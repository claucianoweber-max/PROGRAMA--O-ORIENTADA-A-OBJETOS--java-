import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: R$ ");
        double valorProduto = scanner.nextDouble();
        System.out.print("Porcentagem de desconto (%): ");
        double percentualDesconto = scanner.nextDouble();
        double valorDesconto = valorProduto * (percentualDesconto / 100);
        double precoFinal = valorProduto - valorDesconto;
        System.out.println("\n Saída em Tela");
        System.out.printf("Valor: R$ %.2f%n", valorProduto);
        System.out.printf("Desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço com desconto aplicado: R$ %.2f%n", precoFinal);

        scanner.close();
    }
}
