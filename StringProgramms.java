import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProgramms {
    public static void main(String[] args) {
        String name= "rammayyannnn";

        removeDuplicate1(name);
        removeDuplicate2(name);
        removeDuplicate3(name);
        removeDuplicate4(name);
        countEachCharacter(name);
        findMaxOccuringCharacter(name);
        findDuplicateCharacterInString(name);
        countEachCharAndArangeinAsc(name);
        arrangeEachCharAndArangeinAsc(name);

    }

    private static void arrangeEachCharAndArangeinAsc(String name) {
        String[] strings=name.split("");
        Map<String, Long> collect = Arrays.stream(strings).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }

    private static void countEachCharAndArangeinAsc(String name) {
    }

    private static void findDuplicateCharacterInString(String name) {
    }

    private static void findMaxOccuringCharacter(String name) {
    }

    private static void countEachCharacter(String name) {
    }

    private static void removeDuplicate4(String name) {
    }

    private static void removeDuplicate3(String name) {
    }

    private static void removeDuplicate2(String name) {

    }

    private static void removeDuplicate1(String name) {
        String[] chars=name.split("");
        Arrays.stream(chars).distinct().forEach(System.out::print);
    }
}