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
        
        Asociado asociado1 = new Asociado("Julio Cesar", "Silva", "M", "03/03/1981");
        Asociado asociado2 = new Asociado("Sabina Ximena", "Capelli", "F", "08/01/1986");

        Domicilio domicilio1 = new Domicilio("Manuel A. Sáez", "1253", "5", "3", "Las Heras", "5539", "Mendoza", "AR-M");

        asociado1.setEstaDomiciliadoEn(domicilio1);
        asociado2.setEstaDomiciliadoEn(domicilio1);

        System.out.println(asociado1);
        System.out.println(asociado2);
    }

}
