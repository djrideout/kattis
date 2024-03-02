import java.util.Scanner;

public class DiceCup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        int min = Math.min(one,two);
        int max = Math.max(one,two);
        for(int i = min; i <= max; i++) {
            System.out.println((i + 1));
        }
    }
    
}