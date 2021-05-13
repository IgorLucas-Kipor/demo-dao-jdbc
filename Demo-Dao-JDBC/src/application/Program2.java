package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("*** Test number one: Department findAll ***");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println();
		
		System.out.println("*** Test number two: Department findById ***");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println();
		
		System.out.println("*** Test number three: Department update ***");
		dep = departmentDao.findById(6);
		dep.setName("Food");
		departmentDao.update(dep);
		System.out.println("Update complete!");
		
//		System.out.println();
		
//		System.out.println("*** Test number four: Department insert ***");
//		Department department = new Department(null, "Books");
//		departmentDao.insert(department);
//		System.out.println("Insert complete! New id = "+department.getId());
		
		System.out.println();
		
		System.out.println("*** Test number five: Department delete ***");
		departmentDao.DeleteById(7);
		System.out.println("Deletion complete!");
	}

}
