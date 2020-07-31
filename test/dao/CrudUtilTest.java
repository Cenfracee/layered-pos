package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class CrudUtilTest {

    public static void main(String[] args) throws SQLException {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE id=?","C001");
        System.out.println(rst.next());
    }

}