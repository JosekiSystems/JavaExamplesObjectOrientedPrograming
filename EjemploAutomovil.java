import  java.util.Date;
public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        
        Automovil subaru = new Automovil("Subaru", "Impreza");

        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        
        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque());
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL), new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5,TipoMotor.BENCINA), new Estanque(50));



        Automovil auto = new Automovil();
        Date fecha = new Date();

        System.out.println("objeto nissan toString  " + nissan.toString());

        System.out.println("auto.equals(nissan) = " + auto.equals(nissan));

        System.out.println("al comparar con equals constumizado, el objeto Automovil con una fecha obtenemos : " + auto.equals(fecha));

        System.out.println("Al comparar los objetos nissan 1 con nissan 2 obtenemos  : " + (nissan == nissan2));
        System.out.println("Al comparar los objetos nissan 1 con nissan 2 con la operacion equals customizada obtnemos  : " + (nissan.equals(nissan2)));

        System.out.println(subaru.verDetalle());
        System.out.println( mazda.verDetalle());
        System.out.println( nissan.verDetalle());

        System.out.println("subaru = " + subaru.acelerar(3000));
        System.out.println("subaru = " + subaru.frenar());

        System.out.println("mazda.aceleraFrenar(4000) = " + mazda.aceleraFrenar(4000));

        System.out.println("Subaru kilómetros de consumo por litro  = " + subaru.calcularConsumo(300,0.75f));

        System.out.println("Subaru kilómetros de consumo por litro2  = " + subaru.calcularConsumo(300,75));

        System.out.println("Nissan kilómetros de consumo por litro2  = " + nissan.calcularConsumo(300,75));






        System.out.println();


    }
}
