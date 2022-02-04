package com.company;

public class Pets extends Animal{

    private String petsType;

    public Pets(Color color, String petsType) {
        super(color);
        this.petsType = petsType;
    }

    public String getPetsType() {
        return petsType;
    }

    @Override
    public void print() {
        System.out.println("Тип животного: "+petsType);
        super.print();
    }
}
