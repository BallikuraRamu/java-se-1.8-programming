import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CounterMultipleStringsLineTxtFile {
    public static void main(String[] args) {
        // Specify the path to your file
        String filePath = "C:\\Users\\SHARPGURUS\\Downloads\\Sort Quartz Jobs.txt";

        // List of strings to search for (using Arrays.asList for Java 8 and earlier)
        List<String> searchStrings = Arrays.asList("/crewpro/control", "/crewpro/auto-call", "/crewpro/assignment");

        // Map to store counts of lines containing each string
        Map<String, Long> countsMap = new HashMap<>();

        // Initialize countsMap with 0 for each search string
        searchStrings.forEach(searchString -> countsMap.put(searchString, 0L));

        // Count total lines and lines containing the specific strings
        try (Stream<String> linesStream = Files.lines(Paths.get(filePath))) {

            // Iterate over each line
            linesStream.forEach(line -> {
                for (String searchString : searchStrings) {
                    if (line.contains(searchString)) {
                        countsMap.put(searchString, countsMap.get(searchString) + 1);
                    }
                }
            });

            // Print the results
            countsMap.forEach((searchString, count) ->
                    System.out.println("Number of lines containing '" + searchString + "': " + count));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
