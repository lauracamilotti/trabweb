
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

        <style>
            .demo-card-square.mdl-card {
                width: 1024px;
                height: 411px;
            }
            .demo-card-square > .mdl-card__title {
                color: #fff;
                background:
                    url('http://pm1.narvii.com/6552/ba411725230461b5322d740120a966917ae6e2ab_hq.jpg')bottom right 15% no-repeat #46B6AC;
            }
        </style>
    </head>
    <body>
        <div class="mdl-layout mdl-js-layout">
            <header class="mdl-layout__header mdl-layout__header--scroll">
                <div class="mdl-layout__header-row">
                    <span class="mdl-layout-title">BRASIL SERIES</span>
                </div>
            </header>
            <div class="mdl-layout__drawer">
                <span class="mdl-layout-title">Menu</span>
                <nav class="mdl-navigation">
                    <a class="mdl-navigation__link">
                        <button type="submit" onclick="location.href = 'Tela.jsp'" class="mdl-button mdl-js-button mdl-button--raised">
                            Inicio
                        </button>
                    </a>
                    <a class="mdl-navigation__link">
                        <button type="submit" onclick="location.href = 'inicio.jsp'" class="mdl-button mdl-js-button mdl-button--raised">
                            Series
                        </button>
                    </a>
                    <a class="mdl-navigation__link">
                        <button type="submit" onclick="location.href = 'cadastraSeries.jsp'" class="mdl-button mdl-js-button mdl-button--raised">
                            Cadastra series
                        </button>
                    </a>
                    
                    <a class="mdl-navigation__link">
                        <button type="submit" onclick="location.href = 'login.jsp'" class="mdl-button mdl-js-button mdl-button--raised">
                            Deslogar
                        </button>
                    </a>
                </nav>
            </div>
            
            <main class="mdl-layout__content">
                <div class="page-content" style="margin-left: 23%;
                     margin-top: 5%">
                    <br>
                    <div class="demo-card-square mdl-card mdl-shadow--2dp">
                        <div class="mdl-card__title mdl-card--expand">
                            <h2 class="mdl-card__title-text">Bem Vindo</h2>
                        </div>
                        <div class="mdl-card__supporting-text"> 
                            Bem vindo administrador!
                            Esta é sua tela para fazer a administração do conteúdo do Séries Brasil!
                        </div>
                        <div class="mdl-card__actions mdl-card--border">
                            <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" href="inicio.jsp">
                                Procurar Série - 
                            </a>
                        </div>
                         <div class="mdl-card__actions mdl-card--border">
                            <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" href="inicio.jsp">
                                Procurar Série - 
                            </a>
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>