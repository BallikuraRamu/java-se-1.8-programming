import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWord {
    public static void main(String[] args) {
String dup ="Hi team , I am ram very good, ram Hi";
        loops(dup);
        String[] strings = {"B","A","D","B","D"};
        streams(strings);
    }
    public static void loops(String str){
        int count = 1;
        String[] words = str.split(" ");

        for(int i=0;i<words.length;i++){
            count =1;
            for (int j=i+1;j< words.length;j++){
                if (words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if (count >1  && words[i] != "0"){
                System.out.println(words[i]);
            }
        }
    }
    public static void streams(String[] words){
        Map<String, Long> collect = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream().filter(entry->entry.getValue()>1).forEach(entry-> System.out.println(entry.getKey()));
    }
}
