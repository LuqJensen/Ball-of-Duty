/**
 * NewAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class NewAccount  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String nickname;

    private java.lang.Integer playerId;

    private byte[] salt;

    private byte[] hash;

    public NewAccount() {
    }

    public NewAccount(
           java.lang.String username,
           java.lang.String nickname,
           java.lang.Integer playerId,
           byte[] salt,
           byte[] hash) {
           this.username = username;
           this.nickname = nickname;
           this.playerId = playerId;
           this.salt = salt;
           this.hash = hash;
    }


    /**
     * Gets the username value for this NewAccount.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this NewAccount.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the nickname value for this NewAccount.
     * 
     * @return nickname
     */
    public java.lang.String getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this NewAccount.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the playerId value for this NewAccount.
     * 
     * @return playerId
     */
    public java.lang.Integer getPlayerId() {
        return playerId;
    }


    /**
     * Sets the playerId value for this NewAccount.
     * 
     * @param playerId
     */
    public void setPlayerId(java.lang.Integer playerId) {
        this.playerId = playerId;
    }


    /**
     * Gets the salt value for this NewAccount.
     * 
     * @return salt
     */
    public byte[] getSalt() {
        return salt;
    }


    /**
     * Sets the salt value for this NewAccount.
     * 
     * @param salt
     */
    public void setSalt(byte[] salt) {
        this.salt = salt;
    }


    /**
     * Gets the hash value for this NewAccount.
     * 
     * @return hash
     */
    public byte[] getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this NewAccount.
     * 
     * @param hash
     */
    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewAccount)) return false;
        NewAccount other = (NewAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
            ((this.playerId==null && other.getPlayerId()==null) || 
             (this.playerId!=null &&
              this.playerId.equals(other.getPlayerId()))) &&
            ((this.salt==null && other.getSalt()==null) || 
             (this.salt!=null &&
              java.util.Arrays.equals(this.salt, other.getSalt()))) &&
            ((this.hash==null && other.getHash()==null) || 
             (this.hash!=null &&
              java.util.Arrays.equals(this.hash, other.getHash())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
        }
        if (getPlayerId() != null) {
            _hashCode += getPlayerId().hashCode();
        }
        if (getSalt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHash() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHash());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHash(), i);
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
        new org.apache.axis.description.TypeDesc(NewAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">NewAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "nickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "playerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "salt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
