public class NodoD {
    int dato;
    NodoD adelante;
    NodoD atras;

    public NodoD(int dato) {
        this.dato = dato;
        this.adelante = null;
        this.atras = null;
    }

    public int getDato() {
        return this.dato;
    }
}