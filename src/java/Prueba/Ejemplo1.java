/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import dao.MascotaDao;
import entidades.Mascota;

/**
 *
 * @author NIL CARDENAS
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MascotaDao mascotadao = new MascotaDao();
        Mascota mimascota = new Mascota(10, "Pablito", "Adan", "Chihuahua");
        
        mascotadao.guardarMascota(mimascota);
    }  
}
