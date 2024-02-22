/* Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area. */

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 8);
        Rectangle rectangle2 = new Rectangle(8, 16);
        Triangle triangle1 = new Triangle(4, 8);
        Triangle triangle2 = new Triangle(8, 16);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle2.calculateArea());
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle2.calculateArea());
    }
}