package com.example.atividadereqres.controller;

import com.example.atividadereqres.model.CandidatoVaga;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/candidatoVaga")
public class CandidatoVagaController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // informações do formulário

        CandidatoVaga candidato = new CandidatoVaga();

        //try {
            candidato.setNome(request.getParameter("field_nome"));
            candidato.setIdiomanativo(request.getParameter("field_idiomanativo"));
            candidato.setDatanasc(request.getParameter("field_datanasc"));
            candidato.setHabilidades(request.getParameterValues("field_habilidades"));

            request.setAttribute("attr_candidato", candidato);

            // encaminhar as informações para outra servlet
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("telaconfirmacaomvc.jsp");
            requestDispatcher.forward(request, response);
        //} catch (RuntimeException re) {
        //    response.sendRedirect("index.jsp");
        //} catch (Exception e) {
        //    response.sendRedirect("index.jsp");
        //}
    }
}