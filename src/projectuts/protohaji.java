/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuts;

/**
 *
 * @author Lab316-31
 */
public class protohaji {
 private int maxsize;
    private String[] quearray;
    private int front;
    private int rear;
    private int nitems;

    public protohaji(int a) {
        maxsize = a;
        quearray = new String[maxsize];
        front = 0;
        rear = -1;
        nitems = 0;
    }

    public void insert(String b) {
        if (rear == maxsize - 1) {
            rear = -1;
        }
        quearray[++rear] = b;
        nitems++;
    }

    public String remove() {
        String temp = quearray[front++];
        if (front == maxsize) {
            front = 0;
        }
        nitems--;
        return temp;
    }

    public String peekfront() {
        return quearray[front];
    }

    public String peekrear() {
        return quearray[rear];
    }

    public boolean isempty() {
        return (nitems == 0);
    }

    public boolean isfull() {
        return (nitems == maxsize);
    }

    public int size() {
        return nitems;
    }

    public String toTampil() {
        String tampil = "";
        if (!isempty()) {
            for (int i = front; i <= rear; i++) {
                tampil += quearray[i] + "\n";
            }
        } else {

        }
        return tampil;
    }  
    
}
