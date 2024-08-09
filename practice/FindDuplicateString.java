import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateString {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\SHARPGURUS\\Downloads\\seniority-move tieup-employee-assignment.txt";
        String outputFile = "C:\\Users\\SHARPGURUS\\Downloads\\sort transtive- seniority-move tieup-emp-assignment.txt";

        try {
            // Read all lines from the input file
            List<String> lines = Files.readAllLines(Paths.get(inputFile));

            // Remove any prefix before "com.pst.app" and filter lines that start with "com.pst.app"
            List<String> cleanedLines = lines.stream()
                    .filter(line -> line.contains("com.pst.app"))
                    .map(line -> line.substring(line.indexOf("com.pst.app"))).
                    map(line -> line.replace(":jar:1.R9.0-SNAPSHOT", "")).
                    map(line->line.replace(":jar:client:1.R9.0-SNAPSHOT:compile",""))
                    .map(line->line.replace(":compile",""))
                    .collect(Collectors.toList());

            // Write the cleaned lines to the output file
            Files.write(Paths.get(outputFile), cleanedLines);
            System.out.println("Cleaned lines written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
