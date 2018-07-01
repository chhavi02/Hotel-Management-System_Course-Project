import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class db {
    private static final String dbClassName = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/";
    static ResultSet rs=null;
    static Statement stmt;
    static Connection con;
    static PreparedStatement pstmt;
    static PreparedStatement pstmt2;
    static PreparedStatement pstmt3;
    static  int rcount=0;
    static int avail=0;

    public static void startDatabase() throws ClassNotFoundException, SQLException {
        Class.forName(dbClassName);
        con=getConnection(url,"root","2020");
        System.out.println("successfully connected to MySQL Database");
        stmt=con.createStatement();
        pstmt=con.prepareStatement("insert into customer values(?,?,?,?,?,?)");
        pstmt2=con.prepareStatement("insert into room values(?,?,?,?,?)");
        pstmt3=con.prepareStatement("insert into booking values(?,?,?,?,?)");

    }
    public static boolean use(String name) throws SQLException {
        if (stmt.execute("use "+name)) return true;
        else {
            return false;
        }
    }
    public static  void close() throws SQLException {
        stmt.close();
        con.close();
        System.out.println("database connection closed successfully");
    }
    public static boolean createDatabase(String name) throws SQLException
    {
        if (stmt.execute("create database "+name)) {
            return true;
        }
        else return false;

    }
    public static boolean dropDatabase(String name) throws SQLException {
        if (stmt.execute("drop database "+name)) return true;

        else {
            return false;
        }
    }
    public static boolean createTable(String q) throws SQLException
    {
        if (stmt.execute(q)) return true;
        else {
            return false;
        }

    }




}
