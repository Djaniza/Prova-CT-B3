import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Recebendo o valor da base da priramide:
        System.out.println("Digite um número ímpar:");
        int pyramidBase = scan.nextInt();

        // Construindo a pirâmide:
        int firstPyramid = 1;
        while (firstPyramid <= pyramidBase) {
            int firstSpaces = (pyramidBase - firstPyramid) / 2;
            while (firstSpaces >= 1) {
                System.out.printf(" ");
                firstSpaces--;
            }
            for (int i = 1; i <= firstPyramid; i++) {
                System.out.printf("*");
            }
            firstPyramid++;
            System.out.println("\n");
        }
    }
}
