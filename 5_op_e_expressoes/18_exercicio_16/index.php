<?php

$a = 5;
$b = 3;

if ($a == $b) {
    echo "A é igual a B (igualdade)<br>";
} else {
    echo "A não é igual a B (igualdade)<br>";
}

if ($a != $b) {
    echo "A é diferente de B (diferença)<br>";
} else {
    echo "A é igual a B (diferença)<br>";
}

if ($a === $b) {
    echo "A é idêntico a B (idêntico)<br>";
} else {
    echo "A não é idêntico a B (idêntico)<br>";
}

if ($a !== $b) {
    echo "A não é idêntico a B (não idêntico)<br>";
} else {
    echo "A é idêntico a B (não idêntico)<br>";
}
?>