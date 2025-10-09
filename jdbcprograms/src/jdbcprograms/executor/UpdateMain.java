package jdbcprograms.executor;

import jdbcprograms.services.CrudOperations;

public class UpdateMain {

	public static void main(String[] args) {
		CrudOperations.updateStudentName(102, "Ramu Kumar");

	}

}
