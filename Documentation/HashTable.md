Hash table is a data structure which organizes data using hash functions in order to quick insert and search
Two types of Hash Tables

- Hash Set

  - Values are unique and not repeated

- Hash Map

  - Stores Key Value Pairs
  - Not thread-safe hence high performance
  - Allows one null key and multiple null values
  - Preferred over hash table if synchronization is not needed

- Hash Table
  - Stores Key Value Pairs
  - Thread-safe hence low performance
  - Does not allow nulls for key and values
  - Legacy

The principle of Hash Table

- Hash table uses concept of hash function to calculate which bucket the value should be inserted or retrieved for a given key
- When we insert a new key, the hash function will decide which bucket the key should be assigned and the key will be stored in the corresponding bucket
- When we want to search for a key, the hash table will use the same hash function to find the corresponding bucket and search only in the specific bucket
- Perfect hash function will be a one-one mapping between the key and the bucket

Time Space Complexity:
Insert Key/Value
Search By Key
Delete Key/Value
Constant Time - O(1) on average
Worst case - O(n) time when collisions
