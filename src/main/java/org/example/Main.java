package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Human human = new Human("Leonenko Pavel Alexandrovich", 37);
        System.out.println(human.toString());

        Builder builder = new Builder("Yudenkov Anton Alexandrovich",36, "Builder");
        System.out.println(builder.toString());

        Sailor sailor = new Sailor("Vlasov Andrey Olegovich", 36, "Sailor");
        System.out.println(sailor.toString());

        Pilot pilot = new Pilot("Fomin Timur Muradovich", 37, "Pilot");
        System.out.println(pilot.toString());
    }
}