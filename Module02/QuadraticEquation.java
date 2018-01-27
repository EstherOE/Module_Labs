public static void solveQuadraticEquation() {

        // Please write your code after this line
    IO.output("Enter an integer, a: ");
    double a = IO.inputDouble();
    IO.output("Enter an integer, b: ");
    double b= IO.inputDouble();
    IO.output("Enter an integer, c: ");
    double c = IO.inputDouble();
  
    double first_x =(-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    double second_x= (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    IO.outputln("First Solution for x =" + first_x);
    IO.outputln("Second Solution for x = " + second_x);





}
