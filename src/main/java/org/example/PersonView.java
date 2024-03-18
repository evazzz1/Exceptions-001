package org.example;

import java.util.Scanner;

public class PersonView {
    public String getInputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество Дата рождения Номер телефона Пол");
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayException(Exception e) {
        System.err.println("Произошла ошибка: " + e.getMessage());
        e.printStackTrace();
    }
}