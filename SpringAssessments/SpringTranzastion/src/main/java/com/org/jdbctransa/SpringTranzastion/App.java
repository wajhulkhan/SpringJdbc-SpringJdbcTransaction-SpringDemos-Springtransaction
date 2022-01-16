package com.org.jdbctransa.SpringTranzastion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	 System.out.println( "Hello World!" );
         SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
         dataSource.setDriver(new com.mysql.cj.jdbc.Driver());
         dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
         dataSource.setUsername("root");
         dataSource.setPassword("");
         JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

         String sqlInsert = "INSERT INTO employee (id, name, salary)"
                 + " VALUES (?, ?, ?)";
         jdbcTemplate.update(sqlInsert, "123", "Wajhul", "14245");

         String sqlUpdate = "UPDATE employee set name=? where id=?";
         jdbcTemplate.update(sqlUpdate, "tomee@mail.com", 1);

         String sqlSelect = "SELECT * FROM employee";
         List<Employee> listContact = jdbcTemplate.query(sqlSelect, new RowMapper<Employee>() {

             public Employee mapRow(ResultSet result, int rowNum) throws SQLException {
                 Employee contact = new Employee();
                 contact.setId(result.getInt("id"));
                 contact.setName(result.getString("name"));
                 contact.setSalary(result.getInt("salary"));


                 return contact;
             }

         });
         for(Employee e : listContact) {
        	 System.out.println(e);
         }
//         String sqlDel = "delete from Employee where id=?";
//         jdbcTemplate.update(sqlDel);

     }
    }

