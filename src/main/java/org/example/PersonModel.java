package org.example;
public class PersonModel {
    private String surname;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private long phoneNumber;
    private char gender;

    public PersonModel(String surname, String firstName, String middleName, String dateOfBirth, long phoneNumber, char gender)
    {
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String toFormattedString() {
        return String.format("Фамилия: %s\nИмя: %s\nОтчество: %s\nДата рождения: %s\nНомер телефона: %d\nПол: %c",
                surname, firstName, middleName, dateOfBirth, phoneNumber, gender);
    }
}