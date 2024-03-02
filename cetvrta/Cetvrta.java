import java.util.Scanner;

public class Cetvrta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] pt1 = new int[2];
        int[] pt2 = new int[2];
        int[] pt3 = new int[2];
        pt1[0] = in.nextInt();
        pt1[1] = in.nextInt();
        pt2[0] = in.nextInt();
        pt2[1] = in.nextInt();
        pt3[0] = in.nextInt();
        pt3[1] = in.nextInt();
        int x1 = 0;
        int x1count = 0;
        int x2 = 0;
        int x2count = 0;
        int y1 = 0;
        int y1count = 0;
        int y2 = 0;
        int y2count = 0;
        x1 = pt1[0]; x1count++;
        y1 = pt1[1]; y1count++;
        if(pt2[0] == x1) {
            x1count++;
        } else {
            x2 = pt2[0];
            x2count++;
        }
        if(pt2[1] == y1) {
            y1count++;
        } else {
            y2 = pt2[1];
            y2count++;
        }
        if(pt3[0] == x1) {
            x1count++;
        } else {
            x2 = pt3[0];
            x2count++;
        }
        if(pt3[1] == y1) {
            y1count++;
        } else {
            y2 = pt3[1];
            y2count++;
        }
        if(x1count < x2count) {
            System.out.print(x1 + " ");
        } else {
            System.out.print(x2 + " ");
        }
        if(y1count < y2count) {
            System.out.println(y1 + " ");
        } else {
            System.out.println(y2 + " ");
        }
    }
    
}
