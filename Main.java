// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//        Scanner teclado = new Scanner(System.in);

//    //     System.out.println("Digite sua idade: ");
//    //     Integer idade = Integer.parseInt(teclado.nextLine());

//    //     if(idade >= 16){
//    //          System.out.println("Menor de Idade e não pode votar!");
//    // }else if(idade >= 16 && idade < 18){
//    //         System.out.println("Menor de Idade e pode votar!");
//    //     }else if(idade >= 18 && idade < 70){     
//    //         System.out.println("Maior de idade e deve votar!");
//    //     }else{
//    //          System.out.println("Você é menor de idade e não pode votar!");
//    //     }
//         // if(idade >= 18){
//         //      System.out.println("Você é maior de idade!");
//         //     {else}   
//         //     System.out.println("Você é menor de idade!");   
//         // }

//     //     System.out.println((idade >= 18) ? "Você é maior de idade!" : "Você é menor de idade!");
     
//     System.out.println("Digite um valor ( 0 - 7 ): ");
//         Integer valor = Integer.parseInt(teclado.nextLine());
//         switch(valor){
//             case 0:
//                 System.out.println("Domingo");
//                 break;
//             case 1:
//                 System.out.println("Segunda-feira");
//                 break;
//             case 2:
//                 System.out.println("Terça-feira");
//                 break;
//             case 3:
//                 System.out.println("Quarta-feira");
//                 break;
//             case 4:
//                 System.out.println("Quinta-feira");
//                 break;
//             case 5:
//                 System.out.println("Sexta-feira");
//                 break;
//             case 6:
//                 System.out.println("Sábado");
//                 break;
//                 case 7:
//                 System.out.println("Domingo");
//                 break;
//             default:
//                 System.out.println("Valor inválido!");
//                 break;
//     }
// }
// }

//1
import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero de litros vendidos: ");
        double litros = teclado.nextDouble();

        System.out.print("Digite o tipo de combustivel (A-alcool, G-gasolina): ");
        char tipo = teclado.next().toUpperCase().charAt(0);

        double precoLitro;
        double desconto;
        double precoTotal;

        if (tipo == 'A') {
            precoLitro = 3.98;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo == 'G') {
            precoLitro = 6.49;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustivel invalido!");
            teclado.close();
            return;
        }

        precoTotal = litros * precoLitro;
        double valorDesconto = precoTotal * desconto;
        double valorPagar = precoTotal - valorDesconto;

        System.out.println("Valor a ser pago: R$ " + valorPagar);

        teclado.close();
    }
}

// 2
import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (Kg): ");
        double kgMorango = teclado.nextDouble();

        System.out.print("Digite a quantidade de macas (Kg): ");
        double kgMaca = teclado.nextDouble();

        double precoMorango;
        double precoMaca;

        if (kgMorango <= 5) {
            precoMorango = kgMorango * 2.50;
        } else {
            precoMorango = kgMorango * 2.20;
        }

        if (kgMaca <= 5) {
            precoMaca = kgMaca * 1.80;
        } else {
            precoMaca = kgMaca * 1.50;
        }

        double precoTotal = precoMorango + precoMaca;
        double kgTotal = kgMorango + kgMaca;

        if (kgTotal > 8 || precoTotal > 25.00) {
            double desconto = precoTotal * 0.10;
            precoTotal = precoTotal - desconto;
        }

        System.out.println("Valor a ser pago: R$ " + precoTotal);

        teclado.close();
    }
}

// 3
import java.util.Scanner;

public class Hipermercado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Tipos de carne:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Digite o tipo de carne (1, 2 ou 3): ");
        int tipoCarne = teclado.nextInt();

        System.out.print("Digite a quantidade de carne (Kg): ");
        double quantidade = teclado.nextDouble();

        System.out.print("Pagamento com cartao? (S/N): ");
        char pagamento = teclado.next().toUpperCase().charAt(0);

        double precoKg;
        String nomeCarne;

        if (tipoCarne == 1) {
            nomeCarne = "File Duplo";
            if (quantidade <= 5) {
                precoKg = 4.90;
            } else {
                precoKg = 5.80;
            }
        } else if (tipoCarne == 2) {
            nomeCarne = "Alcatra";
            if (quantidade <= 5) {
                precoKg = 5.90;
            } else {
                precoKg = 6.80;
            }
        } else {
            nomeCarne = "Picanha";
            if (quantidade <= 5) {
                precoKg = 6.90;
            } else {
                precoKg = 7.80;
            }
        }

        double precoTotal = quantidade * precoKg;
        double valorDesconto = 0;

        if (pagamento == 'S') {
            valorDesconto = precoTotal * 0.05;
        }

        double valorPagar = precoTotal - valorDesconto;

        System.out.println("CUPOM FISCAL");
        System.out.println("Tipo de carne: " + nomeCarne);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preco total: R$ " + precoTotal);

        if (pagamento == 'S') {
            System.out.println("Tipo de pagamento: Cartao");
            System.out.println("Valor do desconto: R$ " + valorDesconto);
        } else {
            System.out.println("Tipo de pagamento: Dinheiro");
            System.out.println("Valor do desconto: R$ 0.00");
        }

        System.out.println("Valor a pagar: R$ " + valorPagar);

        teclado.close();
    }
}

//4
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero do funcionario: ");
        int numero = teclado.nextInt();

        System.out.print("Digite o salario atual: ");
        double salario = teclado.nextDouble();

        double percentual;

        if (salario <= 400.00) {
            percentual = 0.15;
        } else if (salario <= 700.00) {
            percentual = 0.12;
        } else if (salario <= 1000.00) {
            percentual = 0.10;
        } else if (salario <= 1800.00) {
            percentual = 0.07;
        } else if (salario <= 2500.00) {
            percentual = 0.04;
        } else {
            percentual = 0;
        }

        double aumento = salario * percentual;
        double novoSalario = salario + aumento;

        System.out.println("Funcionario: " + numero);
        System.out.println("Salario atual: R$ " + salario);
        System.out.println("Percentual de aumento: " + (percentual * 100) + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Salario corrigido: R$ " + novoSalario);

        teclado.close();
    }
}

// 5
import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a hora de inicio: ");
        int horaInicio = teclado.nextInt();
        System.out.print("Digite o minuto de inicio: ");
        int minutoInicio = teclado.nextInt();

        System.out.print("Digite a hora de termino: ");
        int horaTermino = teclado.nextInt();
        System.out.print("Digite o minuto de termino: ");
        int minutoTermino = teclado.nextInt();

        int totalInicio = horaInicio * 60 + minutoInicio;
        int totalTermino = horaTermino * 60 + minutoTermino;

        int duracaoMinutos;

        if (totalTermino > totalInicio) {
            duracaoMinutos = totalTermino - totalInicio;
        } else {
            duracaoMinutos = (24 * 60) - totalInicio + totalTermino;
        }

        int duracaoHoras = duracaoMinutos / 60;
        int duracaoMin = duracaoMinutos % 60;

        System.out.println("A duracao do jogo foi de " + duracaoHoras + " horas e " + duracaoMin + " minutos");

        teclado.close();
    }
}