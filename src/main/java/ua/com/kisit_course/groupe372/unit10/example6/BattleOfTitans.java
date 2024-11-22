package ua.com.kisit_course.groupe372.unit10.example6;

import java.util.Random;

public class BattleOfTitans {

    public BattleOfTitans() {

        Random random = new Random();

        int a  = random.nextInt(101);
        int b = random.nextInt(101);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        if(a>b){
            System.out.println("Переміг 1 гравець");
        } else {
            System.out.println("Переміг 2 гравець");
        }


    }
}
