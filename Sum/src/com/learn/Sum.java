//package com.learn;

public class Sum {
    public Integer a;
    public  Integer b;
    public Integer sumTwo(Integer a,Integer b){
        this.a= a;
        this.b=b;
        Integer sum = this.a+this.b;
        return sum;
    }

    public  Integer idiv(Integer a,Integer b){
        this.a = a;
        this.b = b;
        Integer result = this.a/this.b;
        return result;
    }

    public static void main(String [] args ){
        Integer a=6;
        Integer b=3;
        Sum sumobj = new Sum();
        System.out.println("Sum is : "+ sumobj.sumTwo(a,b));
        System.out.println("idiv is: "+sumobj.idiv(a,b));
    }
}
