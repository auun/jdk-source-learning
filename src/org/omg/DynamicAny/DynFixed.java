package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynFixed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/java8-openjdk/src/jdk8u-jdk8u222-b05/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Tuesday, June 18, 2019 10:26:12 AM CEST
*/


/**
    * DynFixed objects support the manipulation of IDL fixed values.
    * Because IDL does not have a generic type that can represent fixed types with arbitrary
    * number of digits and arbitrary scale, the operations use the IDL string type.
    */
public interface DynFixed extends DynFixedOperations, org.omg.DynamicAny.DynAny, org.omg.CORBA.portable.IDLEntity 
{
} // interface DynFixed