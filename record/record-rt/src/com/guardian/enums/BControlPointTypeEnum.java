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
                @Range(value = "numericValue", ordinal = 0),
                @Range(value = "booleanValue", ordinal = 1),
                @Range(value = "stringValue", ordinal = 2),
                @Range(value = "enumValue", ordinal = 3),
        },
        defaultValue = "numericValue"
)
public final class BControlPointTypeEnum
        extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BControlPointTypeEnum(772127064)1.0$ @*/
/* Generated Thu Nov 09 09:55:28 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for numericValue. */
  public static final int NUMERIC_VALUE = 0;
  /** Ordinal value for booleanValue. */
  public static final int BOOLEAN_VALUE = 1;
  /** Ordinal value for stringValue. */
  public static final int STRING_VALUE = 2;
  /** Ordinal value for enumValue. */
  public static final int ENUM_VALUE = 3;
  
  /** BControlPointTypeEnum constant for numericValue. */
  public static final BControlPointTypeEnum numericValue = new BControlPointTypeEnum(NUMERIC_VALUE);
  /** BControlPointTypeEnum constant for booleanValue. */
  public static final BControlPointTypeEnum booleanValue = new BControlPointTypeEnum(BOOLEAN_VALUE);
  /** BControlPointTypeEnum constant for stringValue. */
  public static final BControlPointTypeEnum stringValue = new BControlPointTypeEnum(STRING_VALUE);
  /** BControlPointTypeEnum constant for enumValue. */
  public static final BControlPointTypeEnum enumValue = new BControlPointTypeEnum(ENUM_VALUE);
  
  /** Factory method with ordinal. */
  public static BControlPointTypeEnum make(int ordinal)
  {
    return (BControlPointTypeEnum)numericValue.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BControlPointTypeEnum make(String tag)
  {
    return (BControlPointTypeEnum)numericValue.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BControlPointTypeEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BControlPointTypeEnum DEFAULT = numericValue;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BControlPointTypeEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
     * @param enumValue the value
     * @return a user readable text string
     */
    public static String getDisplayText(BControlPointTypeEnum enumValue) {
        return enumValue.getLexicon().get("display.enum.controlPointType." + enumValue.getTag(), enumValue.getTag());
    }

    /**
     * call the static function with this value
     * @return getDisplayText(this)
     */
    public String getDisplayText() {
        return BControlPointTypeEnum.getDisplayText(this);
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
