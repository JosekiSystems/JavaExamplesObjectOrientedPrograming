public enum TipoAutomovil {


    SEDAN("Sedan","Auto normal",4),
    STATION_WAGON("Station Wagon","Auto grande",5),
    HATCHBACK("Hatchback","Auto chingon",5),
    PICKUP("Pickup", "Paila", 3),
    COUPE("Coupe", "Atomovil deportivo",2),
    CONVERTIBLE("Convertible","Auto para Vacacionar",2),
    FURGON("Furgon", "Auto utilitario",3),
    SUV(" SUV "," Todo terreno deportivo ", 5);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
