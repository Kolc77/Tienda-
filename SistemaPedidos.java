import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SistemaPedidos {

    // Clase Cliente
    public class Cliente {
        private String nombre;
        private String direccion;

        public Cliente(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public String getDireccion() {
            return direccion;
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

        // Getters
        public int getNumPedido() {
            return numPedido;
        }

        public List<String> getArticulos() {
            return articulos;
        }

        public Cliente getCliente() {
            return cliente;
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

        // Getters
        public int getNumPedido() {
            return numPedido;
        }

        public String getMetodoPago() {
            return metodoPago;
        }

        public double getTotal() {
            return total;
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

        // Getters
        public int getNumPedido() {
            return numPedido;
        }

        public String getGuia() {
            return guia;
        }

        public Date getFechaEntrega() {
            return fechaEntrega;
        }

        public String getCorreo() {
            return correo;
        }
    }

    // Método principal para probar el sistema
    public static void main(String[] args) {
        // Crear una instancia del sistema
        SistemaPedidos sistema = new SistemaPedidos();

        // Crear instancias de Cliente, Pedido, Pago y Notificacion
        Cliente cliente = sistema.new Cliente("Juan", "Calle 123");
        Pedido pedido = sistema.new Pedido(1, Arrays.asList("Articulo1", "Articulo2"), cliente); // Usar Arrays.asList()
        Pago pago = sistema.new Pago(1, "Tarjeta", 100.50);
        Notificacion notificacion = sistema.new Notificacion(1, "Guia123", new Date(), "juan@correo.com");

        // Mostrar información en consola
        System.out.println("Información del Cliente:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Dirección: " + cliente.getDireccion());

        System.out.println("\nInformación del Pedido:");
        System.out.println("Número de Pedido: " + pedido.getNumPedido());
        System.out.println("Artículos: " + String.join(", ", pedido.getArticulos()));
        System.out.println("Cliente: " + pedido.getCliente().getNombre());

        System.out.println("\nInformación del Pago:");
        System.out.println("Número de Pedido: " + pago.getNumPedido());
        System.out.println("Método de Pago: " + pago.getMetodoPago());
        System.out.println("Total: " + pago.getTotal());

        System.out.println("\nInformación de la Notificación:");
        System.out.println("Número de Pedido: " + notificacion.getNumPedido());
        System.out.println("Guía: " + notificacion.getGuia());
        System.out.println("Fecha de Entrega: " + notificacion.getFechaEntrega());
        System.out.println("Correo: " + notificacion.getCorreo());
    }
}