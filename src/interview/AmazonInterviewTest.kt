package interview

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

internal class AmazonInterviewTest {
    private var subject: AmazonInterview? = null

    @BeforeEach
    fun setUp() {
        subject = AmazonInterview()
    }

    @AfterEach
    fun tearDown() {
        subject = null
    }
}