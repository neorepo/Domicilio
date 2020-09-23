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
public class Domicilio {

    private int id;
    private String calle;
    private String numero;
    private String piso;
    private String departamento;

    private Localidad localidad;

    public Domicilio() {
    }

    public Domicilio(String calle, String numero, String piso, String departamento,
            String nombreLocalidad, String codigoPostalLocalidad, String nombreProvincia, String codigo_3166_2) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        // Relacion de asociación Composición muchos domicilios en una Localidad
        this.localidad = new Localidad(nombreLocalidad, codigoPostalLocalidad, nombreProvincia, codigo_3166_2);
    }

    public Domicilio(int id, String calle, String numero, String piso, String departamento) {
        this.localidad = new Localidad();
    }

    @Override
    public String toString() {
        return "Domicilio{" + "id: " + id + ", calle: " + calle + ", numero: " + numero + ", piso: " + piso + ", departamento: " + departamento + ", localidad=" + localidad + '}';
    }

}
