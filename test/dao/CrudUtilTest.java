package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class CrudUtilTest {

    public static void main(String[] args) throws SQLException {
        List<String> params = new ArrayList<>();
        params.add("C001");
        params.add("Kasun");
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE id=? AND name=?",params);
        System.out.println(rst.next());
    }

}