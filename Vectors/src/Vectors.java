import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector vector = new Vector(20);
        vector.add("h");
        vector.add("hola");
        vector.insertElementAt("jj", 1);
        System.out.println(vector);
        vector.remove("h");
        System.out.println(vector);
        System.out.println(vector.elementAt(0));
    }
}