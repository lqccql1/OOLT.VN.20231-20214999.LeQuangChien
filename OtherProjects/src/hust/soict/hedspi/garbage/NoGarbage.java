package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ThinkPad\\Desktop\\OOLT.VN.20231-20214999.LeQuangChien\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\text.txt";
        StringBuffer contentBuffer = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuffer.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String content = contentBuffer.toString();
        System.out.println(content);
    }
}