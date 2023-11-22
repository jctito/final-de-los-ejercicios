package ejercicio3_6;

import java.util.ArrayList;
import java.util.Scanner;

    public class CursoUniversitario {
        ArrayList<Estudiante> estudiantes;

        public CursoUniversitario() {
            estudiantes = new ArrayList<>();
        }

        public void añadirEstudiante(Estudiante estudiante) {
            for (Estudiante e : estudiantes) {
                if (e.codigo == estudiante.codigo) {
                    System.out.println("Error: El código del estudiante ya existe.");
                    return;
                }
            }
            estudiantes.add(estudiante);
            System.out.println("Estudiante añadido correctamente.");
        }

        public void buscarEstudiante(int codigo) {
            for (Estudiante e : estudiantes) {
                if (e.codigo == codigo) {
                    System.out.println("Estudiante encontrado:");
                    System.out.println("Nombre: " + e.nombre + " " + e.apellido);
                    System.out.println("Código: " + e.codigo);
                    System.out.println("Semestre: " + e.semestre);
                    System.out.println("Nota Final: " + e.notaFinal);
                    return;
                }
            }
            System.out.println("Estudiante no encontrado.");
        }

        public void eliminarEstudiante(int codigo) {
            for (Estudiante e : estudiantes) {
                if (e.codigo == codigo) {
                    System.out.println("Estudiante encontrado:");
                    System.out.println("Nombre: " + e.nombre + " " + e.apellido);
                    System.out.println("Código: " + e.codigo);
                    System.out.println("Semestre: " + e.semestre);
                    System.out.println("Nota Final: " + e.notaFinal);
                    System.out.println("¿Está seguro de que desea eliminar este estudiante? (S/N)");
                    Scanner scanner = new Scanner(System.in);
                    String respuesta = scanner.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        estudiantes.remove(e);
                        System.out.println("Estudiante eliminado correctamente.");
                    } else {
                        System.out.println("Estudiante no eliminado.");
                    }
                    return;
                }
            }
            System.out.println("Estudiante no encontrado.");
        }

        public double calcularPromedio() {
            double sumaNotas = 0;
            for (Estudiante e : estudiantes) {
                sumaNotas += e.notaFinal;
            }
            return estudiantes.size() > 0 ? sumaNotas / estudiantes.size() : 0;
        }

        public int contarEstudiantesAprobados() {
            int contador = 0;
            for (Estudiante e : estudiantes) {
                if (e.notaFinal >= 3.0) {
                    contador++;
                }
            }
            return contador;
        }

        public double calcularPorcentajeAprobados() {
            int totalEstudiantes = estudiantes.size();
            if (totalEstudiantes > 0) {
                int aprobados = contarEstudiantesAprobados();
                return (double) aprobados / totalEstudiantes * 100;
            } else {
                return 0;
            }
        }
}
