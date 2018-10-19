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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-10-18")
public class BackendService {

  public interface Iface {

    public void launchTask(ByteBuffer message, edu.utarlington.pigeon.thrift.TFullTaskId taskId, edu.utarlington.pigeon.thrift.TUserGroupInfo user) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void launchTask(ByteBuffer message, edu.utarlington.pigeon.thrift.TFullTaskId taskId, edu.utarlington.pigeon.thrift.TUserGroupInfo user, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void launchTask(ByteBuffer message, edu.utarlington.pigeon.thrift.TFullTaskId taskId, edu.utarlington.pigeon.thrift.TUserGroupInfo user) throws org.apache.thrift.TException
    {
      send_launchTask(message, taskId, user);
      recv_launchTask();
    }

    public void send_launchTask(ByteBuffer message, edu.utarlington.pigeon.thrift.TFullTaskId taskId, edu.utarlington.pigeon.thrift.TUserGroupInfo user) throws org.apache.thrift.TException
    {
      launchTask_args args = new launchTask_args();
      args.setMessage(message);
      args.setTaskId(taskId);
      args.setUser(user);
      sendBase("launchTask", args);
    }

    public void recv_launchTask() throws org.apache.thrift.TException
    {
      launchTask_result result = new launchTask_result();
      receiveBase(result, "launchTask");
      return;
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void launchTask(ByteBuffer message, edu.utarlington.pigeon.thrift.TFullTaskId taskId, edu.utarlington.pigeon.thrift.TUserGroupInfo user, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      launchTask_call method_call = new launchTask_call(message, taskId, user, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class launchTask_call extends org.apache.thrift.async.TAsyncMethodCall {
      private ByteBuffer message;
      private edu.utarlington.pigeon.thrift.TFullTaskId taskId;
      private edu.utarlington.pigeon.thrift.TUserGroupInfo user;
      public launchTask_call(ByteBuffer message, edu.utarlington.pigeon.thrift.TFullTaskId taskId, edu.utarlington.pigeon.thrift.TUserGroupInfo user, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.message = message;
        this.taskId = taskId;
        this.user = user;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("launchTask", org.apache.thrift.protocol.TMessageType.CALL, 0));
        launchTask_args args = new launchTask_args();
        args.setMessage(message);
        args.setTaskId(taskId);
        args.setUser(user);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        (new Client(prot)).recv_launchTask();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("launchTask", new launchTask());
      return processMap;
    }

    public static class launchTask<I extends Iface> extends org.apache.thrift.ProcessFunction<I, launchTask_args> {
      public launchTask() {
        super("launchTask");
      }

      public launchTask_args getEmptyArgsInstance() {
        return new launchTask_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public launchTask_result getResult(I iface, launchTask_args args) throws org.apache.thrift.TException {
        launchTask_result result = new launchTask_result();
        iface.launchTask(args.message, args.taskId, args.user);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("launchTask", new launchTask());
      return processMap;
    }

    public static class launchTask<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, launchTask_args, Void> {
      public launchTask() {
        super("launchTask");
      }

      public launchTask_args getEmptyArgsInstance() {
        return new launchTask_args();
      }

      public AsyncMethodCallback<Void> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Void>() { 
          public void onComplete(Void o) {
            launchTask_result result = new launchTask_result();
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            launchTask_result result = new launchTask_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, launchTask_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws TException {
        iface.launchTask(args.message, args.taskId, args.user,resultHandler);
      }
    }

  }

  public static class launchTask_args implements org.apache.thrift.TBase<launchTask_args, launchTask_args._Fields>, java.io.Serializable, Cloneable, Comparable<launchTask_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("launchTask_args");

    private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
    private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRUCT, (short)3);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new launchTask_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new launchTask_argsTupleSchemeFactory());
    }

    public ByteBuffer message; // required
    public edu.utarlington.pigeon.thrift.TFullTaskId taskId; // required
    public edu.utarlington.pigeon.thrift.TUserGroupInfo user; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      MESSAGE((short)1, "message"),
      TASK_ID((short)2, "taskId"),
      USER((short)3, "user");

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
          case 1: // MESSAGE
            return MESSAGE;
          case 2: // TASK_ID
            return TASK_ID;
          case 3: // USER
            return USER;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING          , true)));
      tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.utarlington.pigeon.thrift.TFullTaskId.class)));
      tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.utarlington.pigeon.thrift.TUserGroupInfo.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(launchTask_args.class, metaDataMap);
    }

    public launchTask_args() {
    }

    public launchTask_args(
      ByteBuffer message,
      edu.utarlington.pigeon.thrift.TFullTaskId taskId,
      edu.utarlington.pigeon.thrift.TUserGroupInfo user)
    {
      this();
      this.message = org.apache.thrift.TBaseHelper.copyBinary(message);
      this.taskId = taskId;
      this.user = user;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public launchTask_args(launchTask_args other) {
      if (other.isSetMessage()) {
        this.message = org.apache.thrift.TBaseHelper.copyBinary(other.message);
      }
      if (other.isSetTaskId()) {
        this.taskId = new edu.utarlington.pigeon.thrift.TFullTaskId(other.taskId);
      }
      if (other.isSetUser()) {
        this.user = new edu.utarlington.pigeon.thrift.TUserGroupInfo(other.user);
      }
    }

    public launchTask_args deepCopy() {
      return new launchTask_args(this);
    }

    @Override
    public void clear() {
      this.message = null;
      this.taskId = null;
      this.user = null;
    }

    public byte[] getMessage() {
      setMessage(org.apache.thrift.TBaseHelper.rightSize(message));
      return message == null ? null : message.array();
    }

    public ByteBuffer bufferForMessage() {
      return org.apache.thrift.TBaseHelper.copyBinary(message);
    }

    public launchTask_args setMessage(byte[] message) {
      this.message = message == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(message, message.length));
      return this;
    }

    public launchTask_args setMessage(ByteBuffer message) {
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

    public edu.utarlington.pigeon.thrift.TFullTaskId getTaskId() {
      return this.taskId;
    }

    public launchTask_args setTaskId(edu.utarlington.pigeon.thrift.TFullTaskId taskId) {
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

    public edu.utarlington.pigeon.thrift.TUserGroupInfo getUser() {
      return this.user;
    }

    public launchTask_args setUser(edu.utarlington.pigeon.thrift.TUserGroupInfo user) {
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

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case MESSAGE:
        if (value == null) {
          unsetMessage();
        } else {
          setMessage((ByteBuffer)value);
        }
        break;

      case TASK_ID:
        if (value == null) {
          unsetTaskId();
        } else {
          setTaskId((edu.utarlington.pigeon.thrift.TFullTaskId)value);
        }
        break;

      case USER:
        if (value == null) {
          unsetUser();
        } else {
          setUser((edu.utarlington.pigeon.thrift.TUserGroupInfo)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case MESSAGE:
        return getMessage();

      case TASK_ID:
        return getTaskId();

      case USER:
        return getUser();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case MESSAGE:
        return isSetMessage();
      case TASK_ID:
        return isSetTaskId();
      case USER:
        return isSetUser();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof launchTask_args)
        return this.equals((launchTask_args)that);
      return false;
    }

    public boolean equals(launchTask_args that) {
      if (that == null)
        return false;

      boolean this_present_message = true && this.isSetMessage();
      boolean that_present_message = true && that.isSetMessage();
      if (this_present_message || that_present_message) {
        if (!(this_present_message && that_present_message))
          return false;
        if (!this.message.equals(that.message))
          return false;
      }

      boolean this_present_taskId = true && this.isSetTaskId();
      boolean that_present_taskId = true && that.isSetTaskId();
      if (this_present_taskId || that_present_taskId) {
        if (!(this_present_taskId && that_present_taskId))
          return false;
        if (!this.taskId.equals(that.taskId))
          return false;
      }

      boolean this_present_user = true && this.isSetUser();
      boolean that_present_user = true && that.isSetUser();
      if (this_present_user || that_present_user) {
        if (!(this_present_user && that_present_user))
          return false;
        if (!this.user.equals(that.user))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_message = true && (isSetMessage());
      list.add(present_message);
      if (present_message)
        list.add(message);

      boolean present_taskId = true && (isSetTaskId());
      list.add(present_taskId);
      if (present_taskId)
        list.add(taskId);

      boolean present_user = true && (isSetUser());
      list.add(present_user);
      if (present_user)
        list.add(user);

      return list.hashCode();
    }

    @Override
    public int compareTo(launchTask_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

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
      StringBuilder sb = new StringBuilder("launchTask_args(");
      boolean first = true;

      sb.append("message:");
      if (this.message == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.message, sb);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("taskId:");
      if (this.taskId == null) {
        sb.append("null");
      } else {
        sb.append(this.taskId);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("user:");
      if (this.user == null) {
        sb.append("null");
      } else {
        sb.append(this.user);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (taskId != null) {
        taskId.validate();
      }
      if (user != null) {
        user.validate();
      }
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class launchTask_argsStandardSchemeFactory implements SchemeFactory {
      public launchTask_argsStandardScheme getScheme() {
        return new launchTask_argsStandardScheme();
      }
    }

    private static class launchTask_argsStandardScheme extends StandardScheme<launchTask_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, launchTask_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // MESSAGE
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.message = iprot.readBinary();
                struct.setMessageIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // TASK_ID
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.taskId = new edu.utarlington.pigeon.thrift.TFullTaskId();
                struct.taskId.read(iprot);
                struct.setTaskIdIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 3: // USER
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.user = new edu.utarlington.pigeon.thrift.TUserGroupInfo();
                struct.user.read(iprot);
                struct.setUserIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, launchTask_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.message != null) {
          oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
          oprot.writeBinary(struct.message);
          oprot.writeFieldEnd();
        }
        if (struct.taskId != null) {
          oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
          struct.taskId.write(oprot);
          oprot.writeFieldEnd();
        }
        if (struct.user != null) {
          oprot.writeFieldBegin(USER_FIELD_DESC);
          struct.user.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class launchTask_argsTupleSchemeFactory implements SchemeFactory {
      public launchTask_argsTupleScheme getScheme() {
        return new launchTask_argsTupleScheme();
      }
    }

    private static class launchTask_argsTupleScheme extends TupleScheme<launchTask_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, launchTask_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetMessage()) {
          optionals.set(0);
        }
        if (struct.isSetTaskId()) {
          optionals.set(1);
        }
        if (struct.isSetUser()) {
          optionals.set(2);
        }
        oprot.writeBitSet(optionals, 3);
        if (struct.isSetMessage()) {
          oprot.writeBinary(struct.message);
        }
        if (struct.isSetTaskId()) {
          struct.taskId.write(oprot);
        }
        if (struct.isSetUser()) {
          struct.user.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, launchTask_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(3);
        if (incoming.get(0)) {
          struct.message = iprot.readBinary();
          struct.setMessageIsSet(true);
        }
        if (incoming.get(1)) {
          struct.taskId = new edu.utarlington.pigeon.thrift.TFullTaskId();
          struct.taskId.read(iprot);
          struct.setTaskIdIsSet(true);
        }
        if (incoming.get(2)) {
          struct.user = new edu.utarlington.pigeon.thrift.TUserGroupInfo();
          struct.user.read(iprot);
          struct.setUserIsSet(true);
        }
      }
    }

  }

  public static class launchTask_result implements org.apache.thrift.TBase<launchTask_result, launchTask_result._Fields>, java.io.Serializable, Cloneable, Comparable<launchTask_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("launchTask_result");


    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new launchTask_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new launchTask_resultTupleSchemeFactory());
    }


    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
;

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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(launchTask_result.class, metaDataMap);
    }

    public launchTask_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public launchTask_result(launchTask_result other) {
    }

    public launchTask_result deepCopy() {
      return new launchTask_result(this);
    }

    @Override
    public void clear() {
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof launchTask_result)
        return this.equals((launchTask_result)that);
      return false;
    }

    public boolean equals(launchTask_result that) {
      if (that == null)
        return false;

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      return list.hashCode();
    }

    @Override
    public int compareTo(launchTask_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

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
      StringBuilder sb = new StringBuilder("launchTask_result(");
      boolean first = true;

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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class launchTask_resultStandardSchemeFactory implements SchemeFactory {
      public launchTask_resultStandardScheme getScheme() {
        return new launchTask_resultStandardScheme();
      }
    }

    private static class launchTask_resultStandardScheme extends StandardScheme<launchTask_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, launchTask_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, launchTask_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class launchTask_resultTupleSchemeFactory implements SchemeFactory {
      public launchTask_resultTupleScheme getScheme() {
        return new launchTask_resultTupleScheme();
      }
    }

    private static class launchTask_resultTupleScheme extends TupleScheme<launchTask_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, launchTask_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, launchTask_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
      }
    }

  }

}
