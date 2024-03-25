public class Exercicio06 {
    public static void executar(){
        
        System.out.println("Digite a temperatura em graus celsius: ");
        int celsius = Prompt.lerInteiro();

        double fah = (9 * celsius + 160) / 5;
        
        System.out.println("Temperatura em graus fahrenheit: " + fah);


    }
    
}
