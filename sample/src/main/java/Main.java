import com.sun40.fakedata.Fake;
import com.sun40.fakedata.provider.ResourceLoader;
import com.sun40.fakedata.provider.StringProvider;

import java.util.List;
import java.util.Locale;

public class Main implements StringProvider {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*List<String> list = ResourceLoader.getResource(Locale.CANADA, "ipsum");
        for (String item : list) {
            System.out.println(item);
        }*/

        Test test = Fake.create(Test.class);
        System.out.println(test.value);
    }


    public String provide() {
        return null;
    }
}
