/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.edu.tsinghua.tsfile.formatV30;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageHeaderV30 implements org.apache.thrift.TBase<PageHeaderV30, PageHeaderV30._Fields>, java.io.Serializable, Cloneable, Comparable<PageHeaderV30> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PageHeaderV30");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField UNCOMPRESSED_PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("uncompressed_page_size", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField COMPRESSED_PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("compressed_page_size", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CRC_FIELD_DESC = new org.apache.thrift.protocol.TField("crc", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField DATA_PAGE_HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("data_page_header", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField INDEX_PAGE_HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("index_page_header", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField DICTIONARY_PAGE_HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("dictionary_page_header", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PageHeaderV30StandardSchemeFactory());
    schemes.put(TupleScheme.class, new PageHeaderV30TupleSchemeFactory());
  }

  /**
   * the type of the page: indicates which of the *_header fields is set *
   * 
   * @see PageTypeV30
   */
  public PageTypeV30 type; // required
  /**
   * Uncompressed page size in bytes (not including this header) *
   */
  public int uncompressed_page_size; // required
  /**
   * Compressed page size in bytes (not including this header) *
   */
  public int compressed_page_size; // required
  /**
   * 32bit crc for the data below. This allows for disabling checksumming in HDFS
   * if only a few pages needs to be read
   * 
   */
  public int crc; // optional
  public DataPageHeaderV30 data_page_header; // optional
  public IndexPageHeaderV30 index_page_header; // optional
  public DictionaryPageHeaderV30 dictionary_page_header; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the type of the page: indicates which of the *_header fields is set *
     * 
     * @see PageTypeV30
     */
    TYPE((short)1, "type"),
    /**
     * Uncompressed page size in bytes (not including this header) *
     */
    UNCOMPRESSED_PAGE_SIZE((short)2, "uncompressed_page_size"),
    /**
     * Compressed page size in bytes (not including this header) *
     */
    COMPRESSED_PAGE_SIZE((short)3, "compressed_page_size"),
    /**
     * 32bit crc for the data below. This allows for disabling checksumming in HDFS
     * if only a few pages needs to be read
     * 
     */
    CRC((short)4, "crc"),
    DATA_PAGE_HEADER((short)5, "data_page_header"),
    INDEX_PAGE_HEADER((short)6, "index_page_header"),
    DICTIONARY_PAGE_HEADER((short)7, "dictionary_page_header");

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
        case 1: // TYPE
          return TYPE;
        case 2: // UNCOMPRESSED_PAGE_SIZE
          return UNCOMPRESSED_PAGE_SIZE;
        case 3: // COMPRESSED_PAGE_SIZE
          return COMPRESSED_PAGE_SIZE;
        case 4: // CRC
          return CRC;
        case 5: // DATA_PAGE_HEADER
          return DATA_PAGE_HEADER;
        case 6: // INDEX_PAGE_HEADER
          return INDEX_PAGE_HEADER;
        case 7: // DICTIONARY_PAGE_HEADER
          return DICTIONARY_PAGE_HEADER;
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
  private static final int __UNCOMPRESSED_PAGE_SIZE_ISSET_ID = 0;
  private static final int __COMPRESSED_PAGE_SIZE_ISSET_ID = 1;
  private static final int __CRC_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CRC,_Fields.DATA_PAGE_HEADER,_Fields.INDEX_PAGE_HEADER,_Fields.DICTIONARY_PAGE_HEADER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PageTypeV30.class)));
    tmpMap.put(_Fields.UNCOMPRESSED_PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("uncompressed_page_size", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPRESSED_PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("compressed_page_size", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CRC, new org.apache.thrift.meta_data.FieldMetaData("crc", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DATA_PAGE_HEADER, new org.apache.thrift.meta_data.FieldMetaData("data_page_header", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DataPageHeaderV30.class)));
    tmpMap.put(_Fields.INDEX_PAGE_HEADER, new org.apache.thrift.meta_data.FieldMetaData("index_page_header", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, IndexPageHeaderV30.class)));
    tmpMap.put(_Fields.DICTIONARY_PAGE_HEADER, new org.apache.thrift.meta_data.FieldMetaData("dictionary_page_header", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DictionaryPageHeaderV30.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PageHeaderV30.class, metaDataMap);
  }

  public PageHeaderV30() {
  }

  public PageHeaderV30(
    PageTypeV30 type,
    int uncompressed_page_size,
    int compressed_page_size)
  {
    this();
    this.type = type;
    this.uncompressed_page_size = uncompressed_page_size;
    setUncompressed_page_sizeIsSet(true);
    this.compressed_page_size = compressed_page_size;
    setCompressed_page_sizeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PageHeaderV30(PageHeaderV30 other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.uncompressed_page_size = other.uncompressed_page_size;
    this.compressed_page_size = other.compressed_page_size;
    this.crc = other.crc;
    if (other.isSetData_page_header()) {
      this.data_page_header = new DataPageHeaderV30(other.data_page_header);
    }
    if (other.isSetIndex_page_header()) {
      this.index_page_header = new IndexPageHeaderV30(other.index_page_header);
    }
    if (other.isSetDictionary_page_header()) {
      this.dictionary_page_header = new DictionaryPageHeaderV30(other.dictionary_page_header);
    }
  }

  public PageHeaderV30 deepCopy() {
    return new PageHeaderV30(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setUncompressed_page_sizeIsSet(false);
    this.uncompressed_page_size = 0;
    setCompressed_page_sizeIsSet(false);
    this.compressed_page_size = 0;
    setCrcIsSet(false);
    this.crc = 0;
    this.data_page_header = null;
    this.index_page_header = null;
    this.dictionary_page_header = null;
  }

  /**
   * the type of the page: indicates which of the *_header fields is set *
   * 
   * @see PageTypeV30
   */
  public PageTypeV30 getType() {
    return this.type;
  }

  /**
   * the type of the page: indicates which of the *_header fields is set *
   * 
   * @see PageTypeV30
   */
  public PageHeaderV30 setType(PageTypeV30 type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * Uncompressed page size in bytes (not including this header) *
   */
  public int getUncompressed_page_size() {
    return this.uncompressed_page_size;
  }

  /**
   * Uncompressed page size in bytes (not including this header) *
   */
  public PageHeaderV30 setUncompressed_page_size(int uncompressed_page_size) {
    this.uncompressed_page_size = uncompressed_page_size;
    setUncompressed_page_sizeIsSet(true);
    return this;
  }

  public void unsetUncompressed_page_size() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNCOMPRESSED_PAGE_SIZE_ISSET_ID);
  }

  /** Returns true if field uncompressed_page_size is set (has been assigned a value) and false otherwise */
  public boolean isSetUncompressed_page_size() {
    return EncodingUtils.testBit(__isset_bitfield, __UNCOMPRESSED_PAGE_SIZE_ISSET_ID);
  }

  public void setUncompressed_page_sizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNCOMPRESSED_PAGE_SIZE_ISSET_ID, value);
  }

  /**
   * Compressed page size in bytes (not including this header) *
   */
  public int getCompressed_page_size() {
    return this.compressed_page_size;
  }

  /**
   * Compressed page size in bytes (not including this header) *
   */
  public PageHeaderV30 setCompressed_page_size(int compressed_page_size) {
    this.compressed_page_size = compressed_page_size;
    setCompressed_page_sizeIsSet(true);
    return this;
  }

  public void unsetCompressed_page_size() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMPRESSED_PAGE_SIZE_ISSET_ID);
  }

  /** Returns true if field compressed_page_size is set (has been assigned a value) and false otherwise */
  public boolean isSetCompressed_page_size() {
    return EncodingUtils.testBit(__isset_bitfield, __COMPRESSED_PAGE_SIZE_ISSET_ID);
  }

  public void setCompressed_page_sizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMPRESSED_PAGE_SIZE_ISSET_ID, value);
  }

  /**
   * 32bit crc for the data below. This allows for disabling checksumming in HDFS
   * if only a few pages needs to be read
   * 
   */
  public int getCrc() {
    return this.crc;
  }

  /**
   * 32bit crc for the data below. This allows for disabling checksumming in HDFS
   * if only a few pages needs to be read
   * 
   */
  public PageHeaderV30 setCrc(int crc) {
    this.crc = crc;
    setCrcIsSet(true);
    return this;
  }

  public void unsetCrc() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CRC_ISSET_ID);
  }

  /** Returns true if field crc is set (has been assigned a value) and false otherwise */
  public boolean isSetCrc() {
    return EncodingUtils.testBit(__isset_bitfield, __CRC_ISSET_ID);
  }

  public void setCrcIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CRC_ISSET_ID, value);
  }

  public DataPageHeaderV30 getData_page_header() {
    return this.data_page_header;
  }

  public PageHeaderV30 setData_page_header(DataPageHeaderV30 data_page_header) {
    this.data_page_header = data_page_header;
    return this;
  }

  public void unsetData_page_header() {
    this.data_page_header = null;
  }

  /** Returns true if field data_page_header is set (has been assigned a value) and false otherwise */
  public boolean isSetData_page_header() {
    return this.data_page_header != null;
  }

  public void setData_page_headerIsSet(boolean value) {
    if (!value) {
      this.data_page_header = null;
    }
  }

  public IndexPageHeaderV30 getIndex_page_header() {
    return this.index_page_header;
  }

  public PageHeaderV30 setIndex_page_header(IndexPageHeaderV30 index_page_header) {
    this.index_page_header = index_page_header;
    return this;
  }

  public void unsetIndex_page_header() {
    this.index_page_header = null;
  }

  /** Returns true if field index_page_header is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex_page_header() {
    return this.index_page_header != null;
  }

  public void setIndex_page_headerIsSet(boolean value) {
    if (!value) {
      this.index_page_header = null;
    }
  }

  public DictionaryPageHeaderV30 getDictionary_page_header() {
    return this.dictionary_page_header;
  }

  public PageHeaderV30 setDictionary_page_header(DictionaryPageHeaderV30 dictionary_page_header) {
    this.dictionary_page_header = dictionary_page_header;
    return this;
  }

  public void unsetDictionary_page_header() {
    this.dictionary_page_header = null;
  }

  /** Returns true if field dictionary_page_header is set (has been assigned a value) and false otherwise */
  public boolean isSetDictionary_page_header() {
    return this.dictionary_page_header != null;
  }

  public void setDictionary_page_headerIsSet(boolean value) {
    if (!value) {
      this.dictionary_page_header = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((PageTypeV30)value);
      }
      break;

    case UNCOMPRESSED_PAGE_SIZE:
      if (value == null) {
        unsetUncompressed_page_size();
      } else {
        setUncompressed_page_size((Integer)value);
      }
      break;

    case COMPRESSED_PAGE_SIZE:
      if (value == null) {
        unsetCompressed_page_size();
      } else {
        setCompressed_page_size((Integer)value);
      }
      break;

    case CRC:
      if (value == null) {
        unsetCrc();
      } else {
        setCrc((Integer)value);
      }
      break;

    case DATA_PAGE_HEADER:
      if (value == null) {
        unsetData_page_header();
      } else {
        setData_page_header((DataPageHeaderV30)value);
      }
      break;

    case INDEX_PAGE_HEADER:
      if (value == null) {
        unsetIndex_page_header();
      } else {
        setIndex_page_header((IndexPageHeaderV30)value);
      }
      break;

    case DICTIONARY_PAGE_HEADER:
      if (value == null) {
        unsetDictionary_page_header();
      } else {
        setDictionary_page_header((DictionaryPageHeaderV30)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case UNCOMPRESSED_PAGE_SIZE:
      return Integer.valueOf(getUncompressed_page_size());

    case COMPRESSED_PAGE_SIZE:
      return Integer.valueOf(getCompressed_page_size());

    case CRC:
      return Integer.valueOf(getCrc());

    case DATA_PAGE_HEADER:
      return getData_page_header();

    case INDEX_PAGE_HEADER:
      return getIndex_page_header();

    case DICTIONARY_PAGE_HEADER:
      return getDictionary_page_header();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case UNCOMPRESSED_PAGE_SIZE:
      return isSetUncompressed_page_size();
    case COMPRESSED_PAGE_SIZE:
      return isSetCompressed_page_size();
    case CRC:
      return isSetCrc();
    case DATA_PAGE_HEADER:
      return isSetData_page_header();
    case INDEX_PAGE_HEADER:
      return isSetIndex_page_header();
    case DICTIONARY_PAGE_HEADER:
      return isSetDictionary_page_header();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PageHeaderV30)
      return this.equals((PageHeaderV30)that);
    return false;
  }

  public boolean equals(PageHeaderV30 that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_uncompressed_page_size = true;
    boolean that_present_uncompressed_page_size = true;
    if (this_present_uncompressed_page_size || that_present_uncompressed_page_size) {
      if (!(this_present_uncompressed_page_size && that_present_uncompressed_page_size))
        return false;
      if (this.uncompressed_page_size != that.uncompressed_page_size)
        return false;
    }

    boolean this_present_compressed_page_size = true;
    boolean that_present_compressed_page_size = true;
    if (this_present_compressed_page_size || that_present_compressed_page_size) {
      if (!(this_present_compressed_page_size && that_present_compressed_page_size))
        return false;
      if (this.compressed_page_size != that.compressed_page_size)
        return false;
    }

    boolean this_present_crc = true && this.isSetCrc();
    boolean that_present_crc = true && that.isSetCrc();
    if (this_present_crc || that_present_crc) {
      if (!(this_present_crc && that_present_crc))
        return false;
      if (this.crc != that.crc)
        return false;
    }

    boolean this_present_data_page_header = true && this.isSetData_page_header();
    boolean that_present_data_page_header = true && that.isSetData_page_header();
    if (this_present_data_page_header || that_present_data_page_header) {
      if (!(this_present_data_page_header && that_present_data_page_header))
        return false;
      if (!this.data_page_header.equals(that.data_page_header))
        return false;
    }

    boolean this_present_index_page_header = true && this.isSetIndex_page_header();
    boolean that_present_index_page_header = true && that.isSetIndex_page_header();
    if (this_present_index_page_header || that_present_index_page_header) {
      if (!(this_present_index_page_header && that_present_index_page_header))
        return false;
      if (!this.index_page_header.equals(that.index_page_header))
        return false;
    }

    boolean this_present_dictionary_page_header = true && this.isSetDictionary_page_header();
    boolean that_present_dictionary_page_header = true && that.isSetDictionary_page_header();
    if (this_present_dictionary_page_header || that_present_dictionary_page_header) {
      if (!(this_present_dictionary_page_header && that_present_dictionary_page_header))
        return false;
      if (!this.dictionary_page_header.equals(that.dictionary_page_header))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PageHeaderV30 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUncompressed_page_size()).compareTo(other.isSetUncompressed_page_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUncompressed_page_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uncompressed_page_size, other.uncompressed_page_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompressed_page_size()).compareTo(other.isSetCompressed_page_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompressed_page_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.compressed_page_size, other.compressed_page_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCrc()).compareTo(other.isSetCrc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCrc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.crc, other.crc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData_page_header()).compareTo(other.isSetData_page_header());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData_page_header()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_page_header, other.data_page_header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndex_page_header()).compareTo(other.isSetIndex_page_header());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex_page_header()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index_page_header, other.index_page_header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDictionary_page_header()).compareTo(other.isSetDictionary_page_header());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDictionary_page_header()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dictionary_page_header, other.dictionary_page_header);
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
    StringBuilder sb = new StringBuilder("PageHeaderV30(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("uncompressed_page_size:");
    sb.append(this.uncompressed_page_size);
    first = false;
    if (!first) sb.append(", ");
    sb.append("compressed_page_size:");
    sb.append(this.compressed_page_size);
    first = false;
    if (isSetCrc()) {
      if (!first) sb.append(", ");
      sb.append("crc:");
      sb.append(this.crc);
      first = false;
    }
    if (isSetData_page_header()) {
      if (!first) sb.append(", ");
      sb.append("data_page_header:");
      if (this.data_page_header == null) {
        sb.append("null");
      } else {
        sb.append(this.data_page_header);
      }
      first = false;
    }
    if (isSetIndex_page_header()) {
      if (!first) sb.append(", ");
      sb.append("index_page_header:");
      if (this.index_page_header == null) {
        sb.append("null");
      } else {
        sb.append(this.index_page_header);
      }
      first = false;
    }
    if (isSetDictionary_page_header()) {
      if (!first) sb.append(", ");
      sb.append("dictionary_page_header:");
      if (this.dictionary_page_header == null) {
        sb.append("null");
      } else {
        sb.append(this.dictionary_page_header);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'uncompressed_page_size' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'compressed_page_size' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (data_page_header != null) {
      data_page_header.validate();
    }
    if (index_page_header != null) {
      index_page_header.validate();
    }
    if (dictionary_page_header != null) {
      dictionary_page_header.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PageHeaderV30StandardSchemeFactory implements SchemeFactory {
    public PageHeaderV30StandardScheme getScheme() {
      return new PageHeaderV30StandardScheme();
    }
  }

  private static class PageHeaderV30StandardScheme extends StandardScheme<PageHeaderV30> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PageHeaderV30 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = PageTypeV30.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNCOMPRESSED_PAGE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.uncompressed_page_size = iprot.readI32();
              struct.setUncompressed_page_sizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMPRESSED_PAGE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.compressed_page_size = iprot.readI32();
              struct.setCompressed_page_sizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CRC
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.crc = iprot.readI32();
              struct.setCrcIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DATA_PAGE_HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.data_page_header = new DataPageHeaderV30();
              struct.data_page_header.read(iprot);
              struct.setData_page_headerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // INDEX_PAGE_HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.index_page_header = new IndexPageHeaderV30();
              struct.index_page_header.read(iprot);
              struct.setIndex_page_headerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DICTIONARY_PAGE_HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.dictionary_page_header = new DictionaryPageHeaderV30();
              struct.dictionary_page_header.read(iprot);
              struct.setDictionary_page_headerIsSet(true);
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
      if (!struct.isSetUncompressed_page_size()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'uncompressed_page_size' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetCompressed_page_size()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'compressed_page_size' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PageHeaderV30 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(UNCOMPRESSED_PAGE_SIZE_FIELD_DESC);
      oprot.writeI32(struct.uncompressed_page_size);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COMPRESSED_PAGE_SIZE_FIELD_DESC);
      oprot.writeI32(struct.compressed_page_size);
      oprot.writeFieldEnd();
      if (struct.isSetCrc()) {
        oprot.writeFieldBegin(CRC_FIELD_DESC);
        oprot.writeI32(struct.crc);
        oprot.writeFieldEnd();
      }
      if (struct.data_page_header != null) {
        if (struct.isSetData_page_header()) {
          oprot.writeFieldBegin(DATA_PAGE_HEADER_FIELD_DESC);
          struct.data_page_header.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.index_page_header != null) {
        if (struct.isSetIndex_page_header()) {
          oprot.writeFieldBegin(INDEX_PAGE_HEADER_FIELD_DESC);
          struct.index_page_header.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dictionary_page_header != null) {
        if (struct.isSetDictionary_page_header()) {
          oprot.writeFieldBegin(DICTIONARY_PAGE_HEADER_FIELD_DESC);
          struct.dictionary_page_header.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PageHeaderV30TupleSchemeFactory implements SchemeFactory {
    public PageHeaderV30TupleScheme getScheme() {
      return new PageHeaderV30TupleScheme();
    }
  }

  private static class PageHeaderV30TupleScheme extends TupleScheme<PageHeaderV30> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PageHeaderV30 struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      oprot.writeI32(struct.uncompressed_page_size);
      oprot.writeI32(struct.compressed_page_size);
      BitSet optionals = new BitSet();
      if (struct.isSetCrc()) {
        optionals.set(0);
      }
      if (struct.isSetData_page_header()) {
        optionals.set(1);
      }
      if (struct.isSetIndex_page_header()) {
        optionals.set(2);
      }
      if (struct.isSetDictionary_page_header()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCrc()) {
        oprot.writeI32(struct.crc);
      }
      if (struct.isSetData_page_header()) {
        struct.data_page_header.write(oprot);
      }
      if (struct.isSetIndex_page_header()) {
        struct.index_page_header.write(oprot);
      }
      if (struct.isSetDictionary_page_header()) {
        struct.dictionary_page_header.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PageHeaderV30 struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = PageTypeV30.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.uncompressed_page_size = iprot.readI32();
      struct.setUncompressed_page_sizeIsSet(true);
      struct.compressed_page_size = iprot.readI32();
      struct.setCompressed_page_sizeIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.crc = iprot.readI32();
        struct.setCrcIsSet(true);
      }
      if (incoming.get(1)) {
        struct.data_page_header = new DataPageHeaderV30();
        struct.data_page_header.read(iprot);
        struct.setData_page_headerIsSet(true);
      }
      if (incoming.get(2)) {
        struct.index_page_header = new IndexPageHeaderV30();
        struct.index_page_header.read(iprot);
        struct.setIndex_page_headerIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dictionary_page_header = new DictionaryPageHeaderV30();
        struct.dictionary_page_header.read(iprot);
        struct.setDictionary_page_headerIsSet(true);
      }
    }
  }

}

