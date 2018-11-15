package com.guardian.history.records;

import com.guardian.json.JSONObj;
import com.guardian.json.JSONSupport;

import javax.baja.history.BHistoryRecord;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@NiagaraType
@NiagaraProperty(
        name = "time",
        type = "BAbsTime",
        defaultValue = "BAbsTime.now()"
)
@NiagaraProperty(
        name = "messageType",
        type = "String",
        defaultValue = "-"
)
@NiagaraProperty(
        name = "receiverName",
        type = "String",
        defaultValue = "-"
)
@NiagaraProperty(
        name = "receiverAddress",
        type = "String",
        defaultValue = "-"
)
@NiagaraProperty(
        name = "messageText",
        type = "String",
        defaultValue = "-"
)
@NiagaraProperty(
        name = "note",
        type = "String",
        defaultValue = "-"
)
public class BMessageTrendRecord
        extends BHistoryRecord
        implements JSONSupport
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.history.records.BMessageTrendRecord(2248826820)1.0$ @*/
/* Generated Wed Apr 11 14:00:05 CST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "time"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code time} property.
   * @see #getTime
   * @see #setTime
   */
  public static final Property time = newProperty(0, BAbsTime.now(), null);
  
  /**
   * Get the {@code time} property.
   * @see #time
   */
  public BAbsTime getTime() { return (BAbsTime)get(time); }
  
  /**
   * Set the {@code time} property.
   * @see #time
   */
  public void setTime(BAbsTime v) { set(time, v, null); }

////////////////////////////////////////////////////////////////
// Property "messageType"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code messageType} property.
   * @see #getMessageType
   * @see #setMessageType
   */
  public static final Property messageType = newProperty(0, "-", null);
  
  /**
   * Get the {@code messageType} property.
   * @see #messageType
   */
  public String getMessageType() { return getString(messageType); }
  
  /**
   * Set the {@code messageType} property.
   * @see #messageType
   */
  public void setMessageType(String v) { setString(messageType, v, null); }

////////////////////////////////////////////////////////////////
// Property "receiverName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code receiverName} property.
   * @see #getReceiverName
   * @see #setReceiverName
   */
  public static final Property receiverName = newProperty(0, "-", null);
  
  /**
   * Get the {@code receiverName} property.
   * @see #receiverName
   */
  public String getReceiverName() { return getString(receiverName); }
  
  /**
   * Set the {@code receiverName} property.
   * @see #receiverName
   */
  public void setReceiverName(String v) { setString(receiverName, v, null); }

////////////////////////////////////////////////////////////////
// Property "receiverAddress"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code receiverAddress} property.
   * @see #getReceiverAddress
   * @see #setReceiverAddress
   */
  public static final Property receiverAddress = newProperty(0, "-", null);
  
  /**
   * Get the {@code receiverAddress} property.
   * @see #receiverAddress
   */
  public String getReceiverAddress() { return getString(receiverAddress); }
  
  /**
   * Set the {@code receiverAddress} property.
   * @see #receiverAddress
   */
  public void setReceiverAddress(String v) { setString(receiverAddress, v, null); }

////////////////////////////////////////////////////////////////
// Property "messageText"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code messageText} property.
   * @see #getMessageText
   * @see #setMessageText
   */
  public static final Property messageText = newProperty(0, "-", null);
  
  /**
   * Get the {@code messageText} property.
   * @see #messageText
   */
  public String getMessageText() { return getString(messageText); }
  
  /**
   * Set the {@code messageText} property.
   * @see #messageText
   */
  public void setMessageText(String v) { setString(messageText, v, null); }

////////////////////////////////////////////////////////////////
// Property "note"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code note} property.
   * @see #getNote
   * @see #setNote
   */
  public static final Property note = newProperty(0, "-", null);
  
  /**
   * Get the {@code note} property.
   * @see #note
   */
  public String getNote() { return getString(note); }
  
  /**
   * Set the {@code note} property.
   * @see #note
   */
  public void setNote(String v) { setString(note, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMessageTrendRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * Tests whether this record type has a fixed size. BAlarmTrendRecord have a variable size.
     * @see BHistoryRecord#isFixedSize()
     */
    @Override
    public boolean isFixedSize() { return false; }

    /**
     * Read the type specific fields from the specified input.
     * @see javax.baja.history.BTrendRecord#doReadTrend(DataInput)
     */
    @Override
    public void doRead(DataInput in) throws IOException {
        this.setTime(BAbsTime.make(in.readLong()));
        this.setMessageType(in.readUTF());
        this.setReceiverName(in.readUTF());
        this.setReceiverAddress(in.readUTF());
        this.setMessageText(in.readUTF());
        this.setNote(in.readUTF());
    }

    /**
     * Write the type specific fields to the specified output.
     * @see javax.baja.history.BTrendRecord#doWriteTrend(DataOutput)
     */
    @Override
    public void doWrite(DataOutput out) throws IOException {
        out.writeLong(this.getTime().getMillis());
        out.writeUTF(this.getMessageType());
        out.writeUTF(this.getReceiverName());
        out.writeUTF(this.getReceiverAddress());
        out.writeUTF(this.getMessageText());
        out.writeUTF(this.getNote());
    }

    /**
     * @see javax.baja.history.BTrendRecord#getValueProperty()
     */
    public Property getValueProperty() {
        return null;
    }

    /**
     * Set the values in this record.
     * @return Returns this instance with the new values set.
     */
    public BMessageTrendRecord set(BAbsTime timestamp,
                                   String msgType,
                                   String receiver,
                                   String msgToAddress,
                                   String text,
                                   String note) {
        this.setTime(timestamp);
        this.setMessageType(msgType);
        this.setReceiverName(receiver);
        this.setReceiverAddress(msgToAddress);
        this.setMessageText(text);
        this.setNote(note);
        return this;
    }

    /**
     * make a readable string of this record
     * @see BHistoryRecord#toString(Context)
     */
    @Override
    public String toString(Context ctx) {
        StringBuffer s = new StringBuffer(64);
        s.append(super.toString(ctx));
        s.append(" timeStamp=");
        s.append(this.getTime());
        s.append(" to=");
        s.append(this.getReceiverName());
        s.append("[");
        s.append(this.getReceiverAddress());
        s.append("](");
        s.append(this.getMessageType());
        s.append(")");
        return s.toString();
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
        jsonObj.put(this.getLexicon().get("api.json.message.timeStamp.mills"), this.getTime().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.message.type"), this.getMessageType());
        jsonObj.put(this.getLexicon().get("api.json.message.receiver.name"), this.getReceiverName());
        jsonObj.put(this.getLexicon().get("api.json.message.receiver.address"), this.getReceiverAddress());
        jsonObj.put(this.getLexicon().get("api.json.message.text"), this.getMessageText());
        jsonObj.put(this.getLexicon().get("api.json.message.note"), this.getNote());
        return jsonObj;
    }

}
