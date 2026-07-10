package com.chaicode.conditionals.model;

public record CoffeeExtras(boolean whippedCream, boolean extraShot) {
    public CoffeeExtras() {
        this(false, false);
    }
}
