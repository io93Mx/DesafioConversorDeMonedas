

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Desafio Curso 5!");


        //API KEY exchangeRate
        //Your API Key: e9c627cdfa3d4f5132d90b2b
        //Example Request: https://v6.exchangerate-api.com/v6/e9c627cdfa3d4f5132d90b2b/latest/USD

        String direccion = "https://v6.exchangerate-api.com/v6/e9c627cdfa3d4f5132d90b2b/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build(); 
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();        
        System.out.println(json);
        //devuelve: (llave: valor, llave: valor, etc)
        

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 7) {
            
            System.out.println("***************************************\n");
            System.out.println("Bienvenid@ al conversor de monedas");
            System.out.println("1) Dolar a Peso Mexicano");
            System.out.println("2) Peso Mexicano a Dolar");
            System.out.println("3) Dolar a Real Brasileño");
            System.out.println("4) Real Brasileño a Dolar");
            System.out.println("5) Dolar a Yuan Chino");
            System.out.println("6) Yuan Chino a Dolar");
            System.out.println("7) Salir");
            System.out.println("\nElija una opcion valida");
            System.out.println("\n*************************************\n");

            
            opcion = scanner.nextInt();

            if (opcion == 1) {

                
            } else if (opcion == 2) {

                
            } else if (opcion == 3) {

                
            } else if (opcion == 4) {

                
            } else if (opcion == 5) {

                
            } else if (opcion == 6) {

                
            } else if (opcion == 7) {

                
            } else {
                System.out.println("Opcion no Valida");                
            }

        }
        
        scanner.close();

        



    }        
}