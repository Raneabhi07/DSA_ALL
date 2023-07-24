public class Shortestpath {

    public static float shortestPath(String path){
        int x =0, y =0;
        for (int i=0; i<path.length();i++){
            if(path.charAt(i) == 'N'){
                y++;
            }else if(path.charAt(i) == 'S'){
                y--;
            }else if(path.charAt(i) == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int x_square = x*x;
        int y_square = y*y;
        return  (float)Math.sqrt(x_square+y_square);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";

        System.out.println(shortestPath(path));
    }
}
