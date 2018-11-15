package com.guardian.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BControlPointTypeEnum
 * numeric, boolean, string, enum
 * @author Chris Lee
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range(value = "emergency", ordinal = 0),
                @Range(value = "booleanTrip", ordinal = 1),
                @Range(value = "booleanAlarm", ordinal = 2),
                @Range(value = "booleanWarning", ordinal = 3),
                @Range(value = "numericHighTrip", ordinal = 4),
                @Range(value = "numericHighAlarm", ordinal = 5),
                @Range(value = "numericHighWarning", ordinal = 6),
                @Range(value = "numericLowTrip", ordinal = 7),
                @Range(value = "numericLowAlarm", ordinal = 8),
                @Range(value = "numericLowWarning", ordinal = 9),
                @Range(value = "enumTrip", ordinal = 10),
                @Range(value = "enumAlarm", ordinal = 11),
                @Range(value = "enumWarning", ordinal = 12),
        },
        defaultValue = "booleanAlarm"
)
public final class BAlarmLevelTypeEnum
        extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BAlarmLevelTypeEnum(3203557677)1.0$ @*/
/* Generated Mon Nov 13 11:16:13 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for emergency. */
  public static final int EMERGENCY = 0;
  /** Ordinal value for booleanTrip. */
  public static final int BOOLEAN_TRIP = 1;
  /** Ordinal value for booleanAlarm. */
  public static final int BOOLEAN_ALARM = 2;
  /** Ordinal value for booleanWarning. */
  public static final int BOOLEAN_WARNING = 3;
  /** Ordinal value for numericHighTrip. */
  public static final int NUMERIC_HIGH_TRIP = 4;
  /** Ordinal value for numericHighAlarm. */
  public static final int NUMERIC_HIGH_ALARM = 5;
  /** Ordinal value for numericHighWarning. */
  public static final int NUMERIC_HIGH_WARNING = 6;
  /** Ordinal value for numericLowTrip. */
  public static final int NUMERIC_LOW_TRIP = 7;
  /** Ordinal value for numericLowAlarm. */
  public static final int NUMERIC_LOW_ALARM = 8;
  /** Ordinal value for numericLowWarning. */
  public static final int NUMERIC_LOW_WARNING = 9;
  /** Ordinal value for enumTrip. */
  public static final int ENUM_TRIP = 10;
  /** Ordinal value for enumAlarm. */
  public static final int ENUM_ALARM = 11;
  /** Ordinal value for enumWarning. */
  public static final int ENUM_WARNING = 12;
  
  /** BAlarmLevelTypeEnum constant for emergency. */
  public static final BAlarmLevelTypeEnum emergency = new BAlarmLevelTypeEnum(EMERGENCY);
  /** BAlarmLevelTypeEnum constant for booleanTrip. */
  public static final BAlarmLevelTypeEnum booleanTrip = new BAlarmLevelTypeEnum(BOOLEAN_TRIP);
  /** BAlarmLevelTypeEnum constant for booleanAlarm. */
  public static final BAlarmLevelTypeEnum booleanAlarm = new BAlarmLevelTypeEnum(BOOLEAN_ALARM);
  /** BAlarmLevelTypeEnum constant for booleanWarning. */
  public static final BAlarmLevelTypeEnum booleanWarning = new BAlarmLevelTypeEnum(BOOLEAN_WARNING);
  /** BAlarmLevelTypeEnum constant for numericHighTrip. */
  public static final BAlarmLevelTypeEnum numericHighTrip = new BAlarmLevelTypeEnum(NUMERIC_HIGH_TRIP);
  /** BAlarmLevelTypeEnum constant for numericHighAlarm. */
  public static final BAlarmLevelTypeEnum numericHighAlarm = new BAlarmLevelTypeEnum(NUMERIC_HIGH_ALARM);
  /** BAlarmLevelTypeEnum constant for numericHighWarning. */
  public static final BAlarmLevelTypeEnum numericHighWarning = new BAlarmLevelTypeEnum(NUMERIC_HIGH_WARNING);
  /** BAlarmLevelTypeEnum constant for numericLowTrip. */
  public static final BAlarmLevelTypeEnum numericLowTrip = new BAlarmLevelTypeEnum(NUMERIC_LOW_TRIP);
  /** BAlarmLevelTypeEnum constant for numericLowAlarm. */
  public static final BAlarmLevelTypeEnum numericLowAlarm = new BAlarmLevelTypeEnum(NUMERIC_LOW_ALARM);
  /** BAlarmLevelTypeEnum constant for numericLowWarning. */
  public static final BAlarmLevelTypeEnum numericLowWarning = new BAlarmLevelTypeEnum(NUMERIC_LOW_WARNING);
  /** BAlarmLevelTypeEnum constant for enumTrip. */
  public static final BAlarmLevelTypeEnum enumTrip = new BAlarmLevelTypeEnum(ENUM_TRIP);
  /** BAlarmLevelTypeEnum constant for enumAlarm. */
  public static final BAlarmLevelTypeEnum enumAlarm = new BAlarmLevelTypeEnum(ENUM_ALARM);
  /** BAlarmLevelTypeEnum constant for enumWarning. */
  public static final BAlarmLevelTypeEnum enumWarning = new BAlarmLevelTypeEnum(ENUM_WARNING);
  
  /** Factory method with ordinal. */
  public static BAlarmLevelTypeEnum make(int ordinal)
  {
    return (BAlarmLevelTypeEnum)emergency.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BAlarmLevelTypeEnum make(String tag)
  {
    return (BAlarmLevelTypeEnum)emergency.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BAlarmLevelTypeEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BAlarmLevelTypeEnum DEFAULT = booleanAlarm;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BAlarmLevelTypeEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
     * @param enumValue the value
     * @return a user readable text string
     */
    public static String getDisplayText(BAlarmLevelTypeEnum enumValue) {
        return enumValue.getLexicon().get("display.enum.alarmLevelType." + enumValue.getTag(), enumValue.getTag());
    }

    /**
     * call the static function with this value
     * @return getDisplayText(this)
     */
    public String getDisplayText() {
        return BAlarmLevelTypeEnum.getDisplayText(this);
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
