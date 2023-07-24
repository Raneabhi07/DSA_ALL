public class OddorEven {

    public static void OorE(int n){
        int bitmask = 1;
        if((n&bitmask) == 0){
            //EVEN
            System.out.println("Even it is");
        }else{
            System.out.println("ODD it is");
        }
    }

    public static void main(String[] args) {
        OorE(12);
        OorE(13);
    }
}
