public class NodoArbol {
    int dato;
    NodoArbol hijoI, hijoD;

    public NodoArbol(int dato) {
        this.dato = dato;
        this.hijoD = this.hijoI = null;
    }

    public String toString() {
        return "dato: " + this.dato;
    }
}