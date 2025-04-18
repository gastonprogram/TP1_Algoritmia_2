package prin;

import api.heapTDA;
import imp.heapIMP;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heapTDA heap = new heapIMP();
		
		heap.inicializarHeap();

		heap.insercion(20);
		heap.insercion(10);
		
		heap.insercion(30);
		heap.insercion(25);

		System.out.println(heap.cima());

		heap.eliminar();
		
		System.out.println(heap.cima()); 
		
		// aca imprime SOS UN NASHE DEL HEAP
	}

}
