/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Vista.*;
import Controlador.*;

/**
 *
 * @author Antonio
 */
public class Main {
    public static FormLogin fl;
    public static ControladorLogin controlLog;
    
    public static FormInicio fi;
    public static ControladorInicio controlfi;
    
    public static FormCliente fcli;
    public static ControladorCliente controlfcli;
    
    public static FormMascota fmas;
    public static ControladorMascota controlMas;
    
    public static void main(String[] args) {
            fi=new FormInicio();
            controlfi=new ControladorInicio(fi);
            
            fl=new FormLogin();
            controlLog=new ControladorLogin(fl,fi);
        
        
    }
    
}
