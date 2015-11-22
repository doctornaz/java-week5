import java.util.Arrays;

public class StringUtil{
    public static String addCommasToNumericString(String digits){
        System.out.println("addCommasToNumericString " + digits);
        String d = "";
        int c = 3;
        if(digits.length() >= 4){
            for (int i = digits.length()-1; i >= 0; i--) {
                d = digits.charAt(i) + d;
                c--;
                if(c == 0 && i != 0){
                    d = ","+d;
                    c = 3;
                }
            }
            System.out.println(d);
            return d;
        }
        else{
            return digits;
        }
    }

    public static String removeAllOccurrences(String str, char ch){
        System.out.println("removeAllOccurrences: " + str);
        String n = "";
        if(str.contains(String.valueOf(ch))){
            char[] a = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != ch){
                    n+= str.charAt(i);
                }
            }
            return new String(n);
        }else{
            return str;
        }
    }

    public static int countWordsOfAText(String text){
        if(!text.isEmpty()){
            System.out.println("countWordsOfAText: Palabras en " + text + ": " + text.split(" ").length);
            return text.split(" ").length;
        }
        else{
            System.out.println("countWordsOfAText: String vacio");
            return 0;
        }
    }

    public static String blow(String str){
        if(!str.isEmpty()){
            for (int i = 0; i < str.length(); i++) {
                if(Character.isDigit(str.charAt(i))){
                    char[] l = new char[Character.getNumericValue(str.charAt(i))];
                    Arrays.fill(l,str.charAt(i+1));
                    String a = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i+1));
                    str = str.replace(a,new String(l));
                }
            }
            System.out.println("blow: " +str);
            return str;
        }
        else{
            System.out.println("blow: String vacio.");
            return "";
        }
    }

    public static int maxRun(String str){
        System.out.println("maxRun " + str);
        if(!str.isEmpty()){
            char[] a = str.toCharArray();

            int c = 1;
            int d = 1;
            for (int i = 0; i < str.length()-1 ; i++) {
                c = (a[i] == a[i+1]) ? c+1 : c;
                if(c > d){
                    d = c;
                    c = 1;
                }
            }
            return d;
        }
        else{
            return 0;
        }
    }
}
