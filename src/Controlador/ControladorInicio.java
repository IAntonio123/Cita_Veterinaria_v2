/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Formato.CentrarForma;
import Principal.Main;
import Vista.FormCliente;
import Vista.FormInicio;
import Vista.FormMascota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Antonio
 */
public class ControladorInicio implements ActionListener{
    
    FormInicio vista;
    public ControladorInicio(FormInicio fi){
        vista=fi;
        vista.jmiCliente.addActionListener(this);
        vista.jmiMascota.addActionListener(this);
        vista.jmiCita.addActionListener(this);
        vista.jmiListaCitas.addActionListener(this);
        fi.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fi.setDefaultCloseOperation(fi.EXIT_ON_CLOSE);
        fi.setTitle("Citas Veterianria");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jmiCliente){
            Main.fcli=new FormCliente();
            Main.controlfcli=new ControladorCliente(Main.fcli);
            vista.jdpContenedor.add(Main.fcli);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fcli);
        }   
        
        if(e.getSource()==vista.jmiMascota){
            Main.fmas=new FormMascota();
            Main.controlMas=new ControladorMascota(Main.fmas);
            vista.jdpContenedor.add(Main.fmas);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fmas);
        }
    }
    
}
