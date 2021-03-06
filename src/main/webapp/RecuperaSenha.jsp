<%-- 
    Document   : RecuperaSenha
    Created on : 16/02/2017, 13:20:22
    Author     : cesar
--%>

<%@page import="javax.enterprise.context.RequestScoped"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
              rel="stylesheet" type="text/css">
        <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
              rel="stylesheet" type="text/css">
        <link href="/CSS.css" rel="stylesheet" type="text/css">
        <link href="/Arquivo.css" rel="stylesheet" type="text/css">
        <title> Login</title>
    </head>

    <body>
        <div class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-ex-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand"><span><h3> JCALEletronicos </h3></span></a>
                </div>
                <div class="collapse navbar-collapse" id="navbar-ex-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <br><a href="#">Home</a>
                        </li>
                        <li>
                            <br><a href="#">Contacts</a>
                        </li>
                    </ul>
                </div>
                <br>
            </div>
        </div>

        <c:if test="${requestScope.mensagemDeErro}">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-md-3 col-md-offset-4">
                        <h1 class="text-center login-title "><font color="#FF0000">${requestScope.mensagemDeErro}</font></h1><br>
                    </div>
                </div>
            </div>
        </c:if>
        <c:if test="${requestScope.mensagemDeInformacao}">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-md-3 col-md-offset-4">
                        <h1 class="text-center login-title "><font color="#009900">${requestScope.mensagemDeInformacao}</font></h1><br>
                    </div>
                </div>
            </div>
        </c:if>

        <div class="container">
            <div class="row">
                <div class="col-sm-6 col-md-3 col-md-offset-4">
                    <h1 class="text-center login-title">Sign in</h1><br>
                    <div class="account-wall">
                        <form action="RecuperarSenha" method="post" class="form-signin">
                            <input type="hidden" name="cmd" value="recSenha"/>
                            <input type="text" class="form-control" placeholder="Login" name="userLogin" required autofocus><br>
                            <input type="text" class="form-control" placeholder="Email" name="userEmail" required><br>
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button><br>                           
                        </form>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
