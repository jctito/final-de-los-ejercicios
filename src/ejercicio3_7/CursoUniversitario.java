package ejercicio3_7;

import java.util.Scanner;

    public class CursoUniversitario {
        Estudiante[] estudiantes;
        int cantidadEstudiantes;

        public CursoUniversitario(int capacidad) {
            estudiantes = new Estudiante[capacidad];
            cantidadEstudiantes = 0;
        }

        public void añadirEstudiante(Estudiante estudiante) {
            for (Estudiante e : estudiantes) {
                if (e != null && e.codigo == estudiante.codigo) {
                    System.out.println("Error: El código del estudiante ya existe.");
                    return;
                }
            }
            if (cantidadEstudiantes < estudiantes.length) {
                estudiantes[cantidadEstudiantes++] = estudiante;
                System.out.println("Estudiante añadido correctamente.");
            } else {
                System.out.println("Error: No hay espacio para más estudiantes.");
            }
        }

        public void buscarEstudiante(int codigo) {
            for (Estudiante e : estudiantes) {
                if (e != null && e.codigo == codigo) {
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
            for (int i = 0; i < cantidadEstudiantes; i++) {
                Estudiante e = estudiantes[i];
                if (e != null && e.codigo == codigo) {
                    System.out.println("Estudiante encontrado:");
                    System.out.println("Nombre: " + e.nombre + " " + e.apellido);
                    System.out.println("Código: " + e.codigo);
                    System.out.println("Semestre: " + e.semestre);
                    System.out.println("Nota Final: " + e.notaFinal);
                    System.out.println("¿Está seguro de que desea eliminar este estudiante? (S/N)");
                    Scanner scanner = new Scanner(System.in);
                    String respuesta = scanner.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        eliminarEstudianteEnIndice(i);
                        System.out.println("Estudiante eliminado correctamente.");
                    } else {
                        System.out.println("Estudiante no eliminado.");
                    }
                    return;
                }
            }
            System.out.println("Estudiante no encontrado.");
        }

        private void eliminarEstudianteEnIndice(int indice) {
            for (int i = indice; i < cantidadEstudiantes - 1; i++) {
                estudiantes[i] = estudiantes[i + 1];
            }
            estudiantes[cantidadEstudiantes - 1] = null;
            cantidadEstudiantes--;
        }

        public double calcularPromedio() {
            double sumaNotas = 0;
            for (Estudiante e : estudiantes) {
                if (e != null) {
                    sumaNotas += e.notaFinal;
                }
            }
            return cantidadEstudiantes > 0 ? sumaNotas / cantidadEstudiantes : 0;
        }

        public int contarEstudiantesAprobados() {
            int contador = 0;
            for (Estudiante e : estudiantes) {
                if (e != null && e.notaFinal >= 3.0) {
                    contador++;
                }
            }
            return contador;
        }

        public double calcularPorcentajeAprobados() {
            int totalEstudiantes = cantidadEstudiantes;
            if (totalEstudiantes > 0) {
                int aprobados = contarEstudiantesAprobados();
                return (double) aprobados / totalEstudiantes * 100;
            } else {
                return 0;
            }
        }
}
