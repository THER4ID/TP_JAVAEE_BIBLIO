<%--
    Document   : index
    Created on : 2017-12-15, 18:20:44
    Author     : Avasam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Acceuil</title>

        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300" rel="stylesheet">
        <link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">
    </head>
    <body>
        <div class="container">

            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="index">Livres</a>
                    </div>
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="ajouterLivre">Ajouter un livre</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active pull-right"><a href="members/logout">Déconnexion</a></li>
                    </ul>
                </div>
            </nav>

            <div class="table table-hover">
                <table class="table" method="put">
                    <c:forEach items="${listeDeLivre}" var="listeDeLivre"></c:forEach>

                        <label style="font-size: 300%">Liste De Livres</label>

                    <tr style="text-align: center;">
                        <td>
                            <label>ISBN</label>
                        </td>
                        <td>
                            <label>Auteur</label>
                        </td>
                        <td>
                            <label>Titre</label>
                        </td>
                        <td>
                            <label>Nombre de Pages</label>
                        </td>
                        <td>
                            <label>Edition</label>
                        </td>
                        <td>
                            <label>Année</label>
                        </td>
                        <td>
                            <label>Langue</label>
                        </td>
                        <td>
                            <label>Description</label>
                        </td>
                        <td>
                            <label>Mots-Clés</label>
                        </td>
                    </tr>
                        <c:forEach var="i" begin="0" end="${listeDeLivre.size()-1}">
                            <tr>
                                <td>
                                    ${listeDeLivre.get(i).ISBN}
                                </td>
                                <td>
                                    ${listeDeLivre.get(i).author}
                                </td>
                                <td>
                                    ${listeDeLivre.get(i).title}
                                </td>
                                <td>
                                    ${listeDeLivre.get(i).NB_Pages}
                                </td>
                                <td>
                                    ${listeDeLivre.get(i).edition}
                                </td>
                                <td>
                                    ${listeDeLivre.get(i).year}
                                </td>
                                <td>
                                    ${listeDeLivre.get(i).language}
                                </td>
                                <td>
                                    ${listeDeLivre.get(i).description}
                                </td>
                                <td>
                                    ${listeDeLivre.get(i).keywords}
                                </td>

                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
