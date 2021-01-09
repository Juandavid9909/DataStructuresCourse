public class Nodo {
    int dato;
    Nodo referencia;

    public Nodo(int d) {
        this.dato = d;
        this.referencia = null;
    }

    public int getDato() {
        return dato;
    }

    public void setRef(Nodo ref) {
        this.referencia = ref;
    }

    public Nodo getRef() {
        return this.referencia;
    }
}