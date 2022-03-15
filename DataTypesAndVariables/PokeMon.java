    package DataTypesAndVariables;

    import jdk.swing.interop.SwingInterOpUtils;

    import java.util.IllegalFormatCodePointException;
    import java.util.Scanner;

    public class PokeMon {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int Y = scanner.nextInt();
            int originalValueOfN = N;
            while (N>=M) {
                N -= M;
                count++;
                if (N == originalValueOfN*0.5 && Y!=0) {
                        N /= Y;
                }
            }
            System.out.println(N);
            System.out.println(count);
        }
    }
