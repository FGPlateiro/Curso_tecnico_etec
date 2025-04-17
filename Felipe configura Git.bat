echo OFF

echo --- Retirando Usuario Github

github config --global --unset-all user.mail
github config --global --unset.all user.name

echo --- configurando usuario GITHUB
echo
echo
git config --global user.name"FGPlateiro"
git config --global user.email felipe.plateiro@gmail.com
echo --- Mostrando a configuração atual do Github no computador
git config --list
echo
echo
echo --- fim ---

pause