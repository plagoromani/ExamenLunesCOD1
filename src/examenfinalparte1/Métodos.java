package examenfinalparte1;
/**
 * 
 * @author Pablite5
 */
public class Métodos {
    int i;
    int z;
    int w;

    /**
     * Realiza una suma con los números que le hemos dado a j y m
     * @param j va a ser un parametro de tipo int
     * @param m va a ser otro parámetro de tipo int
     */
    public Métodos(int j, int m) {
        i=suma(j,m);
    }
    /**
     * Realiza una suma con el número que le hemos dado a j, ya que en este caso solo hay un parámetro
     * @param j va a ser un parámetro de tipo int
     */
    public Métodos(int j) {
        z=suma(j,j);
    }
    /**
     * Este método va a ser siempre igual. El valor de w siempre va a ser -1.
     */
    public Métodos() {
        w=-1;
    }
    public int suma(int x, int x1) {
      return x + x1;
    }
}
