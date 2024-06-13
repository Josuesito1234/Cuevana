package UI;

import Entidades.Pelicula;
import Logica_Negocios.PeliculaBL;

import javax.swing.*;
import java.util.ArrayList;

public class frmPelicula {
    private JList listPeli;
    private JPanel panelPeli;
    private JTextField txtTitulo;
    private JTextField txtDirector;
    private JTextField txtGenero;
    private JButton btnGuardar;

    public JPanel getpanelPeli(){
        return panelPeli;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista de Peliculas");
        frame.setContentPane(new frmPelicula().getpanelPeli());
        frame.pack();
        frame.setVisible(true);
    }

    public frmPelicula() {
        cargarPelicula();

    }

    public frmPelicula(JPanel panelPeli) {
        this.panelPeli = panelPeli;
    }
    private PeliculaBL peliculaBL = new PeliculaBL();


    private void cargarPelicula(){
        ArrayList<Pelicula> peliculas = peliculaBL.mostrar();
        DefaultListModel<String> listModel = new DefaultListModel<>();

        for(Pelicula pelicula : peliculas){
            listModel.addElement(pelicula.getTitulo() + pelicula.getDirector() + pelicula.getGenero());
        }
        listPeli.setModel(listModel);
    }
}
