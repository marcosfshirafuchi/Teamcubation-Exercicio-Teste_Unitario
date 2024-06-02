import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * <h1> Teamcubation - Exercício Teste Unitário</h1>
 * Criar uma classe FizzBuzz em que implemente o seguinte exercício e tenha cobertura de testes:<br>
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
public class FizzBuzzTest {
    @Test
    void numeroDivisivelPor3EPor5() {
        int i = 15;
        Assertions.assertTrue(FizzBuzz.verificacaoNumeroDivisivelPor3EPor5(i));
    }

    @Test
    void numeroNaoDivisivelPor3ENaoDivivelPor5() {
        int i = 6;
        Assertions.assertFalse(FizzBuzz.verificacaoNumeroDivisivelPor3EPor5(i));
    }

    @Test
    void numeroDivisivelPor3() {
        int i = 6;
        Assertions.assertTrue(FizzBuzz.verificacaoNumeroDivisivelPor3(i));
    }
    @Test
    void numeroSoDivisivelPor3() {
        int i = 15;
        Assertions.assertFalse(FizzBuzz.verificacaoNumeroDivisivelPor3(i));
    }

    @Test
    void numeroNaoDivisivelPor3() {
        int i = 11;
        Assertions.assertFalse(FizzBuzz.verificacaoNumeroDivisivelPor3(i));
    }

    @Test
    void numeroDivisivelPor5() {
        int i = 10;
        Assertions.assertTrue(FizzBuzz.verificacaoNumeroDivisivelPor5(i));
    }

    @Test
    void numeroSoDivisivelPor5() {
        int i = 15;
        Assertions.assertFalse(FizzBuzz.verificacaoNumeroDivisivelPor5(i));
    }


    @Test
    void numeroNaoDivisivelPor5() {
        int i = 12;
        Assertions.assertFalse(FizzBuzz.verificacaoNumeroDivisivelPor5(i));
    }
    @Test
    void NemDivisivelPor3ENemDivisivilPor5() {
        int i = 2;
        Assertions.assertEquals(null, FizzBuzz.definirFizzBuzzNumero(i));
    }

    @Test
    void mensagemParaNumeroDivisilPor3(){
        int i = 3;
        Assertions.assertEquals("Fizz", FizzBuzz.definirFizzBuzzNumero(i));
    }
    @Test
    void mensagemParaNumeroDivisilPor5(){
        int i = 5;
        Assertions.assertEquals("Buzz", FizzBuzz.definirFizzBuzzNumero(i));
    }

    @Test
    void mensagemParaNumeroDivisilPor3EPor5(){
        int i = 15;
        Assertions.assertEquals("FizzBuzz", FizzBuzz.definirFizzBuzzNumero(i));
    }
    @Test
    void numeroDigitadoEhPositivo(){
        int numero = 100;
        //Assertions.assertTrue(ExercicioTesteUnitario.numeroDigitado(numero));
        //Assertions.assertNotNull(ExercicioTesteUnitario.numeroDigitado(numero));
        Assertions.assertEquals("Numero Positivo", FizzBuzz.numeroDigitado(numero));
    }

    @Test
    void numeroDigitadoEhZero(){
        int numero = 0;
        Assertions.assertEquals("Numero Zero", FizzBuzz.numeroDigitado(numero));
    }

    @Test
    void numeroDigitadoEhNegativo(){
        int numero = -100;
        Assertions.assertEquals("Numero Negativo", FizzBuzz.numeroDigitado(numero));
    }
}
