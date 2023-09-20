/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

/**
 *
 * @author alanm
 */
public class Trabajador extends Persona {
    
    private double Salario;
    private double HorasT;
    private double pago;
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public double getHorasT() {
        return HorasT;
    }

    public void setHorasT(double HorasT) {
        this.HorasT = HorasT;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    
    public void salario(){
        setSalario(getHorasT()*getPago());
        
    }
    
}
