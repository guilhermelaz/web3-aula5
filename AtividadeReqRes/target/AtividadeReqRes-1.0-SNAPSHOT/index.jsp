<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

    <style>
        form{
            width: 500px;
            display: flex;
            flex-direction: column;
            row-gap: 30px;
        }
    </style>

</head>
<body>

<form action="processavaga" method="POST">

    <label>
        Nome:
    <input type="text" name="field_nome">
    </label>

    <label>
        Data de nascimento:
        <input type="date" name="field_datanasc">
    </label>

    <div>
        <div>Idioma nativo:</div>
        <input type="radio" checked name="field_idiomanativo" value="portugues"> Português
        <input type="radio" name="field_idiomanativo" value="ingles"> Inglês
        <input type="radio" name="field_idiomanativo" value="espanhol"> Espanhol
    </div>

    <div>
        <div>Habilidades:</div>
        <input type="checkbox" checked name="field_habilidades" value="java"> Java
        <input type="checkbox" name="field_habilidades" value="javascript"> JavaScript
        <input type="checkbox" name="field_habilidades" value="html"> HTML
        <input type="checkbox" name="field_habilidades" value="css"> CSS
    </div>

    <input type="submit" value="aplicar">
    <input type="reset">

</form>

</body>
</html>