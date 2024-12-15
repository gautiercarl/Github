package com.htw;

public class FahrenheitToCelsiusStrategy extends ConversionStrategy{
    @Override
    public float convert(float value){
        return (value - 32) / 1.8f;
    }
}
