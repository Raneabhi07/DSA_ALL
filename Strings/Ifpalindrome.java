import java.util.*;

public class Ifpalindrome {
    public static boolean isPal(String str){
        for(int i=0;i<str.length()/2;i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        isPal(str);
    }
}
