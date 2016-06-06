package examenfinalparte1;
/**
 * 
 * @author Pablite5
 */
public class Métodos {
    int i;

    /**
     * Realiza una suma con los parámetros que le hemos dado a j y m
     * @param j va a ser un parametro de tipo int
     * @param m va a ser otro parámetro de tipo int
     */
    public Métodos(int j, int m) {
        i=suma(j,m);
    }
    /**
     * 
     * @param j 
     */
    public Métodos(int j) {
        i=suma(j,j);
    }
    
    public Métodos() {
        i=-1;
    }
    public int suma(int x, int x1) {
      return x + x1;
    }
}
