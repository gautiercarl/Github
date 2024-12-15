package com.htw;

public class MileToKilometerStrategy extends ConversionStrategy{
    @Override
    public float convert(float value){
        return value/1000;
    }
}
