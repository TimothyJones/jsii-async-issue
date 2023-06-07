package org.example;

import io.contract_testing.contractcase.test.jsii_async_issue.Example;

public class Main {

  public static void main(String[] arg) throws InterruptedException {
    System.out.println("Java-host: Constructing Example");
    var foo = new Example();
    System.out.println("Java-host: Calling example.longRunningSomething()");
    foo.longRunningSomething();
    System.out.println("Java-host: Waiting for 5 seconds (the ticks should keep printing while this is happening, but they don't)");
    Thread.sleep( 5000);
    System.out.println("Java-host: Calling example.longRunningSomething() again");
    foo.longRunningSomething();
    System.out.println("Java-host: Note that both sets (1) and (2) of ticks restarted once the JS was called - because node was blocked until it was called from Java");
  }
}