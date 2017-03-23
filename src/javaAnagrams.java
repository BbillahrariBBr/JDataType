import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Alliance on 3/22/2017.
 */
public class javaAnagrams {

    static boolean isAnagram(String a, String b) {

        // Complete the function by writing your code here.

        String A = a;
        String B = b;
        Boolean ret = false;
        if(A != null && B != null) {
            char [] arrayA = A.toLowerCase().replace(" ","").toCharArray();
            char [] arrayB = B.toLowerCase().replace(" ","").toCharArray();
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            ret = Arrays.equals(arrayA, arrayB);
        }
        return ret;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first string: ");
        String a = scan.nextLine();
        System.out.println("enter second string: ");
        //System.out.println();
        //scan.nextLine();
        String b = scan.nextLine();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
