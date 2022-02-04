package com.company;

public class Samsung extends Smartphone{

    private int versionOS;
    private int megaPixels;

    public Samsung(String material, String technoType, int memory, String name, double screen, int battery, int versionOS, int megaPixels) {
        super(material, technoType, memory, name, screen, battery);
        this.versionOS = versionOS;
        this.megaPixels = megaPixels;
    }

    public int getVersionOS() {
        return versionOS;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Версия ОС: "+versionOS+"\nМп камеры: "+megaPixels);
    }
}
