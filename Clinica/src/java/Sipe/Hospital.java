/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sipe;

/**
 *
 * @author Usuario
 */
public class Hospital{

    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public Hospital() {
    }
    private String nombre ;
    private String direccion ;
    
    public String registrarHospital(String nombre) {
        String respuesta = "";
        if(nombre=="Maria Auxiliadora"){
             Hospital m1=new Hospital();
        m1.setDireccion("Tv. 3C #49-02");
        m1.setNombre("Clinica militar");
        respuesta+="Nombre: "+m1.getNombre()+"\nDireccion"+m1.getDireccion();
            return respuesta;
        }else{
            if(nombre=="Clinica militar"){
            Hospital m2=new Hospital();
        m2.setDireccion("Cl. 3 #No. 2 - 15 Este");
        m2.setNombre("Maria Auxiliadora");
        respuesta+="Nombre: "+m2.getNombre()+"\nDireccion"+m2.getDireccion();
            return respuesta;
}
        }
            
        return null;
    }

    
    
    
}
