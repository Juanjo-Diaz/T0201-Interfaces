import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // creo un scanner para que los ints que pida se puedan ingresar desde el cli
    // No uso argumentos porque no se introducirían por consola
    System.out.println("Introduzca el valor \"n\"");
    String N = sc.nextLine();
    System.out.println("Introduzca el valor \"m\"");
    String M = sc.nextLine();
    System.out.println("Introduzca el valor \"k\"");
    String K = sc.nextLine();
    // uso sc.nextLine para asignar valores a los strings
    int ParseN = 0;
    int ParseM = 0;
    int ParseK = 0;
    // inicializo los valores a 0 para que no se produzca un error en el parse
    try {
        ParseN = Integer.parseInt(N);
        ParseM = Integer.parseInt(M);
        ParseK = Integer.parseInt(K);
        // parseInt para asegurarme de que los valores sean correctos
    }
    catch (Exception e) {
        System.out.println("Introduce un valor válido, error: " + e.getMessage());
        System.exit(1);
        //uso e.getMessage para mostrar el mensaje de error y System.exit(1) para que el programa termine con status 1
    }
    if ((ParseK % ParseM == 0 || ParseK % ParseN == 0) && (ParseN * ParseM)> ParseK)
        System.out.println("Se puede realizar el corte");
    else {
        System.out.println("No se puede realizar el corte");
    }
    //Hago la formula para ver si es posible realizar el corte e imprimo si es posible o no
    }

}
