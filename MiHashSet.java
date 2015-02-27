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
        boolean encontrado = false;
        int i = 0;
        int cont = 0;
        while ((i < conjunto.length)&& !(encontrado)) {
            if (valor == conjunto[i]) {
                encontrado = true;
            }
            i++;
        }
        if (!encontrado) {
            int temp[] = new int[i + 1];
            while (cont < conjunto.length) {
                temp[cont] = conjunto[cont];
                cont++;
            }
            temp[cont] = valor;
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
    
    public void print() {
        int i = 0;
        while (i < conjunto.length) {
            System.out.println(conjunto[i]);
            i++;
        }
    }
}
