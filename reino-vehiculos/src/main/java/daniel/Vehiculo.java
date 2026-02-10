public abstract  class Vehiculo {
    /*
    * Clase vehiculo, que va a a ser el molde de todos los vehiculos del 
    * Consecionario
    */
    private int precio;
    private int velocidad;
    private String categoria;

    public Vehiculo(int p, int v, String categoria) {
        this.precio = p;
        this.velocidad = v;
        this.categoria = categoria;
    }
}