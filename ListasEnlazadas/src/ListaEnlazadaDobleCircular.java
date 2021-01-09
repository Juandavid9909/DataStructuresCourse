public class ListaEnlazadaDobleCircular {
    NodoC primero;
    NodoC ultimo;

    public ListaEnlazadaDobleCircular() {
        this.primero = null;
        this.ultimo = null;
    }

    public void agregar(int dato) {
        NodoC nuevo = new NodoC(dato);

        if(this.primero == null) {
            this.primero = nuevo;
            this.primero.adelante = this.primero;
            nuevo.atras = this.ultimo;
            this.ultimo = nuevo;
        }
        else {
            this.ultimo.adelante = nuevo;
            nuevo.adelante = this.primero;
            nuevo.atras = this.ultimo;
            this.ultimo = nuevo;
            this.primero.atras = ultimo;
        }
    }

    public void eliminar(int dato) {
        NodoC actual = this.primero;
        NodoC anterior = this.ultimo;

        do {
            if(actual.dato == dato) {
                if(actual == this.primero) {
                    this.primero = this.primero.adelante;
                    this.ultimo.adelante = this.ultimo;
                    this.primero.atras = ultimo;
                }
                else if(actual == this.ultimo) {
                    this.ultimo = anterior;
                    this.primero.atras = this.ultimo;
                    this.ultimo.adelante = this.primero;
                }
                else {
                    anterior.adelante = actual.adelante;
                    actual.adelante.atras = anterior;
                }
            }
            anterior = actual;
            actual = actual.adelante;
        }while(actual != this.primero);
    }

    public void ver() {
        NodoC actual = this.primero;

        do {
            System.out.println(actual.dato);
            actual = actual.adelante;
        }while(actual != this.primero);
    }
}