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
    public void LowerCaseStringFilterTest() {

        String input = "TITI";
        StringFilter filter = new LowerCaseStringFilter();
        String output = filter.filter(input);

        assertThat(output, equalTo("titi"));
    }

    @Test
    public void PrefixStringFilterTest() {

        String input = "ecologie";
        StringFilter filter = new PrefixStringFilter(3);
        String output = filter.filter(input);

        assertThat(output, equalTo("eco"));
    }

    @Test
    public void PostfixStringFilterTest() {

        String input = "millionaire";
        StringFilter filter = new PostFixStringFilter(4);
        String output = filter.filter(input);

        assertThat(output, equalTo("aire"));
    }

    @Test
    public void Upper_Post_Test(){

        String input = "cybersecurite";
        StringFilter filter1 = new PostFixStringFilter(8);
        String output1 = filter1.filter(input);
        assertThat(output1, equalTo("securite"));

        StringFilter filter2 = new UpperCaseStringFilter();
        String output2 = filter2.filter(output1);
        assertThat(output2, equalTo("SECURITE"));
    }

    @Test
    public void Upper_Post_Pre_Test(){

        String input = "cybersecurite";
        StringFilter filter1 = new PostFixStringFilter(8);
        String output1 = filter1.filter(input);
        assertThat(output1, equalTo("securite"));

        StringFilter filter2 = new UpperCaseStringFilter();
        String output2 = filter2.filter(output1);
        assertThat(output2, equalTo("SECURITE"));

        StringFilter filter3 = new PrefixStringFilter(4);
        String output3 = filter3.filter(output2);
        assertThat(output3, equalTo("SECU"));
    }

    @Test
    public void Upper_Post_Pre_Lower_Test(){

        String input = "cybersecurite";
        StringFilter filter1 = new PostFixStringFilter(8);
        String output1 = filter1.filter(input);
        assertThat(output1, equalTo("securite"));

        StringFilter filter2 = new UpperCaseStringFilter();
        String output2 = filter2.filter(output1);
        assertThat(output2, equalTo("SECURITE"));

        StringFilter filter3 = new PrefixStringFilter(4);
        String output3 = filter3.filter(output2);
        assertThat(output3, equalTo("SECU"));

        StringFilter filter4 = new LowerCaseStringFilter();
        String output4 = filter4.filter(output3);
        assertThat(output4, equalTo("secu"));
    }
}
