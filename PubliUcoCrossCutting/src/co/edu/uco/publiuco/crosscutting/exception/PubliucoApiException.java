package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoApiException extends PubliucoException {

	private static final long serialVersionUID = -4228650668023637895L;

	private PubliucoApiException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}

	public static PubliucoApiException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliucoApiException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliucoApiException create(final String userMessage) {
		return new PubliucoApiException(userMessage, userMessage, new Exception());
	}
	
	public static PubliucoApiException create(final String technicalMessage, final String userMessage) {
		return new PubliucoApiException(technicalMessage, userMessage, new Exception());
	}
	
}


