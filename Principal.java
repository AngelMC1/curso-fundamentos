import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Principal{
    public static ArrayList<Ubicacion> ubicaciones = new ArrayList<>();
    public static void main(String[] args){
        Principal.mostrarMenu();
    }

    public static void mostrarMenu(){
        Zombie z1 = new Zombie();
        Ubicacion u1 = new Ubicacion();
        Scanner sc = new Scanner(System.in);
        while(0==0){
            System.out.println("___Opciones del Sistema____");
            System.out.println("0. Finalizar Programa");
            System.out.println("1. Registrar Zombie");
            System.out.println("2. Visualizar informacion de todos los Zombies");
            System.out.println("3. Visualizar Cantidad de Zombies Creados");
            System.out.println("4. Visualizar informacion de los Zombies que tengan O+ ó AB+");
            System.out.println("5. Visualizar informacion de los Zombies nacidos despues del 2000");
            System.out.println("6. ||||Lanzar Bomba||||  (Disminuirá la salud de los Zombies al 50%)");
            System.out.println("7. Registrar Ubicacion");
            System.out.println("8. Visualizar informacion de todas las Ubicaciones ");
            System.out.println("9. Visualizar Ubicacion más segura (con menos Zombies)");
            System.out.println("10. Visualizar  Ubicaciones ordenadas por distancia de Alejandria (menor a mayor)");
            System.out.println("11. Visualizar Frase sobre Zombies ");
            System.out.println("12. Visualizar cantidad de Zombies Muertos (Con salud 0)");
            System.out.println("_____________________");
            System.out.println("");
            System.out.print("Ingrese un numero ==> ");
            int opcion = sc.nextInt();
            if(opcion == 0){
                break;
            }

            switch(opcion){
                case 1:
                    Zombie z2 = new Zombie();
                    System.out.println("_________________");
                    System.out.println("Registrar Zombie");
                    System.out.println("-----------------\n");

                    System.out.print("Nombre del Zombie ==========>  "); String Nombre = sc.next();
                    z2.setNombre(Nombre);
                    System.out.print("Salud del Zombie (0-100) ===>  "); int salud = sc.nextInt();
                    z2.setSalud(salud);
                    System.out.print("Fecha de nacimiento (AAAA/MM/DD) ==>  "); String Fecha = sc.next();
                    z2.setFechadeNacimiento(Fecha);
                    System.out.print("Tipo de sangre (A+, A-, B+, B-, AB+, AB-, O+, O-) ======>  "); String tipoSangre = sc.next();
                    z2.setTipoSangre(tipoSangre);
                    z1.setInformacionZombies(z2);
                    break;

                case 2:
                    for(int i = 0; i < z1.getInformacionZombies().size(); i++){
                        System.out.println( z1.getInformacionZombies().get(i)); 
                    }
                    break;

                case 3:
                    System.out.println("La cantidad de Zombies hasta el momento es: " + z1.contadorZ);
                    break;

                case 4:
                    String rh;
                    for(int i=0; i < z1.getInformacionZombies().size(); i++){
                        rh=z1.getInformacionZombies().get(i).getTipoSangre();
                        if(rh.equals("O+") || rh.equals("AB+")){
                            System.out.println(z1.getInformacionZombies().get(i));
                        }
                    }
                    break;

                case 5:
                    for(int i = 0; i < z1.getInformacionZombies().size(); i++){
                        String centennials;

                        centennials = z1.getInformacionZombies().get(i).getFecha().substring(0, 4);
                        int cv = Integer.valueOf(centennials);
                        if(cv > 2000){
                            System.out.println(z1.getInformacionZombies().get(i));

                        }
                    }
                    break;

                case 6:
                    System.out.println("BOOOOOOOOM 💥💥💥");
                    for(int i = 0; i < z1.getInformacionZombies().size(); i++) {
                        System.out.println(z1.getInformacionZombies().get(i).getNombre() + " / " + z1.getInformacionZombies().get(i).getSalud() + " --> " + z1.getInformacionZombies().get(i).getSalud() / 2 + " / " + z1.getInformacionZombies().get(i).getFecha() + " / " + z1.getInformacionZombies().get(i).getTipoSangre());
                        z1.getInformacionZombies().get(i).setSalud(z1.getInformacionZombies().get(i).getSalud()/2);

                    }
                    break;

                case 7:
                    Ubicacion u2= new Ubicacion();
                    System.out.println("_________________");
                    System.out.println("Registrar Ubicación");
                    System.out.println("-----------------\n");

                    System.out.print("Nombre de la Ubicación ====> "); String NombreU = sc.next();
                    u2.setNombreU(NombreU);
                    System.out.print("Distancia hasta Alexandria ===>"); float Distancia = sc.nextFloat();
                    u2.setDistancia(Distancia);
                    System.out.print("Cantidad de Zombies en el lugar ===>"); int NumeroZ = sc.nextInt();
                    u2.setNumeroZombies(NumeroZ);
                    u1.setInformacionUbicacion(u2);
                    ubicaciones.add(u2);
                    break;

                case 8:
                    for(int i = 0; i < u1.getInformacionUbicacion().size(); i++){
                        System.out.println( u1.getInformacionUbicacion().get(i)); 
                    }
                    break;

                case 9:
                    Ubicacion segura = u1.InformacionUbicacion.get(0);

                    for(int i = 1; i < u1.InformacionUbicacion.size(); i++){

                        if(u1.InformacionUbicacion.get(i).getNumeroZombies() < segura.getNumeroZombies() ){
                            segura = u1.InformacionUbicacion.get(i);
                        }

                    }
                    System.out.println("La ubicacion mas segura hasta el momento es: " + segura);
                    break;

                case 10:
                    int n = ubicaciones.size(); Ubicacion memory;
                    for(int i = 1; i < n; i++){
                        for(int j = 0; j < n-1; j++){
                            if(ubicaciones.get(j).getDistancia() > ubicaciones.get(j+1).getDistancia()){
                                memory = ubicaciones.get(j);
                                ubicaciones.set(j, ubicaciones.get(j+1));
                                ubicaciones.set(j+1, memory);
                            }
                        }
                    }
                    System.out.println("Organizar Ubicaciones :");
                    for(int i = 0; i < ubicaciones.size(); i++){
                        InformacionUbicacion(i);
                    }
                    break;

                case 11:
                    Random rdm = new Random();
                    int valor = rdm.nextInt(5);
                    FrasesDeZombies(valor);
                    break;

                case 12:
                    boolean validacion = true; 
                    for(int i = 0; i < z1.getInformacionZombies().size(); i++) {
                        if (z1.getInformacionZombies().get(i).getSalud() == 0) {
                            System.out.println(z1.getInformacionZombies().get(i).getNombre() + " Ha Muerto (✖╭╮✖)");
                            validacion = false;
                        }
                        if(validacion == true){
                            System.out.println("No hay ningun zombie muerto");
                        }
                    }
                    break;
                default:
                    System.out.println("Opción no disponible");
            }
        }
    }

    public static void InformacionUbicacion(int i) {
        System.out.println(ubicaciones.get(i).getNombreU() + " / " + ubicaciones.get(i).getDistancia() + "m" + " / " + ubicaciones.get(i).getNumeroZombies());
    }

    public static void FrasesDeZombies(int i){
        switch (i){

            case 0:
                System.out.println("\nCada ser humano que salvamos es un zombi menos que combatir");
                break;
            case 1:
                System.out.println("\n¡No pienso seguir hablando hasta que no te coloques la cabeza!");
                break;
            case 2:
                System.out.println("\nSe podría evitar el apocalipsis zombi simplemente atando juntos los cordones de los zapatos de varios muertos.");
                break;
            case 3:
                System.out.println("\nLos zombies son los únicos que te amarán por tu cerebro");
                break;
            case 4:
                System.out.println("\nSí los zombies se deshacen con el pasar del tiempo... ¿zombiodegradables?");
                break;
        }
    }
}


