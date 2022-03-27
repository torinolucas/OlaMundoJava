/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olá.mundo;

public class OláMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Olá Mundo");
              
        String nome ="lucas";
        System.out.println(nome);
 
        if(nome == "lucas"){
            System.out.println("oi");
        }else{
            System.out.println("tchau");
        }
        Caneta c1 = new Caneta();
        c1.nome = "caneta azul";
        c1.status ();
        
                
    }
}
