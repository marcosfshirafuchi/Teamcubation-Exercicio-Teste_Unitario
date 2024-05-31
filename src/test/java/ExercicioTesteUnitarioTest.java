import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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
public class ExercicioTesteUnitarioTest {
    @Test
    void numeroDivisivelPor3EPor5() {
        int i = 15;
        Assertions.assertTrue(ExercicioTesteUnitario.verificacaoNumeroDivisivelPor3EPor5(i));
    }

    @Test
    void numeroNaoDivisivelPor3ENaoDivivelPor5() {
        int i = 6;
        Assertions.assertFalse(ExercicioTesteUnitario.verificacaoNumeroDivisivelPor3EPor5(i));
    }

    @Test
    void numeroDivisivelPor3() {
        int i = 6;
        Assertions.assertTrue(ExercicioTesteUnitario.verificacaoNumeroDivisivelPor3(i));
    }
    @Test
    void numeroSoDivisivelPor3() {
        int i = 15;
        Assertions.assertFalse(ExercicioTesteUnitario.verificacaoNumeroDivisivelPor3(i));
    }

    @Test
    void numeroNaoDivisivelPor3() {
        int i = 11;
        Assertions.assertFalse(ExercicioTesteUnitario.verificacaoNumeroDivisivelPor3(i));
    }

    @Test
    void numeroDivisivelPor5() {
        int i = 10;
        Assertions.assertTrue(ExercicioTesteUnitario.verificacaoNumeroDivisivelPor5(i));
    }

    @Test
    void numeroSoDivisivelPor5() {
        int i = 15;
        Assertions.assertFalse(ExercicioTesteUnitario.verificacaoNumeroDivisivelPor5(i));
    }


    @Test
    void numeroNaoDivisivelPor5() {
        int i = 12;
        Assertions.assertFalse(ExercicioTesteUnitario.verificacaoNumeroDivisivelPor5(i));
    }
    @Test
    void NemDivisivelPor3ENemDivisivilPor5() {
        int i = 2;
        Assertions.assertEquals(null,ExercicioTesteUnitario.definirFizzBuzzNumero(i));
    }

    @Test
    void mensagemParaNumeroDivisilPor3(){
        int i = 3;
        Assertions.assertEquals("Fizz",ExercicioTesteUnitario.definirFizzBuzzNumero(i));
    }
    @Test
    void mensagemParaNumeroDivisilPor5(){
        int i = 5;
        Assertions.assertEquals("Buzz",ExercicioTesteUnitario.definirFizzBuzzNumero(i));
    }

    @Test
    void mensagemParaNumeroDivisilPor3EPor5(){
        int i = 15;
        Assertions.assertEquals("FizzBuzz",ExercicioTesteUnitario.definirFizzBuzzNumero(i));
    }
}
