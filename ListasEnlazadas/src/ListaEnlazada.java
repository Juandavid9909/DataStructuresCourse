public class ListaEnlazada {
    protected Nodo primero;

    public ListaEnlazada() {
        this.primero = null;
    }

    public ListaEnlazada agregarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);

        nuevo.referencia = this.primero;
        this.primero = nuevo;
        return this;
    }

    public void agregarFinal(int dato) {
        Nodo nuevoF;
        nuevoF = new Nodo(dato);
        nuevoF.referencia = null;

        if(this.primero == null) {
            this.primero = nuevoF;
            return;
        }

        Nodo tmp;

        for(tmp = this.primero; tmp.getRef() != null; tmp = tmp.getRef());
        tmp.setRef(nuevoF);
    }

    public Nodo buscar(int dato) {
        Nodo nodob;

        for(nodob = this.primero; nodob != null; nodob.getRef()) {
            if(dato == nodob.dato) {
                return nodob;
            }
        }

        return null;
    }

    public void eliminar(int dato) {
        boolean encontrado = false;
        Nodo actual = this.primero, anterior = null;

        while(actual != null && !encontrado) {
            encontrado = (actual.dato == dato);
            if(!encontrado) {
                anterior = actual;
                actual = actual.getRef();
            }
        }

        if(actual != null) {
            if(actual == this.primero) {
                this.primero = actual.referencia;
            }
            else {
                anterior.setRef(actual.referencia);
            }
        }
    }

    public void verLista() {
        Nodo nodov = this.primero;

        while(nodov != null) {
            System.out.println(nodov.dato);
            nodov = nodov.referencia;
        }
    }
}