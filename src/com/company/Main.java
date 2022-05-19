package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Pet a = new Pet("Shirley", "Mini Aussie");
        a.setDateOfBirth(LocalDate.of(2006,8,1));
        System.out.println(a.getAge());
        a.setNeedsRestraint(true);
        System.out.println("Does this pet need to be restrained? " + a.checkNeedsRestraint());
        Pet b = new Pet("Stanley", "Dachshund");
        b.setDateOfBirth(LocalDate.of(2015,1,1));
        b.setNeedsRestraint(true);
        System.out.println("Does this pet need to be restrained? " + b.checkNeedsRestraint());
        System.out.println(b.getAge());


        Pet c = new Pet(Pet.Animal.Dog);
        System.out.println(c.getAnimal());


    }
}

