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
public class Pacientes{
  private  String nombres;
  private  String apellido;
  private  int edad;
  private  int identificacion;
  private  String genero;

    public Pacientes(String nombres, String apellido, int edad, int identificacion, String genero) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
        this.genero = genero;
    }

    public void verPacientes(){
    JOptionPane.showMessageDialog(null, "cual es su nombre del paciente: "+nombres+"\n"+"sus apellidos: "
            +apellido+"\n"+"su genero es: "+genero+"\n"+"mecione su edad: "+ edad+"\n"+"su identifacion: "+identificacion);
    }
  public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
   
}
