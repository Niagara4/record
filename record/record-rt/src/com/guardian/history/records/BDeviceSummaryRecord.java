package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;
import com.guardian.enums.BLogTypeEnum;
import com.guardian.json.JSONObj;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * device summary define for history
 * @author Chris Lee
 */
@NiagaraType
@NiagaraProperty(
        name = "deviceLogTag",
        type = "BLogTypeEnum",
        defaultValue = "BLogTypeEnum.modify"
)
@NiagaraProperty(
        name = "startTime",
        type = "BAbsTime",
        defaultValue = "BAbsTime.DEFAULT"
)
@NiagaraProperty(
        name = "endTime",
        type = "BAbsTime",
        defaultValue = "BAbsTime.DEFAULT"
)
@NiagaraProperty(
        name = "holdTime",
        type = "BRelTime",
        defaultValue = "BRelTime.DEFAULT"
)
@NiagaraProperty(
        name = "note",
        type = "String",
        defaultValue = "-"
)
public final class BDeviceSummaryRecord
        extends BValueHistoryRecord
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.history.records.BDeviceSummaryRecord(2750242302)1.0$ @*/
/* Generated Mon Dec 04 10:21:31 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "deviceLogTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code deviceLogTag} property.
   * @see #getDeviceLogTag
   * @see #setDeviceLogTag
   */
  public static final Property deviceLogTag = newProperty(0, BLogTypeEnum.modify, null);
  
  /**
   * Get the {@code deviceLogTag} property.
   * @see #deviceLogTag
   */
  public BLogTypeEnum getDeviceLogTag() { return (BLogTypeEnum)get(deviceLogTag); }
  
  /**
   * Set the {@code deviceLogTag} property.
   * @see #deviceLogTag
   */
  public void setDeviceLogTag(BLogTypeEnum v) { set(deviceLogTag, v, null); }

////////////////////////////////////////////////////////////////
// Property "startTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code startTime} property.
   * @see #getStartTime
   * @see #setStartTime
   */
  public static final Property startTime = newProperty(0, BAbsTime.DEFAULT, null);
  
  /**
   * Get the {@code startTime} property.
   * @see #startTime
   */
  public BAbsTime getStartTime() { return (BAbsTime)get(startTime); }
  
  /**
   * Set the {@code startTime} property.
   * @see #startTime
   */
  public void setStartTime(BAbsTime v) { set(startTime, v, null); }

////////////////////////////////////////////////////////////////
// Property "endTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code endTime} property.
   * @see #getEndTime
   * @see #setEndTime
   */
  public static final Property endTime = newProperty(0, BAbsTime.DEFAULT, null);
  
  /**
   * Get the {@code endTime} property.
   * @see #endTime
   */
  public BAbsTime getEndTime() { return (BAbsTime)get(endTime); }
  
  /**
   * Set the {@code endTime} property.
   * @see #endTime
   */
  public void setEndTime(BAbsTime v) { set(endTime, v, null); }

////////////////////////////////////////////////////////////////
// Property "holdTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code holdTime} property.
   * @see #getHoldTime
   * @see #setHoldTime
   */
  public static final Property holdTime = newProperty(0, BRelTime.DEFAULT, null);
  
  /**
   * Get the {@code holdTime} property.
   * @see #holdTime
   */
  public BRelTime getHoldTime() { return (BRelTime)get(holdTime); }
  
  /**
   * Set the {@code holdTime} property.
   * @see #holdTime
   */
  public void setHoldTime(BRelTime v) { set(holdTime, v, null); }

////////////////////////////////////////////////////////////////
// Property "note"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code note} property.
   * @see #getNote
   * @see #setNote
   */
  public static final Property note = newProperty(0, "-", null);
  
  /**
   * Get the {@code note} property.
   * @see #note
   */
  public String getNote() { return getString(note); }
  
  /**
   * Set the {@code note} property.
   * @see #note
   */
  public void setNote(String v) { setString(note, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDeviceSummaryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     *
     * @return
     */
    @Override
    public boolean isFixedSize() {
        return true;
    }

    /**
     *
     * @param dataInput
     * @throws IOException
     */
    @Override
    protected void doReadTrend(DataInput dataInput) throws IOException {
        this.setTypeTag(BHistoryTagEnum.make(dataInput.readInt()));
        this.setDeviceLogTag(BLogTypeEnum.make(dataInput.readInt()));
        this.setStartTime(BAbsTime.make(dataInput.readLong()));
        this.setEndTime(BAbsTime.make(dataInput.readLong()));
        this.setHoldTime(BRelTime.make(dataInput.readLong()));
        this.setNote(dataInput.readLine());
    }

    /**
     *
     * @param dataOutput
     * @throws IOException
     */
    @Override
    protected void doWriteTrend(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.getTypeTag().getOrdinal());
        dataOutput.writeInt(this.getDeviceLogTag().getOrdinal());
        dataOutput.writeLong(this.getStartTime().getMillis());
        dataOutput.writeLong(this.getEndTime().getMillis());
        dataOutput.writeLong(this.getHoldTime().getMillis());
        dataOutput.writeUTF(this.getNote());
    }

    /**
     *
     * @return
     */
    @Override
    public Property getValueProperty() {
        return null;
    }

    /**
     *
     * @param timestamp
     * @param historyTag
     * @param logType
     * @param startTime
     * @param endTime
     * @param note
     * @return
     */
    public BDeviceSummaryRecord set(BAbsTime timestamp,
                                    BHistoryTagEnum   historyTag,
                                    BLogTypeEnum   logType,
                                    BAbsTime   startTime,
                                    BAbsTime   endTime,
                                    String  note)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(historyTag);
        this.setDeviceLogTag(logType);
        this.setStartTime(startTime);
        this.setEndTime(endTime);
        this.setHoldTime(endTime.delta(startTime));
        this.setNote(note);
        return this;
    }

    /**
     *
     * @param tag
     * @return
     */
    public boolean fitTag(BHistoryTagEnum tag) {
        return this.getTypeTag().equals(tag);
    }

    @Override
    public String toJSONString() {
        return this.getJSONObj().toString();
    }

    @Override
    public JSONObj getJSONObj() {
        JSONObj jsonObj = new JSONObj();
        return this.appendJSONObj(jsonObj);
    }

    @Override
    public JSONObj appendJSONObj(JSONObj jsonObj) {
        jsonObj.put("start", this.getStartTime().getMillis());
        jsonObj.put("end", this.getEndTime().getMillis());
        jsonObj.put("held", this.getHoldTime().getMillis());
        jsonObj.put("tag", this.getDeviceLogTag().getDisplayText());
        jsonObj.put("note", this.getNote());
        return jsonObj;
    }


}