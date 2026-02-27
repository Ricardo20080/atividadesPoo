
package exercicio5classe;

public class Exercicio5Classe {

    public static void main(String[] args) {
       
        aluno aluno1 = new aluno();
        
        aluno1.nome = "ricardo";
        aluno1.nota1 = 6.5;
        aluno1.nota2 = 9.3;
        
        
        aluno1.calculaMedia();
        
        aluno1.apresentar();
        
        aluno1.verivicarSituaçao();
    }
    
}
