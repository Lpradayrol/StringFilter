import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class StringFilterTest {

    @Test
    public void upperCaseStringFilter() {
        String input = "toto";
        StringFilter filter = new UpperCaseStringFilter();
        String output = filter.filter(input);
        assertThat(output, equalTo("TOTO"));
    }
}
