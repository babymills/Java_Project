package LabsOOP.labs2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Катя on 22.11.2015.
 */
public class Test {
    public static void main(String[] args) {

    Human h1 = new Human() {
        @Override
        void By() {

        }
    };
        Human h2 = new Human() {
            @Override
            void By() {

            }
        };
       h1.Speak(h2);
      h1.Tolerate(h2);
       h1.SpendTime(h2);
        System.out.println("Тест на совместимость:");
        System.out.println("Первый партнёр: "+h1);
        System.out.println("Второй партнёр"+h2);
        h1.relation(h2);
    }
    }

