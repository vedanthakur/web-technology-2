<?php
    if (isset($_POST["say_hello"])) {
        $say_hello = "hello world";
    } else {
        $say_hello = "Click the button";
    }
?>

<html>
<head>
    <title>Server Side Scripting Example</title>
</head>
<body>
    <p><?php echo $say_hello; ?></p>
    <form action="" method="post">
        <input type="submit" name="say_hello" value="Say Hello">
    </form>
    
</body>
</html>