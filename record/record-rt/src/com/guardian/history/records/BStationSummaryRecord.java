package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;
import com.guardian.json.JSONObj;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * station summary record define for history
 * @author Chris Lee
 */
@NiagaraType
@NiagaraProperty(
        name = "deviceCount",
        type = "long",
        defaultValue = "0L"
)
@NiagaraProperty(
        name = "deviceOnlineCount",
        type = "long",
        defaultValue = "0L"
)
@NiagaraProperty(
        name = "deviceRunCount",
        type = "long",
        defaultValue = "0L"
)
@NiagaraProperty(
        name = "deviceRunMinutesInHour",
        type = "long",
        defaultValue = "0L"
)
@NiagaraProperty(
        name = "deviceAlarmingCount",
        type = "long",
        defaultValue = "0L"
)
public final class BStationSummaryRecord
        extends BValueHistoryRecord
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.history.records.BStationSummaryRecord(3914793449)1.0$ @*/
/* Generated Thu Nov 15 11:12:57 CST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "deviceCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code deviceCount} property.
   * @see #getDeviceCount
   * @see #setDeviceCount
   */
  public static final Property deviceCount = newProperty(0, 0L, null);
  
  /**
   * Get the {@code deviceCount} property.
   * @see #deviceCount
   */
  public long getDeviceCount() { return getLong(deviceCount); }
  
  /**
   * Set the {@code deviceCount} property.
   * @see #deviceCount
   */
  public void setDeviceCount(long v) { setLong(deviceCount, v, null); }

////////////////////////////////////////////////////////////////
// Property "deviceOnlineCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code deviceOnlineCount} property.
   * @see #getDeviceOnlineCount
   * @see #setDeviceOnlineCount
   */
  public static final Property deviceOnlineCount = newProperty(0, 0L, null);
  
  /**
   * Get the {@code deviceOnlineCount} property.
   * @see #deviceOnlineCount
   */
  public long getDeviceOnlineCount() { return getLong(deviceOnlineCount); }
  
  /**
   * Set the {@code deviceOnlineCount} property.
   * @see #deviceOnlineCount
   */
  public void setDeviceOnlineCount(long v) { setLong(deviceOnlineCount, v, null); }

////////////////////////////////////////////////////////////////
// Property "deviceRunCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code deviceRunCount} property.
   * @see #getDeviceRunCount
   * @see #setDeviceRunCount
   */
  public static final Property deviceRunCount = newProperty(0, 0L, null);
  
  /**
   * Get the {@code deviceRunCount} property.
   * @see #deviceRunCount
   */
  public long getDeviceRunCount() { return getLong(deviceRunCount); }
  
  /**
   * Set the {@code deviceRunCount} property.
   * @see #deviceRunCount
   */
  public void setDeviceRunCount(long v) { setLong(deviceRunCount, v, null); }

////////////////////////////////////////////////////////////////
// Property "deviceRunMinutesInHour"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code deviceRunMinutesInHour} property.
   * @see #getDeviceRunMinutesInHour
   * @see #setDeviceRunMinutesInHour
   */
  public static final Property deviceRunMinutesInHour = newProperty(0, 0L, null);
  
  /**
   * Get the {@code deviceRunMinutesInHour} property.
   * @see #deviceRunMinutesInHour
   */
  public long getDeviceRunMinutesInHour() { return getLong(deviceRunMinutesInHour); }
  
  /**
   * Set the {@code deviceRunMinutesInHour} property.
   * @see #deviceRunMinutesInHour
   */
  public void setDeviceRunMinutesInHour(long v) { setLong(deviceRunMinutesInHour, v, null); }

////////////////////////////////////////////////////////////////
// Property "deviceAlarmingCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code deviceAlarmingCount} property.
   * @see #getDeviceAlarmingCount
   * @see #setDeviceAlarmingCount
   */
  public static final Property deviceAlarmingCount = newProperty(0, 0L, null);
  
  /**
   * Get the {@code deviceAlarmingCount} property.
   * @see #deviceAlarmingCount
   */
  public long getDeviceAlarmingCount() { return getLong(deviceAlarmingCount); }
  
  /**
   * Set the {@code deviceAlarmingCount} property.
   * @see #deviceAlarmingCount
   */
  public void setDeviceAlarmingCount(long v) { setLong(deviceAlarmingCount, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BStationSummaryRecord.class);

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
        this.setDeviceCount(dataInput.readLong());
        this.setDeviceOnlineCount(dataInput.readLong());
        this.setDeviceRunCount(dataInput.readLong());
        this.setDeviceRunMinutesInHour(dataInput.readLong());
        this.setDeviceAlarmingCount(dataInput.readLong());
    }

    /**
     *
     * @param dataOutput
     * @throws IOException
     */
    @Override
    protected void doWriteTrend(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.getTypeTag().getOrdinal());
        dataOutput.writeLong(this.getDeviceCount());
        dataOutput.writeLong(this.getDeviceOnlineCount());
        dataOutput.writeLong(this.getDeviceRunCount());
        dataOutput.writeLong(this.getDeviceRunMinutesInHour());
        dataOutput.writeLong(this.getDeviceAlarmingCount());
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
     * @param tag
     * @param deviceCount
     * @param deviceOnlineCount
     * @param deviceRunCount
     * @param deviceRunMinutes
     * @param deviceAlarmCount
     * @return
     */
    public BStationSummaryRecord set(BAbsTime timestamp,
                                     BHistoryTagEnum   tag,
                                     long   deviceCount,
                                     long   deviceOnlineCount,
                                     long   deviceRunCount,
                                     long   deviceRunMinutes,
                                     long   deviceAlarmCount)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(tag);
        this.setDeviceCount(deviceCount);
        this.setDeviceOnlineCount(deviceOnlineCount);
        this.setDeviceRunCount(deviceRunCount);
        this.setDeviceRunMinutesInHour(deviceRunMinutes);
        this.setDeviceAlarmingCount(deviceAlarmCount);
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
        jsonObj.put(this.getLexicon().get("api.json.stationSummary.typeTag"), this.getTypeTag());
        jsonObj.put(this.getLexicon().get("api.json.stationSummary.deviceCount"), this.getDeviceCount());
        jsonObj.put(this.getLexicon().get("api.json.stationSummary.deviceOnlineCount"), this.getDeviceOnlineCount());
        jsonObj.put(this.getLexicon().get("api.json.stationSummary.deviceRunCount"), this.getDeviceRunCount());
        jsonObj.put(this.getLexicon().get("api.json.stationSummary.deviceRunMinutes"), this.getDeviceRunMinutesInHour());
        jsonObj.put(this.getLexicon().get("api.json.stationSummary.deviceAlarmingCount"), this.getDeviceAlarmingCount());
        return jsonObj;
    }

}