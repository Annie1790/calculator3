package org.example.Operations;

import java.util.ArrayList;

public class Add implements Calculate {

    @Override
    public int compute(ArrayList<Integer> array) {
        int result = 0;
        for (int segment: array) {
            result += segment;
        }
        return result;
    }
}
