class Circulo extends Figura {
    float raio;

    Circulo() {}

    Circulo(float raio) {
        this(raio,0,0);
    }

    Circulo(float raio, float a) {
        this(raio,a,a);
    }

    Circulo(float raio, float x, float y) {
        p = new Ponto(x,y);
        this.raio = raio;
    }

    void setRaio(float x) {
        raio = x;
    }

    float getRaio() {
        return raio;
    }

    public String toString() {
        return "Circulo";
    }

    void desenhar() {
        System.out.println(this.toString());
    }

    void mover(float dx, float dy) {
        p.setX(p.getX()+dx);
        p.setY(p.getY()+dy);
    }

    void calcArea() {
        double area = Math.PI * (raio * raio);
        System.out.println("Area do " + toString() + ": " + (Math.round(area*100.0))/100.0);
    }
    
}