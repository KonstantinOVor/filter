package org.example;

public class MultiplierFilterImpl implements Filter {
    @Override
    public Object apply(Object o) {
        return (int) o * 2;
    }
}
