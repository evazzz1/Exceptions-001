package org.example;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PersonView view = new PersonView();
        String inputData = view.getInputData();

        try {
            PersonModel person = processInputData(inputData);
            PersonController controller = new PersonController(person);
            controller.writeToFile();
            view.displayMessage("Данные успешно записаны в файл.");
        } catch (InvalidDataFormatException e) {
            view.displayException(e);
        }
    }

    public static PersonModel processInputData(String inputData) throws InvalidDataFormatException {
        String[] parts = inputData.split("\\s+");
        if (parts.length != 6) {
            throw new InvalidDataFormatException("Неверное количество данных");
        }

        String surname = parts[0];
        String firstName = parts[1];
        String middleName = parts[2];
        String dateOfBirth = parts[3];
        long phoneNumber;
        char gender;

        try {
            phoneNumber = Long.parseLong(parts[4]);
            if (parts[5].length() != 1 || (!parts[5].equals("m") && !parts[5].equals("f"))) {
                throw new InvalidDataFormatException("Неверный формат пола");
            }
            gender = parts[5].charAt(0);
        } catch (NumberFormatException e) {
            throw new InvalidDataFormatException("Неверный формат номера телефона");
        }

        return new PersonModel(surname, firstName, middleName, dateOfBirth, phoneNumber, gender);
    }
}
