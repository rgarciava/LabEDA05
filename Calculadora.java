package LabEDA05;

public class Calculadora<T extends Number> {

    public T sumar(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) (Integer) (num1.intValue() + num2.intValue());
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return (T) (Float) (num1.floatValue() + num2.floatValue());
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return (T) (Double) (num1.doubleValue() + num2.doubleValue());
        }
        throw new IllegalArgumentException("Unsupported types");
    }

    public T restar(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) (Integer) (num1.intValue() - num2.intValue());
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return (T) (Float) (num1.floatValue() - num2.floatValue());
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return (T) (Double) (num1.doubleValue() - num2.doubleValue());
        }
        throw new IllegalArgumentException("Unsupported types");
    }

    public T multiplicar(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) (Integer) (num1.intValue() * num2.intValue());
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return (T) (Float) (num1.floatValue() * num2.floatValue());
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return (T) (Double) (num1.doubleValue() * num2.doubleValue());
        }
        throw new IllegalArgumentException("Unsupported types");
    }

    public T dividir(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) (Integer) (num1.intValue() / num2.intValue());
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return (T) (Float) (num1.floatValue() / num2.floatValue());
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return (T) (Double) (num1.doubleValue() / num2.doubleValue());
        }
        throw new IllegalArgumentException("Unsupported types");
    }

    public static void main(String[] args) {
        // Prueba con enteros
        Calculadora<Integer> calcInt = new Calculadora<>();
        System.out.println("Suma (Integer): " + calcInt.sumar(5, 3));
        System.out.println("Resta (Integer): " + calcInt.restar(5, 3));
        System.out.println("Multiplicación (Integer): " + calcInt.multiplicar(5, 3));
        System.out.println("División (Integer): " + calcInt.dividir(5, 3));

        // Prueba con floats
        Calculadora<Float> calcFloat = new Calculadora<>();
        System.out.println("Suma (Float): " + calcFloat.sumar(5.5f, 3.3f));
        System.out.println("Resta (Float): " + calcFloat.restar(5.5f, 3.3f));
        System.out.println("Multiplicación (Float): " + calcFloat.multiplicar(5.5f, 3.3f));
        System.out.println("División (Float): " + calcFloat.dividir(5.5f, 3.3f));
    }
}