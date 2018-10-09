public class Tools {

    public static String[] filter(String[] strings, StringFilter filter) {

        for (String string : strings) {
            string = filter.filter(string);
        }

        return strings;
    }
}
