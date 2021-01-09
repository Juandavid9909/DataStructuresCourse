public class ListaEnlazadaOrdenada extends ListaEnlazada {
    public ListaEnlazadaOrdenada() {
        super();
    }

    public ListaEnlazadaOrdenada insertarOrden(int dato) {
        Nodo nuevo = new Nodo(dato);

        if(this.primero == null) {
            this.primero = nuevo;
        }
        else if(dato < this.primero.getDato()) {
            nuevo.setRef(primero);
            primero = nuevo;
        }
        else {
            Nodo anterior = primero, primeroO = primero;

            while((primeroO.getRef() != null) && dato > primeroO.getDato()) {
                anterior = primeroO;
                primeroO = primeroO.getRef();
            }

            if(dato > primeroO.getDato()) {
                anterior = primeroO;
            }

            nuevo.setRef((anterior.getRef()));
            anterior.setRef(nuevo);
        }

        return this;
    }
}