import java.util.Arrays;
import java.util.Scanner;

public class StringTranspose {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();
        StringTranspose obj=new StringTranspose();
        String[] rev=obj.reverse(str);
        String st=Arrays.toString(rev);
        System.out.println(st);
    }

    public String[] reverse(String string){


           int len=string.split(" ").length;
           String[] arr;
           arr=string.split(" ");
           String[] out=new String[len];
           int i=0;
           for (String value:arr) {
            StringBuilder in = new StringBuilder();
            in.append(value);
            in=in.reverse();

            out[i]=in.toString();
           i++;

        }
           return out;

    }
}
