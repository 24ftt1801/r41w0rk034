public  class ComputeArea {
    public static void main(String[] args) {
        
        double base = 4.0;
        double height = 6.0;
        final double PI = 3.14;
        double radius = 8.0;

        double area_of_square = base * base;
        double area_of_triangle = 0.5 * base * height;
        double area_of_circle = PI * radius * radius;

        System.out.print(" The area of square is " + area_of_square +
                         "\n The area of triangle is " + area_of_triangle +
                         "\n The area of circle is " + area_of_circle);

    }

    
}