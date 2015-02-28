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
        int temp[] = new int[conjunto.length + 1];
        int i = 0;        
        if (!encontrado) {            
            for (; i < conjunto.length; i++) {
                temp[i] = conjunto[i];
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

    /**
     * Comprueba si el conjunto esta vacio.
     * @return Devuelve true si esta vacio,
     * false en caso contrario.
     */
    public boolean isEmpty() {
        return (conjunto.length == 0);
    }

    /**
     * Elimina un elemento del conjunto.
     * @param elemento El elmento a eliminar.
     * @return encontrado Devuelve true si existía, 
     * false en caso contrario.
     */
    public boolean remove(int elemento) {
        boolean encontrado = contains(elemento);
        boolean eliminado = false;
        int temp[] = new int[conjunto.length - 1];
        int i = 0;   
        int cont = 0;
        if (encontrado) {
            while (i < conjunto.length && !(eliminado)) {
                if (conjunto[i] == elemento) {
                    for (; cont < i; cont++) {
                        temp[cont] = conjunto[cont];
                    }
                    for (;cont < temp.length; cont++) {
                        temp[cont] = conjunto[cont + 1];
                    }
                    conjunto = temp;  
                    eliminado = true;
                }
                i++;
            }
        }        
        return encontrado;
    }    

    /**
     * Devuelve el número de elementos del conjunto.
     */
    public int size() {
        return conjunto.length;
    }

    /**
     * Devuelve una cadena conteniendo todos los elementos 
     * del conjunto separados por comas y entre corchetes.
     */
    public String toString() {
        String cadena = "[]"; 
        if (conjunto.length != 0) {
            cadena = "[" + conjunto[0];
            for (int i = 1; i < conjunto.length; i++) {
                cadena += ", " + conjunto[i];
            }
            cadena += "]";            
        }        
        return cadena;
    }

    public void print() {
        for (int i = 0; i < conjunto.length; i++) {
            System.out.println(conjunto[i]);  
        }
    }

    private void print(int con[]) {
        for (int i = 0; i < con.length; i++) {
            System.out.println(con[i]);
        }
    }
}
