/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

/**
 *
 * @author alanm
 */
public class Login {
    protected String contraseña;
    protected String usuario;
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public int entrar(String con,String usu){
        
        if(getContraseña().equals(con) && getUsuario().equals(usu) ){
            System.out.println("Contraseña correcta");
        return 1;
        }
       
        
       return 0; 
    }
    public void mostrar(){
        
        System.out.println(getUsuario());
        System.out.println(getContraseña());
    }
}
