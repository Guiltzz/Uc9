
package aula01_java;

/**
 *
 * @author GUSTAVODELIMADOSSANT
 */
public class Aula01_java {
    public static void main(String[] args) {
        
        String nome = "Gustavo";
        String sobrenome = "Santos";
        String Maior_idade = "";
        
        //int idade = 18;
        int ano_nascimento = 2008;
        int soma_idade = 2026 - ano_nascimento;
        int idade = soma_idade;
        int idade_nova = (idade += 10);
        
        char tipo = 'M';
        double altura = 1.73;
        
        if (idade >=18){
             Maior_idade = "Sou maior de idade";
        } else {
             Maior_idade = "Não sou maior de idade";
        }
        
        System.out.printf("Nome: %s %s %n",nome,sobrenome);
        System.out.printf("Idade: da q a 10 anos terei %d %n",idade_nova);
        System.out.println(Maior_idade);
        System.out.printf("Sou so sexo: %c %n",tipo);
        System.out.printf("Altura:  "+altura+ "%n");
        
    }
    
}
