import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("niru", "jb", "anuj", "mallu", "abad");

        // find first returns optional 
        // optional class introduced to prevent null pointer exception
        Optional <String> name = names.stream().filter(str -> str.contains("r")).findFirst();
        System.out.println(name.get());
        System.out.println(name.orElse("Not found"));
    }
}
