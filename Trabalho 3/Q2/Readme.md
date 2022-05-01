## QUESTÃO 2
Você foi contratado para implementar um sistema bancário para uma prova de conceito com a empresa XPTO. Essa empresa possui 3 tipos de contas bancárias:

* Conta XPTO Basic - Sem benefícios;

* Conta XPTO Plus - Todo crédito feito rende um bônus de 0.5% do valor creditado;

* Conta XPTO Extreme - Todo crédito feito rende um bônus de 0.2% e todo débito é restituído de 0.2% (ou seja, se for debitar R$1000,00, apenas R$998,00 será reduzido).

OBS: toda conta tem um número identificador e permite operações de crédito, débito e consultar saldo.

A sua implementação deve atender aos seguintes requisitos:

1. Você deve implementar corretamente todas os tipos de contas descritas;
1. Cada classe de conta deve implementar o métodos toString que permita identificar o tipo, id e saldo da conta;
1. Crie uma classe Sistema que permita criar todos esses tipos de contas, armazenando-as em apenas um vetor de contas. A classe Sistema deve permitir aplicar as operações de crédito, débito e consulta de saldo sobre qualquer conta do vetor;
1. Teste.