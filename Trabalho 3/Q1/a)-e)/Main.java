class Main {
    public static void main(String[] args) {
        Figura quad1 = new Quadrado(5,3,4);
        Figura quad2 = new Quadrado(10,7);

        quad1.desenhar();
        quad2.desenhar();
        System.out.println();

        quad1.p.mostrarPonto();
        quad1.mover(1,1);
        quad1.p.mostrarPonto();
        System.out.println();

        quad2.p.mostrarPonto();
        quad2.mover(1,1);
        quad2.p.mostrarPonto();
        System.out.println();

        quad1.calcArea();
        quad2.calcArea();
        System.out.println();

        Figura circ1 = new Circulo(2);
        Figura circ2 = new Circulo(3);

        circ1.desenhar();
        circ2.desenhar();
        System.out.println();

        circ1.p.mostrarPonto();
        circ1.mover(1,1);
        circ1.p.mostrarPonto();
        System.out.println();

        circ2.p.mostrarPonto();
        circ2.mover(1,1);
        circ2.p.mostrarPonto();
        System.out.println();

        circ1.calcArea(); 
        circ2.calcArea();
    }
}