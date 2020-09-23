/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domicilio;

/**
 *
 * @author neo
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private String sexo;

    // Debería ser un objeto de tipo fecha
    private String fechaNacimiento;

    private Domicilio estaDomiciliadoEn;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String sexo, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Domicilio getEstaDomiciliadoEn() {
        return estaDomiciliadoEn;
    }

    public void setEstaDomiciliadoEn(Domicilio estaDomiciliadoEn) {
        this.estaDomiciliadoEn = estaDomiciliadoEn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return ", Persona{" + "nombre: " + nombre + ", apellido: " + apellido
                + ", sexo: " + sexo + ", fechaNacimiento: " + fechaNacimiento
                + ", estaDomiciliadoEn: " + estaDomiciliadoEn + '}';
    }

}
