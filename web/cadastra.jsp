<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BRASIL SERIES</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.red-pink.min.css">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/css/select2.min.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/js/select2.min.js"></script>
    </head>
    <body>
        <div class="mdl-layout mdl-js-layout">
            <header class="mdl-layout__header mdl-layout__header--scroll">
                <div class="mdl-layout__header-row">
                    <span class="mdl-layout-title">Cadastro</span>
                </div>
            </header>
            <div class="mdl-layout__drawer">
                <span class="mdl-layout-title">Menu</span>
                <nav class="mdl-navigation">
                    <a class="mdl-navigation__link">
                        <button type="submit" onclick="location.href = 'login.jsp'" class="mdl-button mdl-js-button mdl-button--raised">
                            Login
                        </button>
                    </a>
                    <a class="mdl-navigation__link">
                        <button type="submit" onclick="location.href = 'cadastra.jsp'" class="mdl-button mdl-js-button mdl-button--raised">
                            Cadastro
                        </button>
                    </a>
                    <a class="mdl-navigation__link">
                        <button type="submit" onclick="location.href = 'SeriesBrasil.jsp'" class="mdl-button mdl-js-button mdl-button--raised">
                            Inicio
                        </button>
                    </a>
                </nav>
            </div>
            <main class="mdl-layout__content">
                <div class="page-content" style="margin: 38%;
                     margin-top: 7%">
                    
                    <form name="formCadastra" action="ControllerCadastra" method="post" class="col s12" style="
                              width: 500px;
                              ">
                        <div class="mdl-textfield mdl-js-textfield">
                            <input class="mdl-textfield__input" type="text" id="login_user" name="login">
                            <label class="mdl-textfield__label" for="sample1">Login</label>
                        </div>
                        <div class="mdl-textfield mdl-js-textfield">
                            <input class="mdl-textfield__input" type="password" id="senha_user" name="senha">
                            <label class="mdl-textfield__label" for="sample1">Senha</label>
                        </div>
                        <button type="submit" class="mdl-button mdl-js-button mdl-button--raised" style="
                                margin-top: 50px;
                                margin-left: 200px;"
                                >
                            Cadastrar
                        </button>
                    </form>
                </div>
            </main>
        </div>
    </body>
</html>