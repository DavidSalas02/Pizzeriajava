/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class ConexionGeneral {
    public static Connection obtenerConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pizzeria2";
        String usuario = "root";
        String contraseña = "2004";
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        return conexion;
    }
}
