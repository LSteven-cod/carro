
/**
 * Write a description of class carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carro
{
    String color;
    double galones;
    boolean encendido;
    int puertas;
    double motor;
/**
     * Constructor for objects of class carro
     */
    public carro()
    {
        // initialise instance variables
        this.color= "negro"; 
        this.galones= 30.5;
        this.encendido= false;
        this.motor= 1.5;
        
    }
    
     public carro(String newColor, double newGalones, boolean newArrancado, int newPuertas, double newMotor)
    {
        // initialise instance variables
    
        
        this.color= newColor; 
        this.galones= newGalones;
        this.encendido= newArrancado;
        this.puertas = newPuertas;
        this.motor = newMotor;
        
    }
    
    public void setColor(String newColor){
        this.color = newColor;
    }
    
    public void setGalones(double newGalones){
        this.galones = newGalones;
    }

   public void setEncendido(boolean newEncendido){
        this.encendido = newEncendido;
    }  
    
    public void setPuertas(int newPuertas){
        this.puertas = newPuertas;
    }
    public void setMotor(double newMotor){
        this.motor = newMotor;
    }
    
    
    public int getPuertas(){
        return this.puertas;
    }
   
    public String getColor(){
        return this.color;
    }
    
    public double getGalones(){
        return this.galones;
    }

   public boolean getEncendido(){
        return this.encendido;
    }
    public double getMotor(){
        return this.motor;
    }
    
    public String toString(){
        String cad = "";
        
        cad += "El carro tiene los siguientes atributos: "+"\n";
        cad += "\t- El color es: " + getColor() + "\n" ;
        cad += "\t- Tiene en el tanque: " + getGalones() + "\n" ;
        cad += "\t- El carro esta encendido: " + getEncendido() + "\n";
        cad +="\t- El motor del auto es: " +getMotor()+ "\n";
        
        
        return cad;
    }

}
