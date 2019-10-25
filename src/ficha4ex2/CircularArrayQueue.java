/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex2;

/**
 *
 * @author tiago
 */
public class CircularArrayQueue<T> implements QueueADT<T>{
    
    private final int DEFAULT_CAPACITY = 3;
    private int front;
    private int rear;
    private int count;
    private T[] queue;

    public CircularArrayQueue() {
        front = 0;
        rear = 0;
        count = 0;
        queue = (T[]) (new Object[DEFAULT_CAPACITY]);
    }
    
    public CircularArrayQueue(int initialCapacity) {
        front = 0;
        rear = 0;
        count = 0;
        queue = (T[]) (new Object[initialCapacity]);
    }

    @Override
    public void enqueue(T element) {
        //v1
        this.queue[this.rear] = element;
        this.rear = (this.rear + 1) % this.queue.length;
        this.count++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException2 {
        if(this.isEmpty()){
            throw new EmptyCollectionException2("Lista Vazia");
        } else{
            T current = this.queue[this.front];
            this.queue[this.front] = null;
            this.front = (this.front + 1) % this.queue.length;
            this.count--;
            return current;
        }
    }

    @Override
    public T first() throws EmptyCollectionException2 {
        if(this.isEmpty()){
            throw new EmptyCollectionException2("Lista Vazia!");
        } else{
            return this.queue[this.front];
        }
    }

    @Override
    public boolean isEmpty() {
        if(this.count == 0){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public int size() {
         return this.count;
    }

    @Override
    public String toString() {
        int t = this.front;
        StringBuilder str = new StringBuilder();
        str.append("Front: ");str.append("Conteudo: ");str.append(this.queue[this.front]);str.append("|");str.append("Posição: ");str.append(this.front);str.append("\n");
        str.append("Rear: ");str.append("Conteudo: ");str.append(this.queue[this.rear]);str.append("|");str.append("Posição: ");str.append(this.rear);str.append("\n");
        str.append("Tamanho: ");str.append(this.size());str.append("\n");
        str.append("Tamanho Stack: ");str.append(this.queue.length);str.append("\n");
        for(int i=0; i < this.size() ; i++){
            str.append(this.queue[t]);str.append("\n");
            t = (t + 1) % this.queue.length;
        }
        return str.toString();
    }

    
}
