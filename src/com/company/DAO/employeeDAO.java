package com.company.DAO;

import com.company.models.Employee;

import java.sql.*;

public class employeeDAO {

    public Employee getEmployee() {
        try {
            //1.Get a connection
            Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student", "student");
            //2. Create a Statement

            //3. Execute a SQL Query
            //4. Process  the result set
            return new Employee();
        } catch (Exception e) {

        }
        return null;
    }

}
