public class P13 {
    public static void main(String[] args) {
        int a = 5;
        for(int i = 0; i < a; i++){
            int n =2;
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d",((i+1)+10*j) );
                System.out.print(" ");
                System.out.printf("%2d ", ((10-i)+10*j));
                System.out.print(" ");
            }
            System.out.printf("%2d",(10*n+1+i));
            System.out.println();
        }
    }
}
