package org.example;

public class Sailor extends Human{
    private String profession;

    public Sailor(String fullName, int age, String profession) {
        super(fullName, age);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String toString() {
        return super.toString() + " " + profession;
    }
}
