/* DO NOT EDIT */
/* This file was generated from team_log_generated.stone */

package com.dropbox.core.v2.teamlog;

import com.dropbox.core.stone.StoneDeserializerLogger;
import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * File's logged information.
 */
public class FileLogInfo extends FileOrFolderLogInfo {
    // struct team_log.FileLogInfo (team_log_generated.stone)


    /**
     * File's logged information.
     *
     * <p> Use {@link newBuilder} to create instances of this class without
     * specifying values for all optional fields. </p>
     *
     * @param path  Path relative to event context. Must not be {@code null}.
     * @param displayName  Display name.
     * @param fileId  Unique ID.
     * @param fileSize  File or folder size in bytes.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public FileLogInfo(PathLogInfo path, String displayName, String fileId, Long fileSize) {
        super(path, displayName, fileId, fileSize);
    }

    /**
     * File's logged information.
     *
     * <p> The default values for unset fields will be used. </p>
     *
     * @param path  Path relative to event context. Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public FileLogInfo(PathLogInfo path) {
        this(path, null, null, null);
    }

    /**
     * Path relative to event context.
     *
     * @return value for this field, never {@code null}.
     */
    @javax.annotation.Nonnull
    public PathLogInfo getPath() {
        return path;
    }

    /**
     * Display name.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Unique ID.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @javax.annotation.Nullable
    public String getFileId() {
        return fileId;
    }

    /**
     * File or folder size in bytes.
     *
     * @return value for this field, or {@code null} if not present.
     */
    @javax.annotation.Nullable
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Returns a new builder for creating an instance of this class.
     *
     * @param path  Path relative to event context. Must not be {@code null}.
     *
     * @return builder for this class.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public static Builder newBuilder(PathLogInfo path) {
        return new Builder(path);
    }

    /**
     * Builder for {@link FileLogInfo}.
     */
    public static class Builder extends FileOrFolderLogInfo.Builder {

        protected Builder(PathLogInfo path) {
            super(path);
        }

        /**
         * Set value for optional field.
         *
         * @param displayName  Display name.
         *
         * @return this builder
         */
        public Builder withDisplayName(String displayName) {
            super.withDisplayName(displayName);
            return this;
        }

        /**
         * Set value for optional field.
         *
         * @param fileId  Unique ID.
         *
         * @return this builder
         */
        public Builder withFileId(String fileId) {
            super.withFileId(fileId);
            return this;
        }

        /**
         * Set value for optional field.
         *
         * @param fileSize  File or folder size in bytes.
         *
         * @return this builder
         */
        public Builder withFileSize(Long fileSize) {
            super.withFileSize(fileSize);
            return this;
        }

        /**
         * Builds an instance of {@link FileLogInfo} configured with this
         * builder's values
         *
         * @return new instance of {@link FileLogInfo}
         */
        public FileLogInfo build() {
            return new FileLogInfo(path, displayName, fileId, fileSize);
        }
    }

    @Override
    public int hashCode() {
        // attempt to deal with inheritance
        return getClass().toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            FileLogInfo other = (FileLogInfo) obj;
            return ((this.path == other.path) || (this.path.equals(other.path)))
                && ((this.displayName == other.displayName) || (this.displayName != null && this.displayName.equals(other.displayName)))
                && ((this.fileId == other.fileId) || (this.fileId != null && this.fileId.equals(other.fileId)))
                && ((this.fileSize == other.fileSize) || (this.fileSize != null && this.fileSize.equals(other.fileSize)))
                ;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static class Serializer extends StructSerializer<FileLogInfo> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(FileLogInfo value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("path");
            PathLogInfo.Serializer.INSTANCE.serialize(value.path, g);
            if (value.displayName != null) {
                g.writeFieldName("display_name");
                StoneSerializers.nullable(StoneSerializers.string()).serialize(value.displayName, g);
            }
            if (value.fileId != null) {
                g.writeFieldName("file_id");
                StoneSerializers.nullable(StoneSerializers.string()).serialize(value.fileId, g);
            }
            if (value.fileSize != null) {
                g.writeFieldName("file_size");
                StoneSerializers.nullable(StoneSerializers.uInt64()).serialize(value.fileSize, g);
            }
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public FileLogInfo deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            FileLogInfo value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                PathLogInfo f_path = null;
                String f_displayName = null;
                String f_fileId = null;
                Long f_fileSize = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("path".equals(field)) {
                        f_path = PathLogInfo.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("display_name".equals(field)) {
                        f_displayName = StoneSerializers.nullable(StoneSerializers.string()).deserialize(p);
                    }
                    else if ("file_id".equals(field)) {
                        f_fileId = StoneSerializers.nullable(StoneSerializers.string()).deserialize(p);
                    }
                    else if ("file_size".equals(field)) {
                        f_fileSize = StoneSerializers.nullable(StoneSerializers.uInt64()).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_path == null) {
                    throw new JsonParseException(p, "Required field \"path\" missing.");
                }
                value = new FileLogInfo(f_path, f_displayName, f_fileId, f_fileSize);
            }
            else {
                throw new JsonParseException(p, "No subtype found that matches tag: \"" + tag + "\"");
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            StoneDeserializerLogger.log(value, value.toStringMultiline());
            return value;
        }
    }
}
