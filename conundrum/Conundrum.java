import java.util.Scanner;

public class Conundrum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cipher = in.next();
        int out = 0;
        for(int i = 0; i < cipher.length(); i += 3) {
            String sub = cipher.substring(i,i + 3);
            if(!sub.substring(0,1).equals("P")) out++;
            if(!sub.substring(1,2).equals("E")) out++;
            if(!sub.substring(2,3).equals("R")) out++;
        }
        System.out.println(out);
    }
    
}
