import java.util.Scanner;

public class Trik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] cups = {1,0,0};
        String moves = in.next();
        for(int i = 0; i < moves.length(); i++) {
            char temp = moves.charAt(i);
            if(temp == 'A') swap(cups,0,1);
            else if(temp == 'B') swap(cups,1,2);
            else swap(cups,0,2);
        }
        for(int i = 0; i < 3; i++) {
            if(cups[i] == 1) System.out.println((i + 1));
        }
    }
    public static void swap(int[] cups, int first, int second) {
        int temp = cups[first];
        cups[first] = cups[second];
        cups[second] = temp;
    }
}
