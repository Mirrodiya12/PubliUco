package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoDataException extends PubliucoException{
	
	private static final long serialVersionUID = 2L;
	
	private PubliucoDataException(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DTO);
	}
	
	public static PubliucoDataException create(String technicalMessage, String userMessage, Throwable rootCause) {
		
		return new PubliucoDataException(technicalMessage, userMessage, rootCause);
		
	}
	
	public static PubliucoDataException create(String userMessage) {
			
			return new PubliucoDataException(userMessage, userMessage, new Exception());
			
		}
	

	public static PubliucoDataException create(String technicalMessage, final String userMessage) {
		
		return new PubliucoDataException(technicalMessage, userMessage, new Exception());
		
	}
	
	}


