package org.example.Operations;

import java.util.ArrayList;

public class Subtract implements Calculate{

    @Override
    public int compute(ArrayList<Integer> array) {
        int result = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            result -= array.get(i);
        }
        return result;
    }
}
