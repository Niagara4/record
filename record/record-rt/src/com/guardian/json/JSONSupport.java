package com.guardian.json;

/**
 * common methods needed for getting json
 * @author Chris Lee
 */
public interface JSONSupport {

    /**
     * get object String in JSON
     * @return
     */
    String toJSONString();

    /**
     * make a new JSONObj
     * @return
     */
    JSONObj getJSONObj();

    /**
     * append keys to existed JSONObj
     * @param jsonObj
     * @return
     */
    JSONObj appendJSONObj(JSONObj jsonObj);
}
