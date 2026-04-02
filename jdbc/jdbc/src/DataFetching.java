import java.sql.*;

public class DataFetching {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        //import package
        //Loads database driver and Registers driver with JVM
        //establish connection
        //create statement
        //execute statement
        //process the result
        //closing the resources

       // Class.forName("com.mysql.cj.jdbc.Driver"); //#optional

        String url="jdbc:mysql://localhost:3306/emp";
        String username="root";
        String password="Example@2022#dd";
        //create connection
        Connection con= DriverManager.getConnection(url,username,password);
        System.out.println("Connected db");
        //statement creating
        Statement st=con.createStatement();

        //execute statement
        String sql="select * from employee";

        ResultSet result=st.executeQuery(sql);

        //to skip headers in table use next()
        while(result.next())
        {
            System.out.println(result.getInt("id")+" "+result.getString("name")+" "+result.getString("location"));

        }
        //closing the connection
        con.close();

    }

}
