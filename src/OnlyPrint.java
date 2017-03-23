import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Alliance on 3/22/2017.
 */
public class OnlyPrint {
    public static void main(String [] args){
//        String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
//        System.out.println(zeroTo255);
//        String Pattern = zeroTo255;
//        System.out.println(Pattern);
        Scanner input = new Scanner(System.in);
//        System.out.println("enter string: ");
//        String st = input.nextLine();
//        String sTrim =  StringUtils.capitalize(st);
//        System.out.println(st);
        String A = input.nextLine();
        String B = input.nextLine();
        char [] arrayA;
        char [] arrayB;
        char [] arrayACopy;
        char [] arrayBCopy;
        Boolean ret = false;
        if(A != null && B != null) {
            arrayA = A.toLowerCase().toCharArray();
            arrayB = B.toLowerCase().replace(" ","").toCharArray();
//            for (int i = 0; i < arrayA.length; i++){
//                arrayACopy[i] = if(!arrayACopy[i].trim().equals("") || temp[i]!=null)temp[i].trim();
//            }
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            ret = Arrays.equals(arrayA, arrayB);
        }






    }
}
