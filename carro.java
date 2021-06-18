
/**
 * Write a description of class carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carro
{
    private static final double MAX_GALONES = 20;
    
   private String color;
   private double galones;
   private boolean encendido;
   private int puertas;
   private double motor;
   private char []asientos;
/**
     * Constructor for objects of class carro
     */
    public carro()
    {
        // initialise instance variables
        this.color= "negro"; 
        this.galones= 10.5;
        this.encendido= true;
        this.motor= 1.5;
        this.asientos = new char[]{'-','-','-','-'};  
        
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
        if (newGalones < MAX_GALONES){
            this.galones = newGalones;
        }
        
        
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
        if (getGalones()<MAX_GALONES){
            cad += "\t- Tiene en el tanque: " + getGalones() + " galones \n" ;
        }
        else{
            cad+= "\t- el tanque esta rebalsando";
        }
        
        if (getEncendido()==true){
            cad += "\t- El carro esta encendido \n";
        }
        else{
            cad += "\t- El carro esta apagado \n";
        }
        cad +="\t- El motor del auto es: " +getMotor()+ "\n";
        System.out.println(cad);
        
        
        
        return cad;
    }
    public void ocuparLugar(int pos){
        this.asientos[pos] = 'x';
    }

}
