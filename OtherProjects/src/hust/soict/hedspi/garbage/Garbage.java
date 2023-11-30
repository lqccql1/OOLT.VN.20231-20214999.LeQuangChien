package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Garbage {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ThinkPad\\Desktop\\OOLT.VN.20231-20214999.LeQuangChien\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\text.txt";
        String content = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(content);
    }
}