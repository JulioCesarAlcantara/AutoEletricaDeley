<%-- 
    Document   : CadastroUsuarios
    Created on : 15/02/2017, 21:27:32
    Author     : cesar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <script language="JavaScript" type="text/javascript" src="Mascaras.js"></script> 
        <title> Cadasto de Usuários</title>
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
                    <a class="navbar-brand" href="#"><span><h3>JCALEletronicos</h3></span></a>
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
        <div class="container">
            <h1 class="well">Cadastro de Usuários</h1>
            <div class="col-lg-12 well">
                <div class="row">
                    <form name="formUsuario" class="form-signin" action="cadastraUsuario" method="post">
                        <input type="hidden" name="cmd" value="saveAdd"/>
                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Nome</label>
                                    <input type="text" placeholder="Entre com 1º nome aqui .." required class="form-control" name="nomeUsuario">
                                </div>
                                <div class="col-sm-6 form-group">
                                    <label>Nome de usuário</label>
                                    <input type="text" placeholder="Entre com 2º nome aqui .." required class="form-control" name="nomeDeUsuario">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Email</label>
                                    <input type="text" placeholder="Entre com Email aqui.." required class="form-control" name="emailUsuario">
                                </div>
                                <div class="col-sm-6 form-group">
                                    <label>Telefone</label>
                                    <input type="text" placeholder="Entre com Telefone aqui.." maxlength="15" required class="form-control" name="telefoneUsuario" onkeypress="MascaraTelefone(formUsuario.telefoneUsuario);" onblur="ValidaTelefone(formUsuario.telefoneUsuario);">
                                </div>	
                            </div>
                            <div class="row">
                                <div class="col-sm-4 form-group">
                                    <label>Data de Nascimento</label>
                                    <input type="text" class="form-control" placeholder="Data no formato dd/mm/aaaa " maxlength="10" name="dataNascimentoUsuario" onkeypress="MascaraData(formUsuario.dataNascimentoUsuario);" onblur="ValidaData(formUsuario.dataNascimentoUsuario);">
                                </div>	
                                <div class="col-sm-8 form-group">
                                    <label>CPF</label>
                                    <input type="text" placeholder="Cadastro de Pessoa Física aqui.." required maxlength="14" class="form-control" name="cpfUsuario" onkeypress="MascaraCPF(formUsuario.cpfUsuario);" onblur="ValidarCPF(formUsuario.cpfUsuario);">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Defina uma Senha</label>
                                    <input type="password" placeholder="Entre com sua senha aqui.." required class="form-control" name="senhaUsuario">
                                </div>	                                
                                <div class="col-sm-6 form-group">
                                    <label>Confirme sua Senha</label>
                                    <input type="password" placeholder="Confirme sua senha aqui.." required class="form-control" name="senhaConfUsuario">
                                </div>	

                            </div>

                            <input type="submit" class="btn btn-lg btn-success" value="Cadastrar">
                        </div>
                    </form> 
                </div>
            </div>
        </div>
    </body>
</html>
