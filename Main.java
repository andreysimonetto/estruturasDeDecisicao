import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);

   //     System.out.println("Digite sua idade: ");
   //     Integer idade = Integer.parseInt(teclado.nextLine());

   //     if(idade >= 16){
   //          System.out.println("Menor de Idade e não pode votar!");
   // }else if(idade >= 16 && idade < 18){
   //         System.out.println("Menor de Idade e pode votar!");
   //     }else if(idade >= 18 && idade < 70){     
   //         System.out.println("Maior de idade e deve votar!");
   //     }else{
   //          System.out.println("Você é menor de idade e não pode votar!");
   //     }
        // if(idade >= 18){
        //      System.out.println("Você é maior de idade!");
        //     {else}   
        //     System.out.println("Você é menor de idade!");   
        // }

    //     System.out.println((idade >= 18) ? "Você é maior de idade!" : "Você é menor de idade!");
     
    System.out.println("Digite um valor ( 0 - 7 ): ");
        Integer valor = Integer.parseInt(teclado.nextLine());
        switch(valor){
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
                case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
    }
}
}