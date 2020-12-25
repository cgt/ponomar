package Ponomar;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StringOpTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream capturedOutput = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(capturedOutput));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(stdout);
    }

    @Test
    public void main() {
        StringOp.main(new String[]{""});
        Approvals.verify(capturedOutput.toString());
    }
}