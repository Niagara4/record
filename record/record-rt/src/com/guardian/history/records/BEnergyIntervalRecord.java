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
 * energy trend record define for history
 * @author Chris Lee
 */
@NiagaraType
@NiagaraProperty(
        name = "EndAt",
        type = "BAbsTime",
        defaultValue = "BAbsTime.DEFAULT"
)
@NiagaraProperty(
        name = "meterRead",
        type = "double",
        defaultValue = "0.0d"
)
@NiagaraProperty(
        name = "cost",
        type = "double",
        defaultValue = "0.0d"
)
public final class BEnergyIntervalRecord
        extends BValueHistoryRecord
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.history.records.BEnergyIntervalRecord(824908957)1.0$ @*/
/* Generated Mon Dec 04 10:21:31 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

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
// Property "meterRead"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code meterRead} property.
   * @see #getMeterRead
   * @see #setMeterRead
   */
  public static final Property meterRead = newProperty(0, 0.0d, null);
  
  /**
   * Get the {@code meterRead} property.
   * @see #meterRead
   */
  public double getMeterRead() { return getDouble(meterRead); }
  
  /**
   * Set the {@code meterRead} property.
   * @see #meterRead
   */
  public void setMeterRead(double v) { setDouble(meterRead, v, null); }

////////////////////////////////////////////////////////////////
// Property "cost"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code cost} property.
   * @see #getCost
   * @see #setCost
   */
  public static final Property cost = newProperty(0, 0.0d, null);
  
  /**
   * Get the {@code cost} property.
   * @see #cost
   */
  public double getCost() { return getDouble(cost); }
  
  /**
   * Set the {@code cost} property.
   * @see #cost
   */
  public void setCost(double v) { setDouble(cost, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BEnergyIntervalRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * create method
     */
    public BEnergyIntervalRecord() {}

    /**
     * Tests whether this record type has a fixed size.  Float records
     * do have a fixed size.
     */
    @Override
    public boolean isFixedSize() { return true; }

    /**
     * Read the type specific fields from the specified input.
     */
    @Override
    public void doReadTrend(DataInput in) throws IOException {
        this.setTypeTag(BHistoryTagEnum.make(in.readInt()));
        this.setEndAt(BAbsTime.make(in.readLong()));
        this.setMeterRead((double) in.readFloat());
        this.setCost((double) in.readFloat());
    }

    /**
     * Write the type specific fields to the specified output.
     */
    @Override
    public void doWriteTrend(DataOutput out) throws IOException {
        out.writeInt(this.getTypeTag().getOrdinal());
        out.writeLong(this.getEndAt().getMillis());
        out.writeFloat((float) this.getMeterRead());
        out.writeFloat((float) this.getCost());
    }

    /**
     * Set the values in this record.
     * @return Returns this instance with the new values set.
     */
    public BEnergyIntervalRecord set(BAbsTime timestamp,
                                     BHistoryTagEnum typeTag,
                                     double   meterRead,
                                     double   cost,
                                     BStatus  status)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(typeTag);
        this.setEndAt(timestamp);
        this.setMeterRead(meterRead);
        this.setCost(cost);
        this.setStatus(status);
        return this;
    }

    /**
     * draw curve using bill property
     */
    @Override
    public Property getValueProperty() {
        return cost;
    }

    /**
     * Return <code>getValue()</code>.
     */
    public double getNumeric() {
        return getCost();
    }

    /**
     * Return <code>BFacets.NULL</code>.
     */
    public BFacets getNumericFacets() {
        return BFacets.NULL;
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
        jsonObj.put(this.getLexicon().get("api.json.energy.endAt.mills"), this.getEndAt().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.energy.meterRead"), this.getMeterRead());
        jsonObj.put(this.getLexicon().get("api.json.energy.cost"), this.getCost());
        return jsonObj;
    }

}