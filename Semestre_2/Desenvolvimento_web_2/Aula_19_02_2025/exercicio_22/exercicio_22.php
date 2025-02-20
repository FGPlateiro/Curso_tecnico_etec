<?php

$age = 15;
$age2 = 19;
$age3 = 30;
$maioridade = 18;
$result = "Maior de idade";
if($age >= $maioridade){
    echo "Parabens você possui $age anos, logo é $result <br>";
} else {
    echo " Menor de idade <br>";
}
if($age2 >= $maioridade){
    echo " Parabens você possui, $age2 anos, logo é $result <br>";
} else {
    echo " Menor de idade <br>";
}
if($age3 >= $maioridade){
    echo "Parabens você possui, $age3 anos, logo é $result <br>";
} else {
    echo "Menor de idade <br>";
}

?>