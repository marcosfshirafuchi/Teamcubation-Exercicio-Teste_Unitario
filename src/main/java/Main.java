import java.util.Scanner;

public class Main {
    /**
     * <h1> Teamcubation - Exercício Teste Unitário</h1>
     * Escreva um código onde você vai receber um número n, e deve imprimir todos os números, partindo do 1 até n, com a seguinte condição:<br>
     *
     * Se um número for divisível por 3, ao invés de imprimir o número, você deve imprimir Fizz.<br>
     * Se um número for divisível por 5, ao invés de imprimir o número, você deve imprmimir Buzz.<br>
     * Se um número for divisível por 3 e 5 ao mesmo tempo, você deve imprimir FizzBuzz.<br>
     * Se nenhum dos casos acima for atendido, você deve simplesmente imprimir o número.<br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   30/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numeroDigitado = scanner.nextInt();
        for (int i=1; i<= numeroDigitado; i++){
            if (ExercicioTesteUnitario.verificacaoNumeroDivisivelPor3EPor5(i)){
                System.out.println(ExercicioTesteUnitario.definirFizzBuzzNumero(i));
            }else if(ExercicioTesteUnitario.verificacaoNumeroDivisivelPor3(i)){
                System.out.println(ExercicioTesteUnitario.definirFizzBuzzNumero(i));
            } else if (ExercicioTesteUnitario.verificacaoNumeroDivisivelPor5(i)) {
                System.out.println(ExercicioTesteUnitario.definirFizzBuzzNumero(i));
            }else{
                System.out.println(i);
            }
        }
        scanner.close();
    }

}
