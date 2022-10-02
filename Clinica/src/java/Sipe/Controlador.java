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
public class Controlador { 

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setApelldio(String Apelldio) {
        this.Apelldio = Apelldio;
    }

    public String getApelldio() {
        return Apelldio;
    }

    public Controlador(String Nombre, String Apelldio, String sexo, String direccion, int codigo) {
        this.Nombre = Nombre;
        this.Apelldio = Apelldio;
        this.sexo = sexo;
        this.direccion = direccion;
        this.codigo = codigo;
    }

    public Controlador() {
    }
    protected String Nombre;
    protected String Apelldio;
    protected String sexo;
    protected String direccion;
    protected int codigo;
            
   
    }
    

