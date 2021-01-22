package ru.geekbrains.guess_the_number;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    static int range = 9;
    public static void main(String[] args) {
        System.out.println("Ну что, сыгаем?!");
        guessTheNumber();
        scanner.close();
    }

    private static void guessTheNumber(){
        System.out.println("Угадаешь число от 0 до " + range);
        int number = (int)(Math.random() * range);

        for (int i = 1; i <= 3; i++){
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Угадал!!!");
                break;
            }
            else if (input_number > number){
                System.out.println("Неа! Оно меньше");
            }
            else {
                System.out.println("Ой, нет! Оно больше!");
            }
            if (i == 3){
                System.out.println("Все! Попыток больше нет. Сыграем еще разок? 1 - да 0 - нет");
                replay();
            }
        }
    }

    private static void replay(){
        int input_answer = scanner.nextInt();
        if (input_answer == 1){
            System.out.println("Ну что? Еще разок?");
            guessTheNumber();
        } else if(input_answer == 0){
            System.out.println("Чао");
        } else {
            System.out.println("Что-то пошло не так! Попробуй еще раз!");
            replay();
        }
    }
}
