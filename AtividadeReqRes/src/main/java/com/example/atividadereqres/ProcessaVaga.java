package com.example.atividadereqres;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/processavaga")
public class ProcessaVaga extends HttpServlet {

    private DateTimeFormatter formatter;

    @Override
    public void init(ServletConfig config) throws ServletException {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // informações do formulário
        String fieldNome = request.getParameter("field_nome");

        if (fieldNome.equals("")){
            response.sendRedirect("http://localhost:8080/AtividadeReqRes_war_exploded/index.jsp");
        }

        LocalDate fieldDatanasc = LocalDate.parse(request.getParameter("field_datanasc"), formatter);
        String fieldIdiomanativo = request.getParameter("field_idiomanativo");
        String[] fieldHabilidade = request.getParameterValues("field_habilidades");

        // gravar informações na requisição
        request.setAttribute("attr_nome", fieldNome);
        request.setAttribute("attr_datanasc", fieldDatanasc);
        request.setAttribute("attr_idiomanativo", fieldIdiomanativo);
        request.setAttribute("attr_habilidade", fieldHabilidade);

        // encaminhar as informações para outra servlet
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("telaconfirmacao.jsp");
        requestDispatcher.forward(request, response);

    }
}
