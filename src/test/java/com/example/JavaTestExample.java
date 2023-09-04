package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;

/**
 * This is an example class
 * Use it as reference
 */
public class JavaTestExample {

    @Test
    public void aSimpleTest() {
        Integer zero = 0;
        Assertions.assertEquals(0, zero.intValue());
    }

    @Test
    public void aTestWithMockito() {
        MyClass mock = Mockito.mock(MyClass.class);
        MyCallerClass myCallerClass = new MyCallerClass(mock);

        myCallerClass.doSomethingElse();

        Mockito.verify(mock, Mockito.times(1)).doSomething();
    }

    private class MyCallerClass {

        private MyClass myClass;

        private MyCallerClass(MyClass myClass) {
            this.myClass = myClass;
        }

        public void doSomethingElse() {
            myClass.doSomething();
        }
    }

    private class MyClass {

        public void doSomething() {
        }
    }
}
