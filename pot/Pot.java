import java.util.Scanner;

public class Pot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numAddends = in.nextInt();
        int sum = 0;
        for(int i = 0; i < numAddends; i++) {
            int temp = in.nextInt();
            String supertemp = Integer.toString(temp);
            String supersupertemp = supertemp.substring(supertemp.length() - 1);
            int power = Integer.parseInt(supersupertemp);
            String normalnum = supertemp.substring(0,supertemp.length() - 1);
            int notpower = Integer.parseInt(normalnum);
            sum += Math.pow(notpower,power);
        }
        System.out.println(sum);
    }
    
}