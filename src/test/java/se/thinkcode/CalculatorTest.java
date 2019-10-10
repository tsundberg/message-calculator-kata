package se.thinkcode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    public void should_verify_unit_test_env() {
        String expected = "Hello!";
        Calculator calculator = new Calculator();

        String actual = calculator.hello();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void should_send_an_event_to_a_listener() {
        MessageBus bus = new MessageBus();
        Listener listener = new Calculator();

        bus.addListener(listener);

        bus.sendMessage("Hi there!");

        assertThat(((Calculator) listener).getMessage()).isEqualTo("Hi there!");
    }

    

}
