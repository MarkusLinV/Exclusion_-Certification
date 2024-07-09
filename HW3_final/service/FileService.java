package service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.User;

public class FileService {

    public void WriterNewUserInDB(User user) throws IOException {
        String DBpash = new File("").getAbsolutePath() + "\\model\\DB\\" + user.getFirstName() + ".txt";
        File fileName = new File(DBpash);
        try {
            fileName.createNewFile();
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new IOException("file creation error");// ошибка создания файла
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DBpash, true));) {
            bw.write(user.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new IOException("error writing to the file");// ошибка записи в фаил
        }
    }

    // public static void WriterUserInDB(User user) throws IOException{
    // String DBpash = new File("").getAbsolutePath() + "\\model\\DB\\" +
    // user.getFirstName() + ".txt";
    // try (BufferedWriter bw = new BufferedWriter(new FileWriter(DBpash, true));) {
    // bw.write(user.toString() + "\n");
    // } catch (Exception e) {
    // System.out.println("error writing to the file");//ошибка записи в фаил
    // }
    // }
}
