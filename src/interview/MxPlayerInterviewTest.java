package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MxPlayerInterviewTest {
    private MxPlayerInterview subject;

    @BeforeEach
    void setUp() {
        subject = new MxPlayerInterview();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }

    @Test
    void Test_SearchingChallenge_case_1() {
        String actual = subject.SearchingChallenge("(c([od]er)) b(yt[e])");

        Assertions.assertEquals("1 5", actual);
    }

    @Test
    void Test_ArrayChallenge_case_1() {
        String actual = subject.ArrayChallenge(new String[]{"12:15PM-02:00PM", "09:00AM-10:00AM", "10:30AM-12:00PM"});

        Assertions.assertEquals("00:30", actual);
    }

    @Test
    void Test_ArrayChallenge_case_2() {
        String actual = subject.ArrayChallenge(new String[]{"10:00AM-12:30PM","02:00PM-02:45PM","09:10AM-09:50AM"});

        Assertions.assertEquals("01:30", actual);
    }

    @Test
    void Test_GameChallenge_case_1() {
        String actual = subject.GameChallenge(new String[]{"X","O","-","<>","-","O","-","<>","O","X","-"});

        Assertions.assertEquals("", actual);
    }
}