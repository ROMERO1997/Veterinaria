/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Juan Carlos
 */
public interface IMascota {
    
    public abstract void guardarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascotas(Session session);
    public abstract boolean actualizarMascota (Session session, Mascota mascota);
    public abstract List<Mascota> listarRaza(Session session);
    public abstract List<Mascota> listarNombre(Session session);
    public abstract Integer ContadorDeRegistros(Session session);
}
