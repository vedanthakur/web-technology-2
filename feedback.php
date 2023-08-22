<!-- 
    2020 Fall 2.a
Why database is more important? Write PHP code to save feedback form data to MySql database.
(Note: server: 192.168.10.11, username: pu, password: pu@19, database: pu_db) -->
<html>
<head>
    <title>Feedback</title>
</head>
<body>
    <form action="" method="post">
        Name: <input type="text" name="name"><br>
        Email: <input type="email" name="email"><br>
        Feedback message: <br>
        <textarea name="message" cols="30" rows="10">
        </textarea><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

<?php
    if (isset($_POST["message"])) { // true when form is submited
        $name = $_POST["name"];
        $email = $_POST["email"];
        $message = $_POST["message"];

        $dbserver = "192.168.10.11";
        $username = "pu";
        $password = "pu@19";
        $database = "pu_db";

        $conn = mysqli_connect($dbserver, $username, $password, $database);

        if (!$conn) {
            die("Could not connect to Database");
        }

        $sql = "INSERT INTO feedback (`name`, `email`, `message`) VALUES('$name', '$email', '$message')";

        $result = mysqli_query($conn, $sql);

        if (!$result) {
            die("Error");
        }
        else {
            echo "Data inserted!!";
        }

    }
?>