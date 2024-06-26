package exercise7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /**
     * This method stores the data that exists in the file in two arrays provided as parameters
     * @param Products array of product [string]
     * @param Prices array of prices of products [float]
     */
    public static void storeInArray(String[] Products,float[] Prices){

        if(Products.length!=Prices.length){
            System.out.println("lengths of the two arrays must be equal");
            return;
        }

        int n=Products.length;
        String filePath="C://Users//PC//Desktop//learnJavaWithAsmae/products.txt";
        FileReader fileReader= null;
        try {
            fileReader = new FileReader(filePath);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=bufferedReader.readLine();

            int productCounter=0,priceCounter=0; // used to add products and prices in arrays
            boolean[] productAndPrice={false,false}; // to verify that each line in the file contains a product and its price
            int i=0;

            while(line!=null && i<n){
                productAndPrice[0]=false;
                productAndPrice[1]=false;
                String[] wordsOfLine=line.split("-");
                for(String w:wordsOfLine){
                    if(stringIsFloat(w)){
                        float price=Float.parseFloat(w);
                        Prices[priceCounter++]=price;
                        productAndPrice[1]=true;
                    }else{
                        Products[productCounter++]=w;
                        productAndPrice[0]=true;
                    }
                }
                if(productAndPrice[0]==false || productAndPrice[1]==false){
                    System.out.println("missed product or price");
                    return;
                }
                    line=bufferedReader.readLine();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * check if a string can be converted to a float
     * @param s can be whether a string or a float
     * @return true if 's' can be converted to float, false otherwise
     */
    public static boolean stringIsFloat(String s){
        try{
            Float.parseFloat(s);
            return true;
        }catch (Exception e){
            //e.printStackTrace();
            return false;
        }
    }



    public static void displayProducts(String[] arrayOfProducts){
        for(String s:arrayOfProducts){
            System.out.print(s+"  -  ");
        }
        System.out.println();
    }
    public static void displayPrices(float[] arrayOfPrices){
        for(float f:arrayOfPrices){
            System.out.print(f+"  -  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("enter the number of products: ");
        int n=scanner.nextInt();

        String[] arrayOfProducts=new String[n];
        float[] arrayOfPrices=new float[n];

        System.out.println("\n------ before calling  storeInArray() ------");
        displayProducts(arrayOfProducts);
        displayPrices(arrayOfPrices);

        storeInArray(arrayOfProducts,arrayOfPrices);


        System.out.println("\n------ after calling  storeInArray() ------");
        displayProducts(arrayOfProducts);
        displayPrices(arrayOfPrices);
    }
}
