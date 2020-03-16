package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public void pupAge(){

        String name = "tao";


        BigDecimal age = new BigDecimal(21);
        BigDecimal age2 = new BigDecimal(10);

        BigDecimal add = age.add(age2);
        //加法
        BigDecimal sub = age.subtract(age2);
        //减法
        BigDecimal mu = age.multiply(age2);
        //乘法
        BigDecimal dogAge = age.divide(age2).setScale(2,BigDecimal.ROUND_UP);
        //保留两位小数，方法是四舍五入的方法，这里是除法
        System.out.println(dogAge);
    }
    public static int max(int num1,int num2){
        if(num1 > num2){
            return num1;
        }else if(num1 < num2){
            return num2;
        }
        return 0;
    }
    public static void main(String[] args) {
//        Map<String ,String > map = new HashMap<>();
//        map.put("a","a");
//        map.put("b","b");
//        map.put("c","c");
//        Map<String ,String > map2 = new HashMap<>();
//        map2.put("d","d");
//        map2.put("e","e");
//        map2.put("f","f");
//        map.putAll(map2);
//        map.containsKey("a");
//        System.out.println(map2.get("f"));
//        for(Map.Entry<String ,String >entry:map.entrySet()){
//            System.out.println("Key = " + entry.getKey() + ", Value = " +entry.getValue());
//        }
        int i = 1;
        int j = 2;
        int k = max(1,2);
        System.out.println(k);
    }
}

