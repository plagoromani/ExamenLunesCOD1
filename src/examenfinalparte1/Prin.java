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
         * Creamos el objeto métodos.
         */
        Métodos obj = new Métodos();

     /**
      * Esta es la primera operación, como es el metodo SumaDosVariables la suma va a ser de los dos parámetros, en este caso j=10 y m=20 y se muestra por pantalla el resultado
      */
       
        int operacion1 =obj.sumaDosVariables(10, 20);
        System.out.println("Es: " + operacion1);
     /**
      * Esta es la segunda operación, como es el método sumaMismaVariable va a utilizar solo el parametro j, en este caso j=10, que es el valor que le damos nosotros, y seguidamente lo mostramos por pantalla
      */
         int operacion2 = obj.sumaMismaVariable(10);
         System.out.println("Es: " + operacion2);
     /**
      * Esta es la tercera operacion, como es el método sumasiempreigual va a valer siempre -1 ya que le hemos dado el valor en el propio método y siempre va a tener ese valor. Luego lo mostramos por pantalla.
      */
     
        int operacion3 = obj.sumaSiempreIgual();
        System.out.println("Es: " + operacion3);}}
