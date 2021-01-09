public class NodoC {
    int dato;
    NodoC adelante;
    NodoC atras;

    public NodoC() {}

    public NodoC(int dato) {
        this.dato = dato;
        this.adelante = null;
        this.atras = null;
    }

    public int getDato() {
        return this.dato;
    }
}