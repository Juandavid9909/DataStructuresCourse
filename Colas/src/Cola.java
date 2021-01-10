public class Cola {
    NodoCola primero, ultimo;
    int tamanio;

    public Cola() {
        this.primero = this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean empty() {
        return this.primero == null;
    }

    public void insert(int dato) {
        NodoCola nuevo = new NodoCola(dato);

        if(empty()) {
            this.primero = nuevo;
        }
        else {
            this.ultimo.siguiente = nuevo;
        }
        this.ultimo = nuevo;
        this.tamanio++;
    }

    public int delete() {
        int tmp = this.primero.dato;
        this.primero = this.primero.siguiente;
        this.tamanio--;

        return tmp;
    }

    public int inicio() {
        return this.primero.dato;
    }

    public int size() {
        return this.tamanio;
    }
}