package org.omg.CosNaming;


/**
* org/omg/CosNaming/NameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/java8-openjdk/src/jdk8u-jdk8u222-b05/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Tuesday, June 18, 2019 10:26:11 AM CEST
*/


/**
   * A name is a sequence of name components.
   */
public final class NameHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NameComponent value[] = null;

  public NameHolder ()
  {
  }

  public NameHolder (org.omg.CosNaming.NameComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NameHelper.type ();
  }

}