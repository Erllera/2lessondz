package com.company;

public class Phone extends Techno{


    private int memory;

    public Phone(String material, String technoType, int memory) {
        super(material, technoType);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public void print() {
        System.out.println("Память телефона: "+memory+"гб");
    }
}
