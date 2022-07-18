public class P14 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n ; i > 0 ; i--){
            int a = 2;
            for(int j = 0 ; j < a ;j++){
                System.out.printf("%2d" , i+(10*j));
                System.out.print(" " );
                System.out.printf("%2d" , (i+(10*j))+n);
                System.out.print(" ");
            }
            System.out.print((a*10)+i);
            System.out.println();
        }
    }
}
