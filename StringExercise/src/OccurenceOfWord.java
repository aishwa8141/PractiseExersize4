import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceOfWord {



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input string");
        String str=input.nextLine();
        System.out.println("enter word");
        String re=input.next();
        OccurenceOfWord occurenceOfWord=new OccurenceOfWord();
        occurenceOfWord.matching(str,re);


    }

    public void matching(String str, String reE) {
        Pattern p = Pattern.compile(reE);

        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("found at: " + m.start() + " - " + m.end());


        }
    }
}

