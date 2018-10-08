public class UpperCaseStringFilter implements StringFilter {

    @Override
    public void StringFilter(String string) {
        System.out.println(string.toUpperCase());
    }
}
