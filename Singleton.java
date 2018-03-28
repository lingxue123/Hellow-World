package com.wufei.test;
/*
 * @author wf
 * 双重检查的懒汉式单例
 */
public class Singleton{
  private static Singleton singleton = null;
  private Singleton(){
  }
  public static Singleton getInstance(){
    if(singleton==null){
      synchronized(Singleton.class){
        if(singleton==null){
           singleton = new Singleton();
        }
      }
    }
    return singleton;
  }
}
