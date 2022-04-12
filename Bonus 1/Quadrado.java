public class Quadrado {
    Ponto origem;
    float lado;


    void setOrigem(Ponto origem) {
        this.origem = origem;
    }

    void setLado(float lado) {
        this.lado = lado;
    }

    Ponto getOrigem() {
        return origem;
    }

    float getLado() {
        return lado;
    }


    float areaQuadrado(){
        float area = lado * lado;
        return area;
    }
}
