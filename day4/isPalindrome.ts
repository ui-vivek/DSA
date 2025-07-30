/*
Problem Statement: "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.

Examples:

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

*/

function isPal(str: string):boolean {
  let revStr = str.split("").reverse().join("");

  if (str == revStr) {
    return true;
  }
  return false;
}

let str = "ABCDCBA";
console.log(isPal(str))
