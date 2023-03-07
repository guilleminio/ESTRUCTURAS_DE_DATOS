import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ListaDeEnteros listaDeEnteros = new ListaDeEnteros();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("¿Ingresa datos a la lista? (s/n)");
            char rta = bufferedReader.readLine().toLowerCase().charAt(0);
            while ( rta == 's'){
                System.out.print("\nIngrese un número entero: ");
                int numero = Integer.valueOf(bufferedReader.readLine());
                listaDeEnteros.insertarAlPrincipio(numero);
                System.out.print("¿Ingresa datos a la lista? (s/n)");
                rta = bufferedReader.readLine().toLowerCase().charAt(0);
            }

            System.out.print("\nLista resultante: ");
            listaDeEnteros.mostrarLista();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}