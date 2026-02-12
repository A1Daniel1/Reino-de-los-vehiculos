import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class App {
    VehiculoFactory factory = new VehiculoFactory();
    List<Vehiculo> vehiculos;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("Bienvenido al reino de vehículos!");
        iniciarCompra();
        mostrarFactura();
    }


    /* Metodo para iniciar el formulario de compra
    *  
    */
    public static void iniciarCompra() {
        boolean compraFinalizada = false;
        int tipoVehiculo = 0;
        int categoriaVehiculo = 0;
        boolean agregarOtroVehiculo = false;

        while (!compraFinalizada) { 
            system.out.println("Seleccione el tipo de vehículo:");
            system.out.println("1. Tierra");
            system.out.println("2. Acuático");
            system.out.println("3. Aereo");

            tipoVehiculo = system.in.println("Ingrese opcion: ");

            system.out.println("Seleccione la categoría del vehículo:");
            system.out.println("1. Economico");
            system.out.println("2. Lujo");
            system.out.println("3. Usado");

            categoriaVehiculo = system.in.println("Ingrese opcion: ");
            
            Vehiculo vehiculo = factory.crearVehiculo(tipoVehiculo, categoriaVehiculo);
            vehiculos.add(vehiculo);

            system.out.println("¿Desea agregar otro vehículo? (si/no)");
            String respuesta = system.in.println("Ingrese opcion: ");

            if (respuesta.equalsIgnoreCase("no")) {
                compraFinalizada = true;
                system.out.println("¡Gracias por su compra!");
            }
        }
    }

    public void mostrarFactura() {
        // TODO: mostrar la factura como esta en el teams
    }
}
