# Incubyte_Assignment

Main.java [click](https://github.com/AnujMutha/Incubyte_Assignment/tree/main/src/Main.java)
<br/>
StringCalculator.java [click](https://github.com/AnujMutha/Incubyte_Assignment/tree/main/src/StringCalculator.java)

## 1 : Empty string as argument
```java
public class Main {

    public static void main(String[] args) {
        //Instantiating the StringCalculator class
        StringCalculator sc = new StringCalculator();
        //Calling add method by passing string as argument
        System.out.println(sc.add("");
     }
  }
        
```
### Output
```java
0
```
## 2 : Single String Digit as argument
```java
public class Main {

    public static void main(String[] args) {
        //Instantiating the StringCalculator class
        StringCalculator sc = new StringCalculator();
        //Calling add method by passing string as argument
        System.out.println(sc.add("1"));
    }
}
```
### Output
```java
1
```
## 3 : Multiple String Digit as argument
```java
public class Main {

    public static void main(String[] args) {
        //Instantiating the StringCalculator class
        StringCalculator sc = new StringCalculator();
        //Calling add method by passing string as argument
        System.out.println(sc.add("1,2,3,4"));
    }
}
```
### Output
```java
10
```
## 4 : Allowing alphabets as argument and adding their standard position from alphabet table in sum 
```java
public class Main {

    public static void main(String[] args) {
        //Instantiating the StringCalculator class
        StringCalculator sc = new StringCalculator();
        //Calling add method by passing string as argument
        System.out.println(sc.add("a,b,c,d"));
    }
}
```
### Output
```java
10
```
## 5 : Combination of alphabets and numbers
```java
public class Main {

    public static void main(String[] args) {
        //Instantiating the StringCalculator class
        StringCalculator sc = new StringCalculator();
        //Calling add method by passing string as argument
        System.out.println(sc.add("1,2,3,4,a,b,c,d"));
    }
}
```
### Output
```java
20
```
## 6 : Using ',' and '\n' as delimiter between alphabets and numbers
```java
public class Main {

    public static void main(String[] args) {
        //Instantiating the StringCalculator class
        StringCalculator sc = new StringCalculator();
        //Calling add method by passing string as argument
        System.out.println(sc.add("1,2,3\n4,5,6\nA\nb"));
    }
}
```
### Output
```java
24
```
## 7 : Using custom delimiter taken as input from user which starts with "//"
```java
public class Main {

    public static void main(String[] args) {
        //Instantiating the StringCalculator class
        StringCalculator sc = new StringCalculator();
        //Calling add method by passing string as argument
        System.out.println(sc.add("//:\n1:2:3:4:5:a:b"));
    }
}
```
### Output
```java
18
```
## 8 : Ignoring number gretaer than 1000
```java
public class Main {

    public static void main(String[] args) {
        //Instantiating the StringCalculator class
        StringCalculator sc = new StringCalculator();
        //Calling add method by passing string as argument
        System.out.println(sc.add("1,2,3,1001,1000,1,2");
    }
}
```
### Output
```java
1009
```
