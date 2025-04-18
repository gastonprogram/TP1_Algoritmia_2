package imp;

import api.heapTDA;

public class heapIMP implements heapTDA {

	class Elemento{
		int valor;
	}
	
	Elemento[] heap;
	int tamaño;
	
	@Override
	public void inicializarHeap() {
		heap = new Elemento[100];
		tamaño = 0;

	}

	@Override
	public void insercion(int x) {
		Elemento nuevo = new Elemento();
        nuevo.valor = x;
        heap[tamaño] = nuevo;
        intercambiarHaciaArriba(tamaño);
        tamaño++;

	}

	@Override
	public void eliminar() {
		if (tamaño == 0) return;

        heap[0] = heap[tamaño - 1];
        tamaño--;
        intercambiarHaciaAbajo(0);

	}

	private void intercambiarHaciaArriba(int indice) {
		while (indice > 0 && heap[indice].valor > heap[padre(indice)].valor) {
            intercambiar(indice, padre(indice));
            indice = padre(indice);
        }

	}

	private void intercambiarHaciaAbajo(int indice) {
		int mayor = indice;
        int izq = hijoIzq(indice);
        int der = hijoDer(indice);

        if (izq < tamaño && heap[izq].valor > heap[mayor].valor) {
            mayor = izq;
        }
        if (der < tamaño && heap[der].valor > heap[mayor].valor) {
            mayor = der;
        }
        if (mayor != indice) {
            intercambiar(indice, mayor);
            intercambiarHaciaAbajo(mayor);
        }

	}
	
	private int padre(int i){
	        return (i - 1) / 2;
	}

	private int hijoIzq(int i){
	        return 2 * i + 1;
	}

	private int hijoDer(int i){
	        return 2 * i + 2;
	}

	private void intercambiar(int i, int j) {
	        Elemento temp = heap[i];
	        heap[i] = heap[j];
	        heap[j] = temp;
	}

	@Override
	public boolean estaVacio() {
		// TODO Auto-generated method stub
		return (tamaño == 0);
	}

	@Override
	public int cima() {
		 if (tamaño == 0) return -1; 
	        return heap[0].valor;
	}

}
