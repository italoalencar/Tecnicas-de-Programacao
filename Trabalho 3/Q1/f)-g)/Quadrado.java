class Quadrado extends Figura implements Colorida {
    float lado;

    Quadrado() {}

    Quadrado (float lado) {
        this(lado, 0);
    }

    Quadrado(float lado, float a) {
        this(lado, a, a);
    }

    Quadrado(float lado, float x, float y) {
        p = new Ponto(x,y);
        this.lado = lado;
    }

    void setLado(float x) {
        lado = x;
    }

    float getLado() {
        return lado;
    }

    public String toString() {
        return "Quadrado";
    }

    void desenhar() {
        System.out.println(this.toString());
    } 

    public void desenhar(String cor) {
        System.out.println(this.toString() + " " + cor);
    }

    void mover(float dx, float dy) {
        p.setX(p.getX()+dx);
        p.setY(p.getY()+dy);
    }

    void calcArea() {
        float area = lado * lado;
        System.out.println("Area do " + toString() + ": " + area);
    }

}