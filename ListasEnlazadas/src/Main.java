public class Main {
    public static void main(String[] args) {
        ListaEnlazadaDobleCircular lista = new ListaEnlazadaDobleCircular();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.eliminar(2);
        lista.ver();
    }
}