import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre = " ";
        String apellido = " ";
        int opc = 0;
        int id = 0;
        int idbus = 0;
        float saldo = 0;
        float monto = 0;

        Cuenta[] cuentas = new Cuenta[10];

        while (opc != -1) {
            System.out.println("Ingrese opcion: ");
            System.out.println("1. Crear cuenta vacía\n" +
                    "2. Crear cuenta saldo inicial\n" +
                    "3. Ingresar dinero\n" +
                    "4. Sacar dinero\n" +
                    "5. Ver saldo\n" +
                    "6. Salir\n");
            Scanner scanner = new Scanner(System.in);
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Ingrese nombre");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese apellido");
                    apellido = scanner.nextLine();
                    id++;

                    cuentas[id] = new Cuenta(nombre, apellido, id);

                    break;

                case 2:

                    System.out.println("Ingrese nombre:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese apellido:");
                    apellido = scanner.nextLine();
                    System.out.println("Ingrese saldo:");
                    saldo = scanner.nextFloat();
                    id++;

                    cuentas[id] = new Cuenta(nombre, apellido, id);
                    System.out.println("Cuenta creada!");

                    break;
                case 3:
                    System.out.println("Ingrse id: ");
                    idbus = scanner.nextInt();
                    if (idbus > 0 && idbus <= id) {
                        System.out.println("Ingrese monto a cargar: ");
                        monto = scanner.nextFloat();
                        cuentas[id].ingresar(monto);
                    } else {
                        System.out.println("Error! Id no encontrado.");
                    }

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }

            System.out.println("Continuar operando?");
            System.out.println("1- No");
            System.out.println("Otro- Si");
            opc = scanner.nextInt();
            if(opc == 1){
                opc = -1;
            }
        }
    }
}
