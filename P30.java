public class P30 {
    public static void main(String[] args) {
        char a = 'A';
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <=5 ; j++){
                System.out.print(a+" ");
                if(a <'Z'){
                    a++;
                }
            }
            System.out.println();
        }
    }
}
