import java.util.StringTokenizer;

public class Text {

        public static void main(String args[])
        {
            operations op = new operations();
            op.getToken();
            op.sort();

        }
    }

    class operations {
        static String in = "My first name is Vidyadhar and my last name is Yagnik";
        static String arr[] = new String[30];
        static int c = 0;

        void getToken() {
            StringTokenizer st = new StringTokenizer(in, " ");

            while (st.hasMoreTokens()) {
                arr[c] = st.nextToken();
                c++;
            }
            System.out.println("The original string is:::" + in);
            System.out.println("-------The Tokens of the strings--------");
            for (int i = 0; i < c; i++) {
                System.out.println(arr[i]);
            }
        }

        void sort() {
            for (int i = 0; i < c; i++) {
                for (int j = i + 1; j < c; j++) {
                    if (arr[j].compareToIgnoreCase(arr[i]) < 0) {
                        String t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }
            System.out.println("--------The sorted array of strings---------");
            for (int k = 0; k < c; k++) {
                System.out.println(arr[k]);
            }
        }
    }

