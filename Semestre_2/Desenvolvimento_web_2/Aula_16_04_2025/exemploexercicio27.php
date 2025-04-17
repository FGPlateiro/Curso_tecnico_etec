<?php
$arr = [2, 3, false, true, "palmeiras não tem mundial", "PAYSANDU", true, "CLOVIS", 458, 777, "Java", "PHP" ];

// usando funçãop count para fazer verificação do tamanho do array
$x = count($arr);
$y = 0;

while($y < $x){
    if(is_string($arr[$y])) {
        echo $arr[$y] . "<br>";
    }

    $y++;
}
?>