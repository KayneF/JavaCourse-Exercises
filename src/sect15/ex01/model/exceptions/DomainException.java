package sect15.ex01.model.exceptions;

public class DomainException extends Exception {

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
