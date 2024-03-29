package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PersonController {
    private PersonModel person;

    public PersonController(PersonModel person) {
        this.person = person;
    }

    public void writeToFile() {
        String fileName = person.getSurname() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(person.toFormattedString() + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}