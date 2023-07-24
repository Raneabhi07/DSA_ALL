public class Patterns {

    public static void halfPyramid (int n){
    //hollow rectangle pattern
        for (int i = 1; i <= n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void floydpattern (int m) {
        //floyd's traingle pattern
        int n = 1;
        for (int i = 1;i <= m;i++){
            for(int j = 1; j <= i;j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }      
    }


    public static void zeroone(int n) {
        // 0-1 triangle pattern
        for (int i = 1;i <= n; i++){
            for (int j = 1 ;j <= i; j++){
                if ((i+j)%2 == 0){
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterflypattern(int n) {
        //butterfly pattern
        //1st half
        for (int i = 1; i<=n;i++){
            //stars - i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j = 1; j <= 2*(n-i);j++){
                System.out.print(" ");
            } 
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n;i>=1;i--){
            //stars - i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j = 1; j <= 2*(n-i);j++){
                System.out.print(" ");
            } 
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void solidRhombus(int n) {
        //Solid rhombus pattern
        for(int i = 1;i<=n;i++){
        // spaces
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
        // stars
            for(int j = 1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void hollowRhombus(int n) {
        //hollow rhombus pattern
        for (int i=1;i<=n;i++){
            for (int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=n;j++){
                if(i == 1|| i == n||j == 1||j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondpattern(int n) {
        //diamond pattern
        //1st half
        for (int i = 1; i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n;i>=1;i--){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        int a = 1;
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int j = 1; j<=n-i+1;j++){
                System.out.println(a);
                a++;
            }
        }
    }

    // public static void main (String args[]) {
    //     // halfPyramid(7);
    //     // floydpattern(5);
    //     // zeroone(6);
    //     // butterflypattern(7);
    //     // solidRhombus(5);
    //     // hollowRhombus(5);
    //     // diamondpattern(6);
    //     numPattern(5);
    // }

}
