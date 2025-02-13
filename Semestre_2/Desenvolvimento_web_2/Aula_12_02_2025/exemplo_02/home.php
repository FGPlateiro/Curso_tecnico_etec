<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP CALCULOS</title>
    <style>
    body{
        background-color: yellow;
    }
    </style>
</head>
<body>
    <h1>O calculo a seguir é:</h1>

    <?php
    $numero1 = 12;
    $numero2 = 12;
    $resultado1 = $numero1 * $numero2; // operador de multiplicação
    $resultado2 = $numero1 + $numero2; // operador de soma
    $resultado3 = $numero1 / $numero2; // operador de divisão
    $resultado4 = $numero1 - $numero2; // operador de subtração
    $resultado5 = $numero1 ** $numero2; // operador de exponenciação

    echo "produto da multiplicação: $resultado1 <br>";
    echo "produto da adição: $resultado2 <br>";
    echo "produto da divisão: $resultado3 <br>";
    echo "produto da subtração: $resultado4 <br>";
    echo "produtro da exponenciação: $resultado5";

    ?>
</body>
</html>