/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Mascota;
import interfaces.IMascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilitarios.HibernateUtil;

/**
 *
 * @author NIL CARDENAS
 */
public class MascotaDao implements IMascota{

    @Override
    public void guardarMascota(Mascota mascota) {
        //Construir una nueva session y una nueva transaccion
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        
        //Registrar en la base de datos la mascota
        sesion.save(mascota);
        transaccion.commit();
        
        sesion.close();
        
    }

    @Override
    public ArrayList<Mascota> listarMascotas(Session session) {
        ArrayList<Mascota> milista = new ArrayList<>();
        //Crear la consulta hacia la base de datos
        Query query = session.createQuery("FROM Mascota");
        
        //Ejecutar la consulta y obtener la lista
        milista = (ArrayList<Mascota>)query.list();
        
        return milista;
    
    }
    @Override
    public boolean actualizarMascota(Session session,Mascota mascota) {
        boolean respuesta = true;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        try {
            session.update(mascota); 
            transaccion.commit();
        } catch (Exception e) {
            respuesta = false;
        }
        sesion.close();
        return respuesta;
    }
    @Override
    public List<Mascota> listarRaza(Session session) {
        String hql = " from Mascota where raza='Pastor Aleman'";        
        Query query = session.createQuery(hql);
        List< Mascota > lista= (List< Mascota >) query.list();
	return lista;    
    }

    @Override
    public List<Mascota> listarNombre(Session session) {
        String hql = " from Mascota where nombreMascota='Sandor'";        
        Query query = session.createQuery(hql);
        List< Mascota > lista= (List< Mascota >) query.list();
	return lista;    
    }

    @Override
    public Integer ContadorDeRegistros(Session session) {
        String hql = "select count(*) from Mascota";
        Query query = session.createQuery(hql);
        Long FilasTab=(Long) query.uniqueResult();
        Integer cont=FilasTab.intValue();
        return cont;
    }



}
