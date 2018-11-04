/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.utarlington.pigeon.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-11-01")
public class TTaskLaunchSpec implements org.apache.thrift.TBase<TTaskLaunchSpec, TTaskLaunchSpec._Fields>, java.io.Serializable, Cloneable, Comparable<TTaskLaunchSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTaskLaunchSpec");

  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IS_HT_FIELD_DESC = new org.apache.thrift.protocol.TField("isHT", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTaskLaunchSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTaskLaunchSpecTupleSchemeFactory());
  }

  public String taskId; // required
  public ByteBuffer message; // required
  public boolean isHT; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_ID((short)1, "taskId"),
    MESSAGE((short)2, "message"),
    IS_HT((short)3, "isHT");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // MESSAGE
          return MESSAGE;
        case 3: // IS_HT
          return IS_HT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISHT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.IS_HT, new org.apache.thrift.meta_data.FieldMetaData("isHT", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTaskLaunchSpec.class, metaDataMap);
  }

  public TTaskLaunchSpec() {
  }

  public TTaskLaunchSpec(
    String taskId,
    ByteBuffer message,
    boolean isHT)
  {
    this();
    this.taskId = taskId;
    this.message = org.apache.thrift.TBaseHelper.copyBinary(message);
    this.isHT = isHT;
    setIsHTIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTaskLaunchSpec(TTaskLaunchSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTaskId()) {
      this.taskId = other.taskId;
    }
    if (other.isSetMessage()) {
      this.message = org.apache.thrift.TBaseHelper.copyBinary(other.message);
    }
    this.isHT = other.isHT;
  }

  public TTaskLaunchSpec deepCopy() {
    return new TTaskLaunchSpec(this);
  }

  @Override
  public void clear() {
    this.taskId = null;
    this.message = null;
    setIsHTIsSet(false);
    this.isHT = false;
  }

  public String getTaskId() {
    return this.taskId;
  }

  public TTaskLaunchSpec setTaskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  public void unsetTaskId() {
    this.taskId = null;
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return this.taskId != null;
  }

  public void setTaskIdIsSet(boolean value) {
    if (!value) {
      this.taskId = null;
    }
  }

  public byte[] getMessage() {
    setMessage(org.apache.thrift.TBaseHelper.rightSize(message));
    return message == null ? null : message.array();
  }

  public ByteBuffer bufferForMessage() {
    return org.apache.thrift.TBaseHelper.copyBinary(message);
  }

  public TTaskLaunchSpec setMessage(byte[] message) {
    this.message = message == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(message, message.length));
    return this;
  }

  public TTaskLaunchSpec setMessage(ByteBuffer message) {
    this.message = org.apache.thrift.TBaseHelper.copyBinary(message);
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public boolean isIsHT() {
    return this.isHT;
  }

  public TTaskLaunchSpec setIsHT(boolean isHT) {
    this.isHT = isHT;
    setIsHTIsSet(true);
    return this;
  }

  public void unsetIsHT() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISHT_ISSET_ID);
  }

  /** Returns true if field isHT is set (has been assigned a value) and false otherwise */
  public boolean isSetIsHT() {
    return EncodingUtils.testBit(__isset_bitfield, __ISHT_ISSET_ID);
  }

  public void setIsHTIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISHT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((ByteBuffer)value);
      }
      break;

    case IS_HT:
      if (value == null) {
        unsetIsHT();
      } else {
        setIsHT((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return getTaskId();

    case MESSAGE:
      return getMessage();

    case IS_HT:
      return isIsHT();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return isSetTaskId();
    case MESSAGE:
      return isSetMessage();
    case IS_HT:
      return isSetIsHT();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTaskLaunchSpec)
      return this.equals((TTaskLaunchSpec)that);
    return false;
  }

  public boolean equals(TTaskLaunchSpec that) {
    if (that == null)
      return false;

    boolean this_present_taskId = true && this.isSetTaskId();
    boolean that_present_taskId = true && that.isSetTaskId();
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (!this.taskId.equals(that.taskId))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_isHT = true;
    boolean that_present_isHT = true;
    if (this_present_isHT || that_present_isHT) {
      if (!(this_present_isHT && that_present_isHT))
        return false;
      if (this.isHT != that.isHT)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskId = true && (isSetTaskId());
    list.add(present_taskId);
    if (present_taskId)
      list.add(taskId);

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    boolean present_isHT = true;
    list.add(present_isHT);
    if (present_isHT)
      list.add(isHT);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTaskLaunchSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskId()).compareTo(other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsHT()).compareTo(other.isSetIsHT());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsHT()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isHT, other.isHT);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TTaskLaunchSpec(");
    boolean first = true;

    sb.append("taskId:");
    if (this.taskId == null) {
      sb.append("null");
    } else {
      sb.append(this.taskId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.message, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isHT:");
    sb.append(this.isHT);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTaskLaunchSpecStandardSchemeFactory implements SchemeFactory {
    public TTaskLaunchSpecStandardScheme getScheme() {
      return new TTaskLaunchSpecStandardScheme();
    }
  }

  private static class TTaskLaunchSpecStandardScheme extends StandardScheme<TTaskLaunchSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTaskLaunchSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.taskId = iprot.readString();
              struct.setTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readBinary();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_HT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isHT = iprot.readBool();
              struct.setIsHTIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTaskLaunchSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.taskId != null) {
        oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
        oprot.writeString(struct.taskId);
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeBinary(struct.message);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_HT_FIELD_DESC);
      oprot.writeBool(struct.isHT);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTaskLaunchSpecTupleSchemeFactory implements SchemeFactory {
    public TTaskLaunchSpecTupleScheme getScheme() {
      return new TTaskLaunchSpecTupleScheme();
    }
  }

  private static class TTaskLaunchSpecTupleScheme extends TupleScheme<TTaskLaunchSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTaskLaunchSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTaskId()) {
        optionals.set(0);
      }
      if (struct.isSetMessage()) {
        optionals.set(1);
      }
      if (struct.isSetIsHT()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTaskId()) {
        oprot.writeString(struct.taskId);
      }
      if (struct.isSetMessage()) {
        oprot.writeBinary(struct.message);
      }
      if (struct.isSetIsHT()) {
        oprot.writeBool(struct.isHT);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTaskLaunchSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.taskId = iprot.readString();
        struct.setTaskIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.message = iprot.readBinary();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.isHT = iprot.readBool();
        struct.setIsHTIsSet(true);
      }
    }
  }

}

