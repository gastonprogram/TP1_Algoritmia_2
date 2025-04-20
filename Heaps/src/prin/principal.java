package prin;

import api.heapTDA;
import imp.heapIMP;

public class principal {

	public static void main(String[] args) {
		
		heapTDA heap = new heapIMP();
		
		heap.InicializarHeap();
		
		System.out.println(heap.ColaVacia());

		heap.Acolar(20);
		heap.Acolar(10);
		heap.Acolar(30);
		heap.Acolar(25);

		System.out.println(heap.Primero());

		heap.Desacolar();
		heap.Acolar(45);
		heap.Acolar(15);
		heap.Acolar(35);

		System.out.println(heap.ColaVacia());
		
		heap.HeapSort();
		
	}

}
