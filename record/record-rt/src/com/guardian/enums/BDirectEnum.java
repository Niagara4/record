package com.guardian.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BDirectEnum
 * still, east, south, west, north, northEast, southEast, northWest, southWest
 * @author Chris Lee
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range(value = "still", ordinal = 0),
                @Range(value = "east", ordinal = 1),
                @Range(value = "south", ordinal = 2),
                @Range(value = "west", ordinal = 3),
                @Range(value = "north", ordinal = 4),
                @Range(value = "northEast", ordinal = 5),
                @Range(value = "southEast", ordinal = 6),
                @Range(value = "northWest", ordinal = 7),
                @Range(value = "southWest", ordinal = 8),
        },
        defaultValue = "still"
)
public final class BDirectEnum
        extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.base.lbs.BDirectEnum(594864263)1.0$ @*/
/* Generated Tue Feb 07 08:13:07 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for still. */
  public static final int STILL = 0;
  /** Ordinal value for east. */
  public static final int EAST = 1;
  /** Ordinal value for south. */
  public static final int SOUTH = 2;
  /** Ordinal value for west. */
  public static final int WEST = 3;
  /** Ordinal value for north. */
  public static final int NORTH = 4;
  /** Ordinal value for northEast. */
  public static final int NORTH_EAST = 5;
  /** Ordinal value for southEast. */
  public static final int SOUTH_EAST = 6;
  /** Ordinal value for northWest. */
  public static final int NORTH_WEST = 7;
  /** Ordinal value for southWest. */
  public static final int SOUTH_WEST = 8;
  
  /** BDirectEnum constant for still. */
  public static final BDirectEnum still = new BDirectEnum(STILL);
  /** BDirectEnum constant for east. */
  public static final BDirectEnum east = new BDirectEnum(EAST);
  /** BDirectEnum constant for south. */
  public static final BDirectEnum south = new BDirectEnum(SOUTH);
  /** BDirectEnum constant for west. */
  public static final BDirectEnum west = new BDirectEnum(WEST);
  /** BDirectEnum constant for north. */
  public static final BDirectEnum north = new BDirectEnum(NORTH);
  /** BDirectEnum constant for northEast. */
  public static final BDirectEnum northEast = new BDirectEnum(NORTH_EAST);
  /** BDirectEnum constant for southEast. */
  public static final BDirectEnum southEast = new BDirectEnum(SOUTH_EAST);
  /** BDirectEnum constant for northWest. */
  public static final BDirectEnum northWest = new BDirectEnum(NORTH_WEST);
  /** BDirectEnum constant for southWest. */
  public static final BDirectEnum southWest = new BDirectEnum(SOUTH_WEST);
  
  /** Factory method with ordinal. */
  public static BDirectEnum make(int ordinal)
  {
    return (BDirectEnum)still.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BDirectEnum make(String tag)
  {
    return (BDirectEnum)still.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BDirectEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BDirectEnum DEFAULT = still;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDirectEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * a short tag for read
     * @param direct
     * @return "E""S""W""N""SE""SW""NE""NW"
     */
    public static String getDirectTag(BDirectEnum direct) {
        if(direct.equals(BDirectEnum.east)) {
            return "E";
        } else if(direct.equals(BDirectEnum.south)) {
            return "S";
        } else if(direct.equals(BDirectEnum.west)) {
            return "W";
        } else if(direct.equals(BDirectEnum.north)) {
            return "N";
        } else if(direct.equals(BDirectEnum.southEast)) {
            return "SE";
        } else if(direct.equals(BDirectEnum.southWest)) {
            return "SW";
        } else if(direct.equals(BDirectEnum.northEast)) {
            return "NE";
        } else if(direct.equals(BDirectEnum.northWest)) {
            return "NW";
        } else {
            return "N";
        }
    }

    /**
     * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
     * @param enumValue the value
     * @return a user readable text string
     */
    public static String getDisplayText(BDirectEnum enumValue) {
        return enumValue.getLexicon().get("display.enum.direct." + enumValue.getTag(), enumValue.getTag());
    }

    /**
     * call the static function with this value
     * @return getDisplayText(this)
     */
    public String getDisplayText() {
        return BDirectEnum.getDisplayText(this);
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