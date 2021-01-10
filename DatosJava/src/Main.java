import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList;
        Stack pila;
        Queue cola;

        linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("aaaa");
        linkedList.add(2);
        linkedList.add(3);
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.add(0, 111);
        System.out.println(linkedList.get(0));

        /* pila = new Stack();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push("hola");

        while(!pila.empty()) {
            System.out.println(pila.pop());
        } */

        /* Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll()); */
    }
}