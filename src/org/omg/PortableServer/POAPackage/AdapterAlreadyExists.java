package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/AdapterAlreadyExists.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u152/9742/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, September 14, 2017 2:16:52 AM PDT
*/

public final class AdapterAlreadyExists extends org.omg.CORBA.UserException
{

  public AdapterAlreadyExists ()
  {
    super(AdapterAlreadyExistsHelper.id());
  } // ctor


  public AdapterAlreadyExists (String $reason)
  {
    super(AdapterAlreadyExistsHelper.id() + "  " + $reason);
  } // ctor

} // class AdapterAlreadyExists
