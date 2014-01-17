/**
 * RichMediaStudioCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;


/**
 * A {@code Creative} that is created by a Rich Media Studio. You
 * cannot create this creative,
 *             but you can update some fields of this creative.
 */
public class RichMediaStudioCreative  extends com.google.api.ads.dfp.axis.v201308.BaseRichMediaStudioCreative  implements java.io.Serializable {
    /* {@code true} if this is interstitial. An interstitial creative
     * will not consider an
     *                     impression served until it is fully rendered in
     * the browser. This attribute is readonly. */
    private java.lang.Boolean isInterstitial;

    public RichMediaStudioCreative() {
    }

    public RichMediaStudioCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201308.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201308.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201308.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201308.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.Long studioCreativeId,
           com.google.api.ads.dfp.axis.v201308.RichMediaStudioCreativeFormat creativeFormat,
           com.google.api.ads.dfp.axis.v201308.RichMediaStudioCreativeArtworkType artworkType,
           java.lang.Long totalFileSize,
           java.lang.String[] adTagKeys,
           java.lang.String[] customKeyValues,
           java.lang.String surveyUrl,
           java.lang.String allImpressionsUrl,
           java.lang.String richMediaImpressionsUrl,
           java.lang.String backupImageImpressionsUrl,
           java.lang.String overrideCss,
           java.lang.String requiredFlashPluginVersion,
           java.lang.Integer duration,
           com.google.api.ads.dfp.axis.v201308.RichMediaStudioCreativeBillingAttribute billingAttribute,
           com.google.api.ads.dfp.axis.v201308.RichMediaStudioChildAssetProperty[] richMediaStudioChildAssetProperties,
           java.lang.Boolean isInterstitial) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType,
            studioCreativeId,
            creativeFormat,
            artworkType,
            totalFileSize,
            adTagKeys,
            customKeyValues,
            surveyUrl,
            allImpressionsUrl,
            richMediaImpressionsUrl,
            backupImageImpressionsUrl,
            overrideCss,
            requiredFlashPluginVersion,
            duration,
            billingAttribute,
            richMediaStudioChildAssetProperties);
        this.isInterstitial = isInterstitial;
    }


    /**
     * Gets the isInterstitial value for this RichMediaStudioCreative.
     * 
     * @return isInterstitial   * {@code true} if this is interstitial. An interstitial creative
     * will not consider an
     *                     impression served until it is fully rendered in
     * the browser. This attribute is readonly.
     */
    public java.lang.Boolean getIsInterstitial() {
        return isInterstitial;
    }


    /**
     * Sets the isInterstitial value for this RichMediaStudioCreative.
     * 
     * @param isInterstitial   * {@code true} if this is interstitial. An interstitial creative
     * will not consider an
     *                     impression served until it is fully rendered in
     * the browser. This attribute is readonly.
     */
    public void setIsInterstitial(java.lang.Boolean isInterstitial) {
        this.isInterstitial = isInterstitial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaStudioCreative)) return false;
        RichMediaStudioCreative other = (RichMediaStudioCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isInterstitial==null && other.getIsInterstitial()==null) || 
             (this.isInterstitial!=null &&
              this.isInterstitial.equals(other.getIsInterstitial())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getIsInterstitial() != null) {
            _hashCode += getIsInterstitial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaStudioCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "RichMediaStudioCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInterstitial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "isInterstitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
