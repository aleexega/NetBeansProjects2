/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FP
 */
public class Principal {

    private static final String CADENA_CONEXION = "jdbc:mysql://localhost:3306/biblioteca";

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(CADENA_CONEXION, "root", "fp.2023"); Statement sentencia = con.createStatement();) {
            
        } catch (SQLException e) {
            System.out.println("Conexion incorrecta");
            System.out.println(e.getMessage());
        }
    }
}
