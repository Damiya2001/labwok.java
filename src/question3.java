import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter centimetres(cm): ");
        float centimetres = Float.parseFloat(scanner.next());

        float inch = (float) (centimetres/ 2.54);
        float feet = (float)(inch/12);
        System.out.print("inches: "+ inch +"\n" );
        System.out.print("feet: "+ feet );

    }
}
