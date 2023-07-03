package rex;

public class RexLogger {
    private static String LOG_TAG = "REXLOGGER";
    private static int TRACE_ITER = 0;

    /*
     * *** SMALI CODE TO ADD ***
     * invoke-static {}, Lrex/RexLogger;->start()V
     *
     */
    static public void start() {
        Throwable t = new Throwable();
        String line = t.getStackTrace()[1].getClassName();
        line = line + "->" + t.getStackTrace()[1].getMethodName();
        line = line + " Line " + t.getStackTrace()[1].getLineNumber();
        line = line + " =============== START";
        android.util.Log.wtf(LOG_TAG, line);
    }

    /*
     * *** SMALI CODE TO ADD ***
     * invoke-static {}, Lrex/RexLogger;->end()V
     *
     */
    static public void end() {
        Throwable t = new Throwable();
        String line = t.getStackTrace()[1].getClassName();
        line = line + "->" + t.getStackTrace()[1].getMethodName();
        line = line + " Line " + t.getStackTrace()[1].getLineNumber();
        line = line + " =============== END";
        android.util.Log.wtf(LOG_TAG, line);
    }

    /*
     * *** SMALI CODE TO ADD ***
     * invoke-static {}, Lrex/RexLogger;->markNewTrace()V
     *
     */
    static public void markNewTrace() {
        Throwable t = new Throwable();
        String line = t.getStackTrace()[1].getClassName();
        line = line + "->" + t.getStackTrace()[1].getMethodName();
        line = line + " Line " + t.getStackTrace()[1].getLineNumber();
        line = line + " ================== NEW TRACE " + TRACE_ITER;
        TRACE_ITER++;
        android.util.Log.wtf(LOG_TAG, line);
    }


    /*
     * *** SMALI CODE TO ADD ***
     * invoke-static {}, Lrex/RexLogger;->d()V
     *
     */
    static public void d() {
        Throwable t = new Throwable();
        String line = t.getStackTrace()[1].getClassName();
        line = line + "->" + t.getStackTrace()[1].getMethodName();
        line = line + " Line " + t.getStackTrace()[1].getLineNumber();
        android.util.Log.wtf(LOG_TAG, line);
    }


    /*
     * *** SMALI CODE TO ADD ***
     * invoke-static {}, Lrex/RexLogger;->stacktrace()V
     *
     */
    static public void stacktrace() {
        Throwable t = new Throwable();
        android.util.Log.wtf(LOG_TAG, t.getStackTrace().toString());
    }

    /*
     * *** SMALI CODE TO ADD ***
     * invoke-static {v0}, Lrex/RexLogger;->d(Ljava/lang/Object;)V
     *
     */
    static public void d(java.lang.Object m) {
        Throwable t = new Throwable();
        String line = t.getStackTrace()[1].getClassName();
        line = line + "->" + t.getStackTrace()[1].getMethodName();
        line = line + " Line " + t.getStackTrace()[1].getLineNumber();
        line = line + " Value: " + getString(m);
        android.util.Log.wtf(LOG_TAG, line);
    }

    /*
     * *** SMALI CODE TO ADD ***
     * invoke-static {v0}, Lrex/RexLogger;->d(I)V
     */
    static public void d(int m) {
        Throwable t = new Throwable();
        String line = t.getStackTrace()[1].getClassName();
        line = line + "->" + t.getStackTrace()[1].getMethodName();
        line = line + " Line " + t.getStackTrace()[1].getLineNumber();
        line = line + " Value: " + m;
        android.util.Log.wtf(LOG_TAG, line);
    }

    /*
     * *** SMALI CODE TO ADD ***
     * invoke-static {v0}, Lrex/RexLogger;->d(C)V
     */
    static public void d(char m) {
        Throwable t = new Throwable();
        String line = t.getStackTrace()[1].getClassName();
        line = line + "->" + t.getStackTrace()[1].getMethodName();
        line = line + " Line " + t.getStackTrace()[1].getLineNumber();
        line = line + " Value: " + m;
        android.util.Log.wtf(LOG_TAG, line);
    }

    private static String getString(java.lang.Object s) {
        if (s == null) {
            return "<empty value>";
        } else {
            return s.toString();
        }
    }
}
