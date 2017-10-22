package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public static void insereUsuario(UsuarioDTO usuario) {
	try {
	    String query = "insert into Usuario(login, senha) values(?,?)";
	    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BrasilSeries", "root", "1941");
	    PreparedStatement ps = conn.prepareStatement(query);
	    ps.setString(1, usuario.getLogin());
	    ps.setString(2, usuario.getSenha());
	    ps.execute();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }

    public static boolean existeUsuario(UsuarioDTO usuario) {
	boolean isTrue = false;
	try {
	    String query = "select login, senha from Usuario";
	    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BrasilSeries", "root", "1941");
	    
	    PreparedStatement ps = conn.prepareStatement(query);
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {
		if (rs.getString("login").equals(usuario.getLogin()) && rs.getString("senha").equals(usuario.getSenha())) {
		    isTrue = true;
		    break;
		}
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return isTrue;
    }
}