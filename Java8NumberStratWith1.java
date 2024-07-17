import java.util.List;
import java.util.stream.Collectors;

public class Java8NumberStratWith1 {
    public static void main(String[] args) {
        List<Integer> list=List.of(12,8,17,22,13,76,15);
        //find all number who start with '1'.
        List<String> newList=list.stream().map(n->String.valueOf(n))
                .filter(s->s.startsWith("1")).collect(Collectors.toList());
        System.out.println(newList);
    }
}
