import java.util.*;
public class Sol {
    public static int question(String str, char ch){

        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == ch){
                return i;
            }else{
                System.out.println("NA");
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        System.out.println(question("hello", 'e'));
    }
}
