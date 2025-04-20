package pruebas;

import api.ColaPrioridadHeapTDA;
import imp.ColaPrioridadHeapsIMP;

public class prueba1 {

	public static void main(String[] args) {


		ColaPrioridadHeapTDA cola = new ColaPrioridadHeapsIMP();
		
        cola.InicializarCola();

		System.out.println(cola.ColaVacia());

        cola.AcolarPrioridad(10, 2); 
        cola.AcolarPrioridad(20, 5); 
        cola.AcolarPrioridad(5, 1); 
        cola.AcolarPrioridad(35, 3); 
        

		System.out.println(cola.Prioridad());
		
		cola.Desacolar();
		cola.AcolarPrioridad(1, 10);
		cola.AcolarPrioridad(15, 3);
		cola.AcolarPrioridad(25, 7);
		

		System.out.println(cola.Prioridad());

		System.out.println(cola.ColaVacia());
        
        cola.HeapSort();
        
        
        
        
        		
	}
}