import java.util.Scanner;

public class TakeTwoStones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean blah = n % 2 == 0;
        if(blah) System.out.println("Bob");
        else System.out.println("Alice");
                
        }
    }
    