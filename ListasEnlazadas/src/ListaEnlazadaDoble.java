public class ListaEnlazadaDoble {
    NodoD primero, ultimo;
    int tamanio;

    public ListaEnlazadaDoble() {}

    public void agregar(int dato) {
        NodoD nuevo = new NodoD(dato);

        if(this.tamanio == 0) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        }
        else {
            nuevo.atras = ultimo;
            this.ultimo.adelante = nuevo;
            this.ultimo = nuevo;
        }
        this.tamanio++;
    }

    public void agregarInicio(int dato) {
        NodoD nuevo = new NodoD(dato);

        if(this.tamanio == 0) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        }
        else {
            nuevo.adelante = this.primero;
            this.primero.atras = nuevo;
            this.primero = nuevo;
        }
        this.tamanio++;
    }

    public boolean eliminar() {
        if(this.tamanio > 0) {
            if(this.tamanio == 1) {
                this.primero = null;
                this.ultimo = null;
            }
            else {
                this.ultimo.atras.adelante = null;
                this.ultimo.adelante = null;
                this.ultimo = this.ultimo.atras;
            }
            tamanio--;
        }

        return false;
    }

    public boolean eliminarInicio() {
        if(this.tamanio > 0) {
            if(this.tamanio == 1) {
                this.primero = null;
                this.ultimo = null;
            }
            else {
                this.primero.adelante.atras = null;
                this.primero = this.primero.adelante;
            }
        }
        return false;
    }

    public void verLista() {
        NodoD nodov = this.primero;

        while(nodov != null) {
            System.out.println(nodov.dato);
            nodov = nodov.adelante;
        }
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public boolean vacio() {
        return this.tamanio == 0;
    }
}