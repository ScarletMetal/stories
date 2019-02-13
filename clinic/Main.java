package com.company.stories.clinic;

public class Main {

    public static void main(String... args) {
        Clinic clinic = new Clinic();

        clinic.addAnimal(new Animal("Bobby", "Dog", 9911, 3));
        clinic.addAnimal(new Animal("Mitzi", "Cat", 99332123, 1));


        clinic.addVet(new Vet(3344556, "Dr Ramsey", 5));

        System.out.println(clinic.findAnimalById(9911));
        System.out.println(clinic.findVetById(3344556));
    }
}
