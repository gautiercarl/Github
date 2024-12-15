package com.htw;

public class CelsiusToFahrenheitStrategy extends ConversionStrategy {


    @Override
    public float convert(float value){
        return ((value*1.8f)+32);
    }
    
}
