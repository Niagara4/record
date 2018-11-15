package com.guardian.history.records;

import com.guardian.enums.BDirectEnum;
import com.guardian.enums.BHistoryTagEnum;
import com.guardian.enums.BLatTagEnum;
import com.guardian.enums.BLngTagEnum;
import com.guardian.json.JSONObj;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * gps position & statue record define for history
 * @author Chris Lee
 */
@NiagaraType
@NiagaraProperty(
        name = "longitude",
        type = "String",defaultValue = "nan"
)
@NiagaraProperty(
        name = "longitudeTag",
        type = "BLngTagEnum",
        defaultValue = "BLngTagEnum.east"
)
@NiagaraProperty(
        name = "latitude",
        type = "String",
        defaultValue = "nan"
)
@NiagaraProperty(
        name = "latitudeTag",
        type = "BLatTagEnum",
        defaultValue = "BLatTagEnum.north"
)
@NiagaraProperty(
        name = "height",
        type = "String",
        defaultValue = "nan"
)
@NiagaraProperty(
        name = "speed",
        type = "String",
        defaultValue = "nan"
)
@NiagaraProperty(
        name = "directAngel",
        type = "double",
        defaultValue = "0.0d"
)
@NiagaraProperty(
        name = "directTag",
        type = "BDirectEnum",
        defaultValue = "BDirectEnum.still"
)
@NiagaraProperty(
        name = "updateTime",
        type = "BAbsTime",
        defaultValue = "BAbsTime.DEFAULT"
)
@NiagaraProperty(
        name = "satelliteCount",
        type = "String",
        defaultValue = "nan"
)
public final class BGpsPositionHistoryRecord
        extends BValueHistoryRecord
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.history.records.BGpsPositionHistoryRecord(1262213261)1.0$ @*/
/* Generated Mon Dec 04 10:21:31 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "longitude"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code longitude} property.
   * @see #getLongitude
   * @see #setLongitude
   */
  public static final Property longitude = newProperty(0, "nan", null);
  
  /**
   * Get the {@code longitude} property.
   * @see #longitude
   */
  public String getLongitude() { return getString(longitude); }
  
  /**
   * Set the {@code longitude} property.
   * @see #longitude
   */
  public void setLongitude(String v) { setString(longitude, v, null); }

////////////////////////////////////////////////////////////////
// Property "longitudeTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code longitudeTag} property.
   * @see #getLongitudeTag
   * @see #setLongitudeTag
   */
  public static final Property longitudeTag = newProperty(0, BLngTagEnum.east, null);
  
  /**
   * Get the {@code longitudeTag} property.
   * @see #longitudeTag
   */
  public BLngTagEnum getLongitudeTag() { return (BLngTagEnum)get(longitudeTag); }
  
  /**
   * Set the {@code longitudeTag} property.
   * @see #longitudeTag
   */
  public void setLongitudeTag(BLngTagEnum v) { set(longitudeTag, v, null); }

////////////////////////////////////////////////////////////////
// Property "latitude"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code latitude} property.
   * @see #getLatitude
   * @see #setLatitude
   */
  public static final Property latitude = newProperty(0, "nan", null);
  
  /**
   * Get the {@code latitude} property.
   * @see #latitude
   */
  public String getLatitude() { return getString(latitude); }
  
  /**
   * Set the {@code latitude} property.
   * @see #latitude
   */
  public void setLatitude(String v) { setString(latitude, v, null); }

////////////////////////////////////////////////////////////////
// Property "latitudeTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code latitudeTag} property.
   * @see #getLatitudeTag
   * @see #setLatitudeTag
   */
  public static final Property latitudeTag = newProperty(0, BLatTagEnum.north, null);
  
  /**
   * Get the {@code latitudeTag} property.
   * @see #latitudeTag
   */
  public BLatTagEnum getLatitudeTag() { return (BLatTagEnum)get(latitudeTag); }
  
  /**
   * Set the {@code latitudeTag} property.
   * @see #latitudeTag
   */
  public void setLatitudeTag(BLatTagEnum v) { set(latitudeTag, v, null); }

////////////////////////////////////////////////////////////////
// Property "height"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code height} property.
   * @see #getHeight
   * @see #setHeight
   */
  public static final Property height = newProperty(0, "nan", null);
  
  /**
   * Get the {@code height} property.
   * @see #height
   */
  public String getHeight() { return getString(height); }
  
  /**
   * Set the {@code height} property.
   * @see #height
   */
  public void setHeight(String v) { setString(height, v, null); }

////////////////////////////////////////////////////////////////
// Property "speed"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code speed} property.
   * @see #getSpeed
   * @see #setSpeed
   */
  public static final Property speed = newProperty(0, "nan", null);
  
  /**
   * Get the {@code speed} property.
   * @see #speed
   */
  public String getSpeed() { return getString(speed); }
  
  /**
   * Set the {@code speed} property.
   * @see #speed
   */
  public void setSpeed(String v) { setString(speed, v, null); }

////////////////////////////////////////////////////////////////
// Property "directAngel"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code directAngel} property.
   * @see #getDirectAngel
   * @see #setDirectAngel
   */
  public static final Property directAngel = newProperty(0, 0.0d, null);
  
  /**
   * Get the {@code directAngel} property.
   * @see #directAngel
   */
  public double getDirectAngel() { return getDouble(directAngel); }
  
  /**
   * Set the {@code directAngel} property.
   * @see #directAngel
   */
  public void setDirectAngel(double v) { setDouble(directAngel, v, null); }

////////////////////////////////////////////////////////////////
// Property "directTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code directTag} property.
   * @see #getDirectTag
   * @see #setDirectTag
   */
  public static final Property directTag = newProperty(0, BDirectEnum.still, null);
  
  /**
   * Get the {@code directTag} property.
   * @see #directTag
   */
  public BDirectEnum getDirectTag() { return (BDirectEnum)get(directTag); }
  
  /**
   * Set the {@code directTag} property.
   * @see #directTag
   */
  public void setDirectTag(BDirectEnum v) { set(directTag, v, null); }

////////////////////////////////////////////////////////////////
// Property "updateTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code updateTime} property.
   * @see #getUpdateTime
   * @see #setUpdateTime
   */
  public static final Property updateTime = newProperty(0, BAbsTime.DEFAULT, null);
  
  /**
   * Get the {@code updateTime} property.
   * @see #updateTime
   */
  public BAbsTime getUpdateTime() { return (BAbsTime)get(updateTime); }
  
  /**
   * Set the {@code updateTime} property.
   * @see #updateTime
   */
  public void setUpdateTime(BAbsTime v) { set(updateTime, v, null); }

////////////////////////////////////////////////////////////////
// Property "satelliteCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code satelliteCount} property.
   * @see #getSatelliteCount
   * @see #setSatelliteCount
   */
  public static final Property satelliteCount = newProperty(0, "nan", null);
  
  /**
   * Get the {@code satelliteCount} property.
   * @see #satelliteCount
   */
  public String getSatelliteCount() { return getString(satelliteCount); }
  
  /**
   * Set the {@code satelliteCount} property.
   * @see #satelliteCount
   */
  public void setSatelliteCount(String v) { setString(satelliteCount, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BGpsPositionHistoryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    @Override
    public boolean isFixedSize() {
        return false;
    }

    @Override
    public Property getValueProperty() {
        return null;
    }

    @Override
    protected void doReadTrend(DataInput dataInput) throws IOException {
        this.setTypeTag(BHistoryTagEnum.make(dataInput.readInt()));
        this.setLongitude(dataInput.readUTF());
        this.setLongitudeTag(BLngTagEnum.make(dataInput.readInt()));
        this.setLatitude(dataInput.readUTF());
        this.setLatitudeTag(BLatTagEnum.make(dataInput.readInt()));
        this.setHeight(dataInput.readUTF());
        this.setSpeed(dataInput.readUTF());
        this.setDirectAngel(dataInput.readDouble());
        this.setDirectTag(BDirectEnum.make(dataInput.readInt()));
        this.setUpdateTime(BAbsTime.make(dataInput.readLong()));
        this.setSatelliteCount(dataInput.readUTF());
    }

    @Override
    protected void doWriteTrend(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.getTypeTag().getOrdinal());
        dataOutput.writeUTF(this.getLongitude());
        dataOutput.writeInt(this.getLongitudeTag().getOrdinal());
        dataOutput.writeUTF(this.getLatitude());
        dataOutput.writeInt(this.getLatitudeTag().getOrdinal());
        dataOutput.writeUTF(this.getHeight());
        dataOutput.writeUTF(this.getSpeed());
        dataOutput.writeDouble(this.getDirectAngel());
        dataOutput.writeInt(this.getDirectTag().getOrdinal());
        dataOutput.writeLong(this.getUpdateTime().getMillis());
        dataOutput.writeUTF(this.getSatelliteCount());
    }

  /**
   *
   * @param timestamp
   * @param typeTag
   * @param longitude
   * @param longitudeTag
   * @param latitude
   * @param latitudeTag
   * @param height
   * @param speed
   * @param directAngle
   * @param directTag
   * @param updateTime
   * @param satelliteCount
   * @return
   */
    public BGpsPositionHistoryRecord set(BAbsTime timestamp,
                                         BHistoryTagEnum typeTag,
                                         String longitude,
                                         BLngTagEnum longitudeTag,
                                         String latitude,
                                         BLatTagEnum latitudeTag,
                                         String height,
                                         String speed,
                                         double directAngle,
                                         BDirectEnum directTag,
                                         BAbsTime updateTime,
                                         String satelliteCount)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(typeTag);
        this.setLongitude(longitude);
        this.setLongitudeTag(longitudeTag);
        this.setLatitude(latitude);
        this.setLatitudeTag(latitudeTag);
        this.setHeight(height);
        this.setSpeed(speed);
        this.setDirectAngel(directAngle);
        this.setDirectTag(directTag);
        this.setUpdateTime(updateTime);
        this.setSatelliteCount(satelliteCount);
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
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.timestamp.mills"), this.getTimestamp().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.longitude"), this.getLongitude());
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.longitudeTag"), BLngTagEnum.getDirectTag(this.getLongitudeTag()));
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.latitude"), this.getLatitude());
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.latitudeTag"), BLatTagEnum.getDirectTag(this.getLatitudeTag()));
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.height"), this.getHeight());
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.speed"), this.getSpeed());
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.directAngle"), this.getDirectAngel());
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.directTag"), BDirectEnum.getDirectTag(this.getDirectTag()));
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.updateTime.mills"), this.getUpdateTime().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.gpsPosition.satelliteCount"), this.getSatelliteCount());
        return jsonObj;
    }

}