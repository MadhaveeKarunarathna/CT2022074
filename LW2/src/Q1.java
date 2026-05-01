class Q1Main {
    public static void main(String[] args) {

        double A = 2, B = 3, C = 4;
        double X = 5, Y = 2;


        double resultA = Math.sqrt((B * B) + (4 * A * C));
        System.out.println("a. sqrt(B^2 + 4AC) = " + resultA);


        double resultB = Math.sqrt(X + (4 * Math.pow(Y, 3)));
        System.out.println("b. sqrt(X + 4Y^3) = " + resultB);


        double resultC = Math.cbrt(X * Y);
        System.out.println("c. cbrt(X * Y) = " + resultC);


        double radius = 5;
        double resultD = Math.PI * radius * radius;
        System.out.println("d. Area of circle = " + resultD);
    }
}
