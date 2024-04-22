package com.github.dangelcrack;

public class Calculadora {
    double suma(double a, double b) {
        return a + b;
    }

    double resta(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    double multiplica(double a, double b) {
        return (a * b);
    }

    double divide(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new OperacionInvalidaException("El divisor no puede ser 0");
        }
        return dividendo / divisor;
    }

    double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    double raizCuadrada(double radicando) {
        if (radicando < 0) {
            throw new OperacionInvalidaException("El radicando no puede ser negativo");
        }

        return Math.sqrt(radicando);
    }

    public static class OperacionInvalidaException extends RuntimeException {
        public OperacionInvalidaException(String message) {
            super(message);
        }
    }
}