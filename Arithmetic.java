package com.bl.demo;

import java.util.HashMap;

public class Arithmetic {
    int a;
    int b;
    int c;
    HashMap<String,Integer> computationResults = new HashMap<>();
    Arithmetic(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int computeFirstExpression(){
        computationResults.put("result1",(a+b*c));
        return (a+b*c);
    }

    int computeSecondExpression(){
        computationResults.put("result2",(a*b+c));
        return (a*b+c);
    }
    int computeThirdExpression() {
        computationResults.put("result3",(c+a/b));
        return (c+a/b);
    }
    int computeFourthExpression(){
        computationResults.put("result4",(a%b+c));
        return (a%b+c);
    }


}
