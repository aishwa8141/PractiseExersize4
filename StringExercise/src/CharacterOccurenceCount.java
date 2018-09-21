import java.util.Scanner;

public class CharacterOccurenceCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();
        System.out.println("enter a character to find the occurence");
        char c = input.next(".").charAt(0);
        CharacterOccurenceCount obj=new CharacterOccurenceCount();
        int count= obj.occurance(str,c);
        System.out.println("the count of "+c+" : "+count);

    }
    public  int occurance(String string,char a){
        int charCount;

        charCount=string.length() - string.replaceAll(String.valueOf(a),"").length();
        return charCount;

    }



}
