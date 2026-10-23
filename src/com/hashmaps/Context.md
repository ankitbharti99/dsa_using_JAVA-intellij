In Java, an interface called `Map`.

-> And there is a `Set` interface also which adds a collection of items with no duplicate items. In `HashSet`, adding, removing, and checking for an item takes O(1) average time, but there is no key-value pair in it.

-> If we want to use a map but in sorted order, use `TreeMap`. It sorts the keys in ascending order by default. Operations like `get()`, `put()`, and `remove()` take O(log n) time.

But these are interfaces that define methods like `get()`, `put()`, `remove()`, etc. The implementation classes provide the actual functionality, so we don't need to worry about the internal implementation when using them.

The most popular implementation of `Map` is `HashMap` (key-value pairs). Keys must be unique, but values can be duplicated.

**HashMap and Hashtable are different:**

`HashMap` is not synchronized, so it is not thread-safe. It cannot be shared between multiple threads that modify it concurrently without proper synchronization.

Whereas `Hashtable` is synchronized, meaning its individual methods are synchronized. However, for modern Java applications, `ConcurrentHashMap` is generally preferred for concurrent access.

`HashMap` allows one `null` key and multiple `null` values, whereas `Hashtable` does not allow any `null` keys or values.

**Why does HashMap allow null but Hashtable does not?**

-> This is mainly due to their API design and implementation. `HashMap` was designed to support `null` keys and values, while the older `Hashtable` implementation explicitly prohibits them.

-> A `null` value can make it difficult to distinguish between a missing key and a key mapped to `null` when using `get()`. In `HashMap`, we can use `containsKey()` to distinguish between these cases. `Hashtable` avoids this ambiguity by prohibiting null keys and values.

-> The restriction is not because `Hashtable` is synchronized. Synchronization itself does not require a class to reject null values.

**Additional points:**

-> `Map` stores key-value pairs, whereas `Set` stores unique elements.

-> `HashMap` does not guarantee iteration order, whereas `LinkedHashMap` maintains insertion order.

-> `TreeMap` sorts keys, not values.

-> `HashMap` and `HashSet` generally provide O(1) average-time operations, while `TreeMap` and `TreeSet` generally provide O(log n) operations.