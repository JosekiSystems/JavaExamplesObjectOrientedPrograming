
public class EjemploAutomovilEnum {
    public static void main(String[] args) {


        Automovil.setCapacidadEstanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
        Automovil auto = new Automovil();

        System.out.println();
        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipo.getDescripcion());


        tipo = mazda.getTipo();

        switch(tipo){
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");

            case COUPE ->
                System.out.println("Es un atomovil pequeño de dos puertas y normalmente deportivo");

            case FURGON->
                System.out.println("Es un atomovil utilitario de transporte");

            case HATCHBACK->
                System.out.println("Es un atomovil mediano compacto y chingon");

            case PICKUP->
                System.out.println("Es un atomovil de doble cabina o camineta");

            case SEDAN->
                System.out.println("Es un atomivil mediano");

            case STATION_WAGON->
                System.out.println("Es un atomovil grande");


                // A partir del JDK 13 en adelante la notacion del switch cambia los : por -> y no es necasaio indicar el break.

        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta :tipos){
            System.out.println(    ta +
                    " => " + ta.name()+
                    " , "  + ta.getNombre()+
                    " , "  + ta.getDescripcion()+
                    " , "  + ta.getNumeroPuerta());
            System.out.println();
        }

    }


}
