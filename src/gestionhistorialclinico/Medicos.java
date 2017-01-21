/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionhistorialclinico;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Medicos {
   private  String nombre;
    private String apellidos ;
    private int identificacion;
    private String especialidad;

    public Medicos(String nombre, String apellidos, int identificacion, String especialidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.especialidad = especialidad;
    }

   public void verMedicos(){
        JOptionPane.showMessageDialog(null, "nombre del doctor: "+nombre+"\n"+"su apellido:"+apellidos+
                "\n"+"su numero de identificacion: "+identificacion+"\n"+"su especialidad es: "+especialidad);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
