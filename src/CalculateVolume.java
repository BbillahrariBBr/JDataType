import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by Alliance on 3/22/2017.
 */

public class CalculateVolume {
    public  static void main (String [] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//            Scanner sc=new Scanner(System.in);
//            String a=sc.next();
//            int k=sc.nextInt();
//            String max=a.substring(0,k);
//            String min=a.substring(0,k);
//
//            for(int i=0; i+k<=a.length(); i++){
//                if(a.substring(i, i+k).compareTo(min)<0) min=a.substring(i, i+k);
//                if(a.substring(i, i+k).compareTo(max)>0) max=a.substring(i, i+k);
//            }
//
//            System.out.println(min);
//            System.out.println(max);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String newString = input.next();
        System.out.println("How many number want a substring: ");
        int subStringNumber = input.nextInt();

        String max = newString.substring(0,subStringNumber);
        String min = newString.substring(0,subStringNumber);

        for (int i = 0; i+subStringNumber <=newString.length() ; i++) {
            if(newString.substring(i,i+subStringNumber).compareTo(min)<0){
                min = newString.substring(i,i+subStringNumber);
                System.out.println("min substring: " + min);
            }
            if (newString.substring(i,i+subStringNumber).compareTo(max)>0){
                max= newString.substring(i,i+subStringNumber);
                System.out.println("max substring: " + max);
            }

        }
        System.out.println("final min string: "+ min);
        System.out.println("fianla max string: "+ max);
        }


}

