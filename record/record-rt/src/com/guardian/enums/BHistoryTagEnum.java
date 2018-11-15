package com.guardian.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BHistoryTagEnum
 * the history record time tag, for querying, values like:
 * minute, hour, day, week, month, year, cov(ChangeOfValue)
 * @author Chris Lee
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range("custom"),
                @Range("minute"),
                @Range("hour"),
                @Range("day"),
                @Range("week"),
                @Range("month"),
                @Range("year"),
                @Range("cov"),
        },
        defaultValue = "custom"
)
public final class BHistoryTagEnum
        extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BHistoryTagEnum(941454731)1.0$ @*/
/* Generated Thu Nov 15 07:53:03 CST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for custom. */
  public static final int CUSTOM = 0;
  /** Ordinal value for minute. */
  public static final int MINUTE = 1;
  /** Ordinal value for hour. */
  public static final int HOUR = 2;
  /** Ordinal value for day. */
  public static final int DAY = 3;
  /** Ordinal value for week. */
  public static final int WEEK = 4;
  /** Ordinal value for month. */
  public static final int MONTH = 5;
  /** Ordinal value for year. */
  public static final int YEAR = 6;
  /** Ordinal value for cov. */
  public static final int COV = 7;
  
  /** BHistoryTagEnum constant for custom. */
  public static final BHistoryTagEnum custom = new BHistoryTagEnum(CUSTOM);
  /** BHistoryTagEnum constant for minute. */
  public static final BHistoryTagEnum minute = new BHistoryTagEnum(MINUTE);
  /** BHistoryTagEnum constant for hour. */
  public static final BHistoryTagEnum hour = new BHistoryTagEnum(HOUR);
  /** BHistoryTagEnum constant for day. */
  public static final BHistoryTagEnum day = new BHistoryTagEnum(DAY);
  /** BHistoryTagEnum constant for week. */
  public static final BHistoryTagEnum week = new BHistoryTagEnum(WEEK);
  /** BHistoryTagEnum constant for month. */
  public static final BHistoryTagEnum month = new BHistoryTagEnum(MONTH);
  /** BHistoryTagEnum constant for year. */
  public static final BHistoryTagEnum year = new BHistoryTagEnum(YEAR);
  /** BHistoryTagEnum constant for cov. */
  public static final BHistoryTagEnum cov = new BHistoryTagEnum(COV);
  
  /** Factory method with ordinal. */
  public static BHistoryTagEnum make(int ordinal)
  {
    return (BHistoryTagEnum)custom.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BHistoryTagEnum make(String tag)
  {
    return (BHistoryTagEnum)custom.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BHistoryTagEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BHistoryTagEnum DEFAULT = custom;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHistoryTagEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
     * @param enumValue the value
     * @return a user readable text string
     */
    public static String getDisplayText(BHistoryTagEnum enumValue) {
        return enumValue.getLexicon().get("display.enum.historyTag." + enumValue.getTag(), enumValue.getTag());
    }

    /**
     * call the static function with this value
     * @return getDisplayText(this)
     */
    public String getDisplayText() {
        return BHistoryTagEnum.getDisplayText(this);
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