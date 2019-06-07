/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author NIL CARDENAS
 */
@ManagedBean
@ViewScoped
public class MascotaBean {

    private Mascota mascota;

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public MascotaBean() {
        this.mascota = new Mascota();
    }

    public void guardarMascota() {

        try {
            MascotaDao mascotaDao = new MascotaDao();
            mascotaDao.guardarMascota(mascota);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public boolean actualizarMascota() {

        boolean respuesta = true;
        try {
            MascotaDao mascotaDao = new MascotaDao();

        } catch (Exception e) {
            respuesta = false;
        }
        return respuesta;
    }

    public ArrayList<Mascota> listarMascotas() {

        boolean respuesta = true;
        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotaDao = new MascotaDao();

        return lista;
    }
}
