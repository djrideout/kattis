import java.util.Scanner;

public class Bijele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kings = in.nextInt();
        int queens = in.nextInt();
        int rooks = in.nextInt();
        int bishops = in.nextInt();
        int knights = in.nextInt();
        int pawns = in.nextInt();
        System.out.print((1 - kings) + " ");
        System.out.print((1 - queens) + " ");
        System.out.print((2 - rooks) + " ");
        System.out.print((2 - bishops) + " ");
        System.out.print((2 - knights) + " ");
        System.out.println((8 - pawns) + " ");
    }
    
}
