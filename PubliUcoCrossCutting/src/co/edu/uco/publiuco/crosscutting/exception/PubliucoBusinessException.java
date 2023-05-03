package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoBusinessException extends PubliucoException{
	
	private static final long serialVersionUID = 2L;
	
	private PubliucoBusinessException(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DATA);
	}
	
	public static PubliucoBusinessException create(String technicalMessage, String userMessage, Throwable rootCause) {
		
		return new PubliucoBusinessException(technicalMessage, userMessage, rootCause);
		
	}
	
	public static PubliucoBusinessException create(String userMessage) {
			
			return new PubliucoBusinessException(userMessage, userMessage, new Exception());
			
		}
	

	public static PubliucoBusinessException create(String technicalMessage, final String userMessage) {
		
		return new PubliucoBusinessException(technicalMessage, userMessage, new Exception());
		
	}
	
	}


