package com.company;

public class Techno implements Printable{

    private String material;
    private String technoType;

    public Techno(String material, String technoType) {
        this.material = material;
        this.technoType = technoType;
    }

    public String getMaterial() {
        return material;
    }

    public String getTechnoType() {
        return technoType;
    }

    @Override
    public void print() {

        System.out.println("Материал: "+material+"\nТип техники: "+technoType);

    }
}
