/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cybergato
 */
public class Album {
    
    private String nombreAlbum;
    private String fecha_lanzamiento;
    private String artista;
    private String idAlbum;
    private String urlIcon;

    public Album(String nombreAlbum, String fecha_lanzamiento, String artista, String idAlbum, String urlIcon) {
        this.nombreAlbum = nombreAlbum;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.artista = artista;
        this.idAlbum = idAlbum;
        this.urlIcon = urlIcon;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getUrlIcon() {
        return urlIcon;
    }

    public void setUrlIcon(String urlIcon) {
        this.urlIcon = urlIcon;
    }
    
    
   
}
