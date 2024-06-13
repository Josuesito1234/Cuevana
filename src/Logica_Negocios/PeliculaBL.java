package Logica_Negocios;

import Acceso_Datos.PeliculaDAL;
import Entidades.Pelicula;

import java.util.ArrayList;

public class PeliculaBL {
    private static PeliculaDAL peliDAL = new PeliculaDAL();

    public static ArrayList<Pelicula> mostrar(){
        return peliDAL.mostrar();
    }
    public int guardar(Pelicula peli){
        return peliDAL.guardar(peli);
    }
    public int eliminar(int pId){
        return peliDAL.eliminar(pId);
    }
}
