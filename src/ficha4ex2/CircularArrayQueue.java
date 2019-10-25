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
    
    private final int DEFAULT_CAPACITY = 10;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T first() throws EmptyCollectionException2 {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
         return this.count;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Front: ");str.append(this.queue[this.front]);str.append("|");str.append(this.front);str.append("\n");
        str.append("Rear: ");str.append(this.queue[this.rear]);str.append("|");str.append(this.rear);str.append("\n");
        str.append("Tamanho: ");str.append(this.size());str.append("\n");
        str.append("Tamanho Stack: ");str.append(this.queue.length);str.append("\n");
        for(int i=0; i<this.size(); i++){
            str.append(this.queue[i]);str.append("\n");
        }
        return str.toString();
    }

    
}
