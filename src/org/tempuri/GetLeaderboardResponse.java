/**
 * GetLeaderboardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetLeaderboardResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO[] getLeaderboardResult;

    public GetLeaderboardResponse() {
    }

    public GetLeaderboardResponse(
           org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO[] getLeaderboardResult) {
           this.getLeaderboardResult = getLeaderboardResult;
    }


    /**
     * Gets the getLeaderboardResult value for this GetLeaderboardResponse.
     * 
     * @return getLeaderboardResult
     */
    public org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO[] getGetLeaderboardResult() {
        return getLeaderboardResult;
    }


    /**
     * Sets the getLeaderboardResult value for this GetLeaderboardResponse.
     * 
     * @param getLeaderboardResult
     */
    public void setGetLeaderboardResult(org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.PlayerDTO[] getLeaderboardResult) {
        this.getLeaderboardResult = getLeaderboardResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLeaderboardResponse)) return false;
        GetLeaderboardResponse other = (GetLeaderboardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLeaderboardResult==null && other.getGetLeaderboardResult()==null) || 
             (this.getLeaderboardResult!=null &&
              java.util.Arrays.equals(this.getLeaderboardResult, other.getGetLeaderboardResult())));
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
        if (getGetLeaderboardResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetLeaderboardResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetLeaderboardResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLeaderboardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetLeaderboardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLeaderboardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetLeaderboardResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Ball_of_Duty_Server.DTO", "PlayerDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Ball_of_Duty_Server.DTO", "PlayerDTO"));
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
