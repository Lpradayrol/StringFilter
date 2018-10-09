public class PostFixStringFilter implements  StringFilter {

    int sizeOfPostfix;

    public PostFixStringFilter(int sizeOfPostfix) {
        this.sizeOfPostfix = sizeOfPostfix;
    }

    @Override
    public String filter(String string) {

        int length = string.length();

        return string.substring(length-sizeOfPostfix, length);

    }
}
