package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I'm master of GIT");
        System.out.println(" And this is another change...yeah this is super cool program");
        System.out.println(" And this is another change...my program is growing");
        System.out.println("Another commit...yey...right");
        System.out.println("Test");

        Person p1 = new Person("Katarina", "Moscow", 256);
        System.out.println(p1.toString());

        Person p2 = new Person("Ernesto", "Havana", 92);
        System.out.println(p2.toString());

        Person p3 = new Person("Fidel", "Havana", 94);

        Person p4 = new Person("Artur", "Książenice", 44);

        Car car1 = new Car("Honda", "Civic", 2001);
        System.out.println(car1.toString());
    }
}
