package com.company;
import java.util.Optional;
import java.util.List;

public interface StackOperations {
    List<String> get();
    Optional<String> pop();
    void push(final String item);
}