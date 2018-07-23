package models;

import io.ebean.Finder;
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


    public static Finder<Integer, Libro> find = new Finder<>(Libro.class);

    public Libro() {
    }

    public Libro(Integer id, String title, Integer price, String author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
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

    public static Finder<Integer, Libro> getFind() {
        return find;
    }

    public static void setFind(Finder<Integer, Libro> find) {
        Libro.find = find;
    }
}
