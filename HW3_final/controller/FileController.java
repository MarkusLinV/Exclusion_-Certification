package controller;

import model.User;
import service.FileService;

public class FileController {
    private FileService fs = new FileService();
    
    public void WriterNewUserInDB(User user){
        try {
            fs.WriterNewUserInDB(user);
            System.out.println("The data is recorded");//данные записаны
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
    }
}
