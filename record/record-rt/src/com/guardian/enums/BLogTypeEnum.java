package com.guardian.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BLogTypeEnum
 * value of log type like:
 * login, modify, stationOnline, stationOffline, stationAlarm, stationRecover, deviceOnline, deviceOffline, deviceStart, deviceStop, deviceAlarm, deviceReset, pointAlarm, pointReset
 * @author Chris Lee
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range("login"),
                @Range("modify"),
                @Range("stationOnline"),
                @Range("stationOffline"),
                @Range("stationAlarm"),
                @Range("stationRecover"),
                @Range("deviceOnline"),
                @Range("deviceOffline"),
                @Range("deviceStart"),
                @Range("deviceStop"),
                @Range("deviceAlarm"),
                @Range("deviceReset"),
                @Range("pointAlarm"),
                @Range("pointReset"),
        },
        defaultValue = "modify"
)
public final class BLogTypeEnum
        extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.base.enums.BLogTypeEnum(1288659493)1.0$ @*/
/* Generated Fri May 05 09:08:39 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for login. */
  public static final int LOGIN = 0;
  /** Ordinal value for modify. */
  public static final int MODIFY = 1;
  /** Ordinal value for stationOnline. */
  public static final int STATION_ONLINE = 2;
  /** Ordinal value for stationOffline. */
  public static final int STATION_OFFLINE = 3;
  /** Ordinal value for stationAlarm. */
  public static final int STATION_ALARM = 4;
  /** Ordinal value for stationRecover. */
  public static final int STATION_RECOVER = 5;
  /** Ordinal value for deviceOnline. */
  public static final int DEVICE_ONLINE = 6;
  /** Ordinal value for deviceOffline. */
  public static final int DEVICE_OFFLINE = 7;
  /** Ordinal value for deviceStart. */
  public static final int DEVICE_START = 8;
  /** Ordinal value for deviceStop. */
  public static final int DEVICE_STOP = 9;
  /** Ordinal value for deviceAlarm. */
  public static final int DEVICE_ALARM = 10;
  /** Ordinal value for deviceReset. */
  public static final int DEVICE_RESET = 11;
  /** Ordinal value for pointAlarm. */
  public static final int POINT_ALARM = 12;
  /** Ordinal value for pointReset. */
  public static final int POINT_RESET = 13;
  
  /** BLogTypeEnum constant for login. */
  public static final BLogTypeEnum login = new BLogTypeEnum(LOGIN);
  /** BLogTypeEnum constant for modify. */
  public static final BLogTypeEnum modify = new BLogTypeEnum(MODIFY);
  /** BLogTypeEnum constant for stationOnline. */
  public static final BLogTypeEnum stationOnline = new BLogTypeEnum(STATION_ONLINE);
  /** BLogTypeEnum constant for stationOffline. */
  public static final BLogTypeEnum stationOffline = new BLogTypeEnum(STATION_OFFLINE);
  /** BLogTypeEnum constant for stationAlarm. */
  public static final BLogTypeEnum stationAlarm = new BLogTypeEnum(STATION_ALARM);
  /** BLogTypeEnum constant for stationRecover. */
  public static final BLogTypeEnum stationRecover = new BLogTypeEnum(STATION_RECOVER);
  /** BLogTypeEnum constant for deviceOnline. */
  public static final BLogTypeEnum deviceOnline = new BLogTypeEnum(DEVICE_ONLINE);
  /** BLogTypeEnum constant for deviceOffline. */
  public static final BLogTypeEnum deviceOffline = new BLogTypeEnum(DEVICE_OFFLINE);
  /** BLogTypeEnum constant for deviceStart. */
  public static final BLogTypeEnum deviceStart = new BLogTypeEnum(DEVICE_START);
  /** BLogTypeEnum constant for deviceStop. */
  public static final BLogTypeEnum deviceStop = new BLogTypeEnum(DEVICE_STOP);
  /** BLogTypeEnum constant for deviceAlarm. */
  public static final BLogTypeEnum deviceAlarm = new BLogTypeEnum(DEVICE_ALARM);
  /** BLogTypeEnum constant for deviceReset. */
  public static final BLogTypeEnum deviceReset = new BLogTypeEnum(DEVICE_RESET);
  /** BLogTypeEnum constant for pointAlarm. */
  public static final BLogTypeEnum pointAlarm = new BLogTypeEnum(POINT_ALARM);
  /** BLogTypeEnum constant for pointReset. */
  public static final BLogTypeEnum pointReset = new BLogTypeEnum(POINT_RESET);
  
  /** Factory method with ordinal. */
  public static BLogTypeEnum make(int ordinal)
  {
    return (BLogTypeEnum)login.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BLogTypeEnum make(String tag)
  {
    return (BLogTypeEnum)login.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BLogTypeEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BLogTypeEnum DEFAULT = modify;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLogTypeEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
     * @param enumValue the value
     * @return a user readable text string
     */
    public static String getDisplayText(BLogTypeEnum enumValue) {
        return enumValue.getLexicon().get("display.enum.logType." + enumValue.getTag(), enumValue.getTag());
    }

    /**
     * call the static function with this value
     * @return getDisplayText(this)
     */
    public String getDisplayText() {
        return BLogTypeEnum.getDisplayText(this);
    }

    /**
     * Get a user readable version of the tag identifier.
     * @param context
     * @return this.getDisplayText()
     */
    @Override
    public String getDisplayTag(Context context) {
        return this.getDisplayText();
    }

    /**
     * override toString function
     * @param context
     * @return {DISPLAY_TAG}[{TAG}]:{ORDINAL}
     */
    @Override
    public String toString(Context context) {
        return this.getDisplayTag(context) + "[" + this.getTag() + "]:" + this.getOrdinal();
    }
}