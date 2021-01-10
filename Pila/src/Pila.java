public class Pila {
    private NodoPila ultimo;
    int tamanio;

    public Pila() {
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean empty() {
        return this.ultimo == null;
    }

    public void push(int dato) {
        NodoPila nuevo = new NodoPila(dato);
        nuevo.siguiente = this.ultimo;
        this.ultimo = nuevo;
        this.tamanio++;
    }

    public int pop() {
        int tmp = this.ultimo.dato;
        this.ultimo = this.ultimo.siguiente;
        this.tamanio--;
        return tmp;
    }

    public int peek() {
        return this.ultimo.dato;
    }

    public int size() {
        return this.tamanio;
    }

    public void clear() {
        while(!empty()) {
            pop();
        }
    }
}