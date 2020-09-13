package ru.mirea.ikbo0819.pr1;

import java.lang.*;

public class Book {
    private String name;
    private int pages;
    public Book(String n, int a){
        name = n;
        pages = a;
    }
    public Book(String n){
        name = n;
        pages = 0;
    }
    public Book(){
        name = "Red";
        pages = 0;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPages() {
        return pages;
    }
    public String toString(){
        return this.name+", pages "+this.pages;
    }
    public void intoDiametr(){
        System.out.println(name+" has a "+pages);
    }
}
