package ejercicio3_7;

import java.util.Vector;

    public class Tienda2 {
        String nombre;
        String propietario;
        int identificadorTributario;
        Vector computadores;
        public Tienda2(String nombre, String propietario, int identificadorTributario) {
            this.nombre = nombre;
            this.propietario = this.propietario;
            this.identificadorTributario = identificadorTributario;
            computadores = new Vector();
        }
        public boolean tiendaLlena() {
            return false;
        }
        public boolean tiendaVacío() {
            return computadores.size() == 0;
        }
        public void añadir(Computador computador) {
            computadores.add(computador);
        }
        public boolean eliminar(String marcaComputador) {
            int pos = buscar(marcaComputador);
            if (pos < 0 ) {
                return false;
            }
            computadores.removeElementAt(pos);
            return true;
        }
        public int buscar(String marcaComputador) {
            Computador computador;
            for (int i = 0; i < computadores.size(); i ++) {
                computador = (Computador) computadores.elementAt(i);
                if (computador.marca.equals(marcaComputador))
                    return i;
            }
            return 1;
        }
        public void imprimir() {
            for (int i = 0; i < computadores.size(); i ++) {
                System.out.println("Computador" + i);
                Computador computador = (Computador) computadores.elementAt(i);
                System.out.println("Marca = " + computador.marca);
                System.out.println("Cantidad de memoria = " + computador.cantidadMemoria);
                System.out.println("Características del procesador = " + computador.característicasProcesador);
                System.out.println("Sistema operativo = " + computador.sistemaOperativo);
                System.out.println("Precio = " + computador.precio);
            }
        }
}
