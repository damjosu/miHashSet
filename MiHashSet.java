/**
 * Clase que emula todos los métodos de la clase HashSet sin el uso de la misma.
 * @author (Josu) 
 * @version (28/02/2015)
 */
public class MiHashSet {
    // Conjunto de números enteros.
    private int conjunto[];
    
    /**
     * Constructor de la clase MiHashSet
     */
    public MiHashSet() {
        conjunto = new int[0];
    }
    
    /**
     * Añade un elemento al conjunto.
     * @param valor El valor del elemento a añadir.
     * @return encontrado Devuelve true en caso de que el elemento no 
     * estuviera en el conjunto, false en caso contrario.
     */
    public boolean add(int valor) {
        boolean encontrado = contains(valor);
        int i = 0;        
        if (!encontrado) {
            int temp[] = new int[conjunto.length + 1];
            while (i < conjunto.length) {
                temp[i] = conjunto[i];
                i++;
            }
            temp[i] = valor;
            conjunto = temp;
        }        
        return encontrado;
    }
    
    /**
     * Vacia el conjunto
     */
    public void clear() {
        conjunto = new int[0];
    }
    
    /**
     * Comprueba si contiene el elemento.
     * @param elemento El elemento a buscar la ocurrencia.
     * @return encontrado Devuelve true si contiene el elemento,
     * false en caso contrario.
     */
    public boolean contains(int elemento) {
        boolean encontrado = false;
        int i = 0;
        while ((i < conjunto.length)&& !(encontrado)) {
            if (elemento == conjunto[i]) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    
    public void print() {
        int i = 0;
        while (i < conjunto.length) {
            System.out.println(conjunto[i]);
            i++;
        }
    }
}
