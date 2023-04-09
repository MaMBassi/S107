cd exercicioStrategy
ls
echo "Teste"
sudo apt install mailutils
echo "fim da instalacao"
echo "Mandando e-mail com mail do linux" | mail -s "Pipeline executado!!" ${{email}}
