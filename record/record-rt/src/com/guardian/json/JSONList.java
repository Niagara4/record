package com.guardian.json;

import com.tridium.json.JSONArray;
import com.tridium.json.JSONException;
import com.tridium.json.JSONTokener;

import javax.baja.naming.SlotPath;
import java.util.Collection;

/**
 * override JSONArray's to String method to deal with niagara unicode storage
 * @author Chris Lee
 */
public class JSONList
    extends JSONArray
{
    /**
     * Construct an empty JSONArray.
     */
    public JSONList() {
        super();
    }

    /**
     * Construct a JSONArray from a JSONTokener.
     *
     * @param x
     *            A JSONTokener
     * @throws JSONException
     *             If there is a syntax error.
     */
    public JSONList(JSONTokener x) throws JSONException {
        super(x);
    }

    /**
     * Construct a JSONArray from a source JSON text.
     *
     * @param source
     *            A string that begins with <code>[</code>&nbsp;<small>(left
     *            bracket)</small> and ends with <code>]</code>
     *            &nbsp;<small>(right bracket)</small>.
     * @throws JSONException
     *             If there is a syntax error.
     */
    public JSONList(String source) throws JSONException {
        super(source);
    }

    /**
     * Construct a JSONArray from a Collection.
     *
     * @param collection
     *            A Collection.
     */
    public JSONList(Collection<?> collection) {
        super(collection);
    }

    /**
     * Construct a JSONArray from an array
     *
     * @throws JSONException
     *             If not an array.
     */
    public JSONList(Object array) throws JSONException {
        super(array);
    }

    /**
     * Override to deal with unicode "$u" to "\\u"
     * @return
     */
    @Override
    public String toString() {
        return SlotPath.unescape(super.toString());
    }
}
