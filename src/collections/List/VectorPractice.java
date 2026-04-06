package collections.List;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<String> vector =new Vector<>();
        System.out.println("default capacity : " + vector.capacity());
        vector.add("sgm");
        vector.add("lakshu");
        System.out.println("After adding : " + vector.capacity());
        vector.add("kaviya"); // Triggers resize (2 → 4)
        System.out.println("Capacity after adding 3rd element: " + vector.capacity());
    }
}
