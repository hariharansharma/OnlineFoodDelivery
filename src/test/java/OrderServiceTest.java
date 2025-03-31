import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    void testCalculateTotal() {
        OrderService service = new OrderService();
        int total = service.calculateTotal(200, 3);

        assertEquals(600, total, "Total price calculation is incorrect!");
    }
}
