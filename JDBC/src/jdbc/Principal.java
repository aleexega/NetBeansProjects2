/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author FP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://localhost:3306/biblioteca";
        try (Connection con = DriverManager.getConnection(cadenaConexion, "root", "fp.2023")) {
            System.out.println("Correcto");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
