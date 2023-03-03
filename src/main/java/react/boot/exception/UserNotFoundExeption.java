package react.boot.exception;

public class UserNotFoundExeption extends RuntimeException{
	public UserNotFoundExeption(Long id) {
		super("User Not found with id "+id);
	}

}
