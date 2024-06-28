package exercise7;

import java.io.*;
import java.sql.*;


//____________________________________________________________________
// create a database : products_prices
// create a table called : products_prices_table
// with 2 columns :
// product -> string
// price -> float
//____________________________________________________________________


public class Solution3DataBase {
    public static void storeInDataBase(String filePath){

        // ------ connection to database ------
        String jdbcURL="jdbc:mysql://localhost:port/dbname";
        String username="root";
        String password="";
        Connection connection=null;

        try{
            connection= DriverManager.getConnection(jdbcURL,username,password);
            System.out.println("Successful connection to the database\n");
        }catch (SQLException e){
            System.out.println("Database connection error");
            e.printStackTrace();
        }


        // iterate over the file
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
            String line=bufferedReader.readLine(); // read the first line
            int i=1;
            while(line!=null){
                String query="INSERT INTO TABLE products_prices_table(product,price) VALUE(?,?)";
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                preparedStatement.setString(1,line.split("-")[0]);
                preparedStatement.setFloat(2,Float.parseFloat(line.split("-")[1]));
                preparedStatement.executeUpdate();
                System.out.println("insert product n°"+i);
                i++;
                line=bufferedReader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("error while reading file");
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println("error wile storing in database");
            e.printStackTrace();
        }
        System.out.println("products are successfully stored in the database :D");
    }
    public static void displayFromDatabase(String url,String username,String password){
        Connection connection=null;
        try{
            connection=DriverManager.getConnection(url,username,password);
            System.out.println("connect to the database successfully ! ");
        }catch (SQLException e){
            System.out.println("failed to connect to database");
            e.printStackTrace();
        }

        String query="SELECT * FROM products_prices_table";
        System.out.println("selecting from table products_prices_table ...");
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("product: "+resultSet.getString("product")+"  -  price: "+resultSet.getFloat("price"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        String filePath="C:/Users/PC/Desktop/learnJavaWithAsmae/products.txt";
        String url="";
        storeInDataBase(filePath);
        displayFromDatabase(url,"root","");



        /* ______ test  ______
        - bad structure of file  :  product - price
        - empty table, then display it
         */

    }
}
