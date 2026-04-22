package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("id")
    private int id;
    @SerializedName("Title")
    private String title;
    @SerializedName("Year")
    private int year;
    @SerializedName("Pages")
    private int pages;
    private String publisher;

    // el constructor vacio
    public Libro() {}

    //getters y setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Libro [" +
                "ID=" + id +
                ", Título='" + title + '\'' +
                ", Año=" + year +
                ']';
    }
}
