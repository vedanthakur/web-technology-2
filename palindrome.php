<?php
/* 2016     
    1 b.)   What is user defined function in PHP? WAP to 
            calculate the number palindrome using user defined function.
*/

// Function to check if a number is a palindrome
function isPalindrome($number) {
    // Convert the number to a string
    $numberStr = (string) $number;

    // Reverse the number string
    $reversedStr = strrev($numberStr);
   
    // Compare the original number with the reversed number
    if ($numberStr === $reversedStr) {
        return true; // It’s a palindrome
    } else {
        return false; // It’s not a palindrome
    }
}

// Example usage of the function
$number1 = 121;

if (isPalindrome($number1)) {
    echo $number1 . " is a palindrome.";
} else {
    echo $number1 . " is not a palindrome.";
}

echo "<br>";

$number2 = 12321;

if (isPalindrome($number2)) {
    echo $number2 . " is a palindrome.";
} else {
    echo $number2 . " is not a palindrome.";
}

?>