// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/explore.proto

package com.google.devtools.kythe.proto;

/**
 * <pre>
 * Requests the parameters and return value of the specified function
 * </pre>
 *
 * Protobuf type {@code kythe.proto.ParametersRequest}
 */
public  final class ParametersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kythe.proto.ParametersRequest)
    ParametersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ParametersRequest.newBuilder() to construct.
  private ParametersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ParametersRequest() {
    functionTickets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ParametersRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              functionTickets_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            functionTickets_.add(s);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        functionTickets_ = functionTickets_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ParametersRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ParametersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.kythe.proto.ParametersRequest.class, com.google.devtools.kythe.proto.ParametersRequest.Builder.class);
  }

  public static final int FUNCTION_TICKETS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList functionTickets_;
  /**
   * <code>repeated string function_tickets = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getFunctionTicketsList() {
    return functionTickets_;
  }
  /**
   * <code>repeated string function_tickets = 1;</code>
   */
  public int getFunctionTicketsCount() {
    return functionTickets_.size();
  }
  /**
   * <code>repeated string function_tickets = 1;</code>
   */
  public java.lang.String getFunctionTickets(int index) {
    return functionTickets_.get(index);
  }
  /**
   * <code>repeated string function_tickets = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFunctionTicketsBytes(int index) {
    return functionTickets_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < functionTickets_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, functionTickets_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < functionTickets_.size(); i++) {
        dataSize += computeStringSizeNoTag(functionTickets_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFunctionTicketsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.devtools.kythe.proto.ParametersRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.kythe.proto.ParametersRequest other = (com.google.devtools.kythe.proto.ParametersRequest) obj;

    boolean result = true;
    result = result && getFunctionTicketsList()
        .equals(other.getFunctionTicketsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFunctionTicketsCount() > 0) {
      hash = (37 * hash) + FUNCTION_TICKETS_FIELD_NUMBER;
      hash = (53 * hash) + getFunctionTicketsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.ParametersRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.devtools.kythe.proto.ParametersRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Requests the parameters and return value of the specified function
   * </pre>
   *
   * Protobuf type {@code kythe.proto.ParametersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kythe.proto.ParametersRequest)
      com.google.devtools.kythe.proto.ParametersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ParametersRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ParametersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.kythe.proto.ParametersRequest.class, com.google.devtools.kythe.proto.ParametersRequest.Builder.class);
    }

    // Construct using com.google.devtools.kythe.proto.ParametersRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      functionTickets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ParametersRequest_descriptor;
    }

    public com.google.devtools.kythe.proto.ParametersRequest getDefaultInstanceForType() {
      return com.google.devtools.kythe.proto.ParametersRequest.getDefaultInstance();
    }

    public com.google.devtools.kythe.proto.ParametersRequest build() {
      com.google.devtools.kythe.proto.ParametersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.kythe.proto.ParametersRequest buildPartial() {
      com.google.devtools.kythe.proto.ParametersRequest result = new com.google.devtools.kythe.proto.ParametersRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        functionTickets_ = functionTickets_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.functionTickets_ = functionTickets_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.kythe.proto.ParametersRequest) {
        return mergeFrom((com.google.devtools.kythe.proto.ParametersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.kythe.proto.ParametersRequest other) {
      if (other == com.google.devtools.kythe.proto.ParametersRequest.getDefaultInstance()) return this;
      if (!other.functionTickets_.isEmpty()) {
        if (functionTickets_.isEmpty()) {
          functionTickets_ = other.functionTickets_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFunctionTicketsIsMutable();
          functionTickets_.addAll(other.functionTickets_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.devtools.kythe.proto.ParametersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.kythe.proto.ParametersRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList functionTickets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFunctionTicketsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        functionTickets_ = new com.google.protobuf.LazyStringArrayList(functionTickets_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string function_tickets = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getFunctionTicketsList() {
      return functionTickets_.getUnmodifiableView();
    }
    /**
     * <code>repeated string function_tickets = 1;</code>
     */
    public int getFunctionTicketsCount() {
      return functionTickets_.size();
    }
    /**
     * <code>repeated string function_tickets = 1;</code>
     */
    public java.lang.String getFunctionTickets(int index) {
      return functionTickets_.get(index);
    }
    /**
     * <code>repeated string function_tickets = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFunctionTicketsBytes(int index) {
      return functionTickets_.getByteString(index);
    }
    /**
     * <code>repeated string function_tickets = 1;</code>
     */
    public Builder setFunctionTickets(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFunctionTicketsIsMutable();
      functionTickets_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string function_tickets = 1;</code>
     */
    public Builder addFunctionTickets(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFunctionTicketsIsMutable();
      functionTickets_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string function_tickets = 1;</code>
     */
    public Builder addAllFunctionTickets(
        java.lang.Iterable<java.lang.String> values) {
      ensureFunctionTicketsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, functionTickets_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string function_tickets = 1;</code>
     */
    public Builder clearFunctionTickets() {
      functionTickets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string function_tickets = 1;</code>
     */
    public Builder addFunctionTicketsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureFunctionTicketsIsMutable();
      functionTickets_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kythe.proto.ParametersRequest)
  }

  // @@protoc_insertion_point(class_scope:kythe.proto.ParametersRequest)
  private static final com.google.devtools.kythe.proto.ParametersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.kythe.proto.ParametersRequest();
  }

  public static com.google.devtools.kythe.proto.ParametersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParametersRequest>
      PARSER = new com.google.protobuf.AbstractParser<ParametersRequest>() {
    public ParametersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ParametersRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ParametersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParametersRequest> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.kythe.proto.ParametersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
