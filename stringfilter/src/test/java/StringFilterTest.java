import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class StringFilterTest {

    @Test
    public void UpperCaseStringFilterTest() {
        String input = "toto";
        StringFilter filter = new UpperCaseStringFilter();
        String output = filter.filter(input);
        assertThat(output, equalTo("TOTO"));
    }

    @Test
    public void LowerCaseStringFilterTest(){
        String input = "TITI";
        StringFilter filter = new LowerCaseStringFilter();
        String output = filter.filter(input);
        assertThat(output, equalTo("titi"));
    }

    @Test
    public void PrefixStringFilterTest(){
        String input = "ecologie";
        StringFilter filter = new PrefixStringFilter();
        String output = filter.filter(input);

        assertThat(output, equalTo("eco"));
    }

    @Test
    public void PostfixStringFilterTest(){
        String input = "millionaire";
        StringFilter filter = new PostFixStringFilter();
        String output = filter.filter(input);

        assertThat(output, equalTo("aire"));
    }
}
