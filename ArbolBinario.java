package LabEDA05;

class Nodo<T extends Comparable<T>> { // Nodo para el árbol
    T dato;
    Nodo<T> izquierda, derecha;

    public Nodo(T dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}

public class ArbolBinario<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(T dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private Nodo<T> insertarRecursivo(Nodo<T> nodo, T dato) {
        if (nodo == null) {
            return new Nodo<>(dato);
        }
        if (dato.compareTo(nodo.dato) < 0) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, dato);
        } else if (dato.compareTo(nodo.dato) > 0) {
            nodo.derecha = insertarRecursivo(nodo.derecha, dato);
        }
        return nodo;
    }

    public void imprimirEnOrden() {
        imprimirEnOrdenRecursivo(raiz);
    }

    private void imprimirEnOrdenRecursivo(Nodo<T> nodo) {
        if (nodo != null) {
            imprimirEnOrdenRecursivo(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            imprimirEnOrdenRecursivo(nodo.derecha);
        }
    }

    public static void main(String[] args) {
        ArbolBinario<Integer> arbol = new ArbolBinario<>();
        for (int i = 1; i <= 100; i++) {
            arbol.insertar(i);
        }
        System.out.println("Elementos del árbol binario en orden:");
        arbol.imprimirEnOrden();
    }
}
