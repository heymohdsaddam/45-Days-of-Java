package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Method_Reference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mohd saddam", "motsim", "tanveer", "sameer", "samar", "neon");
        List<String> unames = names.stream().map(String::toUpperCase).toList();

        unames.forEach(System.out::println);
    }

}
