<?php

function igualdadeFalsa($a, $b) {
    return $a == $b && $a !== $b; 
}


function igualdadeVerdadeira($a, $b) {
    return $a == $b && $a === $b; 
}

$a = 5;
$b = '5';

echo "Resultado da igualdade falsa: " . (igualdadeFalsa($a, $b) ? 'Verdadeiro' : 'Falso') . "\n"; //  Falso
echo "Resultado da igualdade verdadeira: " . (igualdadeVerdadeira($a, $b) ? 'Verdadeiro' : 'Falso') . "\n"; //  Verdadeiro
?>
