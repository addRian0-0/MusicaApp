/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import SQL.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Album;
import model.Pista;

/**
 *
 * @author cybergato
 */
public class PistaDAO {
    
    public List<Pista> getPistas(){

        List<Pista> listaPistas = new ArrayList<>();
        try {

            Connection conn = conexion.getConnection();

            String query = "SELECT ID_PISTA, TIPO_PISTA, NOMBRE_ARTISTA, ID_ALBUM, SELLO_DISCOGRAFICO, FORMATO, EDICION, NOMBRE_PISTA, GENERO, URL_ICONO FROM PISTAS";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                String id = rs.getString("ID_PISTA");
                String tipoPista = rs.getString("TIPO_PISTA");
                String nombreArtista = rs.getString("NOMBRE_ARTISTA");
                String idAlbum = rs.getString("ID_ALBUM");
                String selloDiscografico  = rs.getString("SELLO_DISCOGRAFICO");
                String formato = rs.getString("FORMATO");
                String edicion = rs.getString("EDICION");
                String nombrePista = rs.getString("NOMBRE_PISTA");
                String genero = rs.getString("GENERO");
                String urlIcon = rs.getString("URL_ICONO");

                Pista pistaAdd = new Pista(id, nombreArtista, idAlbum,  selloDiscografico, formato, edicion, nombrePista, genero, urlIcon, tipoPista);
                listaPistas.add(pistaAdd);

            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error al conectar la BD: " + e);
        }

        return listaPistas;
        
    }
    
}
