package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoCrossCuttingException extends PubliucoException{
	
	private static final long serialVersionUID = 2L;
	
	private PubliucoCrossCuttingException(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.CROSSCUTTING);
	}
	
	public static PubliucoCrossCuttingException create(String technicalMessage, String userMessage, Throwable rootCause) {
		
		return new PubliucoCrossCuttingException(technicalMessage, userMessage, rootCause);
		
	}
	
	public static PubliucoCrossCuttingException create(String userMessage) {
			
			return new PubliucoCrossCuttingException(userMessage, userMessage, new Exception());
			
		}
	

	public static PubliucoCrossCuttingException create(String technicalMessage, final String userMessage) {
		
		return new PubliucoCrossCuttingException(technicalMessage, userMessage, new Exception());
		
	}
	
	}


