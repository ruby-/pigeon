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
public class TUserGroupInfo implements org.apache.thrift.TBase<TUserGroupInfo, TUserGroupInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TUserGroupInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUserGroupInfo");

  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("group", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PRIORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("priority", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TUserGroupInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TUserGroupInfoTupleSchemeFactory());
  }

  public String user; // required
  public String group; // required
  public int priority; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER((short)1, "user"),
    GROUP((short)2, "group"),
    PRIORITY((short)3, "priority");

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
        case 1: // USER
          return USER;
        case 2: // GROUP
          return GROUP;
        case 3: // PRIORITY
          return PRIORITY;
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
  private static final int __PRIORITY_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUP, new org.apache.thrift.meta_data.FieldMetaData("group", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRIORITY, new org.apache.thrift.meta_data.FieldMetaData("priority", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUserGroupInfo.class, metaDataMap);
  }

  public TUserGroupInfo() {
  }

  public TUserGroupInfo(
    String user,
    String group,
    int priority)
  {
    this();
    this.user = user;
    this.group = group;
    this.priority = priority;
    setPriorityIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUserGroupInfo(TUserGroupInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetGroup()) {
      this.group = other.group;
    }
    this.priority = other.priority;
  }

  public TUserGroupInfo deepCopy() {
    return new TUserGroupInfo(this);
  }

  @Override
  public void clear() {
    this.user = null;
    this.group = null;
    setPriorityIsSet(false);
    this.priority = 0;
  }

  public String getUser() {
    return this.user;
  }

  public TUserGroupInfo setUser(String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public String getGroup() {
    return this.group;
  }

  public TUserGroupInfo setGroup(String group) {
    this.group = group;
    return this;
  }

  public void unsetGroup() {
    this.group = null;
  }

  /** Returns true if field group is set (has been assigned a value) and false otherwise */
  public boolean isSetGroup() {
    return this.group != null;
  }

  public void setGroupIsSet(boolean value) {
    if (!value) {
      this.group = null;
    }
  }

  public int getPriority() {
    return this.priority;
  }

  public TUserGroupInfo setPriority(int priority) {
    this.priority = priority;
    setPriorityIsSet(true);
    return this;
  }

  public void unsetPriority() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  /** Returns true if field priority is set (has been assigned a value) and false otherwise */
  public boolean isSetPriority() {
    return EncodingUtils.testBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  public void setPriorityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRIORITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case GROUP:
      if (value == null) {
        unsetGroup();
      } else {
        setGroup((String)value);
      }
      break;

    case PRIORITY:
      if (value == null) {
        unsetPriority();
      } else {
        setPriority((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER:
      return getUser();

    case GROUP:
      return getGroup();

    case PRIORITY:
      return getPriority();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER:
      return isSetUser();
    case GROUP:
      return isSetGroup();
    case PRIORITY:
      return isSetPriority();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TUserGroupInfo)
      return this.equals((TUserGroupInfo)that);
    return false;
  }

  public boolean equals(TUserGroupInfo that) {
    if (that == null)
      return false;

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_group = true && this.isSetGroup();
    boolean that_present_group = true && that.isSetGroup();
    if (this_present_group || that_present_group) {
      if (!(this_present_group && that_present_group))
        return false;
      if (!this.group.equals(that.group))
        return false;
    }

    boolean this_present_priority = true;
    boolean that_present_priority = true;
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (this.priority != that.priority)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_user = true && (isSetUser());
    list.add(present_user);
    if (present_user)
      list.add(user);

    boolean present_group = true && (isSetGroup());
    list.add(present_group);
    if (present_group)
      list.add(group);

    boolean present_priority = true;
    list.add(present_priority);
    if (present_priority)
      list.add(priority);

    return list.hashCode();
  }

  @Override
  public int compareTo(TUserGroupInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroup()).compareTo(other.isSetGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.group, other.group);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriority()).compareTo(other.isSetPriority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriority()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priority, other.priority);
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
    StringBuilder sb = new StringBuilder("TUserGroupInfo(");
    boolean first = true;

    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("group:");
    if (this.group == null) {
      sb.append("null");
    } else {
      sb.append(this.group);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("priority:");
    sb.append(this.priority);
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

  private static class TUserGroupInfoStandardSchemeFactory implements SchemeFactory {
    public TUserGroupInfoStandardScheme getScheme() {
      return new TUserGroupInfoStandardScheme();
    }
  }

  private static class TUserGroupInfoStandardScheme extends StandardScheme<TUserGroupInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUserGroupInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.group = iprot.readString();
              struct.setGroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRIORITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priority = iprot.readI32();
              struct.setPriorityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUserGroupInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      if (struct.group != null) {
        oprot.writeFieldBegin(GROUP_FIELD_DESC);
        oprot.writeString(struct.group);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PRIORITY_FIELD_DESC);
      oprot.writeI32(struct.priority);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUserGroupInfoTupleSchemeFactory implements SchemeFactory {
    public TUserGroupInfoTupleScheme getScheme() {
      return new TUserGroupInfoTupleScheme();
    }
  }

  private static class TUserGroupInfoTupleScheme extends TupleScheme<TUserGroupInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUserGroupInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUser()) {
        optionals.set(0);
      }
      if (struct.isSetGroup()) {
        optionals.set(1);
      }
      if (struct.isSetPriority()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetGroup()) {
        oprot.writeString(struct.group);
      }
      if (struct.isSetPriority()) {
        oprot.writeI32(struct.priority);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUserGroupInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(1)) {
        struct.group = iprot.readString();
        struct.setGroupIsSet(true);
      }
      if (incoming.get(2)) {
        struct.priority = iprot.readI32();
        struct.setPriorityIsSet(true);
      }
    }
  }

}

