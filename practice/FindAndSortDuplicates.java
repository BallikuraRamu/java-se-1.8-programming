import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FindAndSortDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFile = scanner.nextLine();
        String outputFile = "C:\\Users\\SHARPGURUS\\Downloads\\sort transtive- seniority-move tieup-emp-assignment.txt";

        try {
            // Read all lines from the input file
            List<String> lines = Files.readAllLines(Paths.get(inputFile));

            // Count the frequency of each line
            Map<String, Long> lineFrequency = lines.stream()
                    .collect(Collectors.groupingBy(line -> line, Collectors.counting()));

            // Filter out lines that are duplicates (appear more than once) and sort them
            Set<String> duplicateLines = lineFrequency.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toCollection(TreeSet::new));  // TreeSet will automatically sort the lines

            // Write the sorted duplicate lines to the output file
            Files.write(Paths.get(outputFile), duplicateLines);

            System.out.println("Sorted duplicate lines written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
