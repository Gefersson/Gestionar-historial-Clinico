/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionhistorialclinico;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author juan
 */
public class GestionHistorialClinico {
 public static List<Medicos> lista=new LinkedList<Medicos>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   lista.add(new Medicos("JUAN CARLOR", "ALVAREZ MENDOZA", 20171214, "CARDIOLOGO"));
      lista.add(new Medicos("CINTIA DEYSI", "ALATA ALATA", 20171516, "ODONTOLOGA"));
    
    int opt=0;
      do{
          opt=Integer.parseInt(JOptionPane.showInputDialog(null,"----menu de medico----\n"+
              "1 - Agregar Medico\n"+
              "2 - Eliminar Medico\n"+
              "3- mostrar Medico\n"+
              "4 - salir"));
      switch(opt){
          case 1: agregar();break;
          case 2: eliminar();break;
          case 3: mostrar(); break;
          case 4: opt=0;break;
          default: JOptionPane.showMessageDialog(null, "la opcion no existe ");
      }
      }while(opt!=0);
      
    
    }
    private static void mostrar()
    {for(int i=0;i<lista.size();i++){
    lista.get(i).verMedicos();  
    }
    
    }

    private static void agregar() {
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

  
    }

    

