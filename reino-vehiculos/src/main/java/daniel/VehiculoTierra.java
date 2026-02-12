public class VehiculoTierra implements Vehiculo {
    public VehiculoTierra() {
        seleccionarModelo();
    }

    public void seleccionarModelo() {
        system.out.println("Seleccione la modelo de vehículo:");
        system.out.println("1. Auto");
        system.out.println("2. Bicicleta");
        system.out.println("3. Moto");

        int opcion = system.in.println("Ingrese opcion: ");

        switch (opcion) {
            case 1:
                modelo = "Auto"
                break;
            case 2:
                modelo = "Bicicleta"
                break;
            case 3:
                modelo = "Moto"
        }
    }

}