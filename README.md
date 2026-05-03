# Proyecto-final-ED

1st Code Smell: OO Abusers: Switch Statements
At first, For guessing the bill depending on the kind of Insurrance and the days long in the hospital, 
we used a Switch, but this method had made us add a new type of insurrance, wich made us to modify the code in multiples lines.

**Applied solution:**

We converted to abstract the Patient class, due to make abstract the calcStationCost() Method.
We created the classes `Private`, `Public` and `VIP`,Overrited with their specific calc implementation

Now, the code is eassier to mantain, and has more scability, this has been tested at "HospitalTest.java" with an example of a private insurance of 2 days long.

Before:
![img.png](img.png)

After:

On patient class:
![img_1.png](img_1.png)

On every insurances class:
![img_2.png](img_2.png)


