import java.util.ArrayList;
public class Zombie{
    
    private String Nombre;
    public int salud;
    private String Fecha;
    public String tipoSangre;
    ArrayList<Zombie> InformacionZombies = new ArrayList();
    public int contadorZ;
    
     public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFechadeNacimiento(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public ArrayList<Zombie> getInformacionZombies() {
        return InformacionZombies;
    }

    public void setInformacionZombies(Zombie InformacionZombies) {
        this.InformacionZombies.add(InformacionZombies);
        contadorZ++;
    }
    
        
        @Override
    public String toString() {
        return "Zombie{" + "Nombre = " + Nombre + ", salud = " + salud + ", FechadeNacimiento = " + Fecha + ", TipodeSangre = " + tipoSangre + '}';
    }
        
    
}
