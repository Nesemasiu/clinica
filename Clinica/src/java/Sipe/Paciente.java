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
public class Paciente extends Controlador{

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMedicoAten() {
        return medicoAten;
    }

    public void setMedicoAten(String medicoAten) {
        this.medicoAten = medicoAten;
    }

    public void setMotConsul(String motConsul) {
        this.motConsul = motConsul;
    }

    public String getMotConsul() {
        return motConsul;
    }

    public void setLugarAten(String LugarAten) {
        this.LugarAten = LugarAten;
    }

    public String getLugarAten() {
        return LugarAten;
    }

    

    public Paciente(String LugarAten, String motConsul, String medicoAten, String fecha, String Nombre, String Apelldio, String sexo, String direccion, int codigo) {
        super(Nombre, Apelldio, sexo, direccion, codigo);
        this.LugarAten = LugarAten;
        this.motConsul = motConsul;
        this.medicoAten = medicoAten;
        this.fecha = fecha;
    }

    public Paciente() {
    }
    private String LugarAten;
    private String motConsul;
    private String medicoAten;
    private String fecha;
   
    public String registroPaciente(String nombre){
        String respuesta="";
        if (nombre=="nestor"){
        Paciente p1= new Paciente();
        p1.setNombre("Nestor");
        p1.setApelldio("Gonzalez");
        p1.setCodigo(1505);
        p1.setSexo("Masculino");
        p1.setDireccion("Crr 15#25-09");
        p1.setLugarAten("Maria auxiliadora");
        p1.setMotConsul("medico general");
        p1.setMedicoAten("Rodrigo");
        p1.setFecha("15/04/22");
       respuesta+="codigo: "+p1.getCodigo()+"\nNombre: "+p1.getNombre()+"\nApellido: "+p1.getApelldio()+"sexo: "+p1.getSexo()+
               "\n Direccion: "+p1.getDireccion()+"\nLugar donde fue atendido: "+p1.getLugarAten()+"\nMotivo Consulta"+p1.getMotConsul()+
               "\nMedico que atendio: "+p1.getMedicoAten()+"\nFecha: "+p1.getFecha();
        return respuesta;
        }
        else{
            if(nombre=="Alix"){
            
        Paciente p2= new Paciente();
        p2.setNombre("Alix");
        p2.setApelldio("Gonzalez");
        p2.setCodigo(1005);
        p2.setSexo("femenino");
        p2.setDireccion("Crr 13#54-19");
        p2.setLugarAten("Clinica militar");
        p2.setMotConsul("odontologia");
        p2.setMedicoAten("Rodrigo");
        p2.setFecha("20/04/22");
        
       respuesta+="codigo: "+p2.getCodigo()+"\nNombre: "+p2.getNombre()+"\nApellido: "+p2.getApelldio()+"sexo: "+p2.getSexo()+
               "\n Direccion: "+p2.getDireccion()+"\nLugar donde fue atendido: "+p2.getLugarAten()+"\nMotivo Consulta"+p2.getMotConsul()+
               "\nMedico que atendio: "+p2.getMedicoAten()+"\nFecha: "+p2.getFecha();
        return respuesta;}
            else{
                if(nombre=="Mateo"){
                
        Paciente p3= new Paciente();
        p3.setNombre("Mateo");
        p3.setApelldio("Molano");
        p3.setCodigo(1023);
        p3.setSexo("masculino");
        p3.setDireccion("Crr 17#32-01");
        p3.setLugarAten("Clinica militar");
        p3.setMotConsul("fisioterapia");
        p3.setMedicoAten("Alejandra");
        p3.setFecha("15/09/22");
         respuesta+="codigo: "+p3.getCodigo()+"\nNombre: "+p3.getNombre()+"\nApellido: "+p3.getApelldio()+"sexo: "+p3.getSexo()+
               "\n Direccion: "+p3.getDireccion()+"\nLugar donde fue atendido: "+p3.getLugarAten()+"\nMotivo Consulta"+p3.getMotConsul()+
               "\nMedico que atendio: "+p3.getMedicoAten()+"\nFecha: "+p3.getFecha();
        return respuesta;
                }
                else{
        Paciente p4= new Paciente();
        p4.setNombre("Lorena");
        p4.setApelldio("Sanchez");
        p4.setCodigo(0623);
        p4.setSexo("Femenino");
        p4.setDireccion("Crr 17#32-01");
        p4.setLugarAten("Maria Auxiliadora");
        p4.setMotConsul("Control embarazo");
        p4.setMedicoAten("Alejandra");
         p4.setFecha("15/12/22");
         respuesta+="codigo: "+p4.getCodigo()+"\nNombre: "+p4.getNombre()+"\nApellido: "+p4.getApelldio()+"sexo: "+p4.getSexo()+
               "\n Direccion: "+p4.getDireccion()+"\nLugar donde fue atendido: "+p4.getLugarAten()+"\nMotivo Consulta"+p4.getMotConsul()+
               "\nMedico que atendio: "+p4.getMedicoAten()+"\nFecha: "+p4.getFecha();
        return respuesta;
                       
               
                }
            }
            }
        
            }
 
    }

