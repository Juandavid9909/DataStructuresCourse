import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(8);

        for(Iterator<Integer> i = treeSet.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }

        /* ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.insertar(1);
        arbolBinario.insertar(10);
        arbolBinario.insertar(7);
        arbolBinario.insertar(5);
        arbolBinario.insertar(8);
        arbolBinario.ver(arbolBinario.raiz); */
    }
}