<?php

if(5 > 10 && 10 > 5) { //true e  false
    echo " entrou no IF 1 <br>";
        }
    if(50 > 10 && 10 > 5){
    echo " entrou no if 2 <br>";
    }
    if(50 > 10 && 10 > 500 ){
     echo " entrou no if 3 <br>";
    }
    if(50 > 100 && 10 > 500){
    echo " entrou no if 4 <br>" ;
    }
    
    $a = 10;
    $b = 5;
    $c = 12;
    $d = 12;
    
    if( $a > $b && $c == $d) {
        echo " entrou no if 5 <br>";
    }
    if($b <= $a && $c >= $d){
        echo " entrou no if 6 <br>";
    }
    if ($b === $a && $c > $d){
        echo "entrou no if 7 <br>";
    }
    if($b <= $a && $c >= $d && $a > $b){
        echo " entou no IF 8 <br>";
    
    }
    if($b <= $a && $c >= $d && $c === $a) {
        echo " entrou no if 9 <br>";
    }
?>