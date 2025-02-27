<?php

$email_destino = array (
     "pergunta" => "pergunta@seusite.com.br",
     "reclamacao" => "reclamacao@seusite.com.br",
     "suporte" => "suporte@seusite.com.br",
     "publicidade" => "publicidade@seusite.com.br",
     "wqebmaster" => "webmaster@seusite.com.br",
);
if(isset($_POST['NOME']) && isset($_POST['EMAIL']) && isset($_POST['assunto']) && isset($_POST['message']))
{
     $nome = $_POST['nome'];
     $email = $_POST['email'];
     $assunto = $_POST['assunto'];
     $mensagem = $_POST['MENSAGEM'];
}
else
{
echo "Todos os campos devem ser preenchidos!";
exit;
}
$msg = "nome do usuário: $nome\n";
$msg .= "E-mail: $small\n";
$msg .= "mensagem: $mensagem";
mail($email_destino[assunto], "mensagem do usuário", $msg, "From:contato@seusite.com.br", "-r contato@seusite.com.br");

echo "sua mensagem foi enviada com sucesso!";
?>