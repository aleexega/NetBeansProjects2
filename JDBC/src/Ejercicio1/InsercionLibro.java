/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class InsercionLibro {

    private static final String CADENA_CONEXION = "jdbc:mysql://localhost:3306/biblioteca";

    public static void visualizarLibros() throws SQLException {
        try (Connection con = DriverManager.getConnection(CADENA_CONEXION, "root", "fp.2023"); Statement sentencia = con.createStatement();) {
            String selectLibro = "SELECT * FROM libro natural join (autor,editorial,tema) ;";
            ResultSet sentenciaSelect = sentencia.executeQuery(selectLibro);
            while (sentenciaSelect.next()) {
                System.out.print(sentenciaSelect.getString("isbn")+" ");
                System.out.print(sentenciaSelect.getString("titulo")+" ");
                System.out.print(sentenciaSelect.getInt("numeroejemplares")+" ");
                System.out.print(sentenciaSelect.getString("nombreAutor")+" ");
                System.out.print(sentenciaSelect.getString("nombreEditorial")+" ");
                System.out.print(sentenciaSelect.getString("direccion")+" ");
                System.out.print(sentenciaSelect.getString("telefono")+" ");
                System.out.print(sentenciaSelect.getString("nombretema")+" ");
                System.out.println("");
                System.out.println("-----------------------------------");
            }
        }catch (SQLException e) {
            System.out.println("Conexion incorrecta");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner teclado = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection(CADENA_CONEXION, "root", "fp.2023"); Statement sentencia = con.createStatement();) {
            //Recogida de datos libro
            String isbn = "1234567891";
            String titulo = "";
            Integer numeroEjemplares = 0;
            String nombreAutor = "";
            String nombreEditorial = "";
            String nombreTema = "";

            //Comprobacion de datos libro
            String selectLibro = "SELECT * FROM libro WHERE isbn='" + isbn + "';";
            ResultSet sentenciaSelect = sentencia.executeQuery(selectLibro);
            if (sentenciaSelect.next()) {
                System.out.println("El libro ya existe");
                visualizarLibros();
            } else {
                visualizarLibros();
            }

            //Insercion de datos
        } catch (SQLException e) {
            System.out.println("Conexion incorrecta");
            System.out.println(e.getMessage());
        }
    }

}
