/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.lg.netty.seven_ThriftNetty.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-02-12")
public class Car implements org.apache.thrift.TBase<Car, Car._Fields>, java.io.Serializable, Cloneable, Comparable<Car> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Car");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MILEAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("mileage", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField MARRIED_FIELD_DESC = new org.apache.thrift.protocol.TField("married", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CarStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CarTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String name; // optional
  public int mileage; // optional
  public boolean married; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    MILEAGE((short)2, "mileage"),
    MARRIED((short)3, "married");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // MILEAGE
          return MILEAGE;
        case 3: // MARRIED
          return MARRIED;
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
    @org.apache.thrift.annotation.Nullable
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
  private static final int __MILEAGE_ISSET_ID = 0;
  private static final int __MARRIED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.MILEAGE,_Fields.MARRIED};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.MILEAGE, new org.apache.thrift.meta_data.FieldMetaData("mileage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.MARRIED, new org.apache.thrift.meta_data.FieldMetaData("married", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL        , "boolean")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Car.class, metaDataMap);
  }

  public Car() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Car(Car other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.mileage = other.mileage;
    this.married = other.married;
  }

  public Car deepCopy() {
    return new Car(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setMileageIsSet(false);
    this.mileage = 0;
    setMarriedIsSet(false);
    this.married = false;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public Car setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getMileage() {
    return this.mileage;
  }

  public Car setMileage(int mileage) {
    this.mileage = mileage;
    setMileageIsSet(true);
    return this;
  }

  public void unsetMileage() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MILEAGE_ISSET_ID);
  }

  /** Returns true if field mileage is set (has been assigned a value) and false otherwise */
  public boolean isSetMileage() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MILEAGE_ISSET_ID);
  }

  public void setMileageIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MILEAGE_ISSET_ID, value);
  }

  public boolean isMarried() {
    return this.married;
  }

  public Car setMarried(boolean married) {
    this.married = married;
    setMarriedIsSet(true);
    return this;
  }

  public void unsetMarried() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MARRIED_ISSET_ID);
  }

  /** Returns true if field married is set (has been assigned a value) and false otherwise */
  public boolean isSetMarried() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MARRIED_ISSET_ID);
  }

  public void setMarriedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MARRIED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case MILEAGE:
      if (value == null) {
        unsetMileage();
      } else {
        setMileage((java.lang.Integer)value);
      }
      break;

    case MARRIED:
      if (value == null) {
        unsetMarried();
      } else {
        setMarried((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case MILEAGE:
      return getMileage();

    case MARRIED:
      return isMarried();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case MILEAGE:
      return isSetMileage();
    case MARRIED:
      return isSetMarried();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Car)
      return this.equals((Car)that);
    return false;
  }

  public boolean equals(Car that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_mileage = true && this.isSetMileage();
    boolean that_present_mileage = true && that.isSetMileage();
    if (this_present_mileage || that_present_mileage) {
      if (!(this_present_mileage && that_present_mileage))
        return false;
      if (this.mileage != that.mileage)
        return false;
    }

    boolean this_present_married = true && this.isSetMarried();
    boolean that_present_married = true && that.isSetMarried();
    if (this_present_married || that_present_married) {
      if (!(this_present_married && that_present_married))
        return false;
      if (this.married != that.married)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetMileage()) ? 131071 : 524287);
    if (isSetMileage())
      hashCode = hashCode * 8191 + mileage;

    hashCode = hashCode * 8191 + ((isSetMarried()) ? 131071 : 524287);
    if (isSetMarried())
      hashCode = hashCode * 8191 + ((married) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(Car other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMileage()).compareTo(other.isSetMileage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMileage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mileage, other.mileage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMarried()).compareTo(other.isSetMarried());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMarried()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.married, other.married);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Car(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetMileage()) {
      if (!first) sb.append(", ");
      sb.append("mileage:");
      sb.append(this.mileage);
      first = false;
    }
    if (isSetMarried()) {
      if (!first) sb.append(", ");
      sb.append("married:");
      sb.append(this.married);
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CarStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CarStandardScheme getScheme() {
      return new CarStandardScheme();
    }
  }

  private static class CarStandardScheme extends org.apache.thrift.scheme.StandardScheme<Car> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Car struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MILEAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mileage = iprot.readI32();
              struct.setMileageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MARRIED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.married = iprot.readBool();
              struct.setMarriedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Car struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMileage()) {
        oprot.writeFieldBegin(MILEAGE_FIELD_DESC);
        oprot.writeI32(struct.mileage);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMarried()) {
        oprot.writeFieldBegin(MARRIED_FIELD_DESC);
        oprot.writeBool(struct.married);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CarTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CarTupleScheme getScheme() {
      return new CarTupleScheme();
    }
  }

  private static class CarTupleScheme extends org.apache.thrift.scheme.TupleScheme<Car> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Car struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetMileage()) {
        optionals.set(1);
      }
      if (struct.isSetMarried()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetMileage()) {
        oprot.writeI32(struct.mileage);
      }
      if (struct.isSetMarried()) {
        oprot.writeBool(struct.married);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Car struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mileage = iprot.readI32();
        struct.setMileageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.married = iprot.readBool();
        struct.setMarriedIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

