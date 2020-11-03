package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stack implements StackOperations {
    private List<String> stackElements = new ArrayList<>();

    @Override
    public List<String> get() {
        return this.stackElements;
    }

    @Override
    public Optional<String> pop() {
        if (stackElements.isEmpty()){
            return Optional.empty();
        }
        else{
            String head = stackElements.get(0);
            stackElements.remove(0);
            return Optional.of(head);
        }
    }

    @Override
    public void push(String item) {
        stackElements.add(0, item);
    }
}