import java.util.Scanner;

public class PrefixStringFilter implements StringFilter {

    @Override
    public String filter(String string) {

        Scanner c = new Scanner(System.in);
        System.out.println("Entrer nombre: ");
        int n = c.nextInt();
        System.out.println(string.substring(0,n));

        return string.substring(0,n);
    }
}
