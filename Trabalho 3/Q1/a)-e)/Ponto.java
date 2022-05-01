class Ponto {
    float x, y;

    Ponto() {}

    Ponto(float a) {
        this(a,a);
    }

    Ponto(float x, float y) {
        setX(x);
        setY(y);
    }

    void setX(float x) {
        this.x = x;
    }

    void setY(float y){
        this.y = y;
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }

    void mostrarPonto() {
        System.out.println("X=" + x + ", Y=" + y);
    }
}