

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Desafio Curso 5!");


        //API KEY exchangeRate
        //Your API Key: e9c627cdfa3d4f5132d90b2b
        
        Scanner scanner = new Scanner(System.in);

        String monedaDolar = "USD";
        String monedaPesoMexicano = "MXN";
        String monedaRealBrasil = "BRL";
        String monedaYuanChino = "CNY";
        
        int opcion = 0;

        try {

            while (opcion != 7) {
                
                System.out.println("***************************************\n");
                System.out.println("Bienvenid@ al conversor de monedas");
                System.out.println("1) Dolar (USD) a Peso Mexicano (MXN)");
                System.out.println("2) Peso Mexicano (MXN) a Dolar (USD)");
                System.out.println("3) Dolar (USD) a Real Brasileño (BRL)");
                System.out.println("4) Real Brasileño (BRL) a Dolar (USD)");
                System.out.println("5) Dolar (USD) a Yuan Chino (CNY)");
                System.out.println("6) Yuan Chino (CNY) a Dolar (USD)");
                System.out.println("7) Salir");
                System.out.println("\nElija una opcion valida");
                System.out.println("\n*************************************\n");
                
                opcion = scanner.nextInt();            

                if (opcion == 1) {

                    System.out.println("Cuantos 'Dolares' quieres cambiar a 'Pesos Mexicanos' ?");
                    double amount = scanner.nextDouble();
                    String direccion = "https://v6.exchangerate-api.com/v6/e9c627cdfa3d4f5132d90b2b/pair/" + monedaDolar + "/" + monedaPesoMexicano + "/" + amount;
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    //System.out.println("Response: " + json);
                    Gson gson = new Gson();                
                    gson.fromJson(json, Moneda.class);  
                    Moneda miMoneda = gson.fromJson(json, Moneda.class);
                    System.out.println("Al tipo de cambio de hoy: " + miMoneda.getFecha()+ " son: " + miMoneda.getTotal() + " " + monedaPesoMexicano);  
                    
                } else if (opcion == 2) {

                    System.out.println("Cuantos 'Pesos Mexicanos' quieres cambiar a 'Dolares' ?");
                    double amount = scanner.nextDouble();
                    String direccion = "https://v6.exchangerate-api.com/v6/e9c627cdfa3d4f5132d90b2b/pair/" + monedaPesoMexicano + "/" + monedaDolar + "/" + amount;
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    //System.out.println("Response: " + json);
                    Gson gson = new Gson();                
                    gson.fromJson(json, Moneda.class);  
                    Moneda miMoneda = gson.fromJson(json, Moneda.class);
                    System.out.println("Al tipo de cambio de hoy: " + miMoneda.getFecha()+ " son: " + miMoneda.getTotal() + " " + monedaDolar); 

                } else if (opcion == 3) {

                    System.out.println("Cuantos 'Dolares' quieres cambiar a 'Reales de Brasil' ?");
                    double amount = scanner.nextDouble();
                    String direccion = "https://v6.exchangerate-api.com/v6/e9c627cdfa3d4f5132d90b2b/pair/" + monedaDolar + "/" + monedaRealBrasil + "/" + amount;
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    //System.out.println("Response: " + json);
                    Gson gson = new Gson();                
                    gson.fromJson(json, Moneda.class);  
                    Moneda miMoneda = gson.fromJson(json, Moneda.class);
                    System.out.println("Al tipo de cambio de hoy: " + miMoneda.getFecha()+ " son: " + miMoneda.getTotal() + " " + monedaRealBrasil); 

                } else if (opcion == 4) {

                    System.out.println("Cuantos 'Reales de Brasil' quieres cambiar a 'Dolares' ?");
                    double amount = scanner.nextDouble();
                    String direccion = "https://v6.exchangerate-api.com/v6/e9c627cdfa3d4f5132d90b2b/pair/" + monedaRealBrasil + "/" + monedaDolar + "/" + amount;
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    //System.out.println("Response: " + json);
                    Gson gson = new Gson();                
                    gson.fromJson(json, Moneda.class);  
                    Moneda miMoneda = gson.fromJson(json, Moneda.class);
                    System.out.println("Al tipo de cambio de hoy: " + miMoneda.getFecha()+ " son: " + miMoneda.getTotal() + " " + monedaDolar); 
                    
                } else if (opcion == 5) {

                    System.out.println("Cuantos 'Dolares' quieres cambiar a 'Yuanes Chinos' ?");
                    double amount = scanner.nextDouble();
                    String direccion = "https://v6.exchangerate-api.com/v6/e9c627cdfa3d4f5132d90b2b/pair/" + monedaDolar + "/" + monedaYuanChino + "/" + amount;
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    //System.out.println("Response: " + json);
                    Gson gson = new Gson();                
                    gson.fromJson(json, Moneda.class);  
                    Moneda miMoneda = gson.fromJson(json, Moneda.class);
                    System.out.println("Al tipo de cambio de hoy: " + miMoneda.getFecha()+ " son: " + miMoneda.getTotal() + " " + monedaYuanChino); 
                    
                } else if (opcion == 6) {

                    System.out.println("Cuantos 'Yuanes Chinos' quieres cambiar a 'Dolares' ?");
                    double amount = scanner.nextDouble();
                    String direccion = "https://v6.exchangerate-api.com/v6/e9c627cdfa3d4f5132d90b2b/pair/" + monedaYuanChino + "/" + monedaDolar + "/" + amount;
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    //System.out.println("Response: " + json);
                    Gson gson = new Gson();                
                    gson.fromJson(json, Moneda.class);  
                    Moneda miMoneda = gson.fromJson(json, Moneda.class);
                    System.out.println("Al tipo de cambio de hoy: " + miMoneda.getFecha()+ " son: " + miMoneda.getTotal() + " " + monedaDolar); 
                    
                } else if (opcion == 7) {
                    System.out.println("Gracias por usar nuestros servicios, hasta proonto");              
                } else {
                    System.out.println("Opcion no Valida");       
                }

            }
        } catch (InputMismatchException e){
            System.out.println("Ocurrio el error: ");
            System.out.println(e.getMessage());
            System.out.println("Presionaste una letra");
        }

        System.out.println("Finalizo la ejecuccion del programa");
                
        scanner.close();

        



    }        
}