package com.example.people;

import com.example.animal.Animal;
import com.example.animal.Cats;
import com.example.animal.Hippo;
import com.example.animal.Squirrel;

public class Zookeeper extends People {


    // Корпление
    public void feed(Animal animal) {
        if (animal.getFullness() == false) {
            System.out.println("Кормим " + animal.getName());
            animal.setFullness(true);
        }
    }


    // Вычесывание
    public void combing(Cats cat) {
        if (cat.getComb() == false) {
            System.out.println("Животное " + cat.getName() + " вычесано");
            cat.setComb(false);
        }
    }

    // Смена воды
    public void changeWater(Hippo hippo) {
        if (hippo.getWater() == false) {
            System.out.println("Вода заменена у животного " + hippo.getName());
            hippo.setWater(true);
        }
    }


    // Слежение за белкой Стрелкой

    public void searchSquirrel (Squirrel squirrel, People people) {
        System.out.println(people.getPosition() + " начинает поиск " + squirrel.getName());
        if (Boolean.TRUE.equals(squirrel.getDetection()) == true) {
            squirrel.setEscape(false);
            System.out.println("Белка возвращена");
        } else {
            System.out.println("Белка не найдена");
        }
    }




}
