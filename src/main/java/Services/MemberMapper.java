package Services;

import Connector.DBConnector;
import Domain.Member;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberMapper {
    DBConnector dbc = new DBConnector();

    public List<Member> getAllMembers() {
        List<Member> members = new ArrayList<>();
        Connection connection = null;
        Statement stmt = null;
        ResultSet res = null;
        String sql = "";
        Member tmpMember = null;

        connection = dbc.getMyConnection();
        try {
            stmt = connection.createStatement();
            sql = "SELECT * FROM members";
            res = stmt.executeQuery(sql);
            while (res.next()) {
                int id = res.getInt(1);
                String firstName = res.getString(2);
                String lastName = res.getString(3);
                tmpMember = new Member(id, firstName, lastName);
                members.add(tmpMember);
            }
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return members;
    }

    public void showAllMembers() {
        for (Member m : getAllMembers()) {
            System.out.println(m);
        }

    }
}
