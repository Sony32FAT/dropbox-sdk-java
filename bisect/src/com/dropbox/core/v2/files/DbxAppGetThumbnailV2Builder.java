/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxDownloader;
import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxDownloadStyleBuilder;

/**
 * The request builder returned by {@link
 * DbxAppFilesRequests#getThumbnailV2Builder}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class DbxAppGetThumbnailV2Builder extends DbxDownloadStyleBuilder<PreviewResult> {
    private final DbxAppFilesRequests _client;
    private final ThumbnailV2Arg.Builder _builder;

    /**
     * Creates a new instance of this builder.
     *
     * @param _client  Dropbox namespace-specific client used to issue files
     *     requests.
     * @param _builder  Request argument builder.
     *
     * @return instsance of this builder
     */
    DbxAppGetThumbnailV2Builder(DbxAppFilesRequests _client, ThumbnailV2Arg.Builder _builder) {
        if (_client == null) {
            throw new NullPointerException("_client");
        }
        this._client = _client;
        if (_builder == null) {
            throw new NullPointerException("_builder");
        }
        this._builder = _builder;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code
     * ThumbnailFormat.JPEG}. </p>
     *
     * @param format  The format for the thumbnail image, jpeg (default) or png.
     *     For  images that are photos, jpeg should be preferred, while png is
     *     better for screenshots and digital arts. Must not be {@code null}.
     *     Defaults to {@code ThumbnailFormat.JPEG} when set to {@code null}.
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public DbxAppGetThumbnailV2Builder withFormat(ThumbnailFormat format) {
        this._builder.withFormat(format);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code
     * ThumbnailSize.W64H64}. </p>
     *
     * @param size  The size for the thumbnail image. Must not be {@code null}.
     *     Defaults to {@code ThumbnailSize.W64H64} when set to {@code null}.
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public DbxAppGetThumbnailV2Builder withSize(ThumbnailSize size) {
        this._builder.withSize(size);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code
     * ThumbnailMode.STRICT}. </p>
     *
     * @param mode  How to resize and crop the image to achieve the desired
     *     size. Must not be {@code null}. Defaults to {@code
     *     ThumbnailMode.STRICT} when set to {@code null}.
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public DbxAppGetThumbnailV2Builder withMode(ThumbnailMode mode) {
        this._builder.withMode(mode);
        return this;
    }

    @Override
    public DbxDownloader<PreviewResult> start() throws ThumbnailV2ErrorException, DbxException {
        ThumbnailV2Arg arg_ = this._builder.build();
        return _client.getThumbnailV2(arg_, getHeaders());
    }
}
