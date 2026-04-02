import java.sql.*;

public class PreparedStatementss {

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

        int id=1;
        String name="udaya";

        String sql="insert into student value(?,?)";

        //statement creating
        PreparedStatement st=con.prepareStatement(sql);
        st.setInt(1,id);
        st.setString(2,name);

        int val=st.executeUpdate();

        System.out.println(val+ "row's affected");
        //closing the connection
        con.close();

    }

}
