import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuscaBinariaTeste {
  
  @Test
  public void numeroExistenteInicio() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {5, 6, 7, 10, 20};
    int chave = 5;

    assertEquals(0, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void numeroExistenteFinal() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {1, 2, 4, 30};
    int chave = 30;

    assertEquals(3, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void numeroExistenteMeio() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {2, 5, 7, 25, 40};
    int chave = 7;

    assertEquals(2, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void numeroInexistente() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {1, 2, 3, 6};
    int chave = 5;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void numeroInexistenteMaiorDoQueNumeroFinal() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {2, 3, 5, 6, 10, 12};
    int chave = 40;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 
}
