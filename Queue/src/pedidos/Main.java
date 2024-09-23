package pedidos;

public class Main {
		public static void main(String [] args) {
			Queue queue = new Queue();
			Order or  = new Order(0, "natilla");
			Order or1 = new Order(1, "natilla");
			Order or2 = new Order(2, "natilla");
			Order or3 = new Order(3, "natilla");
			Order or4 = new Order(4, "natilla");
			Order or5 = new Order(5, "natilla");
			
			queue.enqueue(or);
			queue.enqueue(or1);
			//miColaProceso.eliminar();
			//System.out.println(miColaProceso.obtener());
			queue.enqueue(or2);
			queue.enqueue(or3);
			queue.enqueue(or4);
			queue.enqueue(or5);
			
			//System.out.println(miColaProceso.isEmpty());
			//System.out.println(miColaProceso.size());
			//System.out.println(queue.get(0));
			//queue.clear();
			//System.out.println(miColaProceso.getHead());
		}
	}

