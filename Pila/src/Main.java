public class Main {
    public static void main(String[] args) {
        /*Pila pila = new Pila();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.pop();

        while(!pila.empty()) {
            System.out.println(pila.pop());
        }*/

        PilaO pilaO = new PilaO();
        pilaO.push("hhh");
        pilaO.push(1);
        pilaO.push(true);
        pilaO.push(2.2f);
        pilaO.pop();

        while(!pilaO.empty()) {
            System.out.println(pilaO.pop());
        }
    }
}