package Controlador;

import DAO.serieDAO;
import DTO.Erro;
import DTO.seriesDTO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//controlador que faz a procura das series pelo id, retorna a serie com o id da serie
@WebServlet(name = "ControllerProcura", urlPatterns = {"/ControllerProcura"})
public class ControllerProcura extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = "mostraSerie.jsp";

        if (request.getParameter("selectSeries").equals(null) && request.getParameter("selectgenero").equals(null)) {
            String nota = (String) request.getParameter("selectnota");
            request.setAttribute("nota", nota);
            pagina = "mostraSerie.jsp";
        } else if (request.getParameter("selectnota").equals(null) && request.getParameter("selectgenero").equals(null)) {
            int id = Integer.valueOf(request.getParameter("selectSeries"));
            seriesDTO serie = new serieDAO().carregaSerie(id);
            request.setAttribute("serie", serie);
        } else if (request.getParameter("selectseries").equals(null) && request.getParameter("selectnota").equals(null)) {
            String genero = (String) request.getParameter("selectgenero");
            request.setAttribute("genero", genero);
            pagina = "mostraSerie.jsp";
        } else {
            Erro erro = new Erro();
            erro.setErro("Selecione apenas um objeto de pesquisa por vez");
            erro.setEndereco("inicio.jsp");
            pagina = "Erro.jsp";
            request.setAttribute("erro", erro);
        }

        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);

    }
}
