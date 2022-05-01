## QUESTÃO 1

Crie uma classe abstrata denominada Figura para representar figuras geométricas.  Uma figura geométrica deve possuir os seguintes comportamentos: desenhar, mover e calcularArea:


a) O método desenhar deve imprimir na saída padrão o tipo da figura (ex. Quadrado, Circulo, etc). Utilize o método toString da classe Object para imprimir o tipo da Figura;

b) O método mover deve possuir a seguinte assinatura: void mover (float dx, float dy). Este método deve deslocar todos os pontos de uma figura à uma distancia (dx,dy);

c) O método calcularArea deve retornar a área da figura geométrica;

d) Crie classes concretas que permitam instanciar figuras geométricas do tipo dos quadrados e círculos. Essas classes devem estender e implementar os métodos da classe Figura;

e) Teste as classes criadas na questão anterior instanciando dois quadrados e dois círculos;

f) Suponha que algumas figuras possam ser coloridas. Para isso, a classe que representa uma figura colorida precisa ter um método desenhar recebendo como parâmetro a cor de preenchimento da figura. Tais figuras devem ser classificadas como tipo Colorida. Como você faria para implementar a classe Quadrado como uma figura Colorida e a classe Circulo como figura não colorida, usando o conceito de interface em Java?

g) Teste as classes modificadas anteriormente, criando um vetor para armazenar 10 figuras. Crie figuras concretas neste vetor e imprima a área somente das figuras do tipo Colorida.