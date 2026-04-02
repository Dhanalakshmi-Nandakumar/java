import java.sql.*;

public class DropTable {

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



        String sql="update student set name=? where id=?";
        int id=1;
        String name="div";
        //statement creating
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1,name);
        st.setInt(2,id);


        st.executeUpdate();

        System.out.println("data updated");
        //closing the connection
        con.close();

    }

}
