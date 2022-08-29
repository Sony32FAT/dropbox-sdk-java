/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link ExportError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserFilesRequests#export(String,String)}. </p>
 */
public class ExportErrorException extends DbxApiException {
    // exception for routes:
    //     2/files/export

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link DbxUserFilesRequests#export(String,String)}.
     */
    public final ExportError errorValue;

    public ExportErrorException(String routeName, String requestId, LocalizedText userMessage, ExportError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
