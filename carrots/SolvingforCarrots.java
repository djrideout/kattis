import java.util.Scanner;

public class SolvingforCarrots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //in.useDelimiter("\\n");
        int contestants = in.nextInt();
        int carrots = in.nextInt();
        for(int i = 0; i < contestants; i++) {
            in.next();
        }
        System.out.println(carrots);
    }
    
}