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
        <link href="/Mascaras.js" rel="stylesheet" type="text/css">
        <script language="JavaScript" type="text/javascript" src="Mascaras.js"></script> 
        <script language="JavaScript" type="text/javascript" src="MascaraFixo.js"></script> 

        <title> Cadasto de Clientes</title>
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
            <h1 class="well">Cadastro de Clientes</h1>
            <div class="col-lg-12 well">
                <div class="row">
                    <form name= "formCliente" class="form-signin" action="cadastraCliente" method="post">
                        <input type="hidden" name="cmd" value="saveAdd"/>
                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-12 form-group">
                                    <label>Nome</label>
                                    <input type="text" placeholder="Entre com o nome aqui .." class="form-control" name="nomeCliente" required autofocus>
                                </div>                                
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label >RG</label>
                                    <input type="text" maxlength="7" placeholder="Entre com o RG aqui .." class="form-control" name="rgCliente">
                                </div>		
                                <div class="col-sm-6 form-group">
                                    <label for="cpfCliente">CPF</label>
                                    <input type="text" class="form-control" placeholder="Entre com o CPF aqui .." maxlength="14" name="cpfCliente" required onkeypress="MascaraCPF(formCliente.cpfCliente);" onBlur="ValidarCPF(formCliente.cpfCliente)">
                                </div>
                            </div> 
                            <div class="form-group">
                                <label>Endereço</label>
                                <textarea placeholder="Entre com o Endereço aqui.." rows="4" class="form-control" name="enderecoCliente"></textarea>
                            </div>	
                            <div class="row">
                                <div class="col-sm-4 form-group">
                                    <label for="telefone1Cliente">Telefone 1 para contato</label>
                                    <input type="text" maxlength="15" placeholder="Entre com o Telefone aqui .." class="form-control"  name="telefone1Cliente" required onkeypress="MascaraTelefone(formCliente.telefone1Cliente);" onblur="ValidaTelefone(formCliente.telefone1Cliente)">
                                </div>	
                                <div class="col-sm-4 form-group">
                                    <label for="telefone2Cliente">Telefone 2 para contato</label>
                                    <input type="text" placeholder="Entre telefone aqui.." maxlength="15" class="form-control" name="telefone2Cliente"  onkeypress="MascaraTelefone(formCliente.telefone2Cliente);" onblur="ValidaTelefone(formCliente.telefone2Cliente)">
                                </div>	
                                <div class="col-sm-4 form-group">
                                    <label for="telefoneFixoCliente">Telefone Residencial</label>
                                    <input type="text" placeholder="Entre telefone Fixo aqui.." maxlength="14" class="form-control" name="telefoneFixoCliente" onkeypress="MascaraTelefoneFixo(formCliente.telefoneFixoCliente);" onblur="ValidaTelefone(formCliente.telefoneFixoCliente)">
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
