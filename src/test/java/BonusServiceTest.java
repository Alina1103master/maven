import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregistered() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean unregistered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, unregistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean unregistered = false;
        long expected = 50020;

        // вызываем целевой метод:
        long actual = service.calculate(amount, unregistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldUnregistered() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean unregistered = false;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, unregistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

}