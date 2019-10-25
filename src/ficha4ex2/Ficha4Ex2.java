/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class Ficha4Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircularArrayQueue lista = new CircularArrayQueue();

        int numeroTeste = 1;

        switch (numeroTeste) {
            case 0: //teste adicionar 1 elemento
               lista.enqueue(1);
               System.out.println(lista.toString());
               break;
            case 1:
                lista.enqueue(1);
                lista.enqueue(2);
                lista.enqueue(3);
                System.out.println(lista.toString());
                break;
        }
    }
    
}
