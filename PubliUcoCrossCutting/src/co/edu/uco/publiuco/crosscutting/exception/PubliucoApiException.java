package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoApiException extends PubliucoException{
	
	private static final long serialVersionUID = 2L;
	
	private PubliucoApiException(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}
	
	public static PubliucoApiException create(String technicalMessage, String userMessage, Throwable rootCause) {
		
		return new PubliucoApiException(technicalMessage, userMessage, rootCause);
		
	}
	
	public static PubliucoApiException create(String userMessage) {
			
			return new PubliucoApiException(userMessage, userMessage, new Exception());
			
		}
	

	public static PubliucoApiException create(String technicalMessage, final String userMessage) {
		
		return new PubliucoApiException(technicalMessage, userMessage, new Exception());
		
	}
	
	}


