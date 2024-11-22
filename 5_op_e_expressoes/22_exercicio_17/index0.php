<?php

$resultado1 = (15 > 5) && ("João" === "João");
if ($resultado1) {

    echo "Operação 1: Verdadeiro<br>";
} else {
    
    echo "Operação 1: Falso<br>";
}

$resultado2 = ("teste" > 5) && (1);
if ($resultado2) {
    
    echo "Operação 2: Verdadeiro<br>";
} else {
    
    echo "Operação 2: Falso<br>";
}

$resultado3 = (2 == 3) && (5 >= 3);
if ($resultado3) {
        echo "Operação 3: Verdadeiro<br>";
} else {
    echo "Operação 3: Falso<br>";
}
?>
