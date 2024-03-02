import java.util.Scanner;

public class Cold {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int count = 0;
        for(int i = 0; i < days; i++) {
            if(in.nextInt() < 0) count++;
        }
        System.out.println(count);
    }
    
}
