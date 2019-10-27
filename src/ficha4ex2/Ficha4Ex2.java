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

        int numeroTeste = 9;

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
                //testar remover lista vazia
                try {
                    lista.dequeue();
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4Ex2.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;
            case 3:
                //testar remover elementos da lista
                try {
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
                //teste retornar primeiro elemento da lista com elementos
                try {
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
                //teste verificar se lista esta vazia (retorna true)
                System.out.println(lista.isEmpty());
                break;
            case 7:
                //teste verificar se lista esta vazia (retorna false)
                lista.enqueue(1);
                lista.enqueue(2);
                System.out.println(lista.isEmpty());
                break;
            case 8:
                //teste size com queue vazia
                System.out.println(lista.size());
                break;
            case 9:
                //teste size com elementos na queue
                lista.enqueue(1);
                lista.enqueue(2);
                System.out.println(lista.size());
                break;
            case 10:
                //test 1 expandCapacity
                lista.enqueue(1);
                lista.enqueue(2);
                lista.enqueue(3);
                lista.enqueue(4);
                lista.enqueue(5);
                lista.enqueue(6);
                System.out.println(lista.toString());
                break;
            case 11:
                //test 2 expandCapacity
                lista.enqueue(1);
                lista.enqueue(2);
                lista.enqueue(3);
                lista.enqueue(4);
                lista.enqueue(5);
                lista.enqueue(6);
                lista.enqueue(7);
                System.out.println(lista.toString());
                break;
            case 12:
                //teste 3 expandCapacity
                try {
                    lista.enqueue(1);
                    lista.enqueue(2);
                    lista.enqueue(3);
                    lista.enqueue(4);
                    lista.enqueue(5);
                    lista.enqueue(6);
                    lista.dequeue();
                    lista.enqueue(1);
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4Ex2.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;
        }
    }

}
