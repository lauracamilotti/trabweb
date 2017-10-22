package Controlador;

import DTO.seriesDTO;
import java.io.IOException;
import DAO.serieDAO;
import DTO.Erro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//controlador principal que cadastra as serie, faz as verificacoes de acordo com as regras, e cadastra a serie no banco de dados se tudo estiver correto
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        seriesDTO serie = new seriesDTO();
        serieDAO DAO = new serieDAO();
        String pagina = "inicio.jsp";
        
        if (request.getParameter("nome").equals("") || request.getParameter("genero").equals("") || request.getParameter("nota").equals("")) {
            Erro erro = new Erro();
            erro.setErro("Ah Campos vazios");
            erro.setEndereco("cadastra.jsp");
            pagina = "Erro.jsp";
            request.setAttribute("erro", erro);
        } else {
            serie.setNome(request.getParameter("nome"));
            serie.setGenero(request.getParameter("genero"));
            if (request.getParameter("critica") != null) {
                serie.setCritica(request.getParameter("critica"));
            }
            serie.setNota((String) (request.getParameter("nota")));
            try {
                DAO.cadastraSeries(serie);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
    }
}
