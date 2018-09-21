import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counts {

    public static void main(String[] args) {
        String string = "one one -one___two,,three,one @three*one?two";
        String[] a = string.split(" |___|,|@|\\*|\\?|-");
        for (int i=0;i<a.length;i++)
        System.out.println(a[i]);

        Map<String, Integer> words = new HashMap<>();
        for (String str : a) {
            if (str.length() > 0) {
                if (words.containsKey(str)) {
                    words.put(str, 1 + words.get(str));
                } else {
                    words.put(str, 1);
                }
            }
        }



        System.out.println(words);
    }
}
