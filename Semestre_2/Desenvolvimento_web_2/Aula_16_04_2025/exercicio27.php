<?php
/* crie um array com alguns valores, pelo menos 10 de tiopos de dados diferentes
faça um loop while para exibir apenas os dados que são strings */

$arrValores = ["felipe", "augusto", "marianna", 10051990, 25031993, 17052025, true, false, "novelli", "plateiro", "familia", 190343];

$x = count($arrValores);
$y = 0;

while($y < $x){
    if(is_string($arrValores[$y])){
        echo $arrValores[$y] . "<br>";
    }
    $y++;
}

?>