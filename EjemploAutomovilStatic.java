
public class EjemploAutomovilStatic {
    public static void main(String[] args) {


        Automovil.setCapacidadEstanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO,
                new Motor(3.0,TipoMotor.DIESEL),new Estanque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.COUPE);
        Automovil nissan2 = new Automovil("Nissan","Navara", Color.GRIS,
                new Motor(8.0,TipoMotor.BENCINA),new Estanque(80));
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.COUPE);


        Automovil.setColorPatente(Color.AZUL);


        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println( mazda.verDetalle());
        System.out.println( nissan.verDetalle());
        System.out.println("nissan2 = " + nissan2.verDetalle());

        System.out.println();

        System.out.println("Atributos de los objetos");
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilómetros por litros = "+ Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        System.out.println();

        System.out.println("Kilometros por litro mazda " + mazda.calcularConsumoEstatico(300, 60));
        System.out.println("Kilometros por litro nissan " + nissan.calcularConsumoEstatico(300, 60));
        System.out.println("Kilometros por litro nissan2 " + nissan2.calcularConsumoEstatico(300, 60));

        System.out.println();
        
        TipoAutomovil tipoSubaro = subaru.getTipo();
        System.out.println("tipoSubaro.getNombre() = " + tipoSubaro.getNombre());
        System.out.println("tipoSubaro.getDescripcion() = " + tipoSubaro.getDescripcion());

        System.out.println("mazda consumo por Km = " + mazda.calcularConsumo(300,70));




        // System.out.println("mazda.leerFabricante = " + mazda.getFabricante());


    }


}
