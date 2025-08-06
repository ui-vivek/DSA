# DSA Journey

This repository tracks my daily progress in solving Data Structures and Algorithms problems.

## Daily Log

### Day 1
*   **Count Digits**:
    > You are given an integer n. You need to return the number of digits in the number.
    > The number will have no leading zeroes, except when the number is 0 itself.*   
*   **Reverse Digits of A Number**:
    > Given an integer N return the reverse of the given number.*

### Day 2
*   **Check if a number is Palindrome or Not**:
    > A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
*   **Print all Divisors**:
    > Given an integer `n`, return all of its divisors.
*   **Check Armstrong Number**:
    > Given an integer `n`, check if it is an Armstrong number. An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
*   **Find GCD of two numbers**:
    > Given two non-negative integers `n1` and `n2`, find their greatest common divisor (GCD).*

### Day 3
*   **Print 1 to N using Recursion**:
    > Print numbers from 1 to N using a recursive function.
*   **Print N to 1 using Recursion**:
    > Print numbers from N to 1 using a recursive function.
*   **Sum of first N Natural Numbers**:
    > Given an integer N, find the sum of the first N natural numbers.
*   **Factorial of a Number**:
    > Given an integer N, find its factorial.
*   **Check if a number is Prime**:
    > Given an integer N, determine if it is a prime number.*

### Day 4
*   **Fibonacci Number**:
    > Write a function to find the Nth Fibonacci number.
*   **Check if a string is a Palindrome**:
    > Given a string, check if the string is a palindrome or not. A string is said to be a palindrome if the reverse of the string is the same as the string.
*   **Reverse an Array**:
    > You are given an array. The task is to reverse the array.

### Day 5
*   **Count Frequency of Each Element**:
    > Given an array, count the frequency of each element in the array.

### Day 6
*   **Find the Highest/Lowest Frequency Element**:
    > Given an array of integers, find the elements that have the highest and lowest frequency.
*   **Exploring Map Implementations**:
    > Practiced using `HashMap`, `LinkedHashMap`, and `TreeMap` to understand their distinct behaviors and use cases in Java.

#### Key Differences: `HashMap` vs. `LinkedHashMap` vs. `TreeMap`

| Feature          | HashMap                                                  | LinkedHashMap                                                | TreeMap                                                                    |
| :--------------- | :------------------------------------------------------- | :----------------------------------------------------------- | :------------------------------------------------------------------------- |
| **Ordering**     | Unordered                                                | Insertion Order                                              | Sorted Order (Natural or by Comparator)                                    |
| **Performance**  | O(1) for `get`/`put` (average)                           | O(1) for `get`/`put` (average)                               | O(log n) for `get`/`put`                                                   |
| **Implementation** | Hash Table                                               | Hash Table + Doubly-Linked List                              | Red-Black Tree                                                             |
| **Nulls**        | 1 `null` key, multiple `null` values                     | 1 `null` key, multiple `null` values                         | No `null` keys (natural order), multiple `null` values                     |
| **Use Case**     | Fast lookups where order doesn't matter.                 | Caches or maintaining insertion sequence.                    | When a map sorted by its keys is required.                                 |

### Day 7
*   **Insertion Sort**:
    > Implemented the insertion sort algorithm to sort an array in ascending order.

### Day 8
*   **Bubble Sort**:
    > Implemented the bubble sort algorithm, including an optimization to stop early if the array is already sorted.

---
*This log will be updated daily.*
