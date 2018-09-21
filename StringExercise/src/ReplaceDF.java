import java.util.Scanner;

public class ReplaceDF {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String string = input.nextLine();
        ReplaceDF obj = new ReplaceDF();
        String replaced=obj.replace(string);
        System.out.println("input : "+string);
        System.out.println("output : "+replaced);

    }
    public String replace(String str){

        String s = str.replace('d','f').replace('l','t');
        return s;

    }

}
