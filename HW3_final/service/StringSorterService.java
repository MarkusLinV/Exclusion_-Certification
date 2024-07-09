package service;

import java.util.ArrayList;
import java.util.List;

import model.InputError;

// Лин Максим Андреевич 09.10.2000 79114615434 m
public class StringSorterService {

    private VerificationMethodService v = new VerificationMethodService();

    public String[] StringToArraydata(String string) throws InputError{
        String[] res;
        if (v.hasAmountData(string, 6, " ")) {
            res = string.split(" ");
            if (res == null) {
                throw new InputError("insufficient data or an error in setting spaces");
            }
        }else{
            throw new InputError("insufficient data or an error in setting spaces");//недостаточно данных или ошибка в постановке пробелов
        }
        return res;
    }

    public String getFromArrayGender(String[] arr) throws InputError {
        String res = new String();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 1) {
                if (arr[i].compareTo("m") == 0 | arr[i].compareTo("f") == 0) {
                    res = arr[i];
                } else {
                    throw new InputError("incorrect input of the gender, only f or m");// неверный ввод пола, только f
                                                                                       // или m
                }
            }

        }
        return res;
    }

    public String getFromArrayPhoneNamber(String[] arr) throws InputError {
        String res = new String();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (v.hasNumber(arr[i])) {
                res = arr[i];
                flag = false;
            }
        }
        if (flag) {
            throw new InputError("incorrect phone number input");// incorrect phone number input
        }
        return res;
    }

    public String getFromArrayBirthdate(String[] arr) throws InputError {
        String res = new String();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 10 & v.hasAmountData(arr[i], 3, "\\.")) {
                String temp = arr[i];
                String[] tempArr = temp.split("\\.");
                if (tempArr.length != 3 | tempArr[0].length() != 2 | tempArr[1].length() != 2
                        | tempArr[2].length() != 4) {
                    throw new InputError("invalid date format");// неверный формат даты
                } else {
                    res = arr[i];
                }
            }
        }
        return res;
    }

    public List<String> getFromArrayFIO(String[]arr) throws InputError{
        List<String> fio = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo("m") != 0 & arr[i].compareTo("f") != 0 & !v.hasNumber(arr[i]) & !v.hasAmountData(arr[i], 3, "\\.") & !arr[i].equals("")) {
                fio.add(arr[i]);
            }
        }
        if (fio.size() != 3) {
            throw new InputError("invalid NAME format");//недопустимый формат ФИО
        }
        return fio;
    }

}