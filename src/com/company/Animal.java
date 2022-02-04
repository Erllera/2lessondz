package com.company;

public class Animal implements Printable{

    private Color color;


    public Animal(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


    @Override
    public void print() {
        System.out.println("Цвет животного: "+color);
    }
}
