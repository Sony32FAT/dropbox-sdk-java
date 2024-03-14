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
 * Set restrictions on data center locations where team data resides.
 */
public class DataPlacementRestrictionChangePolicyDetails {
    // struct team_log.DataPlacementRestrictionChangePolicyDetails (team_log_generated.stone)

    protected final PlacementRestriction previousValue;
    protected final PlacementRestriction newValue;

    /**
     * Set restrictions on data center locations where team data resides.
     *
     * @param previousValue  Previous placement restriction. Must not be {@code
     *     null}.
     * @param newValue  New placement restriction. Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public DataPlacementRestrictionChangePolicyDetails(PlacementRestriction previousValue, PlacementRestriction newValue) {
        if (previousValue == null) {
            throw new IllegalArgumentException("Required value for 'previousValue' is null");
        }
        this.previousValue = previousValue;
        if (newValue == null) {
            throw new IllegalArgumentException("Required value for 'newValue' is null");
        }
        this.newValue = newValue;
    }

    /**
     * Previous placement restriction.
     *
     * @return value for this field, never {@code null}.
     */
    @javax.annotation.Nonnull
    public PlacementRestriction getPreviousValue() {
        return previousValue;
    }

    /**
     * New placement restriction.
     *
     * @return value for this field, never {@code null}.
     */
    @javax.annotation.Nonnull
    public PlacementRestriction getNewValue() {
        return newValue;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            previousValue,
            newValue
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
            DataPlacementRestrictionChangePolicyDetails other = (DataPlacementRestrictionChangePolicyDetails) obj;
            return ((this.previousValue == other.previousValue) || (this.previousValue.equals(other.previousValue)))
                && ((this.newValue == other.newValue) || (this.newValue.equals(other.newValue)))
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
    static class Serializer extends StructSerializer<DataPlacementRestrictionChangePolicyDetails> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(DataPlacementRestrictionChangePolicyDetails value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("previous_value");
            PlacementRestriction.Serializer.INSTANCE.serialize(value.previousValue, g);
            g.writeFieldName("new_value");
            PlacementRestriction.Serializer.INSTANCE.serialize(value.newValue, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public DataPlacementRestrictionChangePolicyDetails deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            DataPlacementRestrictionChangePolicyDetails value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                PlacementRestriction f_previousValue = null;
                PlacementRestriction f_newValue = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("previous_value".equals(field)) {
                        f_previousValue = PlacementRestriction.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("new_value".equals(field)) {
                        f_newValue = PlacementRestriction.Serializer.INSTANCE.deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_previousValue == null) {
                    throw new JsonParseException(p, "Required field \"previous_value\" missing.");
                }
                if (f_newValue == null) {
                    throw new JsonParseException(p, "Required field \"new_value\" missing.");
                }
                value = new DataPlacementRestrictionChangePolicyDetails(f_previousValue, f_newValue);
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
