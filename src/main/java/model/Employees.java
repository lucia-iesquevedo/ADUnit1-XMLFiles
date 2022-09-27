
package model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees{
    
    private List<Employee> employee;
            
    public Employees() {
        employee=new ArrayList<>();}

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> listEmp) {
        this.employee = listEmp;
    }
    
    public void addEmployee(Employee e) {
        employee.add(e);
    }
 
    @Override
    public String toString() {
        return "Employees{" + "employee=" + employee + '}';
    }
}