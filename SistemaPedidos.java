import java.util.List;
import java.util.Date;

public class SistemaPedidos {
    
    // Clase Cliente
    public class Cliente {
        private String nombre;
        private String direccion;

        public Cliente(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }

    // Clase Pedido
    public class Pedido {
        private int numPedido;
        private List<String> articulos;
        private Cliente cliente;

        public Pedido(int numPedido, List<String> articulos, Cliente cliente) {
            this.numPedido = numPedido;
            this.articulos = articulos;
            this.cliente = cliente;
        }

        // Getters y Setters
        public int getNumPedido() {
            return numPedido;
        }

        public void setNumPedido(int numPedido) {
            this.numPedido = numPedido;
        }

        public List<String> getArticulos() {
            return articulos;
        }

        public void setArticulos(List<String> articulos) {
            this.articulos = articulos;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
    }

    // Clase Pago
    public class Pago {
        private int numPedido;
        private String metodoPago;
        private double total;

        public Pago(int numPedido, String metodoPago, double total) {
            this.numPedido = numPedido;
            this.metodoPago = metodoPago;
            this.total = total;
        }

        // Getters y Setters
        public int getNumPedido() {
            return numPedido;
        }

        public void setNumPedido(int numPedido) {
            this.numPedido = numPedido;
        }

        public String getMetodoPago() {
            return metodoPago;
        }

        public void setMetodoPago(String metodoPago) {
            this.metodoPago = metodoPago;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }
    }

    // Clase Notificacion
    public class Notificacion {
        private int numPedido;
        private String guia;
        private Date fechaEntrega;
        private String correo;

        public Notificacion(int numPedido, String guia, Date fechaEntrega, String correo) {
            this.numPedido = numPedido;
            this.guia = guia;
            this.fechaEntrega = fechaEntrega;
            this.correo = correo;
        }

        // Getters y Setters
        public int getNumPedido() {
            return numPedido;
        }

        public void setNumPedido(int numPedido) {
            this.numPedido = numPedido;
        }

        public String getGuia() {
            return guia;
        }

        public void setGuia(String guia) {
            this.guia = guia;
        }

        public Date getFechaEntrega() {
            return fechaEntrega;
        }

        public void setFechaEntrega(Date fechaEntrega) {
            this.fechaEntrega = fechaEntrega;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }
    }
}
