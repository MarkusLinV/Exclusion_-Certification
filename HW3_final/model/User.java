package model;

public class User {

    private String firstName;
    private String lastName;
    private String patronymic;
    private String birthdate;
    private String phoneNamber;
    private String gender;

    public User(String firstName, String lastName, String patronymic, String birthdate, String phoneNamber,
            String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.phoneNamber = phoneNamber;
        this.gender = gender;
    }

    public User() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhoneNamber(String phoneNamber) {
        this.phoneNamber = phoneNamber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPhoneNamber() {
        return phoneNamber;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "<" + firstName + ">" + "<" + lastName + ">" + "<" + patronymic + ">" +
               "<" + birthdate + ">" + "<" + phoneNamber + ">" + "<" + gender + ">";
    }

}