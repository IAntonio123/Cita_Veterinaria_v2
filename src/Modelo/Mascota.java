/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Antonio
 */
public class Mascota {
    private String codigoMascota;
    private String Nombre;
    private int idtipoMascota;
    private String sexo;
    private int edad;
    private double peso;
    private String dniPropietario;
    
    public Mascota(){}

    public String getCodigoMascota() {
        return codigoMascota;
    }
    public void setCodigoMascota(String codigoMascota) {
        this.codigoMascota = codigoMascota;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getIdtipoMascota() {
        return idtipoMascota;
    }
    public void setIdtipoMascota(int idtipoMascota) {
        this.idtipoMascota = idtipoMascota;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getDniPropietario() {
        return dniPropietario;
    }
    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

   
}
