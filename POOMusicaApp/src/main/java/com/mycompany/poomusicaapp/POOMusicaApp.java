/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poomusicaapp;

import SQL.conexion;
import interfaces.Inicio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 
 */
public class POOMusicaApp {

    public static void main(String[] args) {
        
        Inicio inicioScreen = new Inicio();
        inicioScreen.setVisible(true);
        inicioScreen.setLocationRelativeTo(null);

    }
}
 