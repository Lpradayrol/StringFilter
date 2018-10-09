public class PrefixStringFilter implements StringFilter {

    int sizeOfPrefix;

    public PrefixStringFilter(int sizeOfPrefix) {
        this.sizeOfPrefix = sizeOfPrefix;
    }

    @Override
    public String filter(String string) {

        return string.substring(0,sizeOfPrefix);

    }
}
