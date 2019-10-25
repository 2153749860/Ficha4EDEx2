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

        int numeroTeste = 7;

        switch (numeroTeste) {
            case 0: //teste adicionar 1 elemento
                lista.enqueue(1);
                System.out.println(lista.toString());
                break;
            case 1:
                //teste encher lista
                lista.enqueue(1);
                lista.enqueue(2);
                lista.enqueue(3);
                System.out.println(lista.toString());
                break;
            case 2:

                try {
                    //testar remover lista vazia
                    lista.dequeue();
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4Ex2.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;
            case 3:
                try {
                    //testar remover elementos da lista
                    lista.enqueue(1);
                    lista.enqueue(2);
                    lista.enqueue(3);
                    lista.dequeue();
                    lista.dequeue();
                    lista.enqueue(4);
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4Ex2.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;
                
            case 4:
                try {
                    //teste retornar primeiro elemento da lista com elementos
                    lista.enqueue(1);
                    lista.enqueue(2);
                    lista.enqueue(3);
                    System.out.println(lista.first());
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4Ex2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                break;
                
            case 5:
                //teste retornar primeiro elemento da lista vazia
                try {
                    System.out.println(lista.first());
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4Ex2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                break;
            case 6:
                //teste verificar se lista esta vazia
                System.out.println(lista.isEmpty());
                break;
            case 7:
                //teste verificar se lista esta vazia
                lista.enqueue(1);
                lista.enqueue(2);
                System.out.println(lista.isEmpty());
                break;
        }
    }

}
