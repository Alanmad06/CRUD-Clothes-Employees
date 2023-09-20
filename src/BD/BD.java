/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.*;
import Back.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author alanm
 */
public class BD {
    Connection conexion;
    PreparedStatement  stInsertarTrbj;
    PreparedStatement  stConsultarTrbj;
    PreparedStatement stActualizarTrbj;
    PreparedStatement stEliminarTrbj;
    PreparedStatement stconsultarTrbjs;
    PreparedStatement  stInsertarDñ;
    PreparedStatement  stConsultarDñ;
    PreparedStatement stActualizarDñ;
    PreparedStatement stEliminarDñ;
    PreparedStatement stconsultarDñs;
    PreparedStatement  stInsertarCamisa;
    PreparedStatement  stConsultarCamisa;
    PreparedStatement stActualizarCamisa;
    PreparedStatement stEliminarCamisa;
    PreparedStatement stconsultarCamisas;
    
    DefaultTableModel modeloCm = new DefaultTableModel();
    DefaultTableModel modeloDñ = new DefaultTableModel();
    DefaultTableModel modeloAl = new DefaultTableModel();
    public BD(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al cargar el Driver");
        } 
    }
    public void abrir_ConexionCm(){
        try{ 
        conexion= DriverManager.getConnection("jdbc:mysql://127.0.0.1/tienda?serverTimezone=America/Bahia","root","");
        stInsertarCamisa = conexion.prepareStatement("Insert Into Camisa Values (?,?,?,?,?)");
        stConsultarCamisa = conexion.prepareStatement("SELECT * FROM Camisa WHERE Codigo=?");
        stconsultarCamisas= conexion.prepareStatement("SELECT * FROM Camisa");
        stActualizarCamisa = conexion.prepareStatement("UPDATE Camisa set Tipo=?, Color=?, Talla=?, Cantidad=? WHERE Codigo=?");
        stEliminarCamisa = conexion.prepareStatement("DELETE FROM Camisa WHERE Codigo=?");
        
                }catch(SQLException ex){
            
            System.out.println(ex.getMessage());
            System.out.println("Error al hacer conexion con MySQL");
        }
    }
    
    public void cerrar_ConexionCm(){
        try{
            conexion.close();
        }catch(SQLException ex){
            
            System.out.println(ex.getMessage());
            System.out.println("Error al cerrar la conexion con MySQL");
        }
        
        
    }
    
    public void insertar_camisas(Camisa camisa){
        try{
        stInsertarCamisa.setString(1, camisa.getTipo());// 1 significa posicion en la tabla de la base de datos
        stInsertarCamisa.setString(2, camisa.getColor()); 
        stInsertarCamisa.setString(3, camisa.getTalla()); 
        stInsertarCamisa.setString(4, camisa.getCantidad()); 
         stInsertarCamisa.setInt(5, camisa.getCodigo()); 
        
       
        stInsertarCamisa.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar la camisa en la Base de Datos");
            
        }
        
        
    }
    
    public Camisa consultar_camisas(String codigo){
        Camisa camisa = null;
        ResultSet rs=null;
        
        try{
            stConsultarCamisa.setString(1, codigo);
            rs=stConsultarCamisa.executeQuery();
            
            if(rs.next()){
                camisa= new Camisa();
                camisa.setTipo(rs.getString("Tipo"));
                camisa.setColor(rs.getString("Color"));
                camisa.setTalla(rs.getString("Talla"));
                camisa.setCantidad(rs.getString("Cantidad"));
                camisa.setCodigo(rs.getInt("Codigo"));
                
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar el Inventario de Camisas");
        }
        return camisa;
    }
    
    public void actualizar_camisas(Camisa camisa){
        try{
            stActualizarCamisa.setString(1,camisa.getTipo());
            stActualizarCamisa.setString(2, camisa.getColor());
            stActualizarCamisa.setString(3, camisa.getTalla());
            stActualizarCamisa.setString(4, camisa.getCantidad());
            stActualizarCamisa.setInt(5, camisa.getCodigo());
            stActualizarCamisa.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al Actualizar el Inventario de camisas en BD");
        }
        
    }


public void eliminar_camisas(Camisa camisa){
try{
    stEliminarCamisa.setInt(1, camisa.getCodigo());
    stEliminarCamisa.executeUpdate();
}catch(SQLException ex){
    System.out.println(ex.getMessage());
    System.out.println("Error al Eliminar camisas en la BD");    
}
}

public DefaultTableModel consultar_camisas(int codigo, DefaultTableModel modelo){
    ResultSet rs=null;
    try{
        stConsultarCamisa.setInt(1, codigo);
        rs=stConsultarCamisa.executeQuery();
        if(rs.next()) //si trae info da true 1 , si no da 0
            cargar_datos_modeloCm(rs,modelo);
    else {
            modeloCm.setRowCount(0);
            }}catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error al consultar el inventario de camisas en la BD");
                
            }
    
    return modelo;
    
}

public DefaultTableModel consultar_camisas( DefaultTableModel modelo){
    ResultSet rs=null;
    try{
        
        rs=stconsultarCamisas.executeQuery();
        if(rs.next()) {//si trae info da true 1 , si no da 0
            cargar_datos_modeloCm(rs,modelo);
        }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error al consultar el inventario de camisas en la BD");
                
            }
    
    return modelo;
    
}

private void cargar_datos_modeloCm(ResultSet rs, DefaultTableModel modelo){
    borrar_modelo(modelo);
    try{
        //ciclo para cada resiltado en la consulta
        do{
            // se crea un arrau que sera una de las filas de la tabla
            Object[] fila = new Object[5]; // Hya nueve columnas en la tabla 
            // se rellena cada posicion del array con una de las colimnas de la tabla
            for(int i=0;i<fila.length;i++){
                fila[i]=rs.getObject(i+1);// El primer indice en rs es el 1 , no el cero, por eso se suma 1
                System.out.println(fila[i]);
            }
            //sE AÑADE Al MODELO LA F ILA COMPLETA
            modelo.addRow(fila);
        }while(rs.next());
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
        System.out.println("Error al cargar del ResultSet al Modelo");
    }
}

public DefaultTableModel crear_modelo_camisa(DefaultTableModel modelo){
    modelo.addColumn("Tipo");
     modelo.addColumn("Color");
      modelo.addColumn("Talla");
       modelo.addColumn("Cantidad");
        modelo.addColumn("Codigo");
                   
    return modelo;
}

     public void abrir_ConexionDñ(){
        try{ 
        conexion= DriverManager.getConnection("jdbc:mysql://127.0.0.1/tienda?serverTimezone=America/Bahia","root","");
        stInsertarDñ = conexion.prepareStatement("Insert Into Dueno Values (?,?,?,?,?,?,?)");
        stConsultarDñ = conexion.prepareStatement("SELECT * FROM Dueno WHERE Usuario=?");
        stconsultarDñs= conexion.prepareStatement("SELECT * FROM Dueno");
        stActualizarDñ = conexion.prepareStatement("UPDATE Dueno set Usuario=?, Contraseña=? ");
        stEliminarDñ = conexion.prepareStatement("DELETE FROM Dueno WHERE Puesto=?");
        
                }catch(SQLException ex){
            
            System.out.println(ex.getMessage());
            System.out.println("Error al hacer conexion con MySQL");
        }
    }
    
    public void cerrar_ConexionDñ(){
        try{
            conexion.close();
        }catch(SQLException ex){
            
            System.out.println(ex.getMessage());
            System.out.println("Error al cerrar la conexion con MySQL");
        }
        
        
    }
    
    public void insertar_Dueño(Dueño dñ){
        try{
        stInsertarDñ.setString(1, dñ.getNombre());// 1 significa posicion en la tabla de la base de datos
        stInsertarDñ.setInt(2, dñ.getEdad()); 
        stInsertarDñ.setString(3, dñ.getEmail()); 
        stInsertarDñ.setString(4, dñ.getPuesto()); 
        stInsertarDñ.setString(5, dñ.getNombreEmpresa());
        stInsertarDñ.setString(6, dñ.getLg().getUsuario());
        stInsertarDñ.setString(7, dñ.getLg().getContraseña());
        stInsertarDñ.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar al Dueño en la Base de Datos");
            
        }
        
        
    }
    
    public Login consultar_Login(){
         Login lg = null;
        ResultSet rs=null;
         try{
            
            rs=stconsultarDñs.executeQuery();
            
            if(rs.next()){
                lg=new Login();
             
                lg.setUsuario(rs.getString("Usuario"));
                 lg.setContraseña(rs.getString("Contraseña"));
                
                 
                 
                
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar al Dueño");
        }
         return lg;
    }
    
    public Dueño consultar_Dueño(){
        Dueño dñ = null;
        Login lg = null;
        ResultSet rs=null;
        
        try{
            
            rs=stconsultarDñs.executeQuery();
            
            if(rs.next()){
                dñ=new Dueño();
                dñ.setNombre(rs.getString("Nombre"));
                dñ.setEdad(rs.getInt("Edad"));
                dñ.setEmail(rs.getString("Email"));
                dñ.setPuesto(rs.getString("Puesto"));
                 dñ.setNombreEmpresa(rs.getString("NombreEmpresa"));
                lg.setUsuario(rs.getString("Usuario"));
                 lg.setContraseña(rs.getString("Contraseña"));
                 dñ.setLg(lg);
                 
                 
                
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar al Dueño");
        }
        return dñ;
    }
    
    public void actualizar_Dueño(Dueño dñ){
        try{
            
            stActualizarDñ.setString(1, dñ.getLg().getUsuario());
            stActualizarDñ.setString(2, dñ.getLg().getContraseña());
            stActualizarDñ.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al Actualizar al Dueño en BD");
        }
        
    }


public void eliminar_Dueño(Dueño dñ){
try{
    stEliminarDñ.setString(1, dñ.getPuesto());
    stEliminarDñ.executeUpdate();
}catch(SQLException ex){
    System.out.println(ex.getMessage());
    System.out.println("Error al Eliminar al Dueño en la BD");    
}
}

public DefaultTableModel consultar_Dueño(String usuario, DefaultTableModel modelo){
    ResultSet rs=null;
    try{
        stConsultarDñ.setString(1, usuario);
        rs=stConsultarDñ.executeQuery();
        if(rs.next()) //si trae info da true 1 , si no da 0
            cargar_datos_modelodñ(rs,modelo);
    else {
            modeloDñ.setRowCount(0);
            }}catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error al consultar al Dueño en la BD");
                
            }
    
    return modelo;
    
}

public int Login(String con,String usu){
    ResultSet rs=null;
    String con1, usu1;
    
    try{
        
        rs=stconsultarDñs.executeQuery();
        while(rs.next()){
        con1=rs.getString("Contraseña");
        usu1=rs.getString("Usuario");
        
        if(con1.equals(con) && usu1.equals(usu) ){
            System.out.println("Contraseña correcta");
        return 1;
        }
       
        
       return 0; }}
       catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error en el Login del Dueño");
                
            }
        
    
    return 0;
}

public int Verificar(){
    
    ResultSet rs=null;
    try{
        
        rs=stconsultarDñs.executeQuery();
        if(rs.next()){
            return 1;
        }else 
return 0;

//si trae info da true 1 , si no da 0
         
           
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error al consultar al Dueño en la BD");
                
            }
    return 0;
}
public String NombreE(){
      
    ResultSet rs=null;
    String NombreE="";
    
    try{
        
        rs=stconsultarDñs.executeQuery();
        while(rs.next()){
        NombreE=rs.getString("NombreEmpresa");
    
        
        
        }
       
        
     }
       catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error en el Login del Dueño");
                
            }
    
    
    return NombreE;
}
public DefaultTableModel consultar_dueño( DefaultTableModel modelo){
    ResultSet rs=null;
    try{
        
        rs=stconsultarDñs.executeQuery();
        if(rs.next()) {//si trae info da true 1 , si no da 0
            cargar_datos_modelodñ(rs,modelo);
        }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error al consultar al Dueño en la BD");
                
            }
    
    return modelo;
    
}

private void cargar_datos_modelodñ(ResultSet rs, DefaultTableModel modelo){
    borrar_modelo(modelo);
    try{
        //ciclo para cada resiltado en la consulta
        do{
            // se crea un arrau que sera una de las filas de la tabla
            Object[] fila = new Object[7]; // Hya nueve columnas en la tabla 
            // se rellena cada posicion del array con una de las colimnas de la tabla
            for(int i=0;i<fila.length;i++){
                fila[i]=rs.getObject(i+1);// El primer indice en rs es el 1 , no el cero, por eso se suma 1
                System.out.println(fila[i]);
            }
            //sE AÑADE Al MODELO LA F ILA COMPLETA
            modelo.addRow(fila);
        }while(rs.next());
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
        System.out.println("Error al cargar del ResultSet al Modelo");
    }
}

public DefaultTableModel crear_modelo_Dueño(DefaultTableModel modelo){
    modelo.addColumn("Nombre");
     modelo.addColumn("Edad");
      modelo.addColumn("Email");
       modelo.addColumn("Puesto");
        modelo.addColumn("Nombre Empresa");
         modelo.addColumn("Usuario");
          modelo.addColumn("Contraseña");
        
          
          
    return modelo;
}

    public void abrir_ConexionTrbj(){
        try{ 
        conexion= DriverManager.getConnection("jdbc:mysql://127.0.0.1/tienda?serverTimezone=America/Bahia","root","");
        stInsertarTrbj = conexion.prepareStatement("Insert Into Trabajador Values (?,?,?,?,?,?,?,?)");
        stConsultarTrbj = conexion.prepareStatement("SELECT * FROM Trabajador WHERE Matricula=?");
        stconsultarTrbjs= conexion.prepareStatement("SELECT * FROM Trabajador");
        stActualizarTrbj = conexion.prepareStatement("UPDATE Trabajador set Nombre=?, Edad=?, Email=?, Puesto=? , PagoXHora=?, HorasTrabajadas=?,Salario=? WHERE Matricula=?");
        stEliminarTrbj = conexion.prepareStatement("DELETE FROM Trabajador WHERE Matricula =?");
        
                }catch(SQLException ex){
            
            System.out.println(ex.getMessage());
            System.out.println("Error al hacer conexion con MySQL");
        }
    }
    
    public void cerrar_ConexionTrbj(){
        try{
            conexion.close();
        }catch(SQLException ex){
            
            System.out.println(ex.getMessage());
            System.out.println("Error al cerrar la conexion con MySQL");
        }
        
        
    }
    
    public void insertar_Trabajador(Trabajador trbj){
        try{
        stInsertarTrbj.setString(1, trbj.getNombre());// 1 significa posicion en la tabla de la base de datos
        stInsertarTrbj.setInt(2, trbj.getEdad()); 
        stInsertarTrbj.setString(3, trbj.getEmail()); 
        stInsertarTrbj.setString(4, trbj.getPuesto()); 
        stInsertarTrbj.setDouble(5, trbj.getPago()); 
        stInsertarTrbj.setDouble(6, trbj.getHorasT()); 
        stInsertarTrbj.setString(7, trbj.getMatricula()); 
        stInsertarTrbj.setDouble(8, trbj.getSalario());
       
        stInsertarTrbj.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar al Trabajador en la Base de Datos");
            
        }
        
        
    }
    
    public Trabajador consultar_trabajador(String codigo){
        Trabajador trbj = null;
        ResultSet rs=null;
        
        try{
            stConsultarTrbj.setString(1, codigo);
            rs=stConsultarTrbj.executeQuery();
            
            if(rs.next()){
                trbj=new Trabajador();
                trbj.setNombre(rs.getString("Nombre"));
                trbj.setEdad(rs.getInt("Edad"));
                trbj.setEmail(rs.getString("Email"));
                trbj.setPuesto(rs.getString("Puesto"));
                 trbj.setPago(rs.getDouble("PagoXHora"));
                  trbj.setHorasT(rs.getDouble("HorasTrabajadas"));
                  trbj.setMatricula(rs.getString("Matricula"));
                  trbj.setSalario(rs.getDouble("Salario"));
                 
                
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar al Trabajador");
        }
        return trbj;
    }
    
    public void actualizar_Trabajador(Trabajador trbj){
        try{
            stActualizarTrbj.setString(1, trbj.getNombre());
            stActualizarTrbj.setInt(2, trbj.getEdad());
            stActualizarTrbj.setString(3, trbj.getEmail());
            stActualizarTrbj.setString(4, trbj.getPuesto());
            stActualizarTrbj.setDouble(5, trbj.getPago());
            stActualizarTrbj.setDouble(6, trbj.getHorasT());
            stActualizarTrbj.setDouble(7, trbj.getSalario());
            stActualizarTrbj.setString(8, trbj.getMatricula());
            stActualizarTrbj.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al Actualizar un Trabajador en BD");
        }
        
    }


public void eliminar_trabajador(Trabajador trbj){
try{
    stEliminarTrbj.setString(1, trbj.getMatricula());
    stEliminarTrbj.executeUpdate();
}catch(SQLException ex){
    System.out.println(ex.getMessage());
    System.out.println("Error al Eliminar un Trabajador en la BD");    
}
}

public DefaultTableModel consultar_trabajador(String matricula, DefaultTableModel modelo){
    ResultSet rs=null;
    try{
        stConsultarTrbj.setString(1, matricula);
        rs=stConsultarTrbj.executeQuery();
        if(rs.next()) //si trae info da true 1 , si no da 0
            cargar_datos_modelotrbj(rs,modelo);
    else {
            modeloAl.setRowCount(0);
            }}catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error al consultar el Trabajador en la BD");
                
            }
    
    return modelo;
    
}

public DefaultTableModel consultar_trabajador( DefaultTableModel modelo){
    ResultSet rs=null;
    try{
        
        rs=stconsultarTrbjs.executeQuery();
        if(rs.next()) {//si trae info da true 1 , si no da 0
            cargar_datos_modelotrbj(rs,modelo);
        }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error al consultar Trabajador en la BD");
                
            }
    
    return modelo;
    
}

private void cargar_datos_modelotrbj(ResultSet rs, DefaultTableModel modelo){
    borrar_modelo(modelo);
    try{
        //ciclo para cada resiltado en la consulta
        do{
            // se crea un arrau que sera una de las filas de la tabla
            Object[] fila = new Object[8]; // Hya nueve columnas en la tabla 
            // se rellena cada posicion del array con una de las colimnas de la tabla
            for(int i=0;i<fila.length;i++){
                fila[i]=rs.getObject(i+1);// El primer indice en rs es el 1 , no el cero, por eso se suma 1
                System.out.println(fila[i]);
            }
            //sE AÑADE Al MODELO LA F ILA COMPLETA
            modelo.addRow(fila);
        }while(rs.next());
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
        System.out.println("Error al cargar del ResultSet al Modelo");
    }
}

public DefaultTableModel crear_modelo_trabajador(DefaultTableModel modelo){
    modelo.addColumn("Nombre");
     modelo.addColumn("Edad");
      modelo.addColumn("Email");
       modelo.addColumn("Puesto");
        modelo.addColumn("PagoXHora");
         modelo.addColumn("Horas Trabajadas");
          modelo.addColumn("Matricula");
           modelo.addColumn("Salario");
          
          
    return modelo;
}

public void borrar_modelo(DefaultTableModel modeloAl){
    while(modeloAl.getRowCount()>=1)
        modeloAl.removeRow(modeloAl.getRowCount()-1);
}
}

