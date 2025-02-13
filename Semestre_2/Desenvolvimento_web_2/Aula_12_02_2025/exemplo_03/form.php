<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form test</title>
</head>
<body>
    <form action="form.php" method="get">
        Digite algo:<input type="text" name="formulario"><br>
        <input type="submit">
</form>
    <?php
     echo "você digitou:", $_GET["formulario"],"<br>";
    ?>
</body>
</html>