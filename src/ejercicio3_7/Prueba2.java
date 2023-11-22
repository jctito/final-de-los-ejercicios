package ejercicio3_7;
import ejercicio3_6.CursoUniversitario;

import java.util.Scanner;
    public class Prueba2 {
        public static void main(String[] args) {
            Tienda2 tienda = new Tienda2("Tienda Cuántica","Pepito Pérez",123456);
            Computador computador1 = new Computador("Acer", 50, "InteliCore 7", "Windows", 18500000);
            Computador computador2 = new Computador("Toshiba", 80,"Intel iCore 5", "Windows", 15500000);
            Computador computador3 = new Computador("Mac", 100,"Intel iCore 7", "Mac", 2500000);
            tienda.añadir(computador1);
            tienda.añadir(computador2);
            tienda.añadir(computador3);
            Scanner sc = new Scanner(System.in);
            String marca = sc.next();
            System.out.println("El computador a buscar: " + marca +  "se encuentra en la posición " + tienda.buscar(marca));
            tienda.imprimir();
              System.out.println("------------------------------------------------------------");
            // ESTUDIANTE
            Scanner he = new Scanner(System.in);
            CursoUniversitario curso = new CursoUniversitario();
            while (true) {
                System.out.println("1. Añadir estudiante");
                System.out.println("2. Buscar estudiante");
                System.out.println("3. Eliminar estudiante");
                System.out.println("4. Calcular promedio del curso");
                System.out.println("5. Obtener cantidad y porcentaje de estudiantes aprobados");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = he.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre del estudiante: ");
                        String nombre = he.next();
                        System.out.print("Apellidos del estudiante: ");
                        String apellidos = he.next();
                        System.out.print("Código del estudiante: ");
                        int codigo = he.nextInt();
                        System.out.print("Semestre del estudiante: ");
                        int semestre = he.nextInt();
                        System.out.print("Nota final del estudiante: ");
                        double notaFinal = he.nextDouble();
                        Estudiante nuevoEstudiante = new Estudiante(nombre, apellidos, codigo, semestre, notaFinal);
                        break;
                    case 2:
                        System.out.print("Ingrese el código del estudiante a buscar: ");
                        int codigoBuscar = he.nextInt();
                        curso.buscarEstudiante(codigoBuscar);
                        break;
                    case 3:
                        System.out.print("Ingrese el código del estudiante a eliminar: ");
                        int codigoEliminar = he.nextInt();
                        curso.eliminarEstudiante(codigoEliminar);
                        break;
                    case 4:
                        double promedio = curso.calcularPromedio();
                        System.out.println("Promedio del curso: " + promedio);
                        break;
                    case 5:
                        int cantidadAprobados = curso.contarEstudiantesAprobados();
                        double porcentajeAprobados = curso.calcularPorcentajeAprobados();
                        System.out.println("Cantidad de estudiantes aprobados: " + cantidadAprobados);
                        System.out.println("Porcentaje de estudiantes aprobados: " + porcentajeAprobados + "%");
                        break;
                    case 6:
                        System.out.println("Hasta luego.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }
            }
        }
    }