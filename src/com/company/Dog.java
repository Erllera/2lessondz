package com.company;

public class Dog extends Pets{

    private String breed;
    private String makeVoice;

    public Dog(Color color, String petsType, String breed, String makeVoice) {
        super(color, petsType);
        this.breed = breed;
        this.makeVoice = makeVoice;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Порода: "+breed+"\nЗвук: "+makeVoice);
    }
}
