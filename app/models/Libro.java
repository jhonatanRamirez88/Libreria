package models;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Libro extends Model {
    @Id
    public Integer id;
    public String title;
    public Integer price;
    public String author;

    private static Set<Libro> books;

    static{
        books = new HashSet<>();
        books.add(new Libro(1, "Hola",2, "Usted"));
        books.add(new Libro(2, "Hola2",3, "Usted2"));
        books.add(new Libro(3, "Hola3",4, "Usted3"));
    }

    public Libro() {}

    public Libro(Integer id, String title, Integer price, String author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public static  Set<Libro> allLibros(){
        return books;
    }


    public static Libro findById(Integer id){
        for(Libro libro : books){
            if(id.equals(libro.getId())){
                return libro;
            }
        }
        return null;
    }

    public static void addLibro(Libro libro){
        books.add(libro);
    }

    public static boolean remove(Libro libro){
        return books.remove(libro);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
