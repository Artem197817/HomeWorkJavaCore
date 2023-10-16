package ru.lakeevda.lesson2;

import ru.lakeevda.lesson2.game.BullsAndCows;

import java.util.Scanner;

public class Task1 {
    static BullsAndCows game;

    public static void main(String[] args) {
        game = new BullsAndCows();
        System.out.println("���� 5 �������!");
        for (int i = 0; i < 5; i++) {
            String userNumber = inputNumber();
            game.checkNumber(userNumber);
            if (!game.getGuessed()) {
                System.out.println("����� " + game.getBulls() + " � ����� " + game.getCows());
            } else {
                System.out.println("�� �������!");
            }
        }
        if (!game.getGuessed()) {
            System.out.println("���������� �����: " + game.getSecretNumber());
        }
    }

    public static String inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (!game.isNumberMatch(result)) {
            System.out.println("������� 4� ������� �����: ");
            result = scanner.nextInt();
        }
        return String.valueOf(result);
    }
}
