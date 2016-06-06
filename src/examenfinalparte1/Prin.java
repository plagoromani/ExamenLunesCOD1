package examenfinalparte1;
/**
 *
 * @author Pablite5
 */


public class Prin {
/**
 * En esta clase, que es la main se llaman a los métodos de la clase Métodos.
 * @param args
 *
 */
    
    public static void main(String[] args){

        /**
         * Creamos el objeto métodos y le damos los valores de j y de m.
         */
        Métodos obj = new Métodos(10,20);

     /**
      * Esta es la primera operación, como es el metodo i la suma va a ser de los dos parámetros, en este caso j=10 y m=20 y se muestra por pantalla el resultado
      */
        int operacion1 = obj.i;

        System.out.println("Es: " + operacion1);
     /**
      * Esta es la segunda operación, como es el método z va a utilizar solo el parametro j, en este caso j=10, que es el valor que le damos al principio, y seguidamente lo mostramos por pantalla
      */
         int operacion2 = obj.z;

        System.out.println("Es: " + operacion2);
     /**
      * Esta es la tercera operacion, como es el método w va a valer siempre -1 ya que le hemos dado el valor en el propio método y siempre va a tener ese valor. Luego lo mostramos por pantalla.
      */
     
        int operacion3 = obj.w;

        System.out.println("Es: " + operacion3);}}
