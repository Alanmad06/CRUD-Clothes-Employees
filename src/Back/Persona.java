/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

/**
 *
 * @author alanm
 */
public class Persona {
    private String Nombre;
    private int Edad;
    private String Email;
    private String puesto;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

 
    public String mostrarD(){
        String datos="";
        datos+=" \nNombre :" +getNombre()+" \nEdad : "+ getEdad() +" \nEmail : "+
                getEmail()+ "\n Puesto : "+ getPuesto() ;
                
        return datos;
        
    }
    
}
