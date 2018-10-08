public class LowerCaseStringFilter implements StringFilter {

    @Override
    public void StringFilter(String string) {
        System.out.println(string.toLowerCase());
    }
}
