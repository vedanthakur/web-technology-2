<html>
<head>
    <title>Cookies</title>
</head>
<body>
    <form action="" method="post">
        Name: <input type="text" name="name"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

<?php
if (isset($_POST["name"])) {
    $name = "student";
    $nameValue = $_POST["name"];

    setcookie($name, $nameValue, time() + (60*60));

    echo 'Welcome '. $_COOKIE["student"];
}

?>