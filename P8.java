public class P8 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ; i++){
            for(int j =1 ; j <= 5 ; j++ ){
                System.out.printf("%2d",(2*j + 10*i ));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
