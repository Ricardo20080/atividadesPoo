
package exercicio5classe;

public class aluno {
    
    //atributos
    
    String nome;
    double nota1;
    double nota2;
    
    
    double media;
    
    
    
    
   public void calculaMedia(){
    
        media = (nota1 + nota2) / 2;  
    }
    
   
   
   
   public void verivicarSituaçao(){
   if(media > 7)
       System.out.println("situaçao: aprovado");
        else if(media > 5)
       System.out.println("situaçao: em recuperaçao");
   else{
           System.out.println("situaçao: reprovado");}
       
   }
   
   
   public void apresentar(){
       System.out.println("nome do aluno: " + nome);
       System.out.println("notas do primeiro semestre: " + nota1);
       System.out.println("notas do segundo semestre: " + nota2);
       System.out.println("media: " + media);
   }
   
}
