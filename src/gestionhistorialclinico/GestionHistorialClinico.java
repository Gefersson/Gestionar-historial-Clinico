/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionhistorialclinico;

import static gestionhistorialclinico.GestionHistorialClinico.listita;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import gestionhistorialclinico.ListaPublica;

/**
 *
 * @author juan
 */
public class GestionHistorialClinico {
    
 public static List<Medicos> lista=new LinkedList<Medicos>();
  public static List<Pacientes> listita=new LinkedList<Pacientes>();
    /**
     *
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
   lista.add(new Medicos("JUAN CARLOR", "ALVAREZ MENDOZA", 20171214, "CARDIOLOGO"));
      lista.add(new Medicos("CINTIA DAYSI", "ALATA ALATA", 20171516, "ODONTOLOGA"));
   
      
      listita.add(new Pacientes("LUIS","CUBA", 23233, 23, "Masculino"));
    
      int opt=0;
      do{
       opt = Integer.parseInt(JOptionPane.showInputDialog(null,"----Historial Clinico----\n"+
               "1 - LISTA DE MEDICOS\n"+
               "2 - LISTA DE PACIENTES\n"+
               "3 - SALIR"));
      switch(opt){
          case 1: {
              List<Medicos> lista=new LinkedList<Medicos>();
               do{
          opt=Integer.parseInt(JOptionPane.showInputDialog(null,"**Menu de Medicos**\n"+
              "1 - Agregar Medico\n"+
              "2- Eliminar Medico\n"+
              "3- mostrar Medico\n"+
              "4 - atras"));
              switch(opt){
          case 1: agregar();break;
          case 2: eliminar();break;
          case 3: mostrar(); break;
          case 4: opt=0;break;
          default: JOptionPane.showMessageDialog(null, "la opcion no existe ");
      }
      }while(opt!=0);
          }
          case 2:{List<Pacientes>listita=new LinkedList<Pacientes>();
             do{
          opt=Integer.parseInt(JOptionPane.showInputDialog(null,"***Menu de Pacientes***\n"+
              "1 - aumentar Paciente\n"+
              "2- retirar Paciente\n"+
              "3- detallar Paciente\n"+
              "4 - atras"));
              switch(opt){
          case 1: aumentar();break;
          case 2: retirar();break;
          case 3: detallar(); break;
          case 4: opt=0;break;
          default: JOptionPane.showMessageDialog(null, "la opcion no existe ");
      }
      }while(opt!=0);    
          }
          
          case 3: opt=0;break;
          default: JOptionPane.showMessageDialog(null, "la opcion no existe ");
      }
      }while(opt!=0);
      ListaPublica a=new Medicos("cinthia","alata", 2323,"odontologa");
      a.listaGeneral();
      ListaPublica b=new Pacientes("david","perez", 4332, 23, "masculino");
     b.listaGeneral();
    } 
     private static void mostrar()
    {for(int i=0;i<lista.size();i++){
    lista.get(i).verMedicos();  
    }
    
    }

    private static  void agregar() {
    String nombre=JOptionPane.showInputDialog("ingrese su Nombre");
    String apellidos=JOptionPane.showInputDialog("ingrese sus Apellidos");
    int identificacion=Integer.parseInt(JOptionPane.showInputDialog("ingrese su Identificacion"));
    String especialidad=JOptionPane.showInputDialog("ingrese su especialidad");
    lista.add(new Medicos(nombre,apellidos,identificacion,especialidad));
    }

    private static void eliminar() {
    int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el medico para  eliminar "));
    lista.remove(elemento);
    }
  private static void detallar()
          
    {for(int i=0;i<listita.size();i++){
    listita.get(i).verPacientes();  
    }}
     private static  void aumentar() {
    String nombres=JOptionPane.showInputDialog("ingrese su Nombres");
    String apellido=JOptionPane.showInputDialog("ingrese sus Apellido");
    int identificacion=Integer.parseInt(JOptionPane.showInputDialog("ingrese su Identificacion"));
    int edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));
    String genero=JOptionPane.showInputDialog("ingrese su genero");
    listita.add(new Pacientes(nombres, apellido, edad, identificacion, genero));
    }
    private static void retirar() {
    int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el paciente para  retirarlo "));
    listita.remove(elemento);    
}

}

    

