/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.utarlington.pigeon.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-10-02")
public class TTaskSpec implements org.apache.thrift.TBase<TTaskSpec, TTaskSpec._Fields>, java.io.Serializable, Cloneable, Comparable<TTaskSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTaskSpec");

  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PREFERENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("preference", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTaskSpecStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTaskSpecTupleSchemeFactory();

  public java.lang.String taskId; // required
  public TPlacementPreference preference; // required
  public java.nio.ByteBuffer message; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_ID((short)1, "taskId"),
    PREFERENCE((short)2, "preference"),
    MESSAGE((short)3, "message");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
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
        case 2: // PREFERENCE
          return PREFERENCE;
        case 3: // MESSAGE
          return MESSAGE;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PREFERENCE, new org.apache.thrift.meta_data.FieldMetaData("preference", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPlacementPreference.class)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTaskSpec.class, metaDataMap);
  }

  public TTaskSpec() {
  }

  public TTaskSpec(
    java.lang.String taskId,
    TPlacementPreference preference,
    java.nio.ByteBuffer message)
  {
    this();
    this.taskId = taskId;
    this.preference = preference;
    this.message = org.apache.thrift.TBaseHelper.copyBinary(message);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTaskSpec(TTaskSpec other) {
    if (other.isSetTaskId()) {
      this.taskId = other.taskId;
    }
    if (other.isSetPreference()) {
      this.preference = new TPlacementPreference(other.preference);
    }
    if (other.isSetMessage()) {
      this.message = org.apache.thrift.TBaseHelper.copyBinary(other.message);
    }
  }

  public TTaskSpec deepCopy() {
    return new TTaskSpec(this);
  }

  @Override
  public void clear() {
    this.taskId = null;
    this.preference = null;
    this.message = null;
  }

  public java.lang.String getTaskId() {
    return this.taskId;
  }

  public TTaskSpec setTaskId(java.lang.String taskId) {
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

  public TPlacementPreference getPreference() {
    return this.preference;
  }

  public TTaskSpec setPreference(TPlacementPreference preference) {
    this.preference = preference;
    return this;
  }

  public void unsetPreference() {
    this.preference = null;
  }

  /** Returns true if field preference is set (has been assigned a value) and false otherwise */
  public boolean isSetPreference() {
    return this.preference != null;
  }

  public void setPreferenceIsSet(boolean value) {
    if (!value) {
      this.preference = null;
    }
  }

  public byte[] getMessage() {
    setMessage(org.apache.thrift.TBaseHelper.rightSize(message));
    return message == null ? null : message.array();
  }

  public java.nio.ByteBuffer bufferForMessage() {
    return org.apache.thrift.TBaseHelper.copyBinary(message);
  }

  public TTaskSpec setMessage(byte[] message) {
    this.message = message == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(message.clone());
    return this;
  }

  public TTaskSpec setMessage(java.nio.ByteBuffer message) {
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((java.lang.String)value);
      }
      break;

    case PREFERENCE:
      if (value == null) {
        unsetPreference();
      } else {
        setPreference((TPlacementPreference)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        if (value instanceof byte[]) {
          setMessage((byte[])value);
        } else {
          setMessage((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return getTaskId();

    case PREFERENCE:
      return getPreference();

    case MESSAGE:
      return getMessage();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return isSetTaskId();
    case PREFERENCE:
      return isSetPreference();
    case MESSAGE:
      return isSetMessage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TTaskSpec)
      return this.equals((TTaskSpec)that);
    return false;
  }

  public boolean equals(TTaskSpec that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_taskId = true && this.isSetTaskId();
    boolean that_present_taskId = true && that.isSetTaskId();
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (!this.taskId.equals(that.taskId))
        return false;
    }

    boolean this_present_preference = true && this.isSetPreference();
    boolean that_present_preference = true && that.isSetPreference();
    if (this_present_preference || that_present_preference) {
      if (!(this_present_preference && that_present_preference))
        return false;
      if (!this.preference.equals(that.preference))
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

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTaskId()) ? 131071 : 524287);
    if (isSetTaskId())
      hashCode = hashCode * 8191 + taskId.hashCode();

    hashCode = hashCode * 8191 + ((isSetPreference()) ? 131071 : 524287);
    if (isSetPreference())
      hashCode = hashCode * 8191 + preference.hashCode();

    hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
    if (isSetMessage())
      hashCode = hashCode * 8191 + message.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTaskSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTaskId()).compareTo(other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPreference()).compareTo(other.isSetPreference());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreference()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.preference, other.preference);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTaskSpec(");
    boolean first = true;

    sb.append("taskId:");
    if (this.taskId == null) {
      sb.append("null");
    } else {
      sb.append(this.taskId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("preference:");
    if (this.preference == null) {
      sb.append("null");
    } else {
      sb.append(this.preference);
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (preference != null) {
      preference.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTaskSpecStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTaskSpecStandardScheme getScheme() {
      return new TTaskSpecStandardScheme();
    }
  }

  private static class TTaskSpecStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTaskSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTaskSpec struct) throws org.apache.thrift.TException {
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
          case 2: // PREFERENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.preference = new TPlacementPreference();
              struct.preference.read(iprot);
              struct.setPreferenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readBinary();
              struct.setMessageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTaskSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.taskId != null) {
        oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
        oprot.writeString(struct.taskId);
        oprot.writeFieldEnd();
      }
      if (struct.preference != null) {
        oprot.writeFieldBegin(PREFERENCE_FIELD_DESC);
        struct.preference.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeBinary(struct.message);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTaskSpecTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTaskSpecTupleScheme getScheme() {
      return new TTaskSpecTupleScheme();
    }
  }

  private static class TTaskSpecTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTaskSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTaskSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTaskId()) {
        optionals.set(0);
      }
      if (struct.isSetPreference()) {
        optionals.set(1);
      }
      if (struct.isSetMessage()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTaskId()) {
        oprot.writeString(struct.taskId);
      }
      if (struct.isSetPreference()) {
        struct.preference.write(oprot);
      }
      if (struct.isSetMessage()) {
        oprot.writeBinary(struct.message);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTaskSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.taskId = iprot.readString();
        struct.setTaskIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.preference = new TPlacementPreference();
        struct.preference.read(iprot);
        struct.setPreferenceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.message = iprot.readBinary();
        struct.setMessageIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

