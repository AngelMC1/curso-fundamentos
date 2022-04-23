import java.util.ArrayList;
public class Ubicacion{
    private String NombreU;
    private float Distancia;
    private int NumeroZombies;
    ArrayList <Ubicacion> InformacionUbicacion = new ArrayList();
    public int contadorU;
    
    public String getNombreU() {
        return NombreU;
    }

    public void setNombreU(String NombreU) {
        this.NombreU = NombreU;
    }
    
    public float getDistancia() {
        return Distancia;
    }

    public void setDistancia(float Distancia) {
        this.Distancia = Distancia;
    }

    public int getNumeroZombies() {
        return NumeroZombies;
    }
    
    public void setNumeroZombies(int NumeroZombies) {
        this.NumeroZombies = NumeroZombies;
    }
    
     public ArrayList<Ubicacion> getInformacionUbicacion() {
        return InformacionUbicacion;
    }
    
    public void setInformacionUbicacion(Ubicacion InformacionUbicacion) {
        this.InformacionUbicacion.add(InformacionUbicacion);
        contadorU++;
    }
        @Override
        public String toString() {
            return "Ubicacion{" + "Nombre = " + NombreU + ", Distancia hasta Alexandria = " + Distancia + ", Zombies en la zona = " + NumeroZombies +  '}';
        
        }
    }
    

