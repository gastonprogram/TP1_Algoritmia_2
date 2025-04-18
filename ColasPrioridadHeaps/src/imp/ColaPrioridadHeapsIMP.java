package imp;

import api.ColaPrioridadHeapTDA;

public class ColaPrioridadHeapsIMP implements ColaPrioridadHeapTDA {
	
	class Elemento {
        int valor;
        int prioridad;
    }

    Elemento[] heap;
    int tamaño;
    
	@Override
	public void InicializarCola() {
		
		heap = new Elemento[100];
        tamaño = 0;

	}

	@Override
	public void AcolarPrioridad(int x, int prioridad) {
		 Elemento nuevo = new Elemento();
	        nuevo.valor = x;
	        nuevo.prioridad = prioridad;

	        heap[tamaño] = nuevo; //insertar elemento
	        intercambiarHaciaArriba(tamaño); //conservar propiedad heap
	        tamaño++;
	}

	@Override
	public void Desacolar() {
		if (tamaño == 0) return;

        heap[0] = heap[tamaño - 1]; //reemplazar raíz con último
        tamaño--;
        intercambiarHaciaAbajo(0); //conservar propiedad heap
	}
	
	@Override
	public void HeapSort() {
	    // Crear una copia del heap actual
	    ColaPrioridadHeapsIMP copia = new ColaPrioridadHeapsIMP();
	    copia.InicializarCola();

	    for (int i = 0; i < tamaño; i++) {
	        copia.AcolarPrioridad(heap[i].valor, heap[i].prioridad);
	    }

	    // Desacolar desde la copia usando sus propios métodos
	    System.out.println("Elementos en orden de prioridad:");
	    while (!copia.ColaVacia()) {
	        System.out.println("Valor: " + copia.Primero() + " | Prioridad: " + copia.Prioridad());
	        copia.Desacolar();
	    }
	}

	@Override
	public int Primero() {
		return heap[0].valor;
	}

	@Override
	public boolean ColaVacia() {
		
		return (tamaño == 0);
	}

	@Override
	public int Prioridad() {

		return heap[0].prioridad;

	}
	
	// metodos privados
	private void intercambiar(int i, int j) {
        Elemento temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void intercambiarHaciaArriba(int i) {
        while (i > 0) {
            int padre = (i - 1) / 2;
            if (heap[i].prioridad > heap[padre].prioridad) {
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

        if (hijoIzq < tamaño && heap[hijoIzq].prioridad > heap[mayor].prioridad) {
            mayor = hijoIzq;
        }

        if (hijoDer < tamaño && heap[hijoDer].prioridad > heap[mayor].prioridad) {
            mayor = hijoDer;
        }

        if (mayor != i) {
            intercambiar(i, mayor);
            intercambiarHaciaAbajo(mayor); // recursivo
        }
    }
}

