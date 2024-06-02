public class ExercicioTesteUnitario {
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
    public static boolean verificacaoNumeroDivisivelPor5(int i) {
        if(i % 3 != 0 && i % 5 ==0){
            definirFizzBuzzNumero(i);
            return true;
        }else{
            return false;
        }
    }

    public static boolean verificacaoNumeroDivisivelPor3(int i) {
        if(i % 3 == 0 && i % 5 !=0){
            definirFizzBuzzNumero(i);
            return true;
        }else{
            return false;
        }
    }
    public static String definirFizzBuzzNumero(int i){
        if(i % 5 == 0 && i % 3 == 0){
            return "FizzBuzz";
        }else if(i % 3 == 0){
            return "Fizz";
        }else if(i % 5 == 0){
            return "Buzz";
        } else{
            return null;
        }
    }

    public static boolean verificacaoNumeroDivisivelPor3EPor5(int i) {
        if(i % 3 == 0 && i % 5 == 0){
            definirFizzBuzzNumero(i);
            return true;
        }
        else{
            return false;
        }

    }

    public static void impressaoDosNumeros(int numeroDigitado){
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
    }

    public static String numeroDigitado(int numero){
        if (numero >0){
            impressaoDosNumeros(numero);
            return "Numero Positivo";
        }else if(numero == 0){
            return "Numero Zero";
        }else{
            return  "Numero Negativo";
        }
    }


}
