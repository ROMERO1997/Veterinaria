/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

/**
 *
 * @author NIL CARDENAS
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        List<Mascota> lista = new LinkedList<>();       
        MascotaDao mascotadao = new MascotaDao();        
        Session sesion = HibernateUtil.getSessionFactory().openSession();       
        lista = mascotadao.listarRaza(sesion);       
        for(Mascota mascota : lista){
            System.out.println(mascota.getRaza());
        }
    }
}
