package se.thinkcode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    public void should_send_an_event_to_a_listener() {
        MessageBus bus = new MessageBus();
        Listener listener = new Calculator();

        bus.addListener(listener);

        bus.sendMessage("Hi there!");

        assertThat(((Calculator) listener).getMessage()).isEqualTo("Hi there!");
    }

    @Test
    public void add_3_and_3_and_get_6_back() {
        MessageBus bus = new MessageBus();
        Calculator calculator = new Calculator();
        Printer printer = new Printer();

        bus.addListener(calculator);
        bus.addListener(printer);

        bus.sendMessage("add 3 and 3");

        int actual = printer.getResult();

        assertThat(actual).isEqualTo(6);
    }
}
