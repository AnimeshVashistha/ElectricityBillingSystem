import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection o;
    Statement s;

    public conn(){

        try{

                Class.forName("com.mysql.jdbc.Driver");
                o = DriverManager.getConnection("jdbc:mysql:///project2","root","");
                s = o.createStatement();
    }catch(Exception e){
            System.out.println(e);
        }
    }



}


