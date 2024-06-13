package Acceso_Datos;
import Entidades.Pelicula;
import java.sql.*;
import java.util.ArrayList;

public class PeliculaDAL {
    PreparedStatement ps;
    ResultSet rs;
    Pelicula peli;
    Conexion con = new Conexion();

    public Connection getConexion() throws SQLException, ClassNotFoundException{
        Class.forName(con.getDriver());
        return DriverManager.getConnection(con.getUrl(),con.getUser(), con.getPass());
    }
    public ArrayList<Pelicula> mostrar(){
        ArrayList<Pelicula> listpeli = new ArrayList<>();
        try{
            ps = getConexion().prepareStatement("select * from pelicula ");
            rs = ps.executeQuery();
            while (rs.next()){
                peli = new Pelicula(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                listpeli.add(peli);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listpeli;
    }
public int guardar(Pelicula pPelicula){
        int result = 0;
        try{
            ps = getConexion().prepareStatement("INSERT INTO " +
                    "pelicula(titulo,director,genero) " + "Values(?,?,?)");
            ps.setString(1,pPelicula.getTitulo());
            ps.setString(2,pPelicula.getDirector());
            ps.setString(3,pPelicula.getGenero());
            result = ps.executeUpdate();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
}
public int eliminar(int pId){
        int result = 0;
        try{
            ps = getConexion().prepareStatement("Delete from pelicula " +
                    "where id = ?");
            ps.setInt(1,pId);
            result = ps.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
}
}
