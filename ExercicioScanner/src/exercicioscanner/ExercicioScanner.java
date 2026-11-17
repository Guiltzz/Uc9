
package exercicioscanner;

import java.util.Scanner;

/**
 *
 * @author GUSTAVODELIMADOSSANT
 */
public class ExercicioScanner {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome = "";
        String sobrenome ="";
        int idade = 0;
        String cidade = "";
        String profissao = "";
        String Hobby = "";
        String linguagem_fav = "";
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Preencher dados");
            System.out.println("2 - Ver os dados");
            System.out.println("3 - Sair");
            
            opcao = sc.nextInt();
            
            switch(opcao){
            case 1:
            System.out.print("Qual seu nome:");
        nome = sc.nextLine();
        System.out.println("Qual seu sobrenome:");
        sobrenome = sc.nextLine();
        System.out.print("Qual sua idade:");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Qual sua cidade:");
        cidade = sc.nextLine();
        System.out.print("Qual sua profissao:");
        profissao = sc.nextLine();
        System.out.print("Qual seu hobby:");
        Hobby = sc.nextLine();
        System.out.print("Qual sua linguagem de programacao favorita:");
        linguagem_fav = sc.nextLine();
        
        break;
        case 2:
        System.out.println("====================");
    System.out.println("Apresentacao Pessoal");
    System.out.println("====================");
    System.out.println("Nome Completo:"+nome+" "+sobrenome);
    System.out.println("Idade:"+ idade);
    System.out.println("Cidade:"+cidade);
    System.out.println("====================");
    System.out.println("Seja bem vindo");
    System.out.println("====================");
        break;
         case 3:
       System.out.println("Saindo...");
       break;
                    
       default:
       System.out.println("Opcao invalida!");
        }
            

        sc.close();
        
        }while(opcao != 3);
        
    }
    
}
