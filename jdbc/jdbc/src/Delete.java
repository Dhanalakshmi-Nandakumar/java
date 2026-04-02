import java.sql.*;

public class Delete {

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
        String sql="delete from student where id=1";

        st.executeUpdate(sql);

        System.out.println("data deelted successfully!");
        //closing the connection
        con.close();

    }

}
