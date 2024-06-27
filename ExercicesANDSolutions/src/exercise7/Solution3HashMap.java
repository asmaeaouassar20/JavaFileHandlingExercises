package exercise7;
// you can use a hashmap :)
// A product is unique in our file :) ... so, the product is the key


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Solution3HashMap {
    public static HashMap<String,Float> storeInArrayList(String filePath){
        HashMap<String,Float> hashMap=new HashMap<String,Float>();
        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
            String line=bufferedReader.readLine();
            while(line!=null){
                hashMap.put(line.split("-")[0],Float.parseFloat(line.split("-")[1]));
                line=bufferedReader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return  hashMap;
    }

    public static void main(String[] args) {
        String filePath="C:/Users/PC/Desktop/learnJavaWithAsmae/products.txt";
        HashMap<String,Float> hashMap=storeInArrayList(filePath);
        System.out.println(hashMap);

    }
}
