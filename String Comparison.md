# String Comparison

Following Eli Sinai's comment, see below a clarification about String Comparison in Java.

In some recitations, we said that String objects in Java should be compared only
using `str1.equals(str2)` because `str1 == str2` would compare 
addresses of the object and not the value of the String. In fact, this is not always correct. 

If the String objects were all created using `new String()`, this will 
**always** create a new object in the heap, thus comparison using `str1 == str2` 
will compare two different addresses in the heap and return `False` even though 
the strings are the same. 

However, if we create a String object using String literal syntax `String s = "Hello"`,
it might return an existing object from String pool (which is kind of a cache of String objects)
and won't create another object. In this case, two variables will point to the same object in the memory,
hence `str1 == str2` will return `True`.   

Notice though that if we change the value of `str2` afterwards,
it'll automatically create a new object in the heap for it.

You can read more at this [link](https://www.java67.com/2014/08/difference-between-string-literal-and-new-String-object-Java.html#ixzz7N9c3jT78).

See below a snippet of code to exemplify this difference. 

```java
public class HelloWorld {
   
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false 
    }
}
```

That being said, I highly recommend comparing string objects 
using `str1.equals(str2)` as it **always** compares string values and not addresses. 