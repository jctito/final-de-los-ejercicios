package ejercicio4_1;

import java.util.Scanner;

    public class PruebaCuenta {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Cuenta de ahorros");
            System.out.println("Ingrese saldo inicial= $");
            float saldoInicialAhorros = input.nextFloat();
            System.out.print("Ingrese tasa de interés= ");
            float tasaAhorros = input.nextFloat();
            CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
            System.out.print("Ingresar cantidad a consignar: $");
            float cantidadDepositar = input.nextFloat();
            cuenta1.consignar(cantidadDepositar);
            System.out.print("Ingresar cantidad a retirar: $");
            float cantidadRetirar = input.nextFloat();
            cuenta1.retirar(cantidadRetirar);
            cuenta1.extractoMensual();
            cuenta1.imprimir();
            System.out.println("------------------------------------------------------------------");
            Libro libroBasico = new Libro("Título del libro", "Autor del libro", 29.99);
            System.out.println("Información del libro básico:");
            libroBasico.mostrarInformacion();
            System.out.println();

            LibroDeTexto libroTexto = new LibroDeTexto("Química Orgánica", "John Smith", 59.99, "Química Avanzada");
            System.out.println("Información del libro de texto:");
            libroTexto.mostrarInformacion();
            System.out.println();

            LibroDeTextoUNAL libroUNAL = new LibroDeTextoUNAL("Matemáticas Discretas", "Alice Johnson", 99.99, "Matemáticas", "Ciencias Básicas");
            System.out.println("Información del libro de la UNAL:");
            libroUNAL.mostrarInformacion();
            System.out.println();

            Novela novela = new Novela("Cien años de soledad", "Gabriel García Márquez", 27.99, "Realista");
            System.out.println("Información de la novela:");
            novela.mostrarInformacion();
            System.out.println();

        }
}
