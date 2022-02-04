package com.company;

public class Smartphone extends Phone{

    private String name;

    private double screen;
    private int battery;

    public Smartphone(String material, String technoType, int memory, String name, double screen, int battery) {
        super(material, technoType, memory);
        this.name = name;
        this.screen = screen;
        this.battery = battery;
    }

    public double getScreen() {
        return screen;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public void print() {
        System.out.println("Название телефона: "+name+"\nДиагональ экрана "+screen+"\nЁмкость батареи: "+battery+" мАч");
        super.print();
    }
}
