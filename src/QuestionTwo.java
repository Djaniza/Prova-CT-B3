import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Recebendo os valores do usuário:
        System.out.println("Qual é o valor do veículo?");
        float carValue = scan.nextFloat();
        System.out.println(
                "O valor mínimo para sua parcela é R$1000,00, qual o valor máximo que você gostaria de pagar?");
        float maxInstallment = scan.nextFloat();

        float maxInstallmentNumber = carValue / maxInstallment;
        int fixMaxNumber = (int) maxInstallmentNumber;
        float finalInstallmentMaxValue = carValue / fixMaxNumber;
        float minInstallmentNumber = carValue / 1000;
        int fixMinNumber = (int) minInstallmentNumber;
        float finalInstallmentMinValue = carValue / fixMinNumber;

        // Imprimindo o resultado:
        System.out.printf(
                "O valor máximo de parcelas é %s no valor de %.2f \nO valor mínimo de parcelas é %s no valor de %.2f",
                fixMinNumber, finalInstallmentMinValue, fixMaxNumber, finalInstallmentMaxValue);
    }
}
