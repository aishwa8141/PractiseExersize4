import java.util.HashMap;
import java.util.Map;

public class ArrayOfString {

        public static void main(String[] args) {

        String[] strings={"b","c","c","d","c","a"};
        Map<String, String> words = new HashMap<>();
        for (String str : strings) {
            if (words.containsKey(str)) {
                words.put(str,"true");

            } else  {
                words.put(str,"false");
            }
        }
        System.out.println(words);
    }



    }






