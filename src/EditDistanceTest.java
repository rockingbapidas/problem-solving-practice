import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EditDistanceTest {
    private EditDistance editDistance;

    @BeforeEach
    void setUp() {
        editDistance = new EditDistance();
    }

    @AfterEach
    void tearDown() {
        editDistance = null;
    }

    @Test
    void Test_Edit_Distance_return_true() {
        boolean actual = editDistance.OneEditApart("cat", "cats");

        Assertions.assertTrue(actual);
    }

    @Test
    void Test_Edit_Distance_return_false() {
        boolean actual = editDistance.OneEditApart("cat", "act");

        Assertions.assertFalse(actual);
    }
}