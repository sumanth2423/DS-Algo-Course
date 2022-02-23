String objects are immutable in java. immutable means unmodifiable or unchangeable
When you explictly assign new value to a string a new object is created with a new reference

Since the string is immutable(unchangeble), concatnaton works by first allocating enough space for the new string, copy the contents from the old string and append to the new string
Hence time complexity is O(n^2)
