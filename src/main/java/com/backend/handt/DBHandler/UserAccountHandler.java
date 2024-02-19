package com.backend.handt.DBHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserAccountHandler {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int insert() {
        return 1;
    }


    public void getAllData() {
        String query = "SELECT * FROM account";
        jdbcTemplate.query(query, new ResultSetExtractor<Integer>() {
            @Override
            public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
                System.out.println("everything is correct");
                return 0;
            }
        });
    }
}
