package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessingRandom();
        while (true) {
            System.out.println("Повторить игру ещё раз? \n 1 – да / 0 – нет");
            Scanner scanner = new Scanner(System.in);
            int choiceAnswer = scanner.nextInt();
            if (choiceAnswer == 1) guessingRandom();
            else {
                System.out.println("Спасибо за игру, было круто!");
                break;
            }
        }

    }

    private static void guessingRandom() {
        Random random = new Random();
        int maxTryCount = 3;
        int answer = random.nextInt(10);
//        System.out.println(answer);
        System.out.println("Введите любое число от 0 до 9");
        for (int tryCount=1; tryCount<=maxTryCount; tryCount++) {
            Scanner scanner = new Scanner(System.in);
            int useranswer = scanner.nextInt();
            if (useranswer == answer) {
                System.out.println("Поздравляю вы угадали");
                break;
            }
            else if (useranswer < answer) System.out.println("Вы ввели слишком маленькое число");
            else System.out.println("Вы ввели слишком большое число");
            if (tryCount!=maxTryCount) System.out.println("Попробуем ещё раз, введите любое число от 0 до 9");
            else System.out.println("Увы, вы проиграли");
        }
    }
}
