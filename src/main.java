import java.sql.ResultSet;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InterruptedException {

       db.startDatabase();
        try {
            boolean var= db.use("hotel_management_system");

        }
        catch (Exception exp)
        {
                db.createDatabase("hotel_management_system");
            boolean var= db.use("hotel_management_system");
            if(!var)
            {
                System.out.println("database created successfully");
            }
            db.createTable("create table customer(id int(100) primary key,name text,age int(50)," +
                    "address text,number text,gender char(200))");
            db.createTable("create table room(rnum int(100) primary key,type text,cost int(100),wifi char(100),nbeds int(100))");
            db.createTable("create table booking(id int(100),rnum int(100),ndays int(100),food text,name char(100),foreign key(id) references customer(id)," +
                    "foreign key(rnum) references room(rnum), primary key(id,rnum))");



        }
        boolean var= db.use("hotel_management_system");


        login login_page = new login();
               login_page.start();





    }

}
