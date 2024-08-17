import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\SHARPGURUS\\Downloads\\misc.txt";
        try {
            List<String> items = Files.readAllLines(Paths.get(filePath));
//            System.out.println("before : "+items);
            Collections.sort(items);
            System.out.println(items);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
