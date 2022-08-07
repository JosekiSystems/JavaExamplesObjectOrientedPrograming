
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        

        Persona conductorSubaru = new Persona("Disco", "Stu");
        Persona conductorMazda = new Persona("Laika", "Lacrau");
        Persona conductorNissan = new Persona("Rod" , "tercero");
        Persona conductorNissan2 = new Persona("Bibi", "Lacrau");

        
        Rueda[] ruedaNiss2= new Rueda[5];
        for(int i = 0; i< ruedaNiss2.length; i++){
            ruedaNiss2[i] = new Rueda ("Pirelli",20,12.5);

        }

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);
        Rueda[] ruedasSub = new Rueda[10];
        for(int i = 0; i < ruedasSub.length; i++){
            subaru.addRueda( new Rueda("Yokohama", 16, 7.5));
        }

        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO,
                new Motor(3.0,TipoMotor.DIESEL),new Estanque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(conductorMazda);
        //mazda.setRuedas(ruedaMaz);
        Rueda[] ruedaMaz = new Rueda[5];
        for(int i = 0; i< ruedaMaz.length; i++){
            mazda.addRueda( new Rueda ("Michelin",18,10.5));
        }
        
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.COUPE);
        nissan.setConductor(conductorNissan);
        nissan.addRueda( new Rueda (" Pirelli ",20,11.5))
                .addRueda( new Rueda (" Pirelli ",20,11.5))
                .addRueda( new Rueda (" Pirelli ",20,11.5))
                .addRueda( new Rueda (" Pirelli ",20,11.5))
                .addRueda( new Rueda (" Pirelli ",20,11.5));



        
        Automovil nissan2 = new Automovil("Nissan","Navara", Color.GRIS,
                new Motor(8.0,TipoMotor.BENCINA),new Estanque(80),conductorNissan2,ruedaNiss2);
        
        
        
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.COUPE);
        Automovil.setColorPatente(Color.AZUL);


        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        System.out.println("----------------------------------");

       /* System.out.println("Ruedas Subaru");
        for(Rueda r: subaru.getRuedas()){
            System.out.println( r.getFabricante()+ " aro: " + r.getAro()+ " ancho "+ r.getAncho());
        }
        System.out.println("Conductor Subaru = " + subaru.getConductor());

        */

    }


}
