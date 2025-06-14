package dao;


import SQL.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Album;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cybergato
 */
public class AlbumDAO {
    
    public List<Album> getAlbum(){
        
        List<Album> lista = new ArrayList<>();
        
        try {

            Connection conn = conexion.getConnection();
            System.out.println("Conexion exitosa...");

            String query = "SELECT ID_ALBUM, NOMBRE_ALBUM, FECHA_LANZAMIENTO, ARTISTA, URL_ICONO FROM ALBUMES";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                
                String id = rs.getString("ID_ALBUM");
                String nombre = rs.getString("NOMBRE_ALBUM");
                String fecha = rs.getString("FECHA_LANZAMIENTO");
                String artista = rs.getString("ARTISTA");
                String urlIcon = rs.getString("URL_ICONO");

                Album albumAdd = new Album(nombre, fecha, artista, id, urlIcon);
                lista.add(albumAdd);
                
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error al conectar la BD: " + e);
        }
        
        return lista;
        
    }
    
}
