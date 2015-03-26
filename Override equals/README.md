#"==" VS "equals"
---------------------------------------

1. "==" operator

    User u1 = new User();
    User u2 = new User();
    User u3 = u1;
In the heap memoery, U1 and U3 they point to a same address. However, U2 is different.

2. equals
    
    object is "equal to" this one.
    First, two objects are same type;
    Second, two objects have same variables.  


    In the Test and User class, we override equals. In order to test it, in the Test class, I set this to compare two objects.

    <User u1 = new User("Tom", 12);
    User u2 = new User("Darren", 12);
    User u3 = new User("Tom", 12);
    boolean b1 = u1.equals(u2);
    boolean b2 = u1.equals(u3);>