
package exercicio2classe;

public class Carro {
    
    //atributos
    
    String marca;
    String modelo;
    boolean ligado;
    
    
    
    public void ligar(){
        
        ligado = true;
        if (ligado == true){
            System.out.println("o carro esta ligado");
        }
        
        
    }
    
    public void desligar(){
    ligado = false;
    if (ligado == false){
        System.out.println("o carro esta desligado");
    }
    
    
    }
    
    
    public void status(){
        System.out.println("o carro esta ligado? " + ligado);
    }
    
    public void imprimir(){
        System.out.println("qual a marca do carro? " + marca);
        System.out.println("qual o modelo do carro? " + modelo);
    }
    
    
};


