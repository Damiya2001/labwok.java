import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Full name: ");
        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();
        char middleFirst = middle.charAt(0);
        System.out.println(last + "," +  first + " " + middleFirst );
    }
}
