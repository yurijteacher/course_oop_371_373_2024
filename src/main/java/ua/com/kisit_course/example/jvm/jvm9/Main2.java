package ua.com.kisit_course.example.jvm.jvm9;

import java.io.*;

public class Main2 {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fr1 = new FileInputStream(new File(""));

        try (br1; br2; fr1) {
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
