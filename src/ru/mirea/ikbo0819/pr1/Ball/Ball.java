package ru.mirea.ikbo0819.pr1.Ball;

import java.lang.*;
public class Ball {
    private String color;
    private int radius;
    public Ball(String n, int a){
        color = n;
        radius = a;
    }
    public Ball(String n){
        color = n;
        radius = 0;
    }
    public Ball(){
        color = "Red";
        radius = 0;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.color+", radius "+this.radius;
    }
    public void intoDiametr(){
        System.out.println(color+" ball has a "+radius*2+" diametr");
    }
}