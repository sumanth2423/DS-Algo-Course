# Two Pointer Pattern

## Type of problems

Sorted Arrays and need to find elements that fulfill certain constraints

## Example

Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.

To solve this problem we can consider each element ony by one and iterate through the rest of the elements

- Time Complexity O(n square)

An efficient way would be start with one pointer in the beginning and another pointer at the end

- Time Complexity is O(n)
- At every step check the sum pointed by the two pointers and if it is not equal then do one of the following

  - If the sum is greater than the target number then decrement the end pointe
  - If the sum is less than the target number then increment the start pointer
