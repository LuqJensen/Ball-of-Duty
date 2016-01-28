/**
 * CompleteAuthenticationChallengeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CompleteAuthenticationChallengeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO completeAuthenticationChallengeResult;

    public CompleteAuthenticationChallengeResponse() {
    }

    public CompleteAuthenticationChallengeResponse(
           org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO completeAuthenticationChallengeResult) {
           this.completeAuthenticationChallengeResult = completeAuthenticationChallengeResult;
    }


    /**
     * Gets the completeAuthenticationChallengeResult value for this CompleteAuthenticationChallengeResponse.
     * 
     * @return completeAuthenticationChallengeResult
     */
    public org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO getCompleteAuthenticationChallengeResult() {
        return completeAuthenticationChallengeResult;
    }


    /**
     * Sets the completeAuthenticationChallengeResult value for this CompleteAuthenticationChallengeResponse.
     * 
     * @param completeAuthenticationChallengeResult
     */
    public void setCompleteAuthenticationChallengeResult(org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO completeAuthenticationChallengeResult) {
        this.completeAuthenticationChallengeResult = completeAuthenticationChallengeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompleteAuthenticationChallengeResponse)) return false;
        CompleteAuthenticationChallengeResponse other = (CompleteAuthenticationChallengeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.completeAuthenticationChallengeResult==null && other.getCompleteAuthenticationChallengeResult()==null) || 
             (this.completeAuthenticationChallengeResult!=null &&
              this.completeAuthenticationChallengeResult.equals(other.getCompleteAuthenticationChallengeResult())));
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
        if (getCompleteAuthenticationChallengeResult() != null) {
            _hashCode += getCompleteAuthenticationChallengeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompleteAuthenticationChallengeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CompleteAuthenticationChallengeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeAuthenticationChallengeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CompleteAuthenticationChallengeResult"));
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
