import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHarry {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        if (find(str)) {
            System.out.println("harry is present");

        } else {
            System.out.println("harry is not present");
        }

    }

     public static boolean find(String s){
          final String REGEX = "Harry";
         Pattern p = Pattern.compile(REGEX);
         Matcher m = p.matcher(s);
         if (m.find()) {

             return true;
         }
         else return false;

    }





}
