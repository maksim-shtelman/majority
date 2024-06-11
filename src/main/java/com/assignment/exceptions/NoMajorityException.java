package com.assignment.exceptions;

import java.util.ArrayList;

public class NoMajorityException extends Exception {
    public NoMajorityException(ArrayList<Integer> list) {
        super("There is no majority element in the list: " + list);
    }
    public NoMajorityException() {
        super("There is no majority element in the list.");
    }
}