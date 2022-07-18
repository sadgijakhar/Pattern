public class P6 {
    public static void main(String[] args) {
        int count = 1;
        for(int i =1 ; i < 6 ; i++){
            for(int j = 1; j < 6 ; j++){
                System.out.printf("%2d",count);
                System.out.print(" ");
                count++;
            }
            System.out.println();
        }
    }
    
}
