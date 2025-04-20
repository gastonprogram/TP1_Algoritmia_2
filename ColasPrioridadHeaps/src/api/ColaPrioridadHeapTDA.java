package api;

public interface ColaPrioridadHeapTDA {
	void InicializarCola () ;
	void AcolarPrioridad (int x, int prioridad);
	void Desacolar() ;
	void HeapSort();
	int Primero();
	boolean ColaVacia ();
	int Prioridad() ;
}