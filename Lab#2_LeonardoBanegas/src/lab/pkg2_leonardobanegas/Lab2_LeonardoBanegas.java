package lab.pkg2_leonardobanegas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_LeonardoBanegas {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Detective> det = new ArrayList();
    private int cont = 0;
    private int pos = 0;
    private Object a;

    public static void main(String[] args) {
        new Lab2_LeonardoBanegas();
    }

    public Lab2_LeonardoBanegas() {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            int opcion = 0;
            System.out.println("1) Agregar Detectives\n"
                    + "2) Modificar Detectives\n"
                    + "3) Eliminar Detectives\n"
                    + "4) Log In\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    agregarDetectives();
                    break;
                case 2:

                    break;
                case 3:
                    eliminarDetectives();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("ERROR!!");
            }
            System.out.println("Continua{s/n}: ");
            resp = sc.next().charAt(0);
        }
    }

    public void agregarDetectives() {
        System.out.println("Ingrese nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese nacionalidad: ");
        String nacionalidad = sc.next();
        System.out.println("Ingrese años laborales: ");
        int anoslab = sc.nextInt();
        System.out.println("Ingrese nivel: ");
        int nivel = sc.nextInt();
        System.out.println("Ingrese usuario: ");
        String usuario = sc.next();
        System.out.println("Ingrese contraseña: ");
        String contraseña = sc.next();
        det.add(new Detective(nombre, edad, nacionalidad, anoslab, nivel, usuario, contraseña));

    }

    public void eliminarDetectives() {
        int conteo = 1;
        System.out.println("----Lista de Detectives----");
        for (Detective de : det) {
            System.out.println(conteo + ")" + " " + de);
            conteo++;
        }
        System.out.println("Elija Detective a Eliminar");
        pos = sc.nextInt() - 1;
        a = det.get(pos);
        det.remove(a);

        conteo = 0;
        System.out.println("----Lista de Detectives----");
        for (Detective de : det) {
            System.out.println(conteo + " " + de);
            conteo++;
        }

    }

    public void modificar() {
        int conteo = 1;
        System.out.println("----Lista de Detectives----");
        for (Detective de : det) {
            System.out.println(conteo + ")" + " " + de);
            conteo++;
        }
        System.out.println("Elija Detective a Modificar");
        pos = sc.nextInt() - 1;
        a = det.get(pos);
        det.remove(a);
    }
}

/*switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("ERROR!!");
            }*/
