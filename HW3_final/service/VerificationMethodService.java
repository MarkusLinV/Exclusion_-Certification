package service;

import java.util.ArrayList;
import java.util.List;

public class VerificationMethodService {

    public boolean hasNumber(String s) {

        int ost = s.length() - 1;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < ost; i = i + 9) {
            if (ost - i > 9) {
                list.add(s.substring(i, i + 9));
            } else {
                list.add(s.substring(i, ost + 1));
            }
        }

        boolean res = false;
        for (String string : list) {
            try {
                Integer.parseInt(string);
                res = true;
            } catch (Exception e) {
                
            }
        }

        return res;
    }

    public boolean hasAmountData(String s, int n, String redex){
        String[] arr = s.split(redex);
        if (arr.length == n) {
            return true;
        }
        return false;
    }

    // public static boolean hasFileInDB(String fileName){
    //    String DBpash = new File("").getAbsolutePath() + "\\model\\DB\\";
    //    File f = new File(DBpash);
    //    String[] fileNamesArr = f.list();
    //    for (int i = 0; i < fileNamesArr.length; i++) {
    //        if (fileNamesArr[i].contains(fileName)) {
    //            return true;
    //        }
    //    }
    //    return false;
    // }
}
