package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RemarkTest {

    @Test
    public void equals() {
        Remark remark = new Remark("Hello");

        // same object return true
        assertTrue(remark.equals(remark));

        // same values return true
        Remark remarkCopy = new Remark("Hello");
        assertTrue(remark.equals(remarkCopy));

        // object with null returns false
        assertFalse(remark.equals(null));

        // different class returns false
        assertFalse(remark.equals(1));

        // different values return false
        Remark otherRemark = new Remark("Bye");
        assertFalse(remark.equals(otherRemark));
    }
}
