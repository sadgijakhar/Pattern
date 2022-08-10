public class P17 {
    public static void main(String[] args) {
        int n = 5 ;
        for (int i = 1 ; i <= 2*n ; i=i+2){
            for ( int j = 1 ; j < 2*n ; j=j+2){
                System.out.printf("%2d",(i+j-1));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
