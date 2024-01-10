import java.sql.*;
public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String password="0000";
        String query="select name from school where id=1";


Class.forName("org.postgresql.Driver");
Connection connection=DriverManager.getConnection(url,user,password);
        System.out.println("Connect Established");

Statement statement= connection.createStatement();
ResultSet result= statement.executeQuery(query);
        //System.out.println(result.next()); // if there is another row or col present or not
        result.next();
        String name=result.getString("name");

        connection.close();// close the connection
        System.out.println("Connect Closed");
    }
}


//steps
/*
import
load and register
create connection
create statement
execute  statement
process the results
close
*/