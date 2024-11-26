

import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {;
        // DEFININDO AS VARIÁVEIS QUE SERÃO USADAS NAS INSTÂNCIAS DE CARRO E MOTO
        Scanner scanner = new Scanner(System.in);
        String marca;       
        String modelo;
        int ano;
        int qtdPassageiros;
        boolean Seguro;
    
        // VARIÁVEIS QUE SERÃO USADAS SÓ PARA CARROS

        String tipoCombustivel;
        String tipoCarro;
        int qtdPortas;
        
        
        int rodar;

        System.out.println("Quantos carros quer cadastrar?");
        rodar = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Carro> carros = new ArrayList<>();
        // LOOP FOR QUE RODA QUANTAS VEZES O USUÁRIO QUISER
        for (int i = rodar ;i > 0;i-- ) {
         
            System.out.println("Marca do carro: ");
            marca = scanner.nextLine();

            System.out.println("Modelo do carro: ");
            modelo = scanner.nextLine();

            System.out.println("Ano do carro: ");
            ano = scanner.nextInt();

            System.out.println("Quantidade de portas: ");
            qtdPortas = scanner.nextInt(); 

            System.out.println("Tipo do combustivel: ");
            tipoCombustivel = scanner.next();

            System.out.println("Quantidade de passageiros: ");
            qtdPassageiros = scanner.nextInt(); 

            System.out.println("Tem seguro? (true/false): ");
            Seguro = scanner.nextBoolean();
            
            scanner.nextLine();

            System.out.println("Tipo do carro: ");
            tipoCarro = scanner.nextLine();

            carros.add(new Carro( marca, modelo, ano, qtdPortas, tipoCombustivel,qtdPassageiros,Seguro,tipoCarro));          
        }
        // LAÇO FOR QUE IMPRIME AS INFORMAÇÕES DE TODOS OS CARROS CADASTRADOS
        for (Carro carro : carros) {
            System.out.println("=====================================================================");
            System.out.printf
            ("Marca: %s - Modelo: %s - Ano: %d - qtdPortas: %d - tipoCombustivel: %s - qtdPassageiros: %d - seguro: %b - tipoCarro: %s"
            ,carro.getMarca(), carro.getModelo(), carro.getAno(), carro.getQuantidadePortas(),
            carro.getTipoCombustivel(), carro.getQtdPassageiros(), carro.getSeguro(), carro.getTipoCarro()
            );
            System.out.println(" ");
        }
       
        // CADASTRO DE MOTOS
        String cor;
        int NumMoto;
        String Categoria;

        System.out.println(" ");
        System.out.println("Quantas motos quer cadastrar? ");
        rodar = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Moto> motos = new ArrayList<>();
        for (int j = rodar; j > 0; j--){
           
            System.out.println("Marca da moto: ");
            marca = scanner.nextLine();

            System.out.println("Modelo da moto: ");
            modelo = scanner.nextLine();

            System.out.println("Ano da moto: ");
            ano = scanner.nextInt();
           
            System.out.println("Quantidade de passageiros: ");
            qtdPassageiros = scanner.nextInt(); 

            System.out.println("Tem seguro? (true/false): ");
            Seguro = scanner.nextBoolean();
            
            scanner.nextLine();

            System.out.println("Cor da moto: ");
            cor = scanner.nextLine();

            System.out.println("Número da moto: ");
            NumMoto = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Categoria da moto: ");
            Categoria = scanner.nextLine();

            motos.add(new Moto(marca, modelo, ano, qtdPassageiros,Seguro, cor, NumMoto, Categoria));
        }
        // LAÇO FOR QUE PERCORRE O ARRAY COM OS OBJETOS 
        for (Moto moto : motos) {
            System.out.println("=======================================");
            System.out.printf("Marca: %s - Modelo: %s - Ano: %d - QtdPassgeiros: %d - Seguro: %b - Cor: %s - NumMoto: %d - Categoria: %s"
            ,moto.getMarca(),moto.getModelo(),moto.getAno(),moto.getQtdPassageiros(),
            moto.getSeguro(),moto.getCor(),moto.getNumMotor(),moto.getCategoria()
            );
            System.out.println(" ");
        }
       
    }
}