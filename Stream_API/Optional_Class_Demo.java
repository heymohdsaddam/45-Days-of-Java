package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_Class_Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohd Saddam", "Rehan Jaffery", "Zaki Nafees", "Mujtaba");
        Optional<String> name1 = names.stream()
                .filter(str -> str.contains("Mohd M"))
                .findFirst();
        System.out.println(name1.orElse("Not found"));
        String name2 = names.stream()
                .filter(str -> str.contains("Mohd M"))
                .findFirst()
                .orElse("Not Found");
        System.out.println(name2);
    }
}
