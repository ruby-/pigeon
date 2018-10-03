/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.utarlington.pigeon.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-10-02")
public class SchedulerStateStoreService {

  public interface Iface {

    public void updateNodeState(java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void updateNodeState(java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException;

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

    public void updateNodeState(java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot) throws org.apache.thrift.TException
    {
      send_updateNodeState(snapshot);
      recv_updateNodeState();
    }

    public void send_updateNodeState(java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot) throws org.apache.thrift.TException
    {
      updateNodeState_args args = new updateNodeState_args();
      args.setSnapshot(snapshot);
      sendBase("updateNodeState", args);
    }

    public void recv_updateNodeState() throws org.apache.thrift.TException
    {
      updateNodeState_result result = new updateNodeState_result();
      receiveBase(result, "updateNodeState");
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

    public void updateNodeState(java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      updateNodeState_call method_call = new updateNodeState_call(snapshot, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class updateNodeState_call extends org.apache.thrift.async.TAsyncMethodCall<Void> {
      private java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot;
      public updateNodeState_call(java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.snapshot = snapshot;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("updateNodeState", org.apache.thrift.protocol.TMessageType.CALL, 0));
        updateNodeState_args args = new updateNodeState_args();
        args.setSnapshot(snapshot);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public Void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new java.lang.IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return null;
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> java.util.Map<java.lang.String,  org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> getProcessMap(java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("updateNodeState", new updateNodeState());
      return processMap;
    }

    public static class updateNodeState<I extends Iface> extends org.apache.thrift.ProcessFunction<I, updateNodeState_args> {
      public updateNodeState() {
        super("updateNodeState");
      }

      public updateNodeState_args getEmptyArgsInstance() {
        return new updateNodeState_args();
      }

      protected boolean isOneway() {
        return false;
      }

      @Override
      protected boolean handleRuntimeExceptions() {
        return false;
      }

      public updateNodeState_result getResult(I iface, updateNodeState_args args) throws org.apache.thrift.TException {
        updateNodeState_result result = new updateNodeState_result();
        iface.updateNodeState(args.snapshot);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("updateNodeState", new updateNodeState());
      return processMap;
    }

    public static class updateNodeState<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, updateNodeState_args, Void> {
      public updateNodeState() {
        super("updateNodeState");
      }

      public updateNodeState_args getEmptyArgsInstance() {
        return new updateNodeState_args();
      }

      public org.apache.thrift.async.AsyncMethodCallback<Void> getResultHandler(final org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new org.apache.thrift.async.AsyncMethodCallback<Void>() { 
          public void onComplete(Void o) {
            updateNodeState_result result = new updateNodeState_result();
            try {
              fcall.sendResponse(fb, result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
            } catch (org.apache.thrift.transport.TTransportException e) {
              _LOGGER.error("TTransportException writing to internal frame buffer", e);
              fb.close();
            } catch (java.lang.Exception e) {
              _LOGGER.error("Exception writing to internal frame buffer", e);
              onError(e);
            }
          }
          public void onError(java.lang.Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TSerializable msg;
            updateNodeState_result result = new updateNodeState_result();
            if (e instanceof org.apache.thrift.transport.TTransportException) {
              _LOGGER.error("TTransportException inside handler", e);
              fb.close();
              return;
            } else if (e instanceof org.apache.thrift.TApplicationException) {
              _LOGGER.error("TApplicationException inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TApplicationException)e;
            } else {
              _LOGGER.error("Exception inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
            } catch (java.lang.Exception ex) {
              _LOGGER.error("Exception writing to internal frame buffer", ex);
              fb.close();
            }
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, updateNodeState_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException {
        iface.updateNodeState(args.snapshot,resultHandler);
      }
    }

  }

  public static class updateNodeState_args implements org.apache.thrift.TBase<updateNodeState_args, updateNodeState_args._Fields>, java.io.Serializable, Cloneable, Comparable<updateNodeState_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("updateNodeState_args");

    private static final org.apache.thrift.protocol.TField SNAPSHOT_FIELD_DESC = new org.apache.thrift.protocol.TField("snapshot", org.apache.thrift.protocol.TType.MAP, (short)1);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new updateNodeState_argsStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new updateNodeState_argsTupleSchemeFactory();

    public java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SNAPSHOT((short)1, "snapshot");

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
          case 1: // SNAPSHOT
            return SNAPSHOT;
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
      tmpMap.put(_Fields.SNAPSHOT, new org.apache.thrift.meta_data.FieldMetaData("snapshot", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
              new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
              new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.utarlington.pigeon.thrift.TNodeState.class))));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(updateNodeState_args.class, metaDataMap);
    }

    public updateNodeState_args() {
    }

    public updateNodeState_args(
      java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot)
    {
      this();
      this.snapshot = snapshot;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public updateNodeState_args(updateNodeState_args other) {
      if (other.isSetSnapshot()) {
        java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> __this__snapshot = new java.util.HashMap<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState>(other.snapshot.size());
        for (java.util.Map.Entry<java.lang.String, edu.utarlington.pigeon.thrift.TNodeState> other_element : other.snapshot.entrySet()) {

          java.lang.String other_element_key = other_element.getKey();
          edu.utarlington.pigeon.thrift.TNodeState other_element_value = other_element.getValue();

          java.lang.String __this__snapshot_copy_key = other_element_key;

          edu.utarlington.pigeon.thrift.TNodeState __this__snapshot_copy_value = new edu.utarlington.pigeon.thrift.TNodeState(other_element_value);

          __this__snapshot.put(__this__snapshot_copy_key, __this__snapshot_copy_value);
        }
        this.snapshot = __this__snapshot;
      }
    }

    public updateNodeState_args deepCopy() {
      return new updateNodeState_args(this);
    }

    @Override
    public void clear() {
      this.snapshot = null;
    }

    public int getSnapshotSize() {
      return (this.snapshot == null) ? 0 : this.snapshot.size();
    }

    public void putToSnapshot(java.lang.String key, edu.utarlington.pigeon.thrift.TNodeState val) {
      if (this.snapshot == null) {
        this.snapshot = new java.util.HashMap<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState>();
      }
      this.snapshot.put(key, val);
    }

    public java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> getSnapshot() {
      return this.snapshot;
    }

    public updateNodeState_args setSnapshot(java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState> snapshot) {
      this.snapshot = snapshot;
      return this;
    }

    public void unsetSnapshot() {
      this.snapshot = null;
    }

    /** Returns true if field snapshot is set (has been assigned a value) and false otherwise */
    public boolean isSetSnapshot() {
      return this.snapshot != null;
    }

    public void setSnapshotIsSet(boolean value) {
      if (!value) {
        this.snapshot = null;
      }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
      switch (field) {
      case SNAPSHOT:
        if (value == null) {
          unsetSnapshot();
        } else {
          setSnapshot((java.util.Map<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState>)value);
        }
        break;

      }
    }

    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      case SNAPSHOT:
        return getSnapshot();

      }
      throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new java.lang.IllegalArgumentException();
      }

      switch (field) {
      case SNAPSHOT:
        return isSetSnapshot();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof updateNodeState_args)
        return this.equals((updateNodeState_args)that);
      return false;
    }

    public boolean equals(updateNodeState_args that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_snapshot = true && this.isSetSnapshot();
      boolean that_present_snapshot = true && that.isSetSnapshot();
      if (this_present_snapshot || that_present_snapshot) {
        if (!(this_present_snapshot && that_present_snapshot))
          return false;
        if (!this.snapshot.equals(that.snapshot))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((isSetSnapshot()) ? 131071 : 524287);
      if (isSetSnapshot())
        hashCode = hashCode * 8191 + snapshot.hashCode();

      return hashCode;
    }

    @Override
    public int compareTo(updateNodeState_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = java.lang.Boolean.valueOf(isSetSnapshot()).compareTo(other.isSetSnapshot());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSnapshot()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.snapshot, other.snapshot);
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
      java.lang.StringBuilder sb = new java.lang.StringBuilder("updateNodeState_args(");
      boolean first = true;

      sb.append("snapshot:");
      if (this.snapshot == null) {
        sb.append("null");
      } else {
        sb.append(this.snapshot);
      }
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

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class updateNodeState_argsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public updateNodeState_argsStandardScheme getScheme() {
        return new updateNodeState_argsStandardScheme();
      }
    }

    private static class updateNodeState_argsStandardScheme extends org.apache.thrift.scheme.StandardScheme<updateNodeState_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, updateNodeState_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // SNAPSHOT
              if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
                {
                  org.apache.thrift.protocol.TMap _map16 = iprot.readMapBegin();
                  struct.snapshot = new java.util.HashMap<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState>(2*_map16.size);
                  java.lang.String _key17;
                  edu.utarlington.pigeon.thrift.TNodeState _val18;
                  for (int _i19 = 0; _i19 < _map16.size; ++_i19)
                  {
                    _key17 = iprot.readString();
                    _val18 = new edu.utarlington.pigeon.thrift.TNodeState();
                    _val18.read(iprot);
                    struct.snapshot.put(_key17, _val18);
                  }
                  iprot.readMapEnd();
                }
                struct.setSnapshotIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, updateNodeState_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.snapshot != null) {
          oprot.writeFieldBegin(SNAPSHOT_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.snapshot.size()));
            for (java.util.Map.Entry<java.lang.String, edu.utarlington.pigeon.thrift.TNodeState> _iter20 : struct.snapshot.entrySet())
            {
              oprot.writeString(_iter20.getKey());
              _iter20.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class updateNodeState_argsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public updateNodeState_argsTupleScheme getScheme() {
        return new updateNodeState_argsTupleScheme();
      }
    }

    private static class updateNodeState_argsTupleScheme extends org.apache.thrift.scheme.TupleScheme<updateNodeState_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, updateNodeState_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetSnapshot()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSnapshot()) {
          {
            oprot.writeI32(struct.snapshot.size());
            for (java.util.Map.Entry<java.lang.String, edu.utarlington.pigeon.thrift.TNodeState> _iter21 : struct.snapshot.entrySet())
            {
              oprot.writeString(_iter21.getKey());
              _iter21.getValue().write(oprot);
            }
          }
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, updateNodeState_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          {
            org.apache.thrift.protocol.TMap _map22 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            struct.snapshot = new java.util.HashMap<java.lang.String,edu.utarlington.pigeon.thrift.TNodeState>(2*_map22.size);
            java.lang.String _key23;
            edu.utarlington.pigeon.thrift.TNodeState _val24;
            for (int _i25 = 0; _i25 < _map22.size; ++_i25)
            {
              _key23 = iprot.readString();
              _val24 = new edu.utarlington.pigeon.thrift.TNodeState();
              _val24.read(iprot);
              struct.snapshot.put(_key23, _val24);
            }
          }
          struct.setSnapshotIsSet(true);
        }
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

  public static class updateNodeState_result implements org.apache.thrift.TBase<updateNodeState_result, updateNodeState_result._Fields>, java.io.Serializable, Cloneable, Comparable<updateNodeState_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("updateNodeState_result");


    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new updateNodeState_resultStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new updateNodeState_resultTupleSchemeFactory();


    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
;

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
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(updateNodeState_result.class, metaDataMap);
    }

    public updateNodeState_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public updateNodeState_result(updateNodeState_result other) {
    }

    public updateNodeState_result deepCopy() {
      return new updateNodeState_result(this);
    }

    @Override
    public void clear() {
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
      switch (field) {
      }
    }

    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      }
      throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new java.lang.IllegalArgumentException();
      }

      switch (field) {
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof updateNodeState_result)
        return this.equals((updateNodeState_result)that);
      return false;
    }

    public boolean equals(updateNodeState_result that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      return hashCode;
    }

    @Override
    public int compareTo(updateNodeState_result other) {
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
      scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      scheme(oprot).write(oprot, this);
      }

    @Override
    public java.lang.String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder("updateNodeState_result(");
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

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class updateNodeState_resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public updateNodeState_resultStandardScheme getScheme() {
        return new updateNodeState_resultStandardScheme();
      }
    }

    private static class updateNodeState_resultStandardScheme extends org.apache.thrift.scheme.StandardScheme<updateNodeState_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, updateNodeState_result struct) throws org.apache.thrift.TException {
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, updateNodeState_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class updateNodeState_resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public updateNodeState_resultTupleScheme getScheme() {
        return new updateNodeState_resultTupleScheme();
      }
    }

    private static class updateNodeState_resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<updateNodeState_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, updateNodeState_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, updateNodeState_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

}
