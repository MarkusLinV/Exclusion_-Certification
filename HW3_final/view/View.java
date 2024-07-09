package view;

import java.util.Scanner;

import controller.FileController;
import controller.StringSorterController;
import model.User;

public class View {

    static StringSorterController ssc = new StringSorterController();

    public void Start() {

        String[] data = GettingDataFromConsole();
        User user = getUser(data);
        new FileController().WriterNewUserInDB(user);

    }

    private String[] GettingDataFromConsole() {
        String[] dataArr = null;
            System.out.println("\nВведите данные для записи в базу, в формате (Фамилия Имя Отчество датаРождения номерТелефона пол):");
            
            try(Scanner scanner = new Scanner(System.in);) {
                dataArr = ssc.StringToArraydata(scanner.nextLine());
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        
        return dataArr;
    }

    private User getUser(String[] string) {
        User user = new User();
        ssc.getFromArrayBirthdate(string, user);
        ssc.getFromArrayGender(string, user);
        ssc.getFromArrayPhoneNamber(string, user);
        ssc.getFromArrayFIO(string, user);
        return user;
    }

}
