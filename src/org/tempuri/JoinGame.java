/**
 * JoinGame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class JoinGame  implements java.io.Serializable {
    private java.lang.Integer clientPlayerId;

    private java.lang.Integer clientSpecialization;

    private java.lang.String clientVersion;

    public JoinGame() {
    }

    public JoinGame(
           java.lang.Integer clientPlayerId,
           java.lang.Integer clientSpecialization,
           java.lang.String clientVersion) {
           this.clientPlayerId = clientPlayerId;
           this.clientSpecialization = clientSpecialization;
           this.clientVersion = clientVersion;
    }


    /**
     * Gets the clientPlayerId value for this JoinGame.
     * 
     * @return clientPlayerId
     */
    public java.lang.Integer getClientPlayerId() {
        return clientPlayerId;
    }


    /**
     * Sets the clientPlayerId value for this JoinGame.
     * 
     * @param clientPlayerId
     */
    public void setClientPlayerId(java.lang.Integer clientPlayerId) {
        this.clientPlayerId = clientPlayerId;
    }


    /**
     * Gets the clientSpecialization value for this JoinGame.
     * 
     * @return clientSpecialization
     */
    public java.lang.Integer getClientSpecialization() {
        return clientSpecialization;
    }


    /**
     * Sets the clientSpecialization value for this JoinGame.
     * 
     * @param clientSpecialization
     */
    public void setClientSpecialization(java.lang.Integer clientSpecialization) {
        this.clientSpecialization = clientSpecialization;
    }


    /**
     * Gets the clientVersion value for this JoinGame.
     * 
     * @return clientVersion
     */
    public java.lang.String getClientVersion() {
        return clientVersion;
    }


    /**
     * Sets the clientVersion value for this JoinGame.
     * 
     * @param clientVersion
     */
    public void setClientVersion(java.lang.String clientVersion) {
        this.clientVersion = clientVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JoinGame)) return false;
        JoinGame other = (JoinGame) obj;
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
            ((this.clientSpecialization==null && other.getClientSpecialization()==null) || 
             (this.clientSpecialization!=null &&
              this.clientSpecialization.equals(other.getClientSpecialization()))) &&
            ((this.clientVersion==null && other.getClientVersion()==null) || 
             (this.clientVersion!=null &&
              this.clientVersion.equals(other.getClientVersion())));
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
        if (getClientSpecialization() != null) {
            _hashCode += getClientSpecialization().hashCode();
        }
        if (getClientVersion() != null) {
            _hashCode += getClientVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JoinGame.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">JoinGame"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPlayerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "clientPlayerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSpecialization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "clientSpecialization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "clientVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
