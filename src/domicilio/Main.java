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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Asociado asociado1 = new Asociado("Homero", "Simpson", "M", "03/08/1981");
        Asociado asociado2 = new Asociado("Marge", "Simpson", "F", "08/03/1986");

        Domicilio domicilio1 = new Domicilio("Falsa", "123", "2", "3", "Springfield", "321", "United States", "US-S");

        asociado1.setEstaDomiciliadoEn(domicilio1);
        asociado2.setEstaDomiciliadoEn(domicilio1);

        System.out.println(asociado1);
        System.out.println(asociado2);
    }

}
