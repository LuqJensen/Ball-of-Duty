/**
 * NewGuestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class NewGuestResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO newGuestResult;

    public NewGuestResponse() {
    }

    public NewGuestResponse(
           org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO newGuestResult) {
           this.newGuestResult = newGuestResult;
    }


    /**
     * Gets the newGuestResult value for this NewGuestResponse.
     * 
     * @return newGuestResult
     */
    public org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO getNewGuestResult() {
        return newGuestResult;
    }


    /**
     * Sets the newGuestResult value for this NewGuestResponse.
     * 
     * @param newGuestResult
     */
    public void setNewGuestResult(org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO newGuestResult) {
        this.newGuestResult = newGuestResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewGuestResponse)) return false;
        NewGuestResponse other = (NewGuestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newGuestResult==null && other.getNewGuestResult()==null) || 
             (this.newGuestResult!=null &&
              this.newGuestResult.equals(other.getNewGuestResult())));
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
        if (getNewGuestResult() != null) {
            _hashCode += getNewGuestResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewGuestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">NewGuestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newGuestResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NewGuestResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Ball_of_Duty_Server.DTO", "PlayerDTO"));
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
