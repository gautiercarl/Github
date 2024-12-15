package com.htw;

public class KilometerToMileStrategy extends ConversionStrategy{
    @Override
    public float convert(float value){
        return value*1000;
    }
}
