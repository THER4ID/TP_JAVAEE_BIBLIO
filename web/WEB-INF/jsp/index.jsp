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
				<label style="font-size: 300%">Liste De Livres</label>
				
                <table class="table">
                    <tr>
                        <th>
                            <label>ISBN</label>
                        </th>
                        <th>
                            <label>Auteur</label>
                        </th>
                        <th>
                            <label>Titre</label>
                        </th>
                        <th>
                            <label>Nombre de Pages</label>
                        </th>
                        <th>
                            <label>Edition</label>
                        </th>
                        <th>
                            <label>Année</label>
                        </th>
                        <th>
                            <label>Langue</label>
                        </th>
                        <th>
                            <label>Description</label>
                        </th>
                        <th>
                            <label>Mots-Clés</label>
                        </th>
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
