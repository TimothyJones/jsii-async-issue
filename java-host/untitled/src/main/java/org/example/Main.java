package org.example;

import io.contract_testing.contractcase.test.jsii_async_issue.Example;

public class Main {

  public static void main(String[] arg) throws InterruptedException {
    System.out.println("Java-host: Constructing Example");
    var foo = new Example();
    System.out.println("Java-host: Calling example.longRunningSomething()");
    foo.longRunningSomething();
    System.out.println("Java-host: Waiting for 5 seconds");
    Thread.sleep( 5000);
    System.out.println("Java-host: Calling example.longRunningSomething() again");
    foo.longRunningSomething();
  }
}