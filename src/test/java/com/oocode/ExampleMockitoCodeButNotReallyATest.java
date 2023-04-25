package com.oocode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.*;

public class ExampleMockitoCodeButNotReallyATest {
    @Test
    public void mockitoKnowsHowToMock() {
        SomeInterface someInterface = mock(SomeInterface.class);

        given(someInterface.makeSound()).willReturn("moo");

        assertThat(someInterface.makeSound(), equalTo("moo"));

        verify(someInterface).makeSound();
    }

    public interface SomeInterface {
        String makeSound();
    }
}
