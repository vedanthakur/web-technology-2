<!-- 2019 Spring
    1 b) What is user defined function? Write a PHP code to 
    calculate the factorial of given number using recursive function? 
    (Create HTML form input the number given by the user)
-->
<!DOCTYPE html>
<html>
<head>
    <title>Factorial Calculator</title>
</head>
<body>
    <h1>Factorial Calculator</h1>
    <form method="post" action="">
        Enter a number: <input type="number" name="number" required>
        <input type="submit" name="submit" value="Calculate">
    </form>
    
    <?php
    // Function to calculate factorial using recursion
    function factorial($num) {
        if ($num <= 1) {
            return 1; // Base case: factorial of 0 and 1 is 1
        } else {
            return $num * factorial($num - 1); // Recursive case: n! = n * (n-1)!
        }
    }

    // Check if the form is submitted
    if (isset($_POST["number"])) {
        $number = $_POST['number'];
        $result = factorial($number);
        echo "<p>The factorial of $number is $result</p>";
    }
    ?>
</body>

</html>
