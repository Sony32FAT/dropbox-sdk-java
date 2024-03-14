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
import java.util.Arrays;

/**
 * Team merge request expiration details shown to the primary team
 */
public class PrimaryTeamRequestExpiredDetails {
    // struct team_log.PrimaryTeamRequestExpiredDetails (team_log_generated.stone)

    protected final String secondaryTeam;
    protected final String sentBy;

    /**
     * Team merge request expiration details shown to the primary team
     *
     * @param secondaryTeam  The secondary team name. Must not be {@code null}.
     * @param sentBy  The name of the secondary team admin who sent the request
     *     originally. Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public PrimaryTeamRequestExpiredDetails(String secondaryTeam, String sentBy) {
        if (secondaryTeam == null) {
            throw new IllegalArgumentException("Required value for 'secondaryTeam' is null");
        }
        this.secondaryTeam = secondaryTeam;
        if (sentBy == null) {
            throw new IllegalArgumentException("Required value for 'sentBy' is null");
        }
        this.sentBy = sentBy;
    }

    /**
     * The secondary team name.
     *
     * @return value for this field, never {@code null}.
     */
    @javax.annotation.Nonnull
    public String getSecondaryTeam() {
        return secondaryTeam;
    }

    /**
     * The name of the secondary team admin who sent the request originally.
     *
     * @return value for this field, never {@code null}.
     */
    @javax.annotation.Nonnull
    public String getSentBy() {
        return sentBy;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            secondaryTeam,
            sentBy
        });
        return hash;
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
            PrimaryTeamRequestExpiredDetails other = (PrimaryTeamRequestExpiredDetails) obj;
            return ((this.secondaryTeam == other.secondaryTeam) || (this.secondaryTeam.equals(other.secondaryTeam)))
                && ((this.sentBy == other.sentBy) || (this.sentBy.equals(other.sentBy)))
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
    static class Serializer extends StructSerializer<PrimaryTeamRequestExpiredDetails> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(PrimaryTeamRequestExpiredDetails value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("secondary_team");
            StoneSerializers.string().serialize(value.secondaryTeam, g);
            g.writeFieldName("sent_by");
            StoneSerializers.string().serialize(value.sentBy, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public PrimaryTeamRequestExpiredDetails deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            PrimaryTeamRequestExpiredDetails value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_secondaryTeam = null;
                String f_sentBy = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("secondary_team".equals(field)) {
                        f_secondaryTeam = StoneSerializers.string().deserialize(p);
                    }
                    else if ("sent_by".equals(field)) {
                        f_sentBy = StoneSerializers.string().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_secondaryTeam == null) {
                    throw new JsonParseException(p, "Required field \"secondary_team\" missing.");
                }
                if (f_sentBy == null) {
                    throw new JsonParseException(p, "Required field \"sent_by\" missing.");
                }
                value = new PrimaryTeamRequestExpiredDetails(f_secondaryTeam, f_sentBy);
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
