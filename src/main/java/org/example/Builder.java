package org.example;

public class Builder extends Human {
    private String profession;

    public Builder(String fullName, int age, String profession) {
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
