package com.nooobcoder.solution;

import com.nooobcoder.solution.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    public void whenPalindrom_thanAccept() {
        Solution palindromeTester = new Solution();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }

    @Test
    public void whenNearPalindrom_thanReject() {
        Solution palindromeTester = new Solution();
        assertFalse(palindromeTester.isPalindrome("neon"));
    }
}