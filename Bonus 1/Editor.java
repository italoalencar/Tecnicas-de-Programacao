public class Editor {
    public static void main(String[] args) {

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        p1.setX(1);
        p1.setY(5);

        p2.setX(4);
        p2.setY(9);


        Reta reta = new Reta();
        reta.setP1(p1);
        reta.setP2(p2);

        System.out.println("A distancia de ponto1 para o ponto2 eh " + reta.medidaReta());


        Quadrado quadrado = new Quadrado();
        quadrado.setLado(10);

        System.out.println("O quadrado de lado " + quadrado.getLado() + " tem area de " + quadrado.areaQuadrado());


        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        System.out.println("O circulo de lado " + circulo.getRaio() + " tem area de " + (Math.round(circulo.areaCirculo()*100.0))/100.0);
    }
}
