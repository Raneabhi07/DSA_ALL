import java.util.Arrays;

public class Ifanagram {
    public static void main(String args[]) {
        String str1 = "Rac";
        String str2 = "car";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            // Convert strings to array
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();
            // sort the arrays
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            boolean result = Arrays.equals(str1Array, str2Array);
            if (result){
                System.out.println("String are anagram");
            }else{
                System.out.println("Strings are not anagram");
            }
        }else{
            System.out.println("Strings are not anagram");
        }
    }
}
