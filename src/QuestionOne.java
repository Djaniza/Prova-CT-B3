import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Recebendo os valores do usuário
        System.out.println("Qual é o valor do empréstimo? ");
        float loanValue = scan.nextFloat();
        System.out.println("Qual é a taxa de juros mensal?");
        float loanInterest = scan.nextFloat();
        System.out.println("Em quantos meses o empréstimo será pago?");
        int months = scan.nextInt();

        // variáveis de controle de valores finais:
        float totalInstallmentValue = 0;
        float totalInterestValue = 0;

        // Cálculos sobre os valores:
        final float amortization = loanValue / months;
        float currentBalance = loanValue;
        float monthlyInterest;
        float monthlyInstallment;

        // Imprimindo a tabela:
        System.out.printf("Valor fixo da amortização: R$%.2f, Saldo devedor total: R$%.2f com um juros de %.2f ao mês",
                amortization, loanValue, loanInterest);
        System.out.println("\n");
        int count = 1;
        while (count <= months) {
            monthlyInterest = currentBalance * (loanInterest / 100);
            monthlyInstallment = monthlyInterest + amortization;
            totalInstallmentValue += monthlyInstallment;
            totalInterestValue += monthlyInterest;
            currentBalance -= amortization;
            System.out.printf("Parcela %s | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo Devedor: R$ %.2f", count,
                    monthlyInterest, monthlyInstallment, currentBalance);
            System.out.println("\n");
            count++;
        }
        System.out.printf("Total: Prestação R$%.2f, Juros R$%.2f, Amortização R$%.2f", totalInstallmentValue,
                totalInterestValue, loanValue);
    }
}
