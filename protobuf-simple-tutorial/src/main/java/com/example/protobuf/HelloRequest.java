// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting.proto

package com.example.protobuf;

/**
 * Protobuf type {@code com.example.protobuf.HelloRequest}
 */
public  final class HelloRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.protobuf.HelloRequest)
    HelloRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloRequest.newBuilder() to construct.
  private HelloRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloRequest() {
    name_ = "";
    hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    sentiment_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HelloRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            age_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              hobbies_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            hobbies_.add(s);
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) != 0)) {
              bagOfTricks_ = com.google.protobuf.MapField.newMapField(
                  BagOfTricksDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000008;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            bagOfTricks__ = input.readMessage(
                BagOfTricksDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            bagOfTricks_.getMutableMap().put(
                bagOfTricks__.getKey(), bagOfTricks__.getValue());
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            sentiment_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        hobbies_ = hobbies_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.protobuf.Greeting.internal_static_com_example_protobuf_HelloRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetBagOfTricks();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.protobuf.Greeting.internal_static_com_example_protobuf_HelloRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.protobuf.HelloRequest.class, com.example.protobuf.HelloRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 2;
  private int age_;
  /**
   * <code>int32 age = 2;</code>
   */
  public int getAge() {
    return age_;
  }

  public static final int HOBBIES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList hobbies_;
  /**
   * <code>repeated string hobbies = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getHobbiesList() {
    return hobbies_;
  }
  /**
   * <code>repeated string hobbies = 3;</code>
   */
  public int getHobbiesCount() {
    return hobbies_.size();
  }
  /**
   * <code>repeated string hobbies = 3;</code>
   */
  public java.lang.String getHobbies(int index) {
    return hobbies_.get(index);
  }
  /**
   * <code>repeated string hobbies = 3;</code>
   */
  public com.google.protobuf.ByteString
      getHobbiesBytes(int index) {
    return hobbies_.getByteString(index);
  }

  public static final int BAGOFTRICKS_FIELD_NUMBER = 4;
  private static final class BagOfTricksDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.example.protobuf.Greeting.internal_static_com_example_protobuf_HelloRequest_BagOfTricksEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> bagOfTricks_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetBagOfTricks() {
    if (bagOfTricks_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          BagOfTricksDefaultEntryHolder.defaultEntry);
    }
    return bagOfTricks_;
  }

  public int getBagOfTricksCount() {
    return internalGetBagOfTricks().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */

  public boolean containsBagOfTricks(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetBagOfTricks().getMap().containsKey(key);
  }
  /**
   * Use {@link #getBagOfTricksMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getBagOfTricks() {
    return getBagOfTricksMap();
  }
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getBagOfTricksMap() {
    return internalGetBagOfTricks().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */

  public java.lang.String getBagOfTricksOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBagOfTricks().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */

  public java.lang.String getBagOfTricksOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBagOfTricks().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int SENTIMENT_FIELD_NUMBER = 5;
  private int sentiment_;
  /**
   * <code>.com.example.protobuf.Sentiment sentiment = 5;</code>
   */
  public int getSentimentValue() {
    return sentiment_;
  }
  /**
   * <code>.com.example.protobuf.Sentiment sentiment = 5;</code>
   */
  public com.example.protobuf.Sentiment getSentiment() {
    @SuppressWarnings("deprecation")
    com.example.protobuf.Sentiment result = com.example.protobuf.Sentiment.valueOf(sentiment_);
    return result == null ? com.example.protobuf.Sentiment.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (age_ != 0) {
      output.writeInt32(2, age_);
    }
    for (int i = 0; i < hobbies_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hobbies_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetBagOfTricks(),
        BagOfTricksDefaultEntryHolder.defaultEntry,
        4);
    if (sentiment_ != com.example.protobuf.Sentiment.HAPPY.getNumber()) {
      output.writeEnum(5, sentiment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, age_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < hobbies_.size(); i++) {
        dataSize += computeStringSizeNoTag(hobbies_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getHobbiesList().size();
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetBagOfTricks().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      bagOfTricks__ = BagOfTricksDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, bagOfTricks__);
    }
    if (sentiment_ != com.example.protobuf.Sentiment.HAPPY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, sentiment_);
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
    if (!(obj instanceof com.example.protobuf.HelloRequest)) {
      return super.equals(obj);
    }
    com.example.protobuf.HelloRequest other = (com.example.protobuf.HelloRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getAge()
        != other.getAge()) return false;
    if (!getHobbiesList()
        .equals(other.getHobbiesList())) return false;
    if (!internalGetBagOfTricks().equals(
        other.internalGetBagOfTricks())) return false;
    if (sentiment_ != other.sentiment_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    if (getHobbiesCount() > 0) {
      hash = (37 * hash) + HOBBIES_FIELD_NUMBER;
      hash = (53 * hash) + getHobbiesList().hashCode();
    }
    if (!internalGetBagOfTricks().getMap().isEmpty()) {
      hash = (37 * hash) + BAGOFTRICKS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetBagOfTricks().hashCode();
    }
    hash = (37 * hash) + SENTIMENT_FIELD_NUMBER;
    hash = (53 * hash) + sentiment_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.protobuf.HelloRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.protobuf.HelloRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.protobuf.HelloRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.protobuf.HelloRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.protobuf.HelloRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.protobuf.HelloRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.protobuf.HelloRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.protobuf.HelloRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.protobuf.HelloRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.protobuf.HelloRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.protobuf.HelloRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.protobuf.HelloRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.protobuf.HelloRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code com.example.protobuf.HelloRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.protobuf.HelloRequest)
      com.example.protobuf.HelloRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.protobuf.Greeting.internal_static_com_example_protobuf_HelloRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetBagOfTricks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableBagOfTricks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.protobuf.Greeting.internal_static_com_example_protobuf_HelloRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.protobuf.HelloRequest.class, com.example.protobuf.HelloRequest.Builder.class);
    }

    // Construct using com.example.protobuf.HelloRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      age_ = 0;

      hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableBagOfTricks().clear();
      sentiment_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.protobuf.Greeting.internal_static_com_example_protobuf_HelloRequest_descriptor;
    }

    @java.lang.Override
    public com.example.protobuf.HelloRequest getDefaultInstanceForType() {
      return com.example.protobuf.HelloRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.protobuf.HelloRequest build() {
      com.example.protobuf.HelloRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.protobuf.HelloRequest buildPartial() {
      com.example.protobuf.HelloRequest result = new com.example.protobuf.HelloRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.age_ = age_;
      if (((bitField0_ & 0x00000004) != 0)) {
        hobbies_ = hobbies_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.hobbies_ = hobbies_;
      result.bagOfTricks_ = internalGetBagOfTricks();
      result.bagOfTricks_.makeImmutable();
      result.sentiment_ = sentiment_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.protobuf.HelloRequest) {
        return mergeFrom((com.example.protobuf.HelloRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.protobuf.HelloRequest other) {
      if (other == com.example.protobuf.HelloRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (!other.hobbies_.isEmpty()) {
        if (hobbies_.isEmpty()) {
          hobbies_ = other.hobbies_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureHobbiesIsMutable();
          hobbies_.addAll(other.hobbies_);
        }
        onChanged();
      }
      internalGetMutableBagOfTricks().mergeFrom(
          other.internalGetBagOfTricks());
      if (other.sentiment_ != 0) {
        setSentimentValue(other.getSentimentValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.protobuf.HelloRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.protobuf.HelloRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <code>int32 age = 2;</code>
     */
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 2;</code>
     */
    public Builder setAge(int value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 age = 2;</code>
     */
    public Builder clearAge() {
      
      age_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureHobbiesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        hobbies_ = new com.google.protobuf.LazyStringArrayList(hobbies_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getHobbiesList() {
      return hobbies_.getUnmodifiableView();
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public int getHobbiesCount() {
      return hobbies_.size();
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public java.lang.String getHobbies(int index) {
      return hobbies_.get(index);
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public com.google.protobuf.ByteString
        getHobbiesBytes(int index) {
      return hobbies_.getByteString(index);
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public Builder setHobbies(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHobbiesIsMutable();
      hobbies_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public Builder addHobbies(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHobbiesIsMutable();
      hobbies_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public Builder addAllHobbies(
        java.lang.Iterable<java.lang.String> values) {
      ensureHobbiesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, hobbies_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public Builder clearHobbies() {
      hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public Builder addHobbiesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureHobbiesIsMutable();
      hobbies_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> bagOfTricks_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetBagOfTricks() {
      if (bagOfTricks_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BagOfTricksDefaultEntryHolder.defaultEntry);
      }
      return bagOfTricks_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableBagOfTricks() {
      onChanged();;
      if (bagOfTricks_ == null) {
        bagOfTricks_ = com.google.protobuf.MapField.newMapField(
            BagOfTricksDefaultEntryHolder.defaultEntry);
      }
      if (!bagOfTricks_.isMutable()) {
        bagOfTricks_ = bagOfTricks_.copy();
      }
      return bagOfTricks_;
    }

    public int getBagOfTricksCount() {
      return internalGetBagOfTricks().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */

    public boolean containsBagOfTricks(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetBagOfTricks().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBagOfTricksMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getBagOfTricks() {
      return getBagOfTricksMap();
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getBagOfTricksMap() {
      return internalGetBagOfTricks().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */

    public java.lang.String getBagOfTricksOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBagOfTricks().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */

    public java.lang.String getBagOfTricksOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBagOfTricks().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearBagOfTricks() {
      internalGetMutableBagOfTricks().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */

    public Builder removeBagOfTricks(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBagOfTricks().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableBagOfTricks() {
      return internalGetMutableBagOfTricks().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */
    public Builder putBagOfTricks(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBagOfTricks().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */

    public Builder putAllBagOfTricks(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableBagOfTricks().getMutableMap()
          .putAll(values);
      return this;
    }

    private int sentiment_ = 0;
    /**
     * <code>.com.example.protobuf.Sentiment sentiment = 5;</code>
     */
    public int getSentimentValue() {
      return sentiment_;
    }
    /**
     * <code>.com.example.protobuf.Sentiment sentiment = 5;</code>
     */
    public Builder setSentimentValue(int value) {
      sentiment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.example.protobuf.Sentiment sentiment = 5;</code>
     */
    public com.example.protobuf.Sentiment getSentiment() {
      @SuppressWarnings("deprecation")
      com.example.protobuf.Sentiment result = com.example.protobuf.Sentiment.valueOf(sentiment_);
      return result == null ? com.example.protobuf.Sentiment.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.example.protobuf.Sentiment sentiment = 5;</code>
     */
    public Builder setSentiment(com.example.protobuf.Sentiment value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      sentiment_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.example.protobuf.Sentiment sentiment = 5;</code>
     */
    public Builder clearSentiment() {
      
      sentiment_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.protobuf.HelloRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.protobuf.HelloRequest)
  private static final com.example.protobuf.HelloRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.protobuf.HelloRequest();
  }

  public static com.example.protobuf.HelloRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloRequest>
      PARSER = new com.google.protobuf.AbstractParser<HelloRequest>() {
    @java.lang.Override
    public HelloRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HelloRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.protobuf.HelloRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

