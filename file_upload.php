<html>
<head>
    <title>File Upload</title>
</head>
<body>
    <form method="post" action="" enctype="multipart/form-data">
        Select a file:
        <input type="file" name="file" required><br>
        <input type="submit" value="Upload">
    </form>
</body>
</html>

<?php

if (isset($_FILES["file"])) {
    $uploadDir = "uploads/"; // Directory where uploaded files will be stored
    
    // Check if the file was uploaded without errors
    if ($_FILES["file"]["error"] === UPLOAD_ERR_OK) {
        $filename = $_FILES["file"]["name"];
        $tempFilePath = $_FILES["file"]["tmp_name"];

        // Move the temporary file to the upload directory with a new name (you can customize the filename as needed)
        $targetFilePath = $uploadDir . basename($filename);

        if (move_uploaded_file($tempFilePath, $targetFilePath)) {
            echo "File uploaded successfully!";
        } else {
            echo "Error uploading file.";
        }
    } else {
        echo "Error: File not uploaded.";
    }
}
?>

