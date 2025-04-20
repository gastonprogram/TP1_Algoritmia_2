package imp;

import api.heapTDA;

public class heapIMP implements heapTDA {

	class Elemento{
		int valor;
	}
	
	Elemento[] heap;
	int tamaño;
	
	@Override
	public void InicializarHeap() {
		heap = new Elemento[100];
		tamaño = 0;

	}

	@Override
	public void Acolar(int x) {
		Elemento nuevo = new Elemento();
        nuevo.valor = x;
        heap[tamaño] = nuevo;
        intercambiarHaciaArriba(tamaño);
        tamaño++;

	}

	@Override
	public void Desacolar() {
		if (tamaño == 0) return;

        heap[0] = heap[tamaño - 1];
        tamaño--;
        intercambiarHaciaAbajo(0);

	}
	
	public void HeapSort() {
		
	    heapIMP copia = new heapIMP();
	    copia.InicializarHeap();

	    for (int i = 0; i < tamaño; i++) {
	        copia.Acolar(heap[i].valor);
	    }

	    System.out.println("Elementos en orden de valor:");
	    while (!copia.ColaVacia()) {
	        System.out.println("Valor: " + copia.Primero());
	        copia.Desacolar();
	    }
	}


	private void intercambiarHaciaArriba(int i) {
		while (i > 0) {
            int padre = (i - 1) / 2;
            if (heap[i].valor > heap[padre].valor) {
                intercambiar(i, padre);
                i = padre;
            } else {
                break;
            }
        }
		
	}

	private void intercambiarHaciaAbajo(int i) {
		int hijoIzq = 2 * i + 1;
        int hijoDer = 2 * i + 2;
        int mayor = i;

        if (hijoIzq < tamaño && heap[hijoIzq].valor > heap[mayor].valor) {
            mayor = hijoIzq;
        }
        if (hijoDer < tamaño && heap[hijoDer].valor > heap[mayor].valor) {
            mayor = hijoDer;
        }
        if (mayor != i) {
            intercambiar(i, mayor);
            intercambiarHaciaAbajo(mayor);
        }

	}

	private void intercambiar(int i, int j) {
	        Elemento temp = heap[i];
	        heap[i] = heap[j];
	        heap[j] = temp;
	}

	@Override
	public boolean ColaVacia() {

		return (tamaño == 0);
	}

	@Override
	public int Primero() {
		 if (tamaño == 0) return -1; 
	        return heap[0].valor;
	}

	
}
