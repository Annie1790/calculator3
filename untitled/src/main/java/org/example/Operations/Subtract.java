package org.example.Operations;

public class Subtract implements Calculate{

    @Override
    public int compute(int value1, int value2) {
        return value1 - value2;
    }
}
