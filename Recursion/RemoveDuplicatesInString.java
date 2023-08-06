package Recursions;

public class RemoveDuplicatesInString {

    public static void removeDup(String str , int i,  StringBuilder newStr, boolean map[]){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar-'a'] == true){
            removeDup(str, i+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDup(str, i+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "aabbccddeeffgghhiz";
        removeDup(str, 0, new StringBuilder(""),new boolean[26]);
        
    }
    
}
