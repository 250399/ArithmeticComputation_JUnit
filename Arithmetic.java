package com.bl.demo;

public class Arithmetic {
    int a;
    int b;
    int c;
    Arithmetic(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int computeFirstExpression(){
        return (a+b*c);
    }

    int computeSecondExpression(){
        return(a*b+c);
    }
    int computeThirdExpression() {
        return (c+a/b);
    }

}
