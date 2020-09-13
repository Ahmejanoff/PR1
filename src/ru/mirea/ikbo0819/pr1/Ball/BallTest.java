package ru.mirea.ikbo0819.pr1.Ball;

import java.lang.*;
public class BallTest {
    public static void main(String[] args) {
        Ball d1 = new Ball("Blue", 2);
        Ball d2 = new Ball("Yellow", 7);
        Ball d3 = new Ball("Black");
        d3.setRadius(1);
        System.out.println(d1);
        d1.intoDiametr();
        d2.intoDiametr();
        d3.intoDiametr();
    }}

