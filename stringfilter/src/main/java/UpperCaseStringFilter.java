public class UpperCaseStringFilter implements StringFilter {

    @Override
    public String filter(String string) {

        //System.out.println(string.toUpperCase());
        return string.toUpperCase();

    }
}
