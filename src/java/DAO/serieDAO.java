package DAO;

import DTO.seriesDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class serieDAO {

    public ArrayList<seriesDTO> carregaSeries() throws SQLException {
        ArrayList<seriesDTO> series = new ArrayList();
        seriesDTO serie;
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BrasilSeries", "root", "1941");
        String query = "select nome, genero, critica, nota, id from serie";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            serie = new seriesDTO();
            serie.setNome(rs.getString(1));
            serie.setGenero(rs.getString(2));
            serie.setCritica(rs.getString(3));
            serie.setNota(rs.getString(4));
            serie.setId(rs.getInt(5));
            series.add(serie);
        }
        return series;
    }

    public seriesDTO carregaSerie(int id) {
        seriesDTO serie = new seriesDTO();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BrasilSeries", "root", "1941");
            String query = "select nome, descricao, critica, nota from serie where id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                serie.setNome(rs.getString(1));
                serie.setGenero(rs.getString(2));
                serie.setCritica(rs.getString(3));
                serie.setNota(rs.getString(4));
                serie.setId(rs.getInt(5));
            }
        } catch (SQLException ex) {

        }
        return serie;
    }
    

    public void cadastraSeries(seriesDTO serie) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BrasilSeries", "root", "1941");
        String query = "insert into serie(nome, descricao, critica, nota) values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, serie.getNome());
        ps.setString(2, serie.getGenero());
        ps.setString(3, serie.getCritica());
        ps.setString(4, serie.getNota());
        ps.execute();
    }

    public seriesDTO carregaSeriePorGenero(String Genero) {
        seriesDTO serie = new seriesDTO();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BrasilSeries", "root", "1941");
            String query = "select nome, genero, critica, nota from serie where genero = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, Genero);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                serie.setNome(rs.getString(1));
                serie.setGenero(rs.getString(2));
                serie.setCritica(rs.getString(3));
                serie.setNota(rs.getString(4));
                serie.setId(rs.getInt(5));
            }
        } catch (SQLException ex) {

        }
        return serie;
    }
    
    public seriesDTO carregaSeriePorNota(String Nota) {
        seriesDTO serie = new seriesDTO();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BrasilSeries", "root", "1941");
            String query = "select nome, genero, critica, nota from serie where nota = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, Nota);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                serie.setNome(rs.getString(1));
                serie.setGenero(rs.getString(2));
                serie.setCritica(rs.getString(3));
                serie.setNota(rs.getString(4));
                serie.setId(rs.getInt(5));
            }
        } catch (SQLException ex) {

        }
        return serie;
    }

    /*public seriesDTO retornaSerieStatico(){
        
        
    }
    
    public ArrayList<seriesDTO> retornaSeriesStaticas(){
        
        
    }*/
}
