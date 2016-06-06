package examenfinalparte1;
/**
 * Esta es la clase métodos y en ella se realizan todos los métodos
 * @author Pablite5
 */
public class Métodos {
    int i;
    int z;
    int w;

   /**
    * Meto todas las operaciones en un mismo método, este método realiza las operaciones cuando le damos valores a j y a m desde la main.
    * @param j es uno de los valores que le damos.
    * @param m es otro de los valores que le damos
    */
    public Métodos(int j, int m) {
        i=suma(j,m); //i realiza una suma con los valores de j y m.
       
        z=suma(j,j); //z realiza una suma con el valor de j.
        
         w=-1; //w siempre vale -1.
    }
     /**
     * Este método realiza una suma.
     * @param x es el primer valor.
     * @param x1 es el segundo valor.
     * @return nos devuelve la suma.
     */
    public int suma(int x, int x1) {
      return x + x1;
    }
}
