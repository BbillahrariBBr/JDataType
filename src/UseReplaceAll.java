import java.util.Scanner;

/**
 * Created by Alliance on 3/22/2017.
 */
public class UseReplaceAll {
    public  static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String newString = input.next();
        String replaceString = newString.replace("\\s","").toLowerCase();
        System.out.println(replaceString);
    }
}
