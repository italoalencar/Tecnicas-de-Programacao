public class Reta {
    Ponto p1;
    Ponto p2;


    void setP1(Ponto p1){
        this.p1 = p1;
    }

    void setP2(Ponto p2){
        this.p2 = p2;
    }

    Ponto getP1(){
        return p1;
    }

    Ponto getP2(){
        return p2;
    }

    
    // dAB² = (xB – xA)² + (yB – yA)²
    public double medidaReta() {
       double med = Math.sqrt(((p2.getX() - p1.getX()) * (p2.getX() - p1.getX())) + ((p2.getY() - p1.getY()) * (p2.getY() - p1.getY()))); 
       return med;
    }
}
