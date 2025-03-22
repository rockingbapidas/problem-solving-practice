package linkedlist;

import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfPalindromeTest {
    @Test
    void test_palindrome_check_for_linked_list(){
        CheckIfPalindrome checkIfPalindrome = new CheckIfPalindrome();
        SingleLinkedListWrapper singleLinkedListWrapper = new SingleLinkedListWrapper();
        singleLinkedListWrapper.build(new int[]{1, 2, 3, 2 ,1});

        assertTrue(checkIfPalindrome.isPalindrome(singleLinkedListWrapper.mNodeHead));
    }

    @Test
    void test_palindrome_check_for_linked_list_false(){
        CheckIfPalindrome checkIfPalindrome = new CheckIfPalindrome();
        SingleLinkedListWrapper singleLinkedListWrapper = new SingleLinkedListWrapper();
        singleLinkedListWrapper.build(new int[]{1, 2, 3, 2 ,3});

        assertFalse(checkIfPalindrome.isPalindrome(singleLinkedListWrapper.mNodeHead));
    }
}