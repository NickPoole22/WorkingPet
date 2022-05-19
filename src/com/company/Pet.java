package com.company;

import java.time.LocalDate;

public class Pet {



    String name;
    String breed;
    LocalDate dateOfBirth; //e.g, 04/17/2012
    boolean needsRestraint;
    Animal animal;

    public enum Animal{
        Dog,
        Cat,
        Chicken,
        Fish
    }

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public Pet(Animal animal)
    {
        this.animal = animal;
    }

    public boolean checkNeedsRestraint(){
        if ( getAge() > 13) {
            return false;
        } else {
            return needsRestraint;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {

        this.dateOfBirth = dateOfBirth;
    }

    public boolean isNeedsRestraint() {
        return needsRestraint;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;

    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        int yearsAgo = now.getYear() - dateOfBirth.getYear();
        if (now.getMonthValue() < dateOfBirth.getMonthValue()) {
            yearsAgo -= 1;
        }
        return yearsAgo;
    }


}
