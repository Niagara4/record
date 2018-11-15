package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;
import com.guardian.json.JSONObj;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.BStatus;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * alarm count record define
 * @author Chris Lee
 */
@NiagaraType
@NiagaraProperty(
        name = "value",
        type = "boolean",
        defaultValue = "false"
)
@NiagaraProperty(
        name = "count",
        type = "int",
        defaultValue = "0"
)
@NiagaraProperty(
        name = "startFrom",
        type = "BAbsTime",
        defaultValue = "BAbsTime.DEFAULT"
)
@NiagaraProperty(
        name = "EndAt",
        type = "BAbsTime",
        defaultValue = "BAbsTime.DEFAULT"
)
@NiagaraProperty(
        name = "keptTime",
        type = "BRelTime",
        defaultValue = "BRelTime.DEFAULT"
)
public final class BAlarmCountHistoryRecord
        extends BValueHistoryRecord
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.history.records.BAlarmCountHistoryRecord(1030788856)1.0$ @*/
/* Generated Mon Dec 04 10:21:31 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "value"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code value} property.
   * @see #getValue
   * @see #setValue
   */
  public static final Property value = newProperty(0, false, null);
  
  /**
   * Get the {@code value} property.
   * @see #value
   */
  public boolean getValue() { return getBoolean(value); }
  
  /**
   * Set the {@code value} property.
   * @see #value
   */
  public void setValue(boolean v) { setBoolean(value, v, null); }

////////////////////////////////////////////////////////////////
// Property "count"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code count} property.
   * @see #getCount
   * @see #setCount
   */
  public static final Property count = newProperty(0, 0, null);
  
  /**
   * Get the {@code count} property.
   * @see #count
   */
  public int getCount() { return getInt(count); }
  
  /**
   * Set the {@code count} property.
   * @see #count
   */
  public void setCount(int v) { setInt(count, v, null); }

////////////////////////////////////////////////////////////////
// Property "startFrom"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code startFrom} property.
   * @see #getStartFrom
   * @see #setStartFrom
   */
  public static final Property startFrom = newProperty(0, BAbsTime.DEFAULT, null);
  
  /**
   * Get the {@code startFrom} property.
   * @see #startFrom
   */
  public BAbsTime getStartFrom() { return (BAbsTime)get(startFrom); }
  
  /**
   * Set the {@code startFrom} property.
   * @see #startFrom
   */
  public void setStartFrom(BAbsTime v) { set(startFrom, v, null); }

////////////////////////////////////////////////////////////////
// Property "EndAt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code EndAt} property.
   * @see #getEndAt
   * @see #setEndAt
   */
  public static final Property EndAt = newProperty(0, BAbsTime.DEFAULT, null);
  
  /**
   * Get the {@code EndAt} property.
   * @see #EndAt
   */
  public BAbsTime getEndAt() { return (BAbsTime)get(EndAt); }
  
  /**
   * Set the {@code EndAt} property.
   * @see #EndAt
   */
  public void setEndAt(BAbsTime v) { set(EndAt, v, null); }

////////////////////////////////////////////////////////////////
// Property "keptTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code keptTime} property.
   * @see #getKeptTime
   * @see #setKeptTime
   */
  public static final Property keptTime = newProperty(0, BRelTime.DEFAULT, null);
  
  /**
   * Get the {@code keptTime} property.
   * @see #keptTime
   */
  public BRelTime getKeptTime() { return (BRelTime)get(keptTime); }
  
  /**
   * Set the {@code keptTime} property.
   * @see #keptTime
   */
  public void setKeptTime(BRelTime v) { set(keptTime, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BAlarmCountHistoryRecord.class);

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
        this.setValue(dataInput.readBoolean());
        this.setCount(dataInput.readInt());
        this.setStartFrom(BAbsTime.make(dataInput.readLong()));
        this.setEndAt(BAbsTime.make(dataInput.readLong()));
        this.setKeptTime(BRelTime.make(dataInput.readLong()));
    }

    /**
     *
     * @param dataOutput
     * @throws IOException
     */
    @Override
    protected void doWriteTrend(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.getTypeTag().getOrdinal());
        dataOutput.writeBoolean(this.getValue());
        dataOutput.writeInt(this.getCount());
        dataOutput.writeLong(this.getStartFrom().getMillis());
        dataOutput.writeLong(this.getEndAt().getMillis());
        dataOutput.writeLong(this.getKeptTime().getMillis());
    }

    /**
     *
     * @return
     */
    @Override
    public Property getValueProperty() {
        return value;
    }

    /**
     *
     * @param timestamp
     * @param tag
     * @param value
     * @param count
     * @param startFrom
     * @return
     */
    public BAlarmCountHistoryRecord set(BAbsTime timestamp,
                                        BHistoryTagEnum   tag,
                                        boolean   value,
                                        int   count,
                                        BAbsTime   startFrom,
                                        BRelTime   keptTime,
                                        BStatus  status)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(tag);
        this.setValue(value);
        this.setCount(count);
        this.setStartFrom(startFrom);
        this.setEndAt(BAbsTime.now());
        this.setKeptTime(keptTime);
        this.setStatus(status);
        return this;
    }

    /**
     *
     * @param timestamp
     * @param tag
     * @param value
     * @param count
     * @param startFrom
     * @return
     */
    public BAlarmCountHistoryRecord set(BAbsTime timestamp,
                                        BHistoryTagEnum   tag,
                                        boolean   value,
                                        int   count,
                                        BAbsTime   startFrom,
                                        BAbsTime   endAt,
                                        BRelTime   keptTime,
                                        BStatus  status)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(tag);
        this.setValue(value);
        this.setCount(count);
        this.setStartFrom(startFrom);
        this.setEndAt(endAt);
        this.setKeptTime(keptTime);
        this.setStatus(status);
        return this;
    }

    /**
     *
     * @return
     */
    public String getValueString() {
        if(this.getValue()) {
            return this.getLexicon().get("api.json.value.alarmCount.value.true");
        } else {
            return this.getLexicon().get("api.json.value.alarmCount.value.false");
        }
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
        jsonObj.put(this.getLexicon().get("api.json.alarmCount.timestamp.mills"), this.getTimestamp().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.alarmCount.tag"), this.getTypeTag());
        jsonObj.put(this.getLexicon().get("api.json.alarmCount.value"), this.getValueString());
        jsonObj.put(this.getLexicon().get("api.json.alarmCount.count"), this.getCount());
        jsonObj.put(this.getLexicon().get("api.json.alarmCount.startFrom.mills"), this.getStartFrom().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.alarmCount.endAt.mills"), this.getEndAt().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.alarmCount.keptTime.mills"), this.getKeptTime().getMillis());
        return jsonObj;
    }
}