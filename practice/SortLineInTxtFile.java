import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLineInTxtFile {
    public static void main(String[] args) throws IOException {
        String inputFile = "C:\\Users\\SHARPGURUS\\Downloads\\All Quartz-jobs.txt";
        String outputFil = "C:\\Users\\SHARPGURUS\\Downloads\\Sort Quartz Jobs.txt";

        List<String> line = readLineFromFile(inputFile);

        Collections.sort(line);

        writeLinesToFiles(outputFil, line);
        System.out.println("Sorted Successful :" + outputFil);
    }

    public static List<String> readLineFromFile(String filePath) {
        List<String> inputLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                inputLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return inputLines;
    }

    public static void writeLinesToFiles(String outputFile, List<String> lines) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
