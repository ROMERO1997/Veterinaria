/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import dao.MascotaDao;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

/**
 *
 * @author NIL CARDENAS
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        MascotaDao mascotadao = new MascotaDao(); 
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        
        int cantidad = mascotadao.ContadorDeRegistros(sesion);
        System.out.println("cantidad de registro de mascotas son :"+cantidad);
    }
}
