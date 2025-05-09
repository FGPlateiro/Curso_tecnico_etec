<?php

include_once("helpers/url.php");
include_once("data/posts.php");
include_once("data/categories.php");

?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- google fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;700&display=swap" rel="stylesheet">
    <!-- css aplicação-->
    <link rel="stylesheet" href="<?= $BASE_URL ?>/css/styles.css">
    
    <title>Blog</title>
</head>
<body>
    <header>
   <a href="<?= $BASE_URL ?>"id="logo">
    <img src="<?= $BASE_URL ?>/img/logo.svg  alt="blog >
</a>
<ul id="navbar">
    <li><a href="index.php"class="nav-link">Home</a></li> 
    <li><a href="#"class="nav-link">Categorias</a></li> 
    <li><a href="#"class="nav-link">Sobre</a></li> 
    <li><a href="contact.php"class="nav-link">Contato</a></li> 
</ul> 
</header>
    
</body>
</html>