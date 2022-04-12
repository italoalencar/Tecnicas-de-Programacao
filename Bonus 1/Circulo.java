public class Circulo {
    Ponto centro;
    float raio;


    void setCentro(Ponto centro){
        this.centro = centro;
    }

    void setRaio(float raio){
        this.raio = raio;
    }

    Ponto getCentro(){
        return centro;
    }

    float getRaio(){
        return raio;
    }


    double areaCirculo(){
        double area = (Math.PI) * (raio * raio);
        return area;
    }
}