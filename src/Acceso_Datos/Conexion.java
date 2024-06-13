package Acceso_Datos;

public class Conexion {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String Url = "jdbc:mysql://127.0.0.1:3306/cinemadb";
    private String User = "root";
    private String pass = "sqlserver";

    public Conexion() {
    }

    public Conexion(String driver, String url, String user, String pass) {
        this.driver = driver;
        Url = url;
        User = user;
        this.pass = pass;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
