package co.edu.uco.publiuco.crosscutting.utils;

public final class UtilText {
	
	private static final UtilText INSTANCE = new UtilText();
	public static final String EMPTY = "";
	private static final String EMAIL_RE = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	
	private UtilText() {
		super();
	}
	
	public static final UtilText getUtilText() {
		return INSTANCE;
	}
	
	public final boolean isNull(final String text) {
		return UtilObject.isNull(text);
	}
	
	public final String getDefault(final String text, final String defaultValue) {
		
		String result = text;
		
		if(isNull(text)) {
			result = isNull(defaultValue) ? EMPTY : defaultValue;
		}
		return result;
	}
	
	public final String getDefaultValue() {
		return EMPTY;
	}
	
	public final String getDefault(final String text) {
		return getDefault(text, EMPTY);
	}
	
	public final boolean isEmpty(final String text) {
		return applyTrim(text).equals(EMPTY);
	}
	
	public final String getDefaultIfEmpty(final String text, final String defaultVelue) {
		return isEmpty(text) ? getDefault(defaultVelue) : text;
	}
	
	public final String applyTrim(final String text) {
		return getDefault(text).trim();
	}
	
	public final boolean matchPattern(final String text, final String pattern) {
		return getDefault(text).matches(getDefault(pattern));
	}
	
	public static final boolean emailStringIsValid(final String emailValue) {
		return UtilText.getUtilText().matchPattern(emailValue, EMAIL_RE);
	}
	
	public static final String getDefaultStringEmail(final String emailValue) {
		return emailStringIsValid(emailValue) ? emailValue : EMPTY;
	}
}