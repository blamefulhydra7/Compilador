import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ErrorCatcher extends BaseErrorListener {
    private String errorInfo;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        errorInfo = "SINTAX ERROR:"+"line " + line + ":" + charPositionInLine + " " + msg;
        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }

    public String getErrorInfo() {
        return errorInfo;
    }
}
