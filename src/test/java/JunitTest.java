import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Test;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class JunitTest {

    @InjectMocks
    Junit junit;

    @Test
    public void Testcalculate() {
        assertEquals(4,junit.calculate(3,1));
    }
}