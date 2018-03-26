import java.util.List;
import java.util.Locale;

import provider.ResourceLoader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> list = ResourceLoader.getResource(Locale.CANADA, "name");
        for (String item : list) {
            System.out.println(item);
        }
    }

}
