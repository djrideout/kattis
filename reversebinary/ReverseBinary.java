import java.util.Scanner;

public class ReverseBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String forwardsBinary = Integer.toBinaryString(input);
        StringBuilder stringy = new StringBuilder(forwardsBinary);
        String reversedBinary = stringy.reverse().toString();
        int output = Integer.parseInt(reversedBinary, 2);
        System.out.println(output);
    }
}
