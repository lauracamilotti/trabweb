<%@page import="java.util.ArrayList"%>
<%@page import="DAO.serieDAO"%>
<%@page import="DTO.seriesDTO"%>
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
                    <span class="mdl-layout-title">BRASIL SERIES</span>
                </div>
            </header>
            <div class="mdl-layout__drawer">
                <span class="mdl-layout-title">Menu</span>
                <nav class="mdl-navigation">
                    <a class="mdl-navigation__link">
                        <button type="submit" onclick="location.href = 'BemVindo.jsp'" class="mdl-button mdl-js-button mdl-button--raised">
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
                            Cadastrar series
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
                <div class="page-content" style="margin-left: 40%;
                     margin-top: 5%">
                    <form name="formCadastra" action="Controller" method="post" class="col s12" style="
                          width: 100%;
                          ">
                        <div class="mdl-textfield mdl-js-textfield">
                            <input class="mdl-textfield__input" type="text" id="nome" name="nome">
                            <label class="mdl-textfield__label" for="sample1">Nome</label>
                        </div>
                        <br>

                        <div class="mdl-textfield mdl-js-textfield">
                            <select class="browser-default" name="selectnota" style="width: 100%;">
                                <option></option>

                                <%ArrayList<String> nota = new ArrayList();
                                    nota.add("Horrivel");
                                    nota.add("Ruim");
                                    nota.add("Media");
                                    nota.add("Boa");
                                    nota.add("Incrivel");
                                %>
                                <% for (String notas : nota) {%>
                                <option value="<%=notas%>"><%=notas%></option>
                                <%}%>
                            </select>
                            <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
                            <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/js/select2.min.js"></script>
                            <script>
                            $(document).ready(function () {
                                $(".browser-default[name=selectnota]").select2({
                                    allowClear: true,
                                    placeholder: 'Selecione a nota desejada'
                                });
                            });
                            </script>
                        </div>
                        <br>
                        <div class="mdl-textfield mdl-js-textfield">
                            <textarea class="mdl-textfield__input" type="text" rows= "3" id="critica" name="critica"></textarea>
                            <label class="mdl-textfield__label" for="sample5">critica</label>
                        </div>
                        <br>
                        <div class="mdl-textfield mdl-js-textfield">
                            <select class="browser-default" name="selectgenero" style="width: 100%;">
                                <option></option>
                                <%ArrayList<String> generos = new ArrayList();
                                    generos.add("Acao");
                                    generos.add("Drama");
                                    generos.add("Suspense");
                                    generos.add("Terror");
                                    generos.add("Aventura");
                                    generos.add("Romance");
                                %>
                                <% for (String genero : generos) {%>
                                <option value="<%=genero%>"><%=genero%></option>
                                <%}%>
                            </select>
                            <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
                            <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/js/select2.min.js"></script>
                            <script>
                            $(document).ready(function () {
                                $(".browser-default[name=selectgenero]").select2({
                                    allowClear: true,
                                    placeholder: 'Selecione o genero desejado'
                                });
                            });
                            </script>
                        </div>
                        <br>
                        <br>
                        <br>
                        <button type="submit" class="mdl-button mdl-js-button mdl-button--raised">
                            Cadastrar
                        </button>   
                    </form>
                </div>
            </main>
        </div>
    </body>
</html>