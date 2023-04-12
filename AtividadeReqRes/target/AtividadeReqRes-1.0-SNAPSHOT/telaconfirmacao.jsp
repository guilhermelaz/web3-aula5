<%@ page import="java.time.LocalDate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Cadastro submetido:</h1>
    <%
        String nome = (String) request.getAttribute("attr_nome");
        LocalDate data = (LocalDate) request.getAttribute("attr_datanasc");
        String idiomanativo = (String) request.getAttribute("attr_idiomanativo");
        String[] habilidades = (String[]) request.getAttribute("attr_habilidade");
    %>

    <ul>
        <li><% out.println(nome);%></li>
        <li><% out.println(data);%></li>
        <li><% out.println(idiomanativo);%></li>
        <ul>
            <% for (String habilidade: habilidades) { %>
            <li> <% out.println(habilidade); %> </li>
            <% } %>
        </ul>
    </ul>

</body>
</html>
