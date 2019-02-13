package com.company.stories.clinic;

import com.company.stories.UnorderedCollection;

public class Clinic {
    private UnorderedCollection<Animal> animals = new UnorderedCollection<>(500);
    private UnorderedCollection<Vet> vets = new UnorderedCollection<>(10);



    public String getUnfoFor(String type) {
        String info = "";
        for (int i = 0; i < animals.getCurrentSize(); i++) {
            Animal animal = animals.get(i);

            if (animal.getType().equals(type)) {
                info += animal;
            }
        }
        return info;
    }

    public void nextYear() {
        for (int i = 0; i < animals.getCurrentSize(); i++) {
            animals.get(i).incAge();
        }
    }

    public String getNameForVetById(int id) {
        for (int i = 0; i < vets.getCurrentSize(); i++) {
            Vet vet = vets.get(i);
            if (vet.getId() == id) return vet.getName();
        }
        return "";
    }

    public Animal findAnimalById(int id) {
        for (int i = 0; i < animals.getCurrentSize(); i++) {
            Animal animal = animals.get(i);
            if (animal.getId() == id) return animal;
        }
        return null;
    }

    public void deleteAnimalWithId(int id) {
        Animal animal = findAnimalById(id);
        if (animal != null) {
            animals.remove(animal);
        }
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Vet findVetById(int id) {
        for (int i = 0; i < vets.getCurrentSize(); i++) {
            Vet vet = vets.get(i);
            if (vet.getId() == id) return vet;
        }
        return null;
    }

    public void deleteVetWithId(int id) {
        Vet vet = findVetById(id);
        if (vet != null) {
            vets.remove(vet);
        }
    }

    public void addVet(Vet vet) {
        vets.add(vet);
    }

    public static void addApointement(Animal patient, String procedures, Vet vet) {
        UnorderedCollection<Appointment> appointments = patient.getAppointments();
        appointments.add(new Appointment(vet.getId(), procedures));
    }

}
