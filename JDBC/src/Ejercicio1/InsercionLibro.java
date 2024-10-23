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
                System.out.print(sentenciaSelect.getString("isbn") + " ");
                System.out.print(sentenciaSelect.getString("titulo") + " ");
                System.out.print(sentenciaSelect.getInt("numeroejemplares") + " ");
                System.out.print(sentenciaSelect.getString("nombreAutor") + " ");
                System.out.print(sentenciaSelect.getString("nombreEditorial") + " ");
                System.out.print(sentenciaSelect.getString("direccion") + " ");
                System.out.print(sentenciaSelect.getString("telefono") + " ");
                System.out.print(sentenciaSelect.getString("nombretema") + " ");
                System.out.println("");
                System.out.println("-----------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Conexion incorrecta");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner teclado = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection(CADENA_CONEXION, "root", "fp.2023"); Statement sentencia = con.createStatement();) {
            //Recogida de datos libro
            String isbn = "12345671";
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
                if (existeAutor(nombreAutor, con) == 0) {
                    altaAutor(nombreAutor, con);
                }
                int idAutor = buscarAutor(nombreAutor);
                /*
                if (!existeTema(nombreTema)) {
                    altaTema(nombreTema);
                }
                int idTema = buscarTema(nombreTema);

                if (!existeEditorial(nombreEditorial)) {
                    altaEditorial(nombreEditorial);
                }
                int idEditorial = buscarEditorial(nombreEditorial);

                altaEditorial(nombreEditorial);
                altaLibro(isbn, titulo, numeroEjemplares, idAutor, idEditorial, idTema);
*/
                visualizarLibros();

            }

            //Insercion de datos
        } catch (SQLException e) {
            System.out.println("Conexion incorrecta");
            System.out.println(e.getMessage());
        }
    }

    private static void altaAutor(String nombreAutor, Connection con) throws SQLException {
        // Se utiliza PreparedStatement para prevenir inyecciones SQL
        String sentenciaInsert = "INSERT INTO autor(nombreAutor) VALUES(?)";
        PreparedStatement ps = con.prepareStatement(sentenciaInsert);
        ps.setString(1, nombreAutor);
        ps.executeUpdate();
    }

    // Método para verificar si el autor existe
    private static int existeAutor(String nombreAutor, Connection con) throws SQLException {
        // No cambiamos la estructura de sentenciaAutor
        String sentenciaAutor = "Select * from autor where nombreAutor='" + nombreAutor + "'";
        ResultSet sentenciaSelect = con.createStatement().executeQuery(sentenciaAutor);

        // Si el autor existe, retornamos 1. Si no, 0.
        if (sentenciaSelect.next()) {
            return 1;  // Existe
        } else {
            return 0;  // No existe
        }
    }

    private static int buscarAutor(String nombreAutor) {
        // Implementa la lógica para buscar el ID del autor
        return 1;  // Ejemplo de valor de retorno
    }
}
