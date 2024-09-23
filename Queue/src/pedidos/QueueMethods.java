package pedidos;

public interface QueueMethods {
	void enqueue(Order pedido);
	void pop();
	Order getHead();
	Order get(int n);
}