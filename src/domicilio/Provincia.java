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
public class Provincia {

    private byte id;
    private String nombre;
    private String codigo_3166_2;

    public Provincia() {
    }

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public Provincia(String nombre, String codigo_3166_2) {
        this.nombre = nombre;
        this.codigo_3166_2 = codigo_3166_2;
    }

    public Provincia(byte id, String nombre, String codigo_3166_2) {
        this.id = id;
        this.nombre = nombre;
        this.codigo_3166_2 = codigo_3166_2;
    }

    @Override
    public String toString() {
        return "Provincia{" + "id: " + id + ", nombre: " + nombre + ", codigo_3166_2: " + codigo_3166_2 + '}';
    }
}
