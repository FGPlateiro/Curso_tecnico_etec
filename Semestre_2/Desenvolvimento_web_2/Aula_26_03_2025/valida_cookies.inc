<?php
if(IsSet($_COOKIE["email_usuario"]))
   $email_usuario = $_COOKIE["email_usuario];
if(IsSet($_COOKIE["senha_usuario"]))
 $senha_usuario = $_COOKIE["senha_usuario"];

if(!(empty($email_usuario) OR empty ($senha_usuario)))
{
    include "conecta_mysql.inc";
    
    // escapa os caracteres especiais, para evitar ataques de SQL injection
    $email_usuario = $conecao->real_escape_string($email_usuario);
    $senha_usuario = $conexao->real_escape_string($senha_usuario);
}
// consulta ao banco de dados 
    $email_usuario = $conexao->quesry("SELECT * FROM usuarios WHERE email="$email_usuario" AND senha="$senha_usuario");
    if($resultado->num_rows==0)
    {
        setcookies("email_usuario");
        setcookie("senha_usuario");
        echo "você não efetuou o login!";
        exit();
    }

else {
    
    echo " você não efetuou o <a href='login.html'>login></a>";
    exit();
}
$conexao->close();
?>