/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephus;

import java.util.Scanner;

/**
 *
 * @author jgale
 */
public class Josephus {

    Node head;
    ListOperations list;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Josephus cicle = new Josephus();
    }

    public Josephus() {
        
        this.head = null;

        list = new ListOperations();

        String[] nombres = {"Pedro", "Juan", "Marco", "Natalia","Leidy","Sebastián","Julián"};

        int size = nombres.length;
        
        for (int i = 0; i < size; i++) {
            head = list.enQueue(head, nombres[i]);
        }
        System.out.println("Lista inicial");
        list.print(head);
        list.josephus(head,4);
    }

}