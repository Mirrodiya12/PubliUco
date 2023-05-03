package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoEntitiesException extends PubliucoException{
	
	private static final long serialVersionUID = 2L;
	
	private PubliucoEntitiesException(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.ENTITY);
	}
	
	public static PubliucoEntitiesException create(String technicalMessage, String userMessage, Throwable rootCause) {
		
		return new PubliucoEntitiesException(technicalMessage, userMessage, rootCause);
		
	}
	
	public static PubliucoEntitiesException create(String userMessage) {
			
			return new PubliucoEntitiesException(userMessage, userMessage, new Exception());
			
		}
	

	public static PubliucoEntitiesException create(String technicalMessage, final String userMessage) {
		
		return new PubliucoEntitiesException(technicalMessage, userMessage, new Exception());
		
	}
	
	}


