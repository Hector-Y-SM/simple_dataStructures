package runner;
import java.util.Scanner;

public class RunnerOpt {
    private List list;
    private Scanner scanner;

    public RunnerOpt(List list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void runnersList() {
        int i = 0;
        System.out.println("Corredores registrados: ");
        while(i < list.getRunnersLength()) {
            Runner runner = list.getAllRunners(i);
            System.out.println("PL: " + i + " Nombre: " + runner.getRunnerName() + " " + runner.getRunnerLastName() +
                                " Edad: "+ runner.getRunnerAge());
            i++;
        }
    }

    public void registrarCorredor(int n) {
        int lugar = 0;
        if(n == 2) {
            System.out.println("En que posicion quieres registrar a este corredor");
            lugar = scanner.nextInt();
            scanner.nextLine();
            if(lugar > list.getRunnersLength() && lugar != 0) {
                System.out.println("No es posible insertar el corredor en este nodo, la longitud de la lista es de: "+list.getRunnersLength());
                return;
            }
        }
        
        System.out.println("Nombre del corredor: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellido del corredor: ");
        String apellido = scanner.nextLine();
        System.out.println("Edad del corredor: ");
        int edad = scanner.nextInt();
        System.out.println("Corredor guardado");
        Runner runner = new Runner(nombre, apellido, edad);
        
        switch(n) {
            case 1 -> list.createRunner(runner);
            case 2 -> list.createRunnerSpecific(lugar, runner);
            case 3 -> list.createRunnerFinallyList(runner);
            default -> 	System.out.println("Opcion invalida");
        }
    }

    public void editMenu() {
        System.out.println("Bienvenido al menu de edicion, que corredor sera editado? (ingresar PL)");
        int edit = scanner.nextInt();
        scanner.nextLine();
        Runner runner = list.getRunner(edit);
        System.out.println("El corredor con PL: "+edit+" tiene los siguientes datos");
        System.out.println("Nombre: "+runner.getRunnerName());
        System.out.println("Apellido: "+runner.getRunnerLastName());
        System.out.println("Edad: "+runner.getRunnerAge());
        editInputs(runner);
    }

    public void editInputs(Runner runner) {
        boolean flag = false;
        while(!flag) {
            System.out.println("Datos disponibles para modificar");
            System.out.println("1. Nombre");
            System.out.println("2. Apellido");
            System.out.println("3. Edad");
            System.out.println("4. Guardar");
            
            int opt = scanner.nextInt();
            scanner.nextLine();
            switch(opt) {
                case 1:
                    System.out.println("Ingresa el nuevo nombre para: "+runner.getRunnerName());
                    String name = scanner.nextLine();
                    if(name == "") {
                        System.out.println("El nombre no puede ser un campo vacio, ingresa un nombre valido");
                        break;
                    }
                    String newName = (runner.getRunnerName() != name)? name : runner.getRunnerName();
                    runner.setRunnerName(newName);
                    break;
                case 2:
                    System.out.println("Ingresa el nuevo apellido para: "+runner.getRunnerLastName());
                    String Lastname = scanner.nextLine();
                    if(Lastname == "") {
                        System.out.println("El nombre no puede ser un campo vacio, ingresa un nombre valido");
                        break;
                    }
                    String newLastName = (runner.getRunnerLastName() != Lastname)? Lastname : runner.getRunnerLastName();
                    runner.setRunnerLastName(newLastName);
                    break;
                case 3:
                    System.out.println("Ingresa la nueva edad para: "+runner.getRunnerName()+ " edad: "+ runner.getRunnerAge());
                    int age = scanner.nextInt();
                    int newAge = (runner.getRunnerAge() != age)? age : runner.getRunnerAge();
                    runner.setRunnerAge(newAge);
                    break;
                case 4:
                    flag = true;
                    break;
            }
        }		
    }
}
