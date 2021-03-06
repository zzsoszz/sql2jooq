package gudusoft.sql2jooq.readme;

import gudusoft.gsqlparser.EDbVendor;
import gudusoft.gsqlparser.sql2jooq.SQL2jOOQ;
import gudusoft.gsqlparser.sql2jooq.db.DatabaseMetaData;
import gudusoft.gsqlparser.sql2jooq.tool.DatabaseMetaUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) throws Exception {

        // 1. Create a JDBC connection
        // ---------------------------
        String userName = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/guestbook";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, userName, password);
        
        // 2. Create a new SQL2jOOQ converter object
        // -----------------------------------------
        DatabaseMetaData metaData = DatabaseMetaUtil
            .getDataBaseMetaData(conn, "guestbook");
            
        SQL2jOOQ convert = new SQL2jOOQ(metaData,
            EDbVendor.dbvmysql,
            "select first_name, last_name from actor where actor_id = 1;");
            
        // 3. Convert your SQL code
        // ------------------------
        convert.convert();
        if (convert.getErrorMessage() != null) {
            System.err.println(convert.getErrorMessage());
            System.exit(-1);
        }
        
        // 4. Get the result
        // -----------------
        System.out.println(convert.getConvertResult());
    }
}
