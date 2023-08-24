<!-- send mail using php  -->
<!DOCTYPE html>
<html>
<head>
    <title>Send Email</title>
</head>
<body>
    <form action="" method="post">
        Email To: <input type="email" name="email_to" required><br>
        Subject: <input type="text" name="subject"><br>
        Message: <br>
        <textarea name="message" cols="30" rows="10" required></textarea><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

<?php
if (isset($_POST["message"])) {
    $email_to = $_POST["email_to"];
    $subject = $_POST["subject"];
    $message = $_POST["message"];
    $email_form = "From: user@example.com";

    if (mail($email_to, $subject, $message, $email_form)) {
        echo "Email sent";
    } else {
        echo "Couldn't send email";
    }
}
?>