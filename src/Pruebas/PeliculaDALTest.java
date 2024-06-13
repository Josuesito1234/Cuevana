package Pruebas;

import Entidades.Pelicula;
import Logica_Negocios.PeliculaBL;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PeliculaDALTest {

    @Test
    @Order(2)
    void mostrar() {
        PeliculaBL peliculaBL = new PeliculaBL();
        ArrayList<Pelicula> peliculas = peliculaBL.mostrar();
        assertNotNull(peliculas, "La lista de peliculas no debe ser nula ");
        assertFalse(peliculas.isEmpty(),"La lista no debe estar vacia ");
    }

    @Test
    @Order(1)
    void guardar() {
        PeliculaBL peliculaBL = new PeliculaBL();
        Pelicula pelicula = new Pelicula("CHUKY", "Nayib Bukele", "Comedia Romantica");
        int result = peliculaBL.guardar(pelicula);
        assertEquals(1,result,"Debe devolver 1");
    }

    @Test
    @Order(3)
    void eliminar() {
        PeliculaBL peliculaBL = new PeliculaBL();
        int result = peliculaBL.eliminar(3);
        assertEquals(1,result,"Deberia volver 1");
    }
}
