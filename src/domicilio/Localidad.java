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
public class Localidad {

    private int id;
    private String nombre;
    private String codigoPostal;

    private Provincia provincia;

    public Localidad() {
    }

    public Localidad(String nombre, String codigoPostal, String nombreProvincia, String codigo_3166_2) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;

        // Relacion de asociación Composición muchas localidades en una Provincia
        this.provincia = new Provincia(nombreProvincia, codigo_3166_2);
    }

    public Localidad(int id, String nombre, String codigoPostal, byte idProvincia, String nombreProvincia, String codigo_3166_2) {
        this.id = id;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;

        this.provincia = new Provincia(idProvincia, nombreProvincia, codigo_3166_2);
    }

    @Override
    public String toString() {
        return "Localidad{" + "id: " + id + ", nombre: " + nombre + ", codigoPostal: " + codigoPostal + ", provincia: " + provincia + '}';
    }

}
