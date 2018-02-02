package lab.pkg2_leonardobanegas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_LeonardoBanegas {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Detective> det = new ArrayList();
    private ArrayList<Casos> casosresueltos = new ArrayList();
    private ArrayList<Casos> casospendientes = new ArrayList();
    private int cont = 0;
    private int pos = 0;
    private Detective a;
    private Detective b;
    private Casos casos;
    private Casos cas;

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
                    + "4) Log In\n"
                    + "5) Exit\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    agregarDetectives();
                    break;
                case 2:
                    modificar();
                    break;
                case 3:
                    eliminarDetectives();
                    break;
                case 4:
                    logIn();
                    break;
                case 5:
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

        System.out.println("-----Modificacion-----");
        System.out.println("Ingrese nombre: ");
        a.setNombre(sc.next());
        System.out.println("Ingrese edad: ");
        a.setEdad(sc.nextInt());
        System.out.println("Ingrese nacionalidad: ");
        a.setNacionalidad(sc.next());
        System.out.println("Ingrese años laborales: ");
        a.setAnoslab(sc.nextInt());
        System.out.println("Ingrese nivel: ");
        a.setNivel(sc.nextInt());
        System.out.println("Ingrese usuario: ");
        a.setUsuario(sc.next());
        System.out.println("Ingrese contraseña: ");
        a.setContra(sc.next());

    }

    private void logIn() {
        a = null;
        boolean login = false;
        System.out.println("Ingrese su usuario: ");
        String usuario = sc.next();
        System.out.println("Ingrese su contraseña: ");
        String contra = sc.next();
        for (int i = 0; i < det.size(); i++) {
            if ((det.get(i).getUsuario().equals(usuario)) && (det.get(i).getContra().equals(contra))) {
                System.out.println("gay");
                a = det.get(i);
                login = true;
            }
        }
        while (login == true) {
            System.out.println("Bienvenido " + a.getNombre());
            char resp = 's';
            while (resp == 's' || resp == 'S') {
                int opcion = 0;
                System.out.println("1) Modificar mis Datos\n"
                        + "2) Listar Mis Datos\n"
                        + "3) Listar Casos\n"
                        + "4) Registrar Casos\n"
                        + "5) Modificar Casos\n"
                        + "6) Enviar Mensaje\n"
                        + "7) Listar Mensajes\n"
                        + "8) Listar Casos Resueltos y En Proceso"
                        + "9) Log Out");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        modificarMisDatos();
                        break;
                    case 2:
                        listarMisDatos();
                        break;
                    case 3:
                        listarCasos();
                        break;
                    case 4:
                        registrarCasos();
                        break;
                    case 5:
                        modificarMisCasos();
                        break;
                    case 6:
                        enviarMensaje();
                        break;
                    case 7:
                        listarMensajes();
                        break;
                    case 8:
                        listarCasosREyEN();
                        break;
                    case 9:
                        System.out.println("Volviendo al Menu Principal");
                        System.exit(0);
                    default:
                        System.out.println("ERROR!!");
                }
                System.out.println("Continua{s/n}: ");
                resp = sc.next().charAt(0);
            }
            login = false;
        }
    }

    private void modificarMisDatos() {
        System.out.println("-----Modificacion-----");
        System.out.println("Ingrese nombre: ");
        a.setNombre(sc.next());
        System.out.println("Ingrese edad: ");
        a.setEdad(sc.nextInt());
        System.out.println("Ingrese nacionalidad: ");
        a.setNacionalidad(sc.next());
        System.out.println("Ingrese años laborales: ");
        a.setAnoslab(sc.nextInt());
        System.out.println("Ingrese nivel: ");
        a.setNivel(sc.nextInt());
        System.out.println("Ingrese usuario: ");
        a.setUsuario(sc.next());
        System.out.println("Ingrese contraseña: ");
        a.setContra(sc.next());
    }

    private void listarMisDatos() {
        System.out.println("-----Listar-----");
        System.out.println("nombre: " + a.getNombre());
        System.out.println("edad: " + a.getEdad());
        System.out.println("nacionalidad: " + a.getNacionalidad());
        System.out.println("años laborales: " + a.getAnoslab());
        System.out.println("nivel: " + a.getNivel());
        System.out.println("usuario: " + a.getUsuario());
        System.out.println("contraseña: " + a.getContra());
    }

    private void registrarCasos() {
        System.out.println("Ingrese Lugar: ");
        String lugar = sc.next();
        System.out.println("Ingrese Descripcion: ");
        String descripcion = sc.next();
        System.out.println("Ingrese tipo: ");
        System.out.println("1) Homicidio");
        System.out.println("2) Robo");
        System.out.println("3) Secuestro");
        System.out.println("4) Violacion");
        String tipo = "";
        int op = sc.nextInt();
        if (op == 1) {
            tipo = "Homicidio";
        } else if (op == 2) {
            tipo = "Robo";
        } else if (op == 3) {
            tipo = "Secuestro";
        } else if (op == 4) {
            tipo = "Violacion";
        } else {
            while (op < 1 || op > 4) {
                System.out.println("ERROR");
                System.out.println("Ingrese categoria: ");
                System.out.println("1) Homicidio");
                System.out.println("2) Robo");
                System.out.println("3) Secuestro");
                System.out.println("4) Violacion");
                tipo = "";
                op = sc.nextInt();
                if (op == 1) {
                    tipo = "Homicidio";
                } else if (op == 2) {
                    tipo = "Robo";
                } else if (op == 3) {
                    tipo = "Secuestro";
                } else if (op == 4) {
                    tipo = "Violacion";
                }
            }
        }
        System.out.println("Ingrese Detective a Cargo: ");
        String detACargo = sc.next();
        System.out.println("Ingrese tipo: ");
        System.out.println("1) En Proceso");
        System.out.println("2) Resuelto");
        String estado = "";
        int op1 = sc.nextInt();
        if (op1 == 1) {
            estado = "En Proceso";
        } else if (op1 == 2) {
            estado = "Resuelto";
        } else {
            while (op1 < 1 || op1 > 2) {
                System.out.println("ERROR");
                System.out.println("Ingrese categoria: ");
                System.out.println("1) En Proceso");
                System.out.println("2) Resuelto");
                estado = "";
                op1 = sc.nextInt();
                if (op1 == 1) {
                    estado = "En Proceso";
                } else if (op1 == 2) {
                    estado = "Resuelto";
                }
            }
        }
        System.out.println("Desea Agregar Evidencia?[s/n]");
        char respevi = sc.next().charAt(0);
        if (respevi == 's' || respevi == 'S') {
            System.out.println("Ingrese Nombre: ");
            String nombre = sc.next();
            System.out.println("Ingrese Descripcion: ");
            String des = sc.next();
            System.out.println("Ingrese Nivel de Peligro: ");
            System.out.println("1) Alto");
            System.out.println("2) Medio");
            System.out.println("3) Bajo");
            String niveldePeligro = "";
            int op2 = sc.nextInt();
            if (op2 == 1) {
                niveldePeligro = "Alto";
            } else if (op2 == 2) {
                niveldePeligro = "Medio";
            } else if (op2 == 3) {
                niveldePeligro = "Bajo";
            } else {
                while (op2 < 1 || op2 > 3) {
                    System.out.println("ERROR");
                    System.out.println("Ingrese categoria: ");
                    System.out.println("1) Alto");
                    System.out.println("2) Medio");
                    System.out.println("3) Bajo");
                    estado = "";
                    op2 = sc.nextInt();
                    if (op2 == 1) {
                        niveldePeligro = "Alto";
                    } else if (op2 == 2) {
                        niveldePeligro = "Medio";
                    } else if (op2 == 3) {
                        niveldePeligro = "Bajo";
                    }
                }
            }
            if (estado == "En Proceso") {
                casospendientes.add(new Casos(lugar, descripcion, tipo, detACargo, estado, nombre, des, niveldePeligro));
            }
            if (estado == "Resuelto") {
                casosresueltos.add(new Casos(lugar, descripcion, tipo, detACargo, estado, nombre, des, niveldePeligro));
            }

            a.getCasos().add(new Casos(lugar, descripcion, tipo, detACargo, estado, nombre, des, niveldePeligro));
        } else {
            if (estado == "En Proceso") {
                casospendientes.add(new Casos(lugar, descripcion, tipo, detACargo, estado));
            }
            if (estado == "Resuelto") {
                casosresueltos.add(new Casos(lugar, descripcion, tipo, detACargo, estado));
            }
            a.getCasos().add(new Casos(lugar, descripcion, tipo, detACargo, estado));
        }

    }

    private void modificarMisCasos() {
        int c = 1;
        for (int i = 0; i < a.getCasos().size(); i++) {
            System.out.println(c + ") " + a.getCasos().get(i));
            c++;
        }
        System.out.println("Elija Caso a Modificar");
        pos = sc.nextInt() - 1;
        casos = a.getCasos().get(pos);

        System.out.println("Ingrese Lugar: ");
        casos.setLugar(sc.next());
        System.out.println("Ingrese Descripcion: ");
        casos.setDescripcion(sc.next());
        System.out.println("Ingrese tipo: ");
        System.out.println("1) Homicidio");
        System.out.println("2) Robo");
        System.out.println("3) Secuestro");
        System.out.println("4) Violacion");
        int op = sc.nextInt();
        if (op == 1) {
            casos.setTipo("Homicidio");
        } else if (op == 2) {
            casos.setTipo("Robo");
        } else if (op == 3) {
            casos.setTipo("Secuestro");
        } else if (op == 4) {
            casos.setTipo("Violacion");
        } else {
            while (op < 1 || op > 4) {
                System.out.println("ERROR");
                System.out.println("Ingrese categoria: ");
                System.out.println("1) Homicidio");
                System.out.println("2) Robo");
                System.out.println("3) Secuestro");
                System.out.println("4) Violacion");
                op = sc.nextInt();
                if (op == 1) {
                    casos.setTipo("Homicidio");
                } else if (op == 2) {
                    casos.setTipo("Robo");
                } else if (op == 3) {
                    casos.setTipo("Secuestro");
                } else if (op == 4) {
                    casos.setTipo("Violacion");
                }
            }
        }
        System.out.println("Ingrese Detective a Cargo: ");
        casos.setDetACargo(sc.next());
        System.out.println("Ingrese Estado: ");
        System.out.println("1) En Proceso");
        System.out.println("2) Resuelto");
        int op1 = sc.nextInt();
        if (op1 == 1) {
            casos.setEstado("En Proceso");
        } else if (op1 == 2) {
            casos.setEstado("Resuelto");
        } else {
            while (op1 < 1 || op1 > 2) {
                System.out.println("ERROR");
                System.out.println("Ingrese categoria: ");
                System.out.println("1) En Proceso");
                System.out.println("2) Resuelto");
                op1 = sc.nextInt();
                if (op1 == 1) {
                    casos.setEstado("En Proceso");
                } else if (op1 == 2) {
                    casos.setEstado("Resuelto");
                }
            }
        }
        System.out.println("Desea Agregar Evidencia?[s/n]");
        char respevi = sc.next().charAt(0);
        if (respevi == 's' || respevi == 'S') {
            System.out.println("Ingrese Nombre: ");
            String nombre = sc.next();
            System.out.println("Ingrese Descripcion: ");
            String des = sc.next();
            System.out.println("Ingrese Nivel de Peligro: ");
            System.out.println("1) Alto");
            System.out.println("2) Medio");
            System.out.println("3) Bajo");
            String niveldePeligro = "";
            int op2 = sc.nextInt();
            if (op2 == 1) {
                niveldePeligro = "En Alto";
            } else if (op2 == 2) {
                niveldePeligro = "Medio";
            } else if (op2 == 3) {
                niveldePeligro = "Bajo";
            } else {
                while (op2 < 1 || op2 > 3) {
                    System.out.println("ERROR");
                    System.out.println("Ingrese categoria: ");
                    System.out.println("1) Alto");
                    System.out.println("2) Medio");
                    System.out.println("3) Bajo");
                    op2 = sc.nextInt();
                    if (op2 == 1) {
                        niveldePeligro = "Alto";
                    } else if (op2 == 2) {
                        niveldePeligro = "Medio";
                    } else if (op2 == 3) {
                        niveldePeligro = "Bajo";
                    }
                }
            }
            casos.setEvi(nombre, des, niveldePeligro);
        }
    }

    private void listarCasos() {
        int q = 1;
        for (int i = 0; i < a.getCasos().size(); i++) {
            if (a.getCasos().get(i).getTipo().equalsIgnoreCase("Homicidio")) {
                System.out.println(q + ")" + a.getCasos().get(i));
                q++;
            }
        }
        for (int i = 0; i < a.getCasos().size(); i++) {
            if (a.getCasos().get(i).getTipo().equalsIgnoreCase("Secuestros")) {
                System.out.println(q + ")" + a.getCasos().get(i));
                q++;
            }
        }
        for (int i = 0; i < a.getCasos().size(); i++) {
            if (a.getCasos().get(i).getTipo().equalsIgnoreCase("Violacion")) {
                System.out.println(q + ")" + a.getCasos().get(i));
                q++;
            }
        }
        for (int i = 0; i < a.getCasos().size(); i++) {
            if (a.getCasos().get(i).getTipo().equalsIgnoreCase("Robo")) {
                System.out.println(q + ")" + a.getCasos().get(i));
                q++;
            }
        }
    }

    private void enviarMensaje() {
        System.out.println("Lista de Detectives");
        int f = 1;
        for (int i = 0; i < det.size(); i++) {
            System.out.println(f + ")" + det.get(i).getNombre());
            f++;
        }

        System.out.println("Seleccione Detectve para Enviar Mensaje");
        int pos = sc.nextInt() - 1;
        while (a == b) {
            System.out.println("Se eligio usted mismo. Intente de nuevo:");
            System.out.println("Lista de Detectives");
            f = 1;
            for (int i = 0; i < det.size(); i++) {
                System.out.println(f + ")" + det.get(i).getNombre());
                f++;
            }

            System.out.println("Seleccione Detectve para Enviar Mensaje");
            pos = sc.nextInt() - 1;
        }
        b = det.get(pos);
        System.out.println("Ingrese Emisor");
        String emisor = sc.next();
        System.out.println("Ingrese Receptor");
        String receptor = sc.next();
        System.out.println("Ingrese Contenido");
        String contenido = sc.next();
        System.out.println("Ingrese Prioridad");
        int prioridad = sc.nextInt();
        b.getMensajes().add(new Mensaje(emisor, receptor, contenido, prioridad));
    }

    private void listarMensajes() {
        System.out.println("Lista de Mensajes");
        int f = 1;
        for (int i = 0; i < a.getMensajes().size(); i++) {
            System.out.println(f + ")" + a.getMensajes().get(i));
            f++;
        }
    }

    private void listarCasosREyEN() {
        System.out.println("Lista de Casos En Proceso");
        int f = 1;
        for (int i = 0; i < casospendientes.size(); i++) {
            System.out.println(f + ")" + casospendientes.get(i));
            f++;
        }
        System.out.println("Lista de Resueltos");
        f = 1;
        for (int i = 0; i < casosresueltos.size(); i++) {
            System.out.println(f + ")" + casosresueltos.get(i));
            f++;
        }
    }
}
