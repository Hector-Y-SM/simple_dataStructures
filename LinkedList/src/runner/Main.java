package runner;
import java.util.Scanner;

public class Main {	
	static Scanner scanner = new Scanner(System.in);
	static List list = new List();
	static RunnerOpt opt = new RunnerOpt(list, scanner);
	
	public static void main(String[] args) {
		boolean flag = false;

			while(!flag){
				try {
					System.out.println("Registro de corredores, selecciona lo que sea necesario: ");
					System.out.println("1. Registrar un corredor");
					System.out.println("2. Eliminar un corredor");
					System.out.println("3. Ver todos los corredores registrados");
					System.out.println("4. Editar los datos de un corredor");
					System.out.println("5. salir");
					
					int input = scanner.nextInt();
					scanner.nextLine();
					switch(input) {
						case 1: 
							System.out.println("1. Registrar un corredor al incio de la lista");
							System.out.println("2. Registrar un corredor en cualquier posicion de la lista");
							System.out.println("3. Registrar un corredor al final de la lista");
							System.out.println("4. Volver al menu principal");
							int res = scanner.nextInt();
							scanner.nextLine();
							if(res == 4) { break; }
							System.out.println("Llena todos los campos para poder registrar un corredor:");
							opt.registrarCorredor(res);
							break;
						case 2: 
							if (list.getRunnersLength() == 0) {
								System.out.println("No hay registros para ser eliminados, registra un corredor para poder acceder");
								break;
							}
							
							opt.runnersList();
							System.out.println("Ingresa el PL del corredor que sera eliminado de la lista?");
							int del = scanner.nextInt();
							scanner.nextLine();
							list.deleteRunner(del);
							if (del <= list.getRunnersLength()) { System.out.println("Corredor eliminado de la lista"); }
							break;
						case 3:
							if(list.getRunnersLength() == 0) {
								System.out.println("No hay ningun registro aun, la lista esta vacia");
							} else {
								opt.runnersList();
							}
							break;
						case 4:
							if(list.getRunnersLength() == 0) {
								System.out.println("No hay ningun registro disponible para editar, la lista esta vacia");
							} else {
								opt.runnersList();
								opt.editMenu();
							}
							break;
						case 5: System.out.println("Adios, gracias por usar:)");
							flag = true;	
							break;
						default: System.out.println("opcion no valida");
					}
				} catch (Exception e) {
		            System.out.println("Respuesta no admitida, por favor ingresa una respuesta en formato valido");
		            scanner.nextLine(); 
		        }
			} 
			scanner.close();
    }
}
