package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoDTOException extends PubliucoException{
	
	private static final long serialVersionUID = 2L;
	
	private PubliucoDTOException(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.BUSINESS);
	}
	
	public static PubliucoDTOException create(String technicalMessage, String userMessage, Throwable rootCause) {
		
		return new PubliucoDTOException(technicalMessage, userMessage, rootCause);
		
	}
	
	public static PubliucoDTOException create(String userMessage) {
			
			return new PubliucoDTOException(userMessage, userMessage, new Exception());
			
		}
	

	public static PubliucoDTOException create(String technicalMessage, final String userMessage) {
		
		return new PubliucoDTOException(technicalMessage, userMessage, new Exception());
		
	}
	
	}


