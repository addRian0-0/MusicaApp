/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cybergato
 */
public class Pista {

    private enum TipoPista {
        SENCILLO("Sencillo"),
        ALBUM("Álbum"),
        REMIX("Remix"),
        LIVE("En Vivo"),
        INSTRUMENTAL("Instrumental"),
        OTRO("Otro");
        private final String descripcion;

        private TipoPista(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }

        @Override
        public String toString() {
            return descripcion;
        }
    }

    private String idPista, nombreArtista, idAlbum, selloDiscografico, edicion, formato, nombrePista, genero, urlIcon;
    private TipoPista tipoPista;

    public Pista(String idPista, String nombreArtista, String idAlbum, String selloDiscografico, String edicion, String formato, String nombrePista, String genero, String urlIcon, TipoPista tipoPista) {
        this.idPista = idPista;
        this.nombreArtista = nombreArtista;
        this.idAlbum = idAlbum;
        this.selloDiscografico = selloDiscografico;
        this.edicion = edicion;
        this.formato = formato;
        this.nombrePista = nombrePista;
        this.genero = genero;
        this.urlIcon = urlIcon;
        this.tipoPista = tipoPista;
    }

    public String getIdPista() {
        return idPista;
    }

    public void setIdPista(String idPista) {
        this.idPista = idPista;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    public void setSelloDiscografico(String selloDiscografico) {
        this.selloDiscografico = selloDiscografico;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getNombrePista() {
        return nombrePista;
    }

    public void setNombrePista(String nombrePista) {
        this.nombrePista = nombrePista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUrlIcon() {
        return urlIcon;
    }

    public void setUrlIcon(String urlIcon) {
        this.urlIcon = urlIcon;
    }

    public TipoPista getTipoPista() {
        return tipoPista;
    }

    public void setTipoPista(TipoPista tipoPista) {
        this.tipoPista = tipoPista;
    }
    
    
    
}
