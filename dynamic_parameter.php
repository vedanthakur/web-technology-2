<?php
function add($rumbers){
    $sum = 0;
    foreach($numbers as $number){
        $sum += $number;
    }
    return $sum;
}

$numbers = [1,2,3,4];
echo add($numbers);
?>