<!-- Example of SESSION in PHP -->
<html>
    <body>
        <form action="" method="POST">
            Username: <input type="text" name="username"><br>  
            Password: <input type="password" name="password"><br>
            <input type="submit" name="submit" value="Submit">
        </form>
    </body>
</html>

<?php
    if(isset($_POST["submit"])){ // if form is submited when it's true
        $username = $_POST["username"];
        // brings username from submited form and stores it in PHP variable $username
        // the "identifier" inside $_POST["identifier"] should be same as the "identifier" in <input name="identifier">
        
        $password = $_POST["password"];
        // brings username from submited form and stores it in PHP variable $password

        session_start(); // starts the session
        $_SESSION["username"] = $username; // stores the $username in SESSION variable username
        $_SESSION["password"] = $password; // stores the $password in SESSION variable password
        echo "Welcome: " . $_SESSION["username"]; // displays welcome message with username from the session
    }
    
?>