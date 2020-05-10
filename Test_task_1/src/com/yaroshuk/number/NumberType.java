package com.yaroshuk.number;

public class NumberType implements NumberTypeInterface {
    private Integer number;

    public NumberType(Integer number) {

        this.number = number;
    }

    @Override
    public Boolean isEven() {

        return this.number % 2 == 0;

    }

    @Override
    public Boolean isComposite() {

        for (int i = 2; i < this.number; i++) {
            if (this.number % i == 0) {
                return true;
            }
        }
        return false;

    }
}
