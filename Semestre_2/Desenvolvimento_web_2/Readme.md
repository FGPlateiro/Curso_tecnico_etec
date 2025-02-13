Aula 12/02/2025
Professor André.
Introdução ao HTTP
  A web roda em cima do protocolo HTTP ( Hyper text Transfer Protocol);
Quando um navegador solicita uma página web é feito um request http;
esta requisição recebe uma reposta, ambos podem possuir um body;
  A resposta contém um reader ( cabeçalho), que é constituído pelo metodo
(GET, POST), ARQUIVO/PATH solicitado ( index.php) e versão do protocolo
HTTP (HTTP/1.X).
Basicamente uma requisição é enviada e uma resposta é recebida.

o que é Localhost?

é a forma de acessar o servidor local da nossa máquina;
Equivale ao IP 127.0.0.1, ou seja, nosso pc.
Assim podemos simular como se o site ou arquivos que estamos
acessando é processado em um servidor
IP significa internet protocol.

A Sintaxe do pqp

O php vai interpretar um bloco de código em nosso arquivo apenas se ele
estiver entre as tags de PHP.
A abertura é: <?php
e o fechamento: ?>
coloque ";" a cada instrução.
Todo o código dentro destas tags será executado pelo PHP, e apos isso
será impresso na tela;

PHP e suas dependencias

podemos checar como o php e suas dependências estão instaladas
no nosso computador.
O nome da função é phpinfo()
ele exibe as versões tambémdos pacotes instalados;
Util para saber como o servidor está configurado;

Case Sensitivity

significa sensibilidade a casas maiúsculas e minúsculas;
para instruções PHP não temos essa diferença, ou seja,
echo = ECHO
porém para variáveis são case sensitive;
ou seja, $nome != $NOME;
obs: veremos variáveis em detalhes adiante.

Instruções de código

As instruções simples de php são separadas por ponto e virgula;
instruções simples são instruidas de uma linha;
quando há uma instrução maior, como de condição ou repetição, a
definição da mesma é dada por abertura e fechamento de chaves;
Nestes casos não precisaremos de ponto e virgula;

palavra reservadas

algumas palavras reservadas são reservadas da linguagem e já tem suas
funcionalidades defionidas, então não podemos utilizar em nossos
programas.
pois caso fosse possível poderíamos substituira sua função original;
_DIR_, _FILE_, ENDIf, print, private, protected, and, require, public,
as, break, case, for, finally, switch, throw e etc.



