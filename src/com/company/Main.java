package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("-----------------------------");

        Samsung galaxy = new Samsung("Пластик ","Мобильный ",512,"Redmi note 10 pro",16.5,5000,10,64);
        galaxy.print();


        System.out.println("-----------------------------");


        Haski haski = new Haski(Color.WHITE,"Домашнее животное","Хаски","Гав гав","Сидеть, лежать",210);
haski.print();
        System.out.println("-----------------------------");

        createObject("Samsung").print();
        System.out.println("-----------------------------");
        createObject("Haski").print();
        System.out.println("-----------------------------");
        createObject("Phone").print();
        System.out.println("-----------------------------");

    }


    public static Printable createObject(String className){
        switch (className) {
            case "Pets":
                Pets pets = new Pets(Color.WHITE, "Хаски");

                return pets;


            case "Dog":
                Dog dog = new Dog(Color.WHITE, "Умное животное", "Хаски", "Эу уком");

                return dog;

            case "Haski":
                Haski haski = new Haski(Color.WHITE, "Домашнее животное", "Хаски", "Гав гав", "Сидеть, лежать", 210);

                return haski;
            case "Phone":
                Phone phone = new Phone("Пластик", "Смартфон", 128);

                return phone;

            case "Smartphone":
                Smartphone smartphone = new Smartphone("Пластик", "Смартфон", 128, "Samsung a31", 13.5, 3800);

                return smartphone;

            case "Samsung":
                Samsung samsung = new Samsung("Пластик", "Смартфон",
                        128, "Samsung a31", 13.5, 3800, 11, 48);
                return samsung;
        }
        return null;
    }

}



//b) Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
//c) Создать Интерфейс Printable с методом void print();
//d) Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
//e) В классе Main создать возвращаемый метод createObject(String className), который умеет создавать
// объекты класса 2й, 3й и 4й и после создания и задания свойств объекту метод возвращает ссылку на объект (пульт).
// Можно использовать switch для того чтоб определить какого типа нужно создать экземпляр объекта.
// Например если в параметре передается “2й” метод должен создать объект именно этого типа.
//f) В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createObject, и распечатать по ним информацию методом print();