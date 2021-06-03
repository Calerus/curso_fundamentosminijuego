
public class Bichos{
    
    private int salud;
    private String nombre;
    
    public Bichos(String nombre, int salud){
        this.salud = salud;
        this.nombre = nombre;
    }
    
    public String getNombre (){
    return this.nombre;
    }
    
    public void setnombre (String nombre){
    this.nombre = nombre;
    }
    
    public int getSalud (){
    return this.salud;
    }
    
    public void setsalud (int salud){
    this.salud = salud;
    }
    
    public String toString(){
        return this.nombre+ "-" +this.salud;
    }
    
    public void atacar(){
        this.setsalud(this.getSalud()-5);
    }
}