package com.assignment.exceptions;

public class EmptyListException extends Exception {
    public EmptyListException() {
        super("The list is empty: calculating the majority is impossible.");
    }
}