public class Automovil implements Comparable <Automovil> {

    private String fabricante;
    private String modelo;
    //private String color = COLOR_GRIS;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int id;
    private int indiceRuedas = 0;


    private TipoAutomovil tipo;


    //private static String colorPatente = "Naranja";
    private static  Color colorPatente = Color.NARANJA;

    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final  Integer VELOCIDAD_MAX_CARRETERA = 120;
    public  static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor,Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public  Automovil addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public String verDetalle(){

            String detalle =  " \n auto.id =  " + this.id+
                    " auto.fabricante = " + this.getFabricante() +
                    " \n auto.modelo = " + this.getModelo();

            if(this.getTipo() != null) {
                    detalle += " \n auto.tipo = " + this.getTipo().getDescripcion();
            }
            detalle += " \n auto.color = " + this.color+
                    " \n auto.pantenteColor = " + colorPatente ;
            if(this.motor != null) {
              detalle +=  " \n auto.cilindrada = " + this.motor.getCilindrada();
            }
            if(conductor != null) {
                detalle += " \nConductor  " + this.getConductor();
            }
            if(getRuedas() != null){
                detalle += " \nRuedas del automovil : ";
                for(Rueda r : this.getRuedas()){
                    detalle += "\n" + r.getFabricante() + " aro " + r.getAro() + " ancho " + r.getAncho();
                }
            }

            return detalle;


    }

    public String acelerar(int rpm) {

        return "el auto " + this.fabricante + " acelera a " + rpm + " rpm ";
    }

    public String frenar(){
            return this.fabricante + " " + this.modelo + " frenando! ";

    }

    public  String aceleraFrenar(int rpm){
            String acelerar = this.acelerar(rpm);
            String frenar = this.frenar();
            return  acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
            return km/(estanque.getCapacidad()*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(estanque.getCapacidad()*(porcentajeBencina)/100f);
    }
    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km/ (Automovil.capacidadEstanqueEstatico * (porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(!(obj instanceof Automovil)){
            return  false;
        }

        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return " \nid = " + this.id +
                " \nfabricante='" + fabricante + '\'' +
                " \nmodelo='" + modelo + '\'' ;

                  // " \ncolor='" + color + '\'' +
                 //  " \ncilindrada= " + motor.getCilindrada() +
                // " \ncapacidadEstanque= " + estanque.getCapacidad() +

    }

    @Override
    public int compareTo(Automovil a) {
         return this.fabricante.compareTo(a.fabricante);

         /*comparar y odenar por fabricante, modelo, conductor*/

        // return this.modelo.compareTo(a.modelo);
        //return this.conductor.toString().compareTo(a.conductor.toString());
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
/*public String verDetalle(){
        StringBuilder sb = new StringBuilder();

        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("auto.modelo = " + this.modelo);
        sb.append("auto.color = " + this.color);
        sb.append("auto.cilindrada = " + this.cilindrada);

        return sb.toString();*/

// El metodo comentado es el que se usa de forma stnadar, deje el ejmplo de codigo optimizado

}


//objeto Automovil con atributos : fabricante
//Al hacer una funcion estatica esta se aplica a todos los objetos.
/*Get Color y Set Color  modificados para funcionar con Enum regresar a  get string y
 set string para funcionar sin Enum. Tambien Enum modificad para funcionar como lista de atributos regresar enum a
 constantes y funcion verDetalle getcolor, getcolorpatente*/