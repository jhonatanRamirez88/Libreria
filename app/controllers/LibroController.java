package controllers;

import models.Libro;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.libros.create;
import views.html.libros.edit;
import views.html.libros.index;
import views.html.libros.show;

import javax.inject.Inject;
import java.util.List;

public class LibroController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result index(){
        List<Libro> libros = Libro.find.all();
        return ok(index.render(libros));
    }

    public Result create(){
        Form<Libro> libroForm = formFactory.form(Libro.class);
        return ok(create.render(libroForm));
    }

    public Result save(){
        Form<Libro> libroForm = formFactory.form(Libro.class).bindFromRequest();
        Libro libro = libroForm.get();
        libro.save();
        return redirect(routes.LibroController.index());
    }

    public Result edit(Integer id){
        Libro libro = Libro.find.byId(id);
        if(libro==null){
            return notFound("Libro no encontrado");
        }
        Form<Libro> libroForm = formFactory.form(Libro.class).fill(libro);
        return ok(edit.render(libroForm));
    }

    public Result update(){
        Libro libro = formFactory.form(Libro.class).bindFromRequest().get();
        Libro antiguo = Libro.find.byId(libro.id);
        if(antiguo==null){
            return notFound("Libro no encontrado");
        }
        antiguo.title = libro.title;
        antiguo.author = libro.author;
        antiguo.price = libro.price;
        antiguo.update();
        return redirect(routes.LibroController.index());
    }

    public Result show(Integer id){
        Libro libro = Libro.find.byId(id);
        if(libro == null){
            return notFound("Libro no encontrado");
        }
        return ok(show.render(libro));
    }

    public Result delete(Integer id){
        Libro libro = Libro.find.byId(id);
        if (libro == null){
            return notFound("Libro no encontrado");
        }
        libro.delete();
        return redirect(routes.LibroController.index());
    }
}
