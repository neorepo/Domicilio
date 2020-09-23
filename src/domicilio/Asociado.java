/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domicilio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author neo
 */
public class Asociado extends Persona {

    public static final String CONDICION_ACTIVO = "ACTIVO";
    public static final String CONDICION_ADHERENTE = "ADHERENTE";
    public static final String CONDICION_JUBILADO = "JUBILADO";

    private String condicionIngreso;

    public Asociado(String nombre, String apellido, String sexo, String fechaNacimiento, Domicilio estaDomiciliadoEn) {
        super(nombre, apellido, sexo, fechaNacimiento, estaDomiciliadoEn);
        // seteamos un valor por defecto (ACTIVO)
        this.condicionIngreso = CONDICION_ACTIVO;
    }

    public Asociado(String nombre, String apellido, String sexo, String fechaNacimiento) {
        super(nombre, apellido, sexo, fechaNacimiento);
        // seteamos un valor por defecto (ACTIVO)
        this.condicionIngreso = CONDICION_ACTIVO;
    }

    public String getCondicionIngreso() {
        return condicionIngreso;
    }

    public void setCondicionIngreso(String condicionIngreso) {
        this.condicionIngreso = condicionIngreso;
    }

    public static List<String> getCondicionesDeIngreso() {
        List<String> condicionesDeIngreso = new ArrayList<>();
        condicionesDeIngreso.add(CONDICION_ACTIVO);
        condicionesDeIngreso.add(CONDICION_ADHERENTE);
        condicionesDeIngreso.add(CONDICION_JUBILADO);
        return condicionesDeIngreso;
    }

    @Override
    public String toString() {
        return "Asociado{" + "condicionIngreso: " + condicionIngreso + super.toString() + '}';
    }

}
