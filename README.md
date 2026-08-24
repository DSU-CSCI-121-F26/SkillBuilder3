
# Skill Builder 3 - Defining Classes and Methods

## Learning Outcomes

By the end of this activity, a student should be able to:

1. Implement a simple Java class.
2. Include and use static fields.
3. Implement accessor and mutator methods
4. Design objects that interact with each other.

## The Grok Coalition

Your studio is building a new title featuring the **Grok**, a hungry little creature with a massive appetite for energy. But before we can launch the Grok into the world, we need to build its fuel source.

**The Mission:** You are tasked with engineering the PowerPill class. Think of this as the "battery" for your character. In this stage, you will define how much energy a pill holds and how it interacts with the world. Later on, we will drop the Grok into the mix to start the feeding frenzy!

## The PowerPill Class

Before the Grok can roam the digital wasteland, it needs a power grid. A PowerPill isn't just an object; it’s a discrete unit of energy waiting to be harvested.

Your objective is to build a flexible class that allows a "Client" (the game engine) to manufacture a wide variety of pills—from low-level "Zaps" to legendary "Overloads."

A PowerPill is a collectible object that the Grok will eventually ingest to boost its stats. As the developer, you need to ensure the game engine can create pills with varying names and potency levels.

```java
/**
 * PowerPill.java 
 * The primary energy source for the Grok species.
 */
public class PowerPill {
    // Your implementation goes here
}
```

## Implementation Sprint (Required Activities)

You are to implement the following in the `PowerPill` class.

1. Add a ***static*** integer field called `DEFAULT_POWER` and set it to 10. (**NOTE: static variables can be initialized outside of constructors, but NOT INSTANCE variables!**)
2. Add an integer field called `power`.
3. Add a String field called `name`.
4. Add a value constructor with a string parameter called `name`.  Add the javadoc comment below before the constructor name.
     <pre>
     /**
     * Initializes this power pill to a default power value
     * and sets the name of the pill to name.
     * @param name the name of this power pill.
     */
     </pre>
5. Add a value constructor where the first parameter is a string called `name` and the second parameter is an integer called `power`.

	<pre>
     /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
	</pre>

6. Add getter methods with an appropriate javadoc comment for each method.
7. Add setter methods with an appropriate javadoc comment for each method.
8. Add a `toString` method that returns a string formatted as,
   
   <pre>
   PowerPill &lt;name&gt; = &lt;power&gt;
   </pre>
   
   where `<name>` is replaced by the PowerPill object's name and <br>
         `<power>` is replaced with the PowerPill object's power

For example,

```
PowerPill p = new PowerPill("Pink", 20);
System.out.printn(p);
```

results in,

```
PowerPill Pink = 20
```

## System Integration (Usage Example)

An example of how the class may be used is,

```java
PowerPill bluePill = new PowerPill("Blue");
PowerPill redPill = new PowerPill("Red",40);

int bluePower = bluePill.getPower();
int redpower = redPill.getPower();

```

## 🧪 Testing & Debugging Strategy

### ⚠️ Resolving Syntax Errors

When you first open `PowerPillTest`, it will likely be full of errors. **Don't panic.** This is because the test file is looking for methods you haven't written yet. As you complete the requirements, the errors in `PowerPillTest` will resolve.

### 🐛 The Debugger is Your Best Friend

If a test fails, don't just guess!

1. **Set a Breakpoint:** Click the margin next to the line number where the failure occurs.
2. **Run Symbolic Debugger:** Watch your variables change in real-time to find exactly where the logic breaks.
3. **Verify Constructors:** If your getters are failing, your constructors likely aren't assigning values correctly.

## Submission

Please submit the PowerPill.java file on CodeGrade when you have completed the work.  The Game Guru will then score your work and add it the dev release if it is worthy.

<span style="font-size:2em;color:green;">Happy Coding!</span>