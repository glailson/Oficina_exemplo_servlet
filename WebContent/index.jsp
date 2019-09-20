<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
</head>
<body>
	<div>    
       <form action="bemvindo.jsp" method="post">
           Nome: <input type="text" name="nome" /><br />
           Idade: <input type="text" name="idade" /><br />
           Sexo: <input type="text" name="sexo" /><br />
           E-mail: <input type="text" name="email" /><br />
           Melhorias: <textarea rows="5" cols="12"> </textarea>
           <input type="submit" value="Gravar" />
        </form>    
    </div>
</body>
</html>