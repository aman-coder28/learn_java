void main() {
    float first = getLine("Enter First Number: ");

    IO.println("Enter an Operator (+, -, /, x) : ");

    char opr = IO.readln().charAt(0);

    float second = getLine("Enter Second Number: ");

    switch (opr) {
        case '+':
            IO.println(first + second);
            break;
        case '-':
            IO.println(first - second);
            break;
        case 'x':
            IO.println(first * second);
            break;
        case '/':
            IO.println(Methods.divide(first, second));
            break;
        default:
            IO.println("Please Enter a valid operator (+ - x /)");
    }
}

float getLine(String text) {
    IO.println(text);

    final var input = IO.readln();

    try {
        return Float.parseFloat(input);
    } catch (Error err) {
        IO.println(err);

        return 0;
    }
}