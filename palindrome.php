<?php
/* 2016     
    1 b.)   What is user defined function in PHP? 
            WAP to calculate the number palindrome using user defined function. 
*/

// Function to check if a number is a palindrome
function isPalindrome($number) {
    // Convert the number to a string
    $numberStr = (string) $number;

    // Reverse the number string
    $reversedStr = strrev($numberStr);
   
    // Compare the original number with the reversed number
    if ($numberStr === $reversedStr) {
        echo $number . " is a palindrome.";
    } else {
        echo $number . " is not a palindrome.";
    }
}

// Example usage of the function
$number = 121;
isPalindrome($number);

$number = 112;
isPalindrome($number);

?>