package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerNotRegistered.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/java8-openjdk/src/jdk8u-jdk8u222-b05/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Tuesday, June 18, 2019 10:26:12 AM CEST
*/

public final class ServerNotRegistered extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerNotRegistered ()
  {
    super(ServerNotRegisteredHelper.id());
  } // ctor

  public ServerNotRegistered (String _serverId)
  {
    super(ServerNotRegisteredHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerNotRegistered (String $reason, String _serverId)
  {
    super(ServerNotRegisteredHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerNotRegistered
