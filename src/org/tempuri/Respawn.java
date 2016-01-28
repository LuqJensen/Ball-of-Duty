/**
 * Respawn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Respawn  implements java.io.Serializable {
    private java.lang.Integer clientPlayerId;

    private java.lang.Integer clientSpecializations;

    public Respawn() {
    }

    public Respawn(
           java.lang.Integer clientPlayerId,
           java.lang.Integer clientSpecializations) {
           this.clientPlayerId = clientPlayerId;
           this.clientSpecializations = clientSpecializations;
    }


    /**
     * Gets the clientPlayerId value for this Respawn.
     * 
     * @return clientPlayerId
     */
    public java.lang.Integer getClientPlayerId() {
        return clientPlayerId;
    }


    /**
     * Sets the clientPlayerId value for this Respawn.
     * 
     * @param clientPlayerId
     */
    public void setClientPlayerId(java.lang.Integer clientPlayerId) {
        this.clientPlayerId = clientPlayerId;
    }


    /**
     * Gets the clientSpecializations value for this Respawn.
     * 
     * @return clientSpecializations
     */
    public java.lang.Integer getClientSpecializations() {
        return clientSpecializations;
    }


    /**
     * Sets the clientSpecializations value for this Respawn.
     * 
     * @param clientSpecializations
     */
    public void setClientSpecializations(java.lang.Integer clientSpecializations) {
        this.clientSpecializations = clientSpecializations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Respawn)) return false;
        Respawn other = (Respawn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientPlayerId==null && other.getClientPlayerId()==null) || 
             (this.clientPlayerId!=null &&
              this.clientPlayerId.equals(other.getClientPlayerId()))) &&
            ((this.clientSpecializations==null && other.getClientSpecializations()==null) || 
             (this.clientSpecializations!=null &&
              this.clientSpecializations.equals(other.getClientSpecializations())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getClientPlayerId() != null) {
            _hashCode += getClientPlayerId().hashCode();
        }
        if (getClientSpecializations() != null) {
            _hashCode += getClientSpecializations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Respawn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Respawn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPlayerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "clientPlayerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSpecializations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "clientSpecializations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
