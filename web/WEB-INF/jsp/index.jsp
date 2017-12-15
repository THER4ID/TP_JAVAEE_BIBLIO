<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
        <style>
            body{
                background-color: #76b852;
                font-family: 'Roboto';
            } 
            .deconnecter{
                left:620px;
            }
        </style>

    </head>

    <body>
        <div class="container">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">Livres</a>
                    </div>
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#add">Ajouter un livre</a></li>
                        <li class="active"><a class="deconnecter"  href="#disconnect">Déconnexion</a></li>                    
                    </ul>
                </div>     
            </nav>
            
            <div class="col-xs-3" style="border-style:solid;">
                
                <label>Ajouter un Livre</label>
                <form>                               
                    <div class="form-group">          
                        <label>ISBN:</label>                       
                        <input type="text" class="form-control" id="isbn"/>
                    </div>
                    <div class="form-group">
                        
                        <label>auteur:</label>                       
                        <input type="text" class="form-control" id="author" />
                    </div>
                    <div class="form-group">
                        <label>titre:</label>
                        <input type="text" class="form-control" id="title" />
                    </div>
                    <div class="form-group">
                        <label>Nombre de pages</label>
                        <input type="number" class="form-control" id="nb_pages" />
                    </div>
                    <div class="form-group">
                        <label>Edition:</label>
                        <input type="text" class="form-control" id="edition" />
                    </div>
                    <div class="form-group">
                        <label>Année</label>
                        <input type="number" class="form-control" value="2017" id="year" maxlength="4" />
                    </div>
                    <div class="form-group">
                        <label>langue:</label>
                        <input type="text" class="form-control" id="language" />
                    </div>
                    <div class="form-group">
                        <label>Description:</label>
                        <input type="text" class="form-control" id="description" /> 
                    </div>
                    <div class="form-group">
                        <label>Mots clé:</label>
                        <input type="text" class="form-control" id="keywords" />
                    </div>   
                    <div class="form group">
                        <button class="form-control">Créer</button>
                    <div>
                </form>
                
                
                
            </div>
        </div>
    </body>
</html>
