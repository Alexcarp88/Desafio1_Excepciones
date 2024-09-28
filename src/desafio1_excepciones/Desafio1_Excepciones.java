package desafio1_excepciones;

public class Desafio1_Excepciones {

    public static void main(String[] args) {
        System.out.println(dividir(10, 2)); // Retorna 5
        System.out.println(dividir(10, 3)); // Retorna 3
        System.out.println(dividirModificado(10, 0)); // Retorna 0 gracias a la modificacion
        System.out.println(dividirConTryCatch(10, 0)); // Retorna 0 y mensaje de error por el catch
        System.out.println(dividir(10, 0)); // Retorna -> excepción ArithmeticException: / by zero

    }

    public static int dividir(int a, int b) {
        return a / b;

    }

    public static int dividirModificado(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static int dividirConTryCatch(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {                       // El parametro e recibe un objeto ArithmeticException
            System.out.println("Error al dividir por cero");  // Al buscar en la web API de Java vemos que es un error
            return 0;                                           // por tiempo de ejecucion, excepcion no esta comprobada
        }
    }

}
