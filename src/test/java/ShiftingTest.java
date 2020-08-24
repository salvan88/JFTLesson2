import gerzen777gmail.com.boxtask.model.Apple;
import gerzen777gmail.com.boxtask.model.Box;
import gerzen777gmail.com.boxtask.model.Orange;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ShiftingTest {

    @Test
    public void newShiftingTest() {

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();

        box1.putFruit(new Apple(), 3);
        box2.putFruit(new Orange(), 2);
        box3.putFruit(new Apple(), 1);

        Assertions.assertEquals(2, box1.shifting(box2).size());
    }
}
