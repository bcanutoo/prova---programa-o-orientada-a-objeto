import java.util.Scanner;

public class PontoPrincipal {
    
    public static double distanciaEuclidiana(Ponto A, Ponto B) {
       
        double dx = B.getY() - A.getY();
        double dy = B.getX() - A.getX();
        
        double dist = Math.sqrt(dx, 2) + Math.sqrt(dy, 2); 
        return Math.sqrt(dist);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite xa: ");
        double xa = sc.nextDouble();
        System.out.print("digite ya: ");
        double ya = sc.nextDouble();

        System.out.print("digite xb: ");
        double xb = sc.nextDouble();
        System.out.print("digite yb: ");
        double yb = sc.nextDouble();

        Ponto A = new Ponto(xa, ya);
        Ponto B = new Ponto(xb, yb);

        double distancia = distanciaEuclidiana(A, B);
    
        System.out.println("A distância euclidiana entre os pontos é: " + distancia);

        sc.close();
    }
}
