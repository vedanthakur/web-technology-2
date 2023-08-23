<?php
function add($numbers){
    $sum = 0;
    foreach ($numbers as $number){
        $sum += $number;
    }
    return $sum;
}

$numbers = array(1,2,3,4);
echo add($numbers);
?>