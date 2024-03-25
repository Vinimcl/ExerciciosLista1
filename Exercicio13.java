import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        System.out.println("Digite o operador (+, -, *, /): ");
        String entrada = leitor.next();
        char op = entrada.charAt(0);

        double resultado = 0;

        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return; 
                break;
            default:
                System.out.println("Operador inválido!");
                return;
        }

        System.out.println("Resultado: " + resultado);

        leitor.close();
    }
}
