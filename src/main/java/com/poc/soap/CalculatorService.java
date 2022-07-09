package com.poc.soap;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public float calc(float num1,float num2,OperatorEnum operatorEnum) throws Exception {
       switch (operatorEnum){
           case SUM: return  num1 + num2;
           case SUBTRACT: return  num1 - num2;
           case MULTIPLY: return  num1 * num2;
           case DIVIDE: return  num1 / num2;
           default: throw new Exception("Operation invalid");
       }
    }
}