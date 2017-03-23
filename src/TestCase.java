import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Alliance on 3/22/2017.
 */
public class TestCase {
    public static void main(String [] args ){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i <testCases ; i++) {
            try{
                String pattern = in.nextLine();
                Pattern.compile (pattern);
                System.out.println("Valid");
            }
            catch (Exception e){
                System.out.println("Invalid");

            }
        }

    }


    }
