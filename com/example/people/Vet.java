package com.example.people;

import com.example.animal.Animal;

public class Vet extends People{

    // Проверка животных и помещение в карантин
    public void check(Animal animal) {
        if (animal.getSick()) {
            System.out.println(animal.getName() + " помещается в карантин");
            animal.setQuarantine(true);
        } else {
            System.out.println("Животное " + animal.getName() + " здорово");
        }
    }

    // Забираем из карантина
    public void getFromQuarantine(Animal animal) {
        if (animal.getSick()) {
            System.out.println(animal.getName() + " остается в карантин");

        } else {
            System.out.println("Животное " + animal.getName() + " здорово");
            animal.setQuarantine(false);
        }
    }

    // Наложение повязки

    public void health(People people) {
        if (people.getInfection()) {
            if (people.getPosition() == "Ветеринар") {
                System.out.println("Повязка наложена" + " Ветеринару");
            }
            if (people.getPosition() == "Смотритель") {
                System.out.println("Повязка наложена" + " Смотрителю");
            }
        }
    }


    public Vet() {
    }
}
