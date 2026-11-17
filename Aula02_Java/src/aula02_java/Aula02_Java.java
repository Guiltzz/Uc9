
package aula02_java;

import java.util.Scanner;
/**
 * @author GUSTAVODELIMADOSSANT
 */
public class Aula02_Java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Ola "+nome);

*/
        /*
        double num1 ;
        double num2 ;
        
        System.out.println("Digite um numero:");
        num1 = sc.nextDouble();
        
        System.out.println("Digite outro numero:");
        num2 = sc.nextDouble();
       
        System.out.println("Soma:"+(num1+num2));
        
        System.out.println("Multiplicacao:"+(num1*num2));
        
        System.out.println("Divisao:"+(num1/num2));
*/
        
        System.out.println("Digite seu ano de nascimento:");
        int ano = sc.nextInt();
        int idade = 2026 - ano;
        System.out.println("idade: "+idade);
        sc.close();
    }
    
}
