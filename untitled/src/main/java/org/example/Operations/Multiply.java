package org.example.Operations;

public class Multiply implements Calculate {
    @Override
    public int compute(int value1, int value2) {
        return value1 * value2;
    }
}
