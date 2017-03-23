import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Alliance on 3/21/2017.
 */
public class DataType {
    public static void main(String [] args ){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print("#");
            }

            System.out.println();

        }

        }

}
