package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
    // ativiade 1
            
    Scanner grava = new Scanner(System.in);
    
    double valor, resultado;
    valor = grava.nextDouble();
    
    resultado = (2/(50 + valor))/((49 + (2*2))/48);
   
    System.out.println(resultado);
    
    
    // ativiade 2
       
      System.out.println("Quanto você gasta com gasolina por mês?");
      double valo;
      valo = grava.nextDouble();
    
      System.out.println("você gasta" + valo );


          // ativiade 3
          
       double val,res;
       
       val = grava.nextDouble();
       
       res = valor + 1;
       
       System.out.println(res);

    // ativiade 4 (nao finalizada)
           
     double lata;
     lata = grava.nextDouble();
     System.out.println(lata);
        
    //ativiade if else 1

     int va;
     System.out.println(" 1.inclusão\n 2.alteração\n 3.exclusão\n 4.sair " );
     va = grava.nextInt();
     if(valor ==1){ 
     long rg,cpf,cod;
     System.out.println("insira seu rg");
     rg = grava.nextLong();
     System.out.println("insira seu cpf");
     cpf = grava.nextLong();
     System.out.println("insira seu codigo");
     cod = grava.nextLong();
     System.out.println("cadastro concluido com sucesso!");
     }else if(valor == 2){
     System.out.println("Registro alterado com sucesso!");
     }else if(valor == 3){
     System.out.println("Registro concluído com sucesso!");
     }else if(valor == 4){
     System.out.println("Encerrando o sistema");}
     else{
     System.out.println("Opção inválida");
   
     }
     
     //ativiade if else 2 ( nao feita)
     
     

     }
     


    }
