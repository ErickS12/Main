
 public class Combo {
        private String nombre;
        private double precio;

        public Combo(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setNombre(String nuevoNombre) {
            this.nombre = nuevoNombre;
        }

        public void setPrecio(double nuevoPrecio) {
            this.precio = nuevoPrecio;
        }

        // Método para convertir el combo a una cadena de texto
        @Override
        public String toString() {
            return nombre + "," + precio;
        }
    }
