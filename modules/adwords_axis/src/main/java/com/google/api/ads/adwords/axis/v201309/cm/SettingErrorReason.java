/**
 * SettingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public class SettingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SettingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DUPLICATE_SETTING_TYPE = "DUPLICATE_SETTING_TYPE";
    public static final java.lang.String _SETTING_TYPE_IS_NOT_AVAILABLE = "SETTING_TYPE_IS_NOT_AVAILABLE";
    public static final java.lang.String _SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN = "SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN";
    public static final java.lang.String _TARGETING_SETTING_REQUIRES_CAMPAIGN_TARGET_RESTRICT_SETTING = "TARGETING_SETTING_REQUIRES_CAMPAIGN_TARGET_RESTRICT_SETTING";
    public static final java.lang.String _TARGET_RESTRICT_SETTING_CANNOT_BE_REVERSED = "TARGET_RESTRICT_SETTING_CANNOT_BE_REVERSED";
    public static final java.lang.String _TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP = "TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SettingErrorReason DUPLICATE_SETTING_TYPE = new SettingErrorReason(_DUPLICATE_SETTING_TYPE);
    public static final SettingErrorReason SETTING_TYPE_IS_NOT_AVAILABLE = new SettingErrorReason(_SETTING_TYPE_IS_NOT_AVAILABLE);
    public static final SettingErrorReason SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN = new SettingErrorReason(_SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN);
    public static final SettingErrorReason TARGETING_SETTING_REQUIRES_CAMPAIGN_TARGET_RESTRICT_SETTING = new SettingErrorReason(_TARGETING_SETTING_REQUIRES_CAMPAIGN_TARGET_RESTRICT_SETTING);
    public static final SettingErrorReason TARGET_RESTRICT_SETTING_CANNOT_BE_REVERSED = new SettingErrorReason(_TARGET_RESTRICT_SETTING_CANNOT_BE_REVERSED);
    public static final SettingErrorReason TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP = new SettingErrorReason(_TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP);
    public static final SettingErrorReason UNKNOWN = new SettingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SettingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SettingErrorReason enumeration = (SettingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SettingErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SettingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "SettingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
