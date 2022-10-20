package TablasHash;
import java.util.Hashtable;
import java.util.Enumeration;
public class TestHashtable {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pablo",33,"Argentina");
        Persona p2 = new Persona("Juan",33,"Mexicano");
        Persona p3 = new Persona("Pedro",33,"Español");

        // Creación de tabla hash
        Hashtable<String, Persona> tabla = new Hashtable<String, Persona>();

        // Agregar a persona en la tabla
        tabla.put(p1.getNombre(),p1);
        //tabla.put(p2.getNombre()),p2;
        //tabla.put(p3.getNombre()),p3;

        // Acceso a cada elemento
        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));

        // Llamar a un desconocido
        System.out.println(tabla.get("Marcos"));

        // Obtener una enumeracion de las claves existentes
        String aux;
        Enumeration<String> keys = tabla.keys();

        while (keys.hasMoreElements()){
            aux = keys.nextElement();
            System.out.println(aux+" = "+tabla.get(aux));
        }
    }
}
