package com.guardian.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BHistoryPolicyEnum
 * the value record in numeric type, like:
 * average, sum, max, min, input
 * @author Chris Lee
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range("average"),    //平均值
                @Range("sum"),  //总和
                @Range("max"),   //最大值
                @Range("min"),   //最小值
                @Range("input"), //实时值
        },
        defaultValue = "input"
)
public final class BHistoryPolicyEnum
        extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BHistoryPolicyEnum(1521190121)1.0$ @*/
/* Generated Wed May 24 09:24:04 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for average. */
  public static final int AVERAGE = 0;
  /** Ordinal value for sum. */
  public static final int SUM = 1;
  /** Ordinal value for max. */
  public static final int MAX = 2;
  /** Ordinal value for min. */
  public static final int MIN = 3;
  /** Ordinal value for input. */
  public static final int INPUT = 4;
  
  /** BHistoryPolicyEnum constant for average. */
  public static final BHistoryPolicyEnum average = new BHistoryPolicyEnum(AVERAGE);
  /** BHistoryPolicyEnum constant for sum. */
  public static final BHistoryPolicyEnum sum = new BHistoryPolicyEnum(SUM);
  /** BHistoryPolicyEnum constant for max. */
  public static final BHistoryPolicyEnum max = new BHistoryPolicyEnum(MAX);
  /** BHistoryPolicyEnum constant for min. */
  public static final BHistoryPolicyEnum min = new BHistoryPolicyEnum(MIN);
  /** BHistoryPolicyEnum constant for input. */
  public static final BHistoryPolicyEnum input = new BHistoryPolicyEnum(INPUT);
  
  /** Factory method with ordinal. */
  public static BHistoryPolicyEnum make(int ordinal)
  {
    return (BHistoryPolicyEnum)average.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BHistoryPolicyEnum make(String tag)
  {
    return (BHistoryPolicyEnum)average.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BHistoryPolicyEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BHistoryPolicyEnum DEFAULT = input;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHistoryPolicyEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
     * @param enumValue the value
     * @return a user readable text string
     */
    public static String getDisplayText(BHistoryPolicyEnum enumValue) {
        return enumValue.getLexicon().get("display.enum.historyPolicy." + enumValue.getTag(), enumValue.getTag());
    }

    /**
     * call the static function with this value
     * @return getDisplayText(this)
     */
    public String getDisplayText() {
        return BHistoryPolicyEnum.getDisplayText(this);
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