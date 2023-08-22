<?php
    if (isset($_POST["submit"])) {
        $name = $_POST["name"];
        $email = $_POST["email"];
        $mobile = $_POST["mobile"];
        $password = $_POST["password"];
        $password_again = $_POST["passwordAgain"];

        if (($password === $password_again) ) {
            
            $dbserver = "localhost";
            $dbuser = "root";
            $dbpassword = "";
            $dbname = "mydatabase";

            $conn = mysqli_connect($dbserver, $dbuser, $dbpassword, $dbname);
            if (!$conn) {
                die("Not connected to database");
            }

            $sql = "INSERT INTO users (`name`, `email`, `mobile`, `password`) VALUES ('$name', '$email', '$mobile', '$password')";

            $runsql = mysqli_query($conn, $sql);

            if (!$runsql) {
                die("Not inserted");
            } else {
                echo "Inserted into databse table.";
            }
        } else {
            echo "Password is not match with password again.";
        }
    }
?>