/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link DownloadZipError}
 * error.
 *
 * <p> This exception is raised by {@link
 * DbxUserFilesRequests#downloadZip(String)}. </p>
 */
public class DownloadZipErrorException extends DbxApiException {
    // exception for routes:
    //     2/files/download_zip

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link DbxUserFilesRequests#downloadZip(String)}.
     */
    public final DownloadZipError errorValue;

    public DownloadZipErrorException(String routeName, String requestId, LocalizedText userMessage, DownloadZipError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
