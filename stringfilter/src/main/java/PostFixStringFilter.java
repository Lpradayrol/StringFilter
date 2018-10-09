public class PostFixStringFilter implements  StringFilter {

    @Override
    public String filter(String string) {

        int length = string.length();
        int n;
        return string.substring(length-n, length);

    }
}
