public class Main {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //Pista:
        System.out.println("--------psitivo negativo y pista--------");
        int numeroIf=5;
        if(numeroIf>0){
            System.out.println("El numero es positivo");
        } else if (numeroIf<0) {
            System.out.println("El numero es negativo");
        }else {
            System.out.println("Es pista");
        }
        System.out.println("-----------while-----------");
//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//Mostrarlo por pantalla cada vez que se ejecute.
        int numeroWhile=-5;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile=numeroWhile +1;
        }
        System.out.println("------------do while-------------");
        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        int n=-5;

        do {
           System.out.println(n);
            n=n+1;

        }while (n<3);
        System.out.println("-------for-----------");

//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor
      for  ( int numeroFor=0;numeroFor<=3;numeroFor++){
          System.out.println(numeroFor);
      }
//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
        System.out.println("--------------Switch-----");
      String estacion="primavera";
      switch (estacion){
          case "verano":
              System.out.println("es verano");
              break;
          case "otoño" :
              System.out.println("es otoño");
              break;
          case "invierno":
              System.out.println("es envierno");
              break;
          case "primavera":
              System.out.println("es primavera");
              break;
          default:
              System.out.println("niguno de estaciones ");
      }


    }
}