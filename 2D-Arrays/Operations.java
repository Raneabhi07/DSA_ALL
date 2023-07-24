public class Operations {
    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if ((n&bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        //make that ith bit '1'
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // Recursive approach
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }
        
        // modified approach although same time complexity
        n  = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return n|bitmask;
    }

    public static int clearLastIBits(int n, int i){
        int bitmask = (~0 << i);
        return n & bitmask;
    }

    public static int clearRangeOfBits(int n, int i, int j){
        int bitmask = (~0<<j+1)|(1<<i)-1;
        return n & bitmask;
    }

    public static boolean powerOf2(int n){
        return (n&(n-1)) == 0;
    }

    public static int countSetBitInNumber(int n){
        int count =0;
        while (n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    
    public static void main(String[] args) {
        // System.out.println(getIthBit(15, 2));
        // System.out.println(getIthBit(10, 3));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        //System.out.println(clearLastIBits(10, 2));
        //System.out.println(clearRangeOfBits(10, 2, 4));
        //System.out.println(powerOf2(8));
        System.out.println(countSetBitInNumber(10));
    }
}
