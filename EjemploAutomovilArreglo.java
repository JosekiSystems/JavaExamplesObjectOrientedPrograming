import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {
        

        Persona conductorSubaru = new Persona("Disco", "Stu");
        Persona conductorMazda = new Persona("Laika", "Lacrau");
        Persona conductorNissan = new Persona("Rod" , "tercero");
        Persona conductorSuzuki = new Persona("Bibi", "Lacrau");
        Persona conductorAudi = new Persona("Nina", "Leyend");


        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);


        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO,
                new Motor(3.0,TipoMotor.DIESEL),new Estanque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(conductorMazda);

        
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.COUPE);
        nissan.setConductor(conductorNissan);


        
        Automovil suzuki = new Automovil("Suzuki","Vitara", Color.GRIS,
                new Motor(1.6,TipoMotor.BENCINA),new Estanque(80));
        suzuki.setConductor(conductorSuzuki);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);


        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(conductorAudi);

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);

        for (Automovil auto : autos) {
            System.out.println(auto);
        }


       /* System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(suzuki.verDetalle());*/

        System.out.println("----------------------------------");

       /* System.out.println("Ruedas Subaru");
        for(Rueda r: subaru.getRuedas()){
            System.out.println( r.getFabricante()+ " aro: " + r.getAro()+ " ancho "+ r.getAncho());
        }
        System.out.println("Conductor Subaru = " + subaru.getConductor());

        */

    }


}
