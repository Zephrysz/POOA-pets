# POOA-pets

## Para fazer o programinha funfar:
1) Clonar o codigo na sua pasta:
```
git clone https://github.com/Zephrysz/POOA-pets.git
```
2) Ir ate o diretório raiz do programa:
```
cd POOA-pets
```
3) Compilar o programa:
```
javac -sourcepath src src/com/pets/*.java
```
4) Executar o programa:
```
java -cp src com.pets.Main
```

## TODO:
1) Ao inves de usar inteiros para representar o dia dos agendamentos/estados, acho que seria legal se agnt conseguisse colocar um localDate ou uma biblioteca similar pra fazer a formatacao dia/mes/ano e as operacoes certinhas
2) Adicionar uma maneira do estabelecimento adiar/cancelar um agendamento, e consequentemente rever a logica de transicao dos agendamentos
3) Rever a gambiarra de que se deve inicializar a situacao de um agendamento com uma situacao qualquer para depois fazer as transicoes
4) Talvez criar a classe Consulta que representa o resultado do agendamento (como o prof sugeriu)
5) Separar as classes em packages com restricao de visibilidade para pacotes, para deixar o sistema mais organizado
6) Talvez adicionar atributo nome nos estabelecimentos alem do cnpj