package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/java8-openjdk/src/jdk8u-jdk8u222-b05/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Tuesday, June 18, 2019 10:26:12 AM CEST
*/

public final class ServerAlreadyActive extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerAlreadyActive ()
  {
    super(ServerAlreadyActiveHelper.id());
  } // ctor

  public ServerAlreadyActive (String _serverId)
  {
    super(ServerAlreadyActiveHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyActive (String $reason, String _serverId)
  {
    super(ServerAlreadyActiveHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyActive
