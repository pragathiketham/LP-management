package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Departments;
import com.virtusa.entities.Employees;
import com.virtusa.integrate.ConnectionManager;

public class JDBCEmployeesDAOImpl implements EmployeesDAO {

	@Override
	public List<Employees> getAllEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select * from employees");
		
		List<Employees> employeesList=new ArrayList<Employees>();
		while(resultSet.next()) {
			Employees employees=new Employees();
			employees.setEmployeeId(resultSet.getInt("employee_id"));
			employees.setFirstName(resultSet.getString("first_name"));
			employees.setLastName(resultSet.getString("last_name"));
			employees.setEmail(resultSet.getString("email"));
			employees.setPhoneNumber(resultSet.getString("phone_number"));
			java.sql.Date 
			hire_date=resultSet.getDate("hire_date");
			
			employees.setHireDate(hire_date.toLocalDate());
			employees.setJobId(resultSet.getString("job_id"));
			employees.setSalary(resultSet.getDouble("salary"));
			employees.setCommissionPCT(resultSet.getDouble("commission_pct"));
			employees.setManagerId(resultSet.getInt("manager_id"));
			employees.setDepartmentId(resultSet.getInt("department_id"));
			employeesList.add(employees);
		}
		ConnectionManager.closeConnection();
		return employeesList;
	}

	@Override
	public Employees getDeparmentName(int employeeId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("select e.employee_id,d.department_name\r\n" + 
				"from employees e\r\n" + 
				"join departments d\r\n" + 
				"on(e.department_id=d.department_id)\r\n" + 
				"where employee_id=?");
		statement.setInt(1, employeeId);
		
		ResultSet resultSet=statement.executeQuery();
		Employees employees=new Employees();
		while(resultSet.next()) {
			
			employees.setEmployeeId(resultSet.getInt("employee_id"));
			
			Departments departments=new Departments();
			departments.setDepartmentName(resultSet.getString("department_name"));
			
			employees.setDepartments(departments);
			
		}
		return employees;
	}

}
