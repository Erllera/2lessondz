package com.company;

public class Haski extends Dog{

    private String commands;
    private int iq;

    public Haski(Color color, String petsType, String breed, String makeVoice, String commands, int iq) {
        super(color, petsType, breed, makeVoice);
        this.commands = commands;
        this.iq = iq;
    }

    public String getCommands() {
        return commands;
    }

    public int getIq() {
        return iq;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Команды: "+commands+"\nIQ: "+iq);
    }


}
