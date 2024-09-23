package pedidos;

public class Order {
	int table;
	String plate;
	
	public Order(int table, String plate) {
		this.table = table;
		this.plate = plate;
	}
	
	int getMesa(int table) { return table; }
	void setMesa(int table) { this.table = table; }
	
	String getPlato(String plate) { return plate; }
	void setPlato(String plate) { this.plate = plate; }
	
	@Override
	public String toString() {
		return "Order [table=" + table + ", plate=" + plate+ "]";
	}
}
