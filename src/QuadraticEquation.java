public class QuadraticEquation {
    private double a, b, c;

    public  QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDelta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public String getRoot() {
        String result = "";
        if (this.a == 0) {
            result = "Không phải phương trình bậc 2";
        } else {
            if (this.getDelta() < 0) {
                result = "Phương trình vô nghiệm";
            } else {
                result = "Phương trình có nghiệm " + (-b - Math.pow(this.getDelta(), 0.5)) / (2 * this.a)
                        + " and " + (-b + Math.pow(this.getDelta(), 0.5)) / (2 * this.a);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,2,3);
        System.out.println(quadraticEquation.getRoot());
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(-2,3,1);
        System.out.println(quadraticEquation1.getRoot());
    }
}
