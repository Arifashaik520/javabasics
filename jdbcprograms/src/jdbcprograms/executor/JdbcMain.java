package jdbcprograms.executor;

import jdbcprograms.services.CrudOperations;

public class JdbcMain {

	public static void main(String[] args) {
		CrudOperations.addStudent(101,"seetha");
		CrudOperations.addStudent(102,"Ramu");
		CrudOperations.addStudent(103,"Geetha");
		

	}

}
