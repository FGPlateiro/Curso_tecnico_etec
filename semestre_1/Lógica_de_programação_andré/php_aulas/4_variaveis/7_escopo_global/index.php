<?php

$teste = "asd";

echo "$teste global 1 <br>";

if(5 > 2){

    $teste = "asd";

    echo "$teste if <br>";

}

echo "$teste global2 <br>";

function funcao(){

    $teste = "xsxs";

}

funcao();

function testandoGlobal(){

    global $teste;

    $teste = 2;

    echo "$teste global função <br>";
}

testandoGlobal();

echo "$teste global 3 <br>";

?>
