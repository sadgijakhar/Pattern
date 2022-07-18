public class P15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int x = i;
            int y = 5-i+1;
            for(int j = 1 ; j <= 5 ; j++){
               if(j%2==0){
                System.out.printf("%2d" , x);
                System.out.print(" ");
               }
               else{
                System.out.printf("%2d" , y);
                System.out.print(" ");
               }
               x +=5;
               y+=5;
            }
            System.out.println();
        }
    }
}
