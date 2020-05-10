package com.yaroshuk.core;

public class GcdLcm implements GcdLcmInterface {
    private Integer numberA;
    private Integer numberB;

    public GcdLcm(Integer numberA, Integer numberB) {
        this.numberA = numberA;
        this.numberB = numberB;


    }

    @Override
    public Integer gcd() {
        int mod = this.numberA % this.numberB;
        if (mod > 0) {
            GcdLcm gcdLcm = new GcdLcm(this.numberB, mod);
            return gcdLcm.gcd();

        } else {
            return this.numberB;
        }

    }

    @Override
    public Integer lcm() {
        return this.numberA * (this.numberB / this.gcd());

    }
}
