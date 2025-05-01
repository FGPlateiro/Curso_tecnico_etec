<?php

$i = 1;

$c = "variavel de teste";

while($i <= 10){
    echo "loop externo $i <br>";

    // segundo cotnador
    $j = 1;

    echo "$c <br>";

    while($j <= 5){
     echo "loop interno $j <br>";
     
     echo "$c 2 <br>";

     $j++;

    }

    $i++;
}

?>