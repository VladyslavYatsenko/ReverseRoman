package com.company.yatsenko;

public class RomanNumeric {
    private String representation=null;

    public RomanNumeric(int number) {
        if(number==1){
            representation="I";
        }else if(number==4){
            representation="IV";
        }else if(number==5) {
            representation = "V";
        }else if(number==9){
            representation="IX";
        }else if(number==10){
            representation="X";
        }else if(number==40){
            representation="XL";
        }else if(number==50){
            representation="L";
        }else if(number==90){
            representation="XC";
        }else if(number==100){
            representation="C";
        }else if(number==400){
            representation="CD";
        }else if(number==500){
            representation="D";
        }else if(number==900){
            representation="CM";
        }else if(number==1000){
            representation="M";
        }
    }

    public String getRepresentation() {
        return representation;
    }
}
