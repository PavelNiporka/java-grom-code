package lesson30.homework;


import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Паша on 21.07.2018.
 */
public class Controller {
    public Set<Employee> employees = new TreeSet<>();

    // список сотрудников работающих над заданным проэктом
    // найти сотрудника
    // найти проэкт
    // вернуть результат

    public Set<Employee> employeesByProject(String projectName) throws BadRequestException {
        Set<Employee> employeesByProject = new TreeSet<>();
        if (projectName == null) throw new BadRequestException("Project does not exist");
        for (Employee employee : employees) {
            if (employee == null) throw new BadRequestException("Employee does not exist");
            for (Project project : employee.getProjects()) {
                if (project == null) throw new BadRequestException("Project does not exist");
                if (project.getName().equals(projectName))
                    employeesByProject.add(employee);
            }
        }
        return employeesByProject;
    }

    //список проэктов в которых участвует заданный сотрудник

    public Set<Project> projectsByEmployee(Employee employee) throws BadRequestException {
        if (employee == null) throw new BadRequestException("Employee does not exist");
        for (Employee em : employees) {
            if (em != null && em.equals(employee))
                return employee.getProjects();
        }
        throw new BadRequestException("Project does not exist");
    }

    //список сотрудников из заданного отдела ,не участвующих ни в одном проэкте

    public Set<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) throws BadRequestException {
        if (departmentType == null)
            throw new BadRequestException("Department does not exist");
        Set<Employee> employeesWithoutProject = new TreeSet<>();
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment().getType().equals(departmentType) && employee.getProjects() == null)
                employeesWithoutProject.add(employee);
        }
        return employeesWithoutProject;
    }

    //список сотрудников,не участвующих ни в одном проэкте
    public Set<Employee> employeesWithoutProject() {
        Set<Employee> employeesWithoutProject = new TreeSet<>();
        for (Employee employee : employees) {
            if (employee != null && employee.getProjects().isEmpty())
                employeesWithoutProject.add(employee);
        }
        return employeesWithoutProject;
    }

    // список подчиненных для заданого руководителя(по всем проэктам которыми он руководит)
    public Set<Employee> employeesByTeamLead(Employee lead) throws BadRequestException {
        if (lead == null)
            throw new BadRequestException("Lead does not exist");
        Set<Employee> employeesByTeamLead = new TreeSet<>();
        for (Employee employee : employees) {
            if (employee == null)
                throw new BadRequestException("Employee does not exist");
            for (Project project : employee.getProjects()) {
                if (project != null && lead.getProjects().contains(project)
                        && !employee.getPosition().equals(Position.TEAM_LEAD)
                        && !employee.getPosition().equals(Position.LEAD_DESIGNER))
                    employeesByTeamLead.add(employee);
            }
        }
        return employeesByTeamLead;

    }

    // список руководителей для заданого сотрудника(по всем проэктам которыми он руководит)
    public Set<Employee> teamLeadsByEmployee(Employee employee) throws BadRequestException {
        if (employee == null)
            throw new BadRequestException("Employee does not exist");
        Set<Employee> teamLeadsByEmployee = new TreeSet<>();
        for (Project project : employee.getProjects()) {
            if (project == null)
                throw new BadRequestException("Project does not exist");
            for (Employee em : employees) {
                if (em != null && em.getProjects().contains(project) && em.getPosition().equals(Position.TEAM_LEAD))
                    teamLeadsByEmployee.add(em);
            }
        }
        return teamLeadsByEmployee;
    }

    //список сотрудников,участвующих в тех же проэктах,что и заданный сотрудник
    public Set<Employee> employeesByProjectEmployee(Employee employee) throws BadRequestException {
        if (employee == null)
            throw new BadRequestException("Employee does not exist");
        Set<Employee> employeesByProjectEmployee = new TreeSet<>();
        for (Employee em : employees) {
            if (em != null)
                for (Project project : em.getProjects()) {
                    if (project != null && em.getProjects().contains(project))
                        employeesByProjectEmployee.add(em);
                }
        }

        return employeesByProjectEmployee;
    }

    //список проэктов выполняемых для заданного заказчика
    public Set<Project> projectsByCustomer(Customer customer) throws Exception {
        if (customer == null) {
            throw new Exception("Customer is null");
        }
        Set<Project> projectByCustomer = new TreeSet<>();
        for (Employee employee : employees) {
            if (employee != null)
                for (Project project : employee.getProjects()) {
                    if (project != null)
                        if (project.getCustomer().equals(customer))
                            projectByCustomer.add(project);
                }
        }
        return projectByCustomer;
    }

    // список сотрудников,участвующих в проэктах,выполняемых для заданного заказчика
    public Set<Employee> employeesByCustomerProjects(Customer customer) throws BadRequestException {
        if (customer == null) throw new BadRequestException("Customer does not exist");
        Set<Employee> employeesByCustomerProjects = new TreeSet<>();
        for (Employee employee : employees) {
            if (employee != null)
                for (Project project : employee.getProjects())
                    if (project != null && project.getCustomer().equals(customer)) {
                        employeesByCustomerProjects.add(employee);
                    }
        }
        return employeesByCustomerProjects;

    }

}



