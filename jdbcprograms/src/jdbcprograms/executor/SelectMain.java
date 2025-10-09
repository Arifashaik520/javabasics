package jdbcprograms.executor;

import jdbcprograms.services.CrudOperations;

public class SelectMain {

	public static void main(String[] args) {
		CrudOperations.displayAllStudents();
        CrudOperations.searchStudent(101);
		

	}

}
