/**
 * RequestAuthenticationChallengeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class RequestAuthenticationChallengeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.LoginDTO requestAuthenticationChallengeResult;

    public RequestAuthenticationChallengeResponse() {
    }

    public RequestAuthenticationChallengeResponse(
           org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.LoginDTO requestAuthenticationChallengeResult) {
           this.requestAuthenticationChallengeResult = requestAuthenticationChallengeResult;
    }


    /**
     * Gets the requestAuthenticationChallengeResult value for this RequestAuthenticationChallengeResponse.
     * 
     * @return requestAuthenticationChallengeResult
     */
    public org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.LoginDTO getRequestAuthenticationChallengeResult() {
        return requestAuthenticationChallengeResult;
    }


    /**
     * Sets the requestAuthenticationChallengeResult value for this RequestAuthenticationChallengeResponse.
     * 
     * @param requestAuthenticationChallengeResult
     */
    public void setRequestAuthenticationChallengeResult(org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.LoginDTO requestAuthenticationChallengeResult) {
        this.requestAuthenticationChallengeResult = requestAuthenticationChallengeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestAuthenticationChallengeResponse)) return false;
        RequestAuthenticationChallengeResponse other = (RequestAuthenticationChallengeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestAuthenticationChallengeResult==null && other.getRequestAuthenticationChallengeResult()==null) || 
             (this.requestAuthenticationChallengeResult!=null &&
              this.requestAuthenticationChallengeResult.equals(other.getRequestAuthenticationChallengeResult())));
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
        if (getRequestAuthenticationChallengeResult() != null) {
            _hashCode += getRequestAuthenticationChallengeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestAuthenticationChallengeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RequestAuthenticationChallengeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestAuthenticationChallengeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RequestAuthenticationChallengeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Ball_of_Duty_Server.DTO", "LoginDTO"));
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
