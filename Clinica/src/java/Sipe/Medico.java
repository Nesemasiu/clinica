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
public class Medico extends Controlador{ 

    public void setNumPacien(int numPacien) {
        this.numPacien = numPacien;
    }

    public int getNumPacien() {
        return numPacien;
    }

    public Medico(int numPacien, String Nombre, String Apelldio, String sexo, String direccion, int codigo) {
        super(Nombre, Apelldio, sexo, direccion, codigo);
        this.numPacien = numPacien;
    }
    private int numPacien;
    

    public Medico() {
    }
    public String registroMedico(String nombre){
        String respuesta = "";
        if (nombre=="Rodrigo"){
        Medico m1= new Medico();
        m1.setNombre("Rodrigo");
        m1.setApelldio("Duran");
        m1.setCodigo(5510);
        m1.setSexo("Masculino");
        m1.setDireccion("Crr 18#45-52");
        m1.setNumPacien(2);
        respuesta+="codigo: "+m1.getCodigo()+"\nNombre: "+m1.getNombre()+"\nApellido: "+m1.getApelldio()+"sexo: "+m1.getSexo()+
               "\n Direccion: "+m1.getDireccion()+"\n numero ´pacientes: "+m1.getNumPacien();
        
        return respuesta;
        }else{
            if(nombre=="Alejandra"){
                
        Medico m2= new Medico();
        m2.setNombre("Alejandra");
        m2.setApelldio("Arrieta");
        m2.setCodigo(1020);
        m2.setSexo("Femenino");
        m2.setDireccion("Cll 55#89-19");
                m2.setNumPacien(3);
        respuesta+="codigo: "+m2.getCodigo()+"\nNombre: "+m2.getNombre()+"\nApellido: "+m2.getApelldio()+"sexo: "+m2.getSexo()+
               "\n Direccion: "+m2.getDireccion()+"\n numero ´pacientes: "+m2.getNumPacien();
        
        return respuesta;
            }
        
        }
        return null;
    
    }
}
