package exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Solution2List {


    public static List<String> storeInArrayList(String filePath ){
        List<String> list=new ArrayList<>();
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
            String line=bufferedReader.readLine();
            while(line!=null){
                String[] words=line.split("-");
                for(String w:words) list.add(w);
                line=bufferedReader.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static void displayList(List<String> list){
       for(int i=0;i<list.size();i+=2){
           System.out.println(list.get(i)+" - "+list.get(i+1));
       }
    }

    public static void main(String[] args) {
        String filePath="C:/Users/PC/Desktop/learnJavaWithAsmae/products.txt";

        List<String> list=storeInArrayList(filePath);

        displayList(list);
    }
}
