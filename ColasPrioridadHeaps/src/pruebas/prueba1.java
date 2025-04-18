package pruebas;

import api.ColaPrioridadHeapTDA;
import imp.ColaPrioridadHeapsIMP;

public class prueba1 {

	public static void main(String[] args) {


		ColaPrioridadHeapTDA cola = new ColaPrioridadHeapsIMP();
        cola.InicializarCola();

        // Insertamos elementos con distintas prioridades
        cola.AcolarPrioridad(100, 2); // valor 100, prioridad 2
        cola.AcolarPrioridad(200, 5); // valor 200, prioridad 5
        cola.AcolarPrioridad(300, 1); // valor 300, prioridad 1
        cola.AcolarPrioridad(400, 3); // valor 400, prioridad 3
        
        //mostrar los elementos en orden (por prioridad)
        cola.HeapSort();
        
        
        
        
        		
	}
}