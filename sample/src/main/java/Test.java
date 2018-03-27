import com.sun40.fakedata.annotation.Defaults;
import com.sun40.fakedata.annotation.Fake;

public class Test {

    @Fake.Int.Exact(10)
    @Fake.Int.Range(min = 5)
    @Fake.Int.Positive
    @Fake.Int.Negative
    @Fake.Unique(value = {Fake.class, Defaults.class})
    public int value;

}
