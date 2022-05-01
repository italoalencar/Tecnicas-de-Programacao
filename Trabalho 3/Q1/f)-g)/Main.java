class Main {
    public static void main(String[] args) {      
        Figura vetFigs [] = new Figura[10];
        int indice = 0;

        vetFigs[indice++] = new Quadrado(5,1,2);    
        vetFigs[indice++] = new Circulo(1,2,3);
        vetFigs[indice++] = new Quadrado(10,12);    
        vetFigs[indice++] = new Quadrado(23);
        vetFigs[indice++] = new Circulo(4,5);
        vetFigs[indice++] = new Circulo(6);
        vetFigs[indice++] = new Quadrado(1,1,1);    
        vetFigs[indice++] = new Circulo(7,8,9);
        vetFigs[indice++] = new Quadrado(2,7,8);    
        vetFigs[indice++] = new Quadrado(99,5);

        for (int i=0; i < indice; i++) {
            if (vetFigs[i] instanceof Colorida) 
                vetFigs[i].calcArea();
        }
    }
}