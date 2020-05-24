package com.gupaoedu.vip.custom;
import java.lang.reflect.Method;
public class $Proxy0 implements com.gupaoedu.vip.custom.Person{
GPInvocationHandler h;
public $Proxy0(GPInvocationHandler h) {
this.h = h;
}
public void findLove(){
try{
Method m = com.gupaoedu.vip.custom.Person.class.getMethod("findLove",new Class[]{});
this.h.invoke(this,m,null);
}catch(Throwable e){e.printStackTrace();}
}
}