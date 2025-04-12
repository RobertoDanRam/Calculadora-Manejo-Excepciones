import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("Ingrese el primer numero: ");
            String entrada1 = scanner.nextLine();
            double num1 = Double.parseDouble(entrada1);

            System.out.print("Ingrese el segundo numero: ");
            String entrada2 = scanner.nextLine();
            double num2 = Double.parseDouble(entrada2); 

            System.out.print("Ingrese una operacion de las siguientes: (+, -, *, /): ");
            String operacion = scanner.nextLine();

            double resultado;

            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir entre cero, es como dividir 0 pasteles entre 0 personas, no se puede :/");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Operacion incorrecta: " + operacion);
            }

            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: Solo se pueden poner números, no escribas letras ni simbolos raros");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error:" + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner cerrado correctamente :)");
            }
        }
    }
}
