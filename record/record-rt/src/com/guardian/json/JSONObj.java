package com.guardian.json;

import com.tridium.json.JSONException;
import com.tridium.json.JSONObject;
import com.tridium.json.JSONTokener;

import javax.baja.naming.SlotPath;
import java.util.Map;

/**
 * override JSONObject's to String method to deal with niagara unicode storage
 * @author Chris Lee
 */
public class JSONObj
    extends JSONObject
{
    /**
     * Construct an empty JSONObject.
     */
    public JSONObj() {
        super();
    }

    /**
     * Construct a JSONObject from a subset of another JSONObject. An array of
     * strings is used to identify the keys that should be copied. Missing keys
     * are ignored.
     *
     * @param jo
     *            A JSONObject.
     * @param names
     *            An array of strings.
     */
    public JSONObj(JSONObject jo, String[] names) {
        super(jo, names);
    }

    /**
     * Construct a JSONObject from a JSONTokener.
     *
     * @param x
     *            A JSONTokener object containing the source string.
     * @throws JSONException
     *             If there is a syntax error in the source string or a
     *             duplicated key.
     */
    public JSONObj(JSONTokener x) throws JSONException {
        super(x);
    }

    /**
     * Construct a JSONObject from a Map.
     *
     * @param m
     *            A map object that can be used to initialize the contents of
     *            the JSONObject.
     */
    public JSONObj(Map<?, ?> m) {
        super(m);
    }

    /**
     * Construct a JSONObject from an Object using bean getters. It reflects on
     * all of the public methods of the object. For each of the methods with no
     * parameters and a name starting with <code>"get"</code> or
     * <code>"is"</code> followed by an uppercase letter, the method is invoked,
     * and a key and the value returned from the getter method are put into the
     * new JSONObject.
     * <p>
     * The key is formed by removing the <code>"get"</code> or <code>"is"</code>
     * prefix. If the second remaining character is not upper case, then the
     * first character is converted to lower case.
     * <p>
     * For example, if an object has a method named <code>"getName"</code>, and
     * if the result of calling <code>object.getName()</code> is
     * <code>"Larry Fine"</code>, then the JSONObject will contain
     * <code>"name": "Larry Fine"</code>.
     * <p>
     * Methods that return <code>void</code> as well as <code>static</code>
     * methods are ignored.
     *
     * @param bean
     *            An object that has getter methods that should be used to make
     *            a JSONObject.
     */
    public JSONObj(Object bean) {
        super(bean);
    }

    /**
     * Construct a JSONObject from an Object, using reflection to find the
     * public members. The resulting JSONObject's keys will be the strings from
     * the names array, and the values will be the field values associated with
     * those keys in the object. If a key is not found or not visible, then it
     * will not be copied into the new JSONObject.
     *
     * @param object
     *            An object that has fields that should be used to make a
     *            JSONObject.
     * @param names
     *            An array of strings, the names of the fields to be obtained
     *            from the object.
     */
    public JSONObj(Object object, String names[]) {
        super(object, names);
    }

    /**
     * Construct a JSONObject from a source JSON text string. This is the most
     * commonly used JSONObject constructor.
     *
     * @param source
     *            A string beginning with <code>{</code>&nbsp;<small>(left
     *            brace)</small> and ending with <code>}</code>
     *            &nbsp;<small>(right brace)</small>.
     * @exception JSONException
     *                If there is a syntax error in the source string or a
     *                duplicated key.
     */
    public JSONObj(String source) throws JSONException {
        super(source);
    }

    /**
     * Construct a JSONObject from a ResourceBundle.
     *
     * @param baseName
     *            The ResourceBundle base name.
     * @param locale
     *            The Locale to load the ResourceBundle for.
     * @throws JSONException
     *             If any JSONExceptions are detected.
     */
//    public JSONObj(String baseName, Locale locale) throws JSONException {
//        super(baseName, locale);
//    }

    /**
     * Constructor to specify an initial capacity of the internal map. Useful for library
     * internal calls where we know, or at least can best guess, how big this JSONObject
     * will be.
     *
     * @param initialCapacity initial capacity of the internal map.
     */
    public JSONObj(int initialCapacity){
        super(initialCapacity);
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
