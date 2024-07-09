package controller;

import java.util.ArrayList;
import java.util.List;

import model.InputError;
import model.User;
import service.StringSorterService;

public class StringSorterController {
    private StringSorterService sss = new StringSorterService();

    public String[] StringToArraydata(String string) throws InputError{
        return sss.StringToArraydata(string);
    }

    public void getFromArrayGender(String[] arr, User user){
        try {
            user.setGender(sss.getFromArrayGender(arr));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.print(e.getMessage());
        }
    }
    public void getFromArrayPhoneNamber(String[] arr, User user){
        try {
            user.setPhoneNamber(sss.getFromArrayPhoneNamber(arr));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.print(e.getMessage());
        }
    }
    public void getFromArrayBirthdate(String[] arr, User user){
        try {
            user.setBirthdate(sss.getFromArrayBirthdate(arr));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.print(e.getMessage());
        }
    }
    public void getFromArrayFIO(String[]arr, User user){
        List<String> list = new ArrayList<>();
        try {
            list = sss.getFromArrayFIO(arr);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.print(e.getMessage());
        }
        user.setFirstName(list.get(0));
        user.setLastName(list.get(1));
        user.setPatronymic(list.get(2));
    }
}
