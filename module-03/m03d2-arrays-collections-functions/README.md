# Module 03: Day 2 - Array, Functions and Debugging
Expanding from the the primitive datatypes, computers also work with lists of data; one of the most basic is the *array*.  An array offers a way to process a list of items, apply rules repeatedly and collect a series of results.

As students are now conversant with the basic data types and flow, we introduce some tools so that we can watch what is happening when a program runs and find where a program does the __bad__ thing (that is to say, *goes awry*).  

Lastly we show how you can extend a program to use external code (or objects &amp; methods) developed by others (i.e. libraries).

## Objectives
- Functions (methods) and fields
- Main
- Arrays
- Intro to debugging code


## Materials & Resources
- One of the examples makes use of a library that is available over the internet (from a source called Maven).  Called `commons-lang` you will need it for use in the Array exercise.

| Link | Comment| Time |
|:---- |:------ |-----:|
|https://www.youtube.com/watch?v=1HTsLK_m2ao|Methods & Fields, Using Functions (Bana.05)|14:06|
|https://www.youtube.com/watch?v=eNPX2pTiaHI|Arrays (Bana.09) (before 08!)|18:08|
|https://www.youtube.com/watch?v=rGlJiUO-dZA|Functions with Classes (Bana.08) | 16:48|
|https://www.youtube.com/watch?v=_pUz-GJcdRU|Arrays & For Loop| 21:00|
|https://www.youtube.com/watch?v=IEqvmsqjpT0|Arrays (related to Object, Bana.11)| 11:07|
|https://www.jetbrains.com/help/idea/2016.2/tutorial-debugging-your-first-java-application.html|How to debug using IntelliJ|
|https://youtu.be/Mr2mPu1tLhk?t=240|Adding a Maven Dependency (this is tip #8, tip #2 Comments at 1 min is also useful at this point)|6:49|


### Optional
| Link | Comment| Time |
|:---- |:------ |-----:|
|[The commons-lang library](http://commons.apache.org/proper/commons-lang/download_lang.cgi)| Explanation of this *add-in*||
|[Jetbrains - list of steps](https://www.jetbrains.com/help/idea/2016.2/configuring-project-and-global-libraries.html#lib_add_to_module_dependencies)|How to add in a library||
|[Jetbrains - downloading libraries](https://www.jetbrains.com/help/idea/2016.2/downloading-libraries-from-maven-repositories.html)| Using Maven||
|[Bana.07 - Exceptions, Try, Catch](https://www.youtube.com/watch?v=EWj60p8esD0)|If curious, mentioned in other videos; will cover later. |15:42|
|[Debugging with IntelliJ](http://blog.javafortesters.com/2016/07/how-to-debug-java-with-intellij.html)|Describing how one uses the debugger in IntelliJ||
|[Smartphone App Store](https://www.google.hu/url?sa=t&rct=j&q=&esrc=s&source=web&cd=5&cad=rja&uact=8&ved=0ahUKEwicjbnV_tTPAhVBDsAKHfvyBjsQFggxMAQ&url=https%3A%2F%2Fplay.google.com%2Fstore%2Fapps%2Fdetails%3Fid%3Dcom.sololearn.java%26hl%3Den&usg=AFQjCNFNXrlHnGw_HpQSbCy7h6QrdCiwxw&sig2=ZZL9MFAHIdpxd5cgomvf8Q)|Consider a smartphone app for practicing on the go (Sololearn Java)||

## Assignment Review 

###  Previous assignment
- Loop printing out prime numbers from 2 to 100

### Add in a library
*There's a useful set of routines that exists outside of the main Java built-in statements which, as we are covering arrays, we'd like to loop in.*
- Why are there libraries
- How are they added so that IDEA knows about them
- How do you include them in a program; reference them in the code.

### Arrays
- overview
  - index and content
  - static vs dynamic
  - dimensioned (space allocated)
- initalise arrays
  - "new" 
  - redefine the values
  - declaration
  - initialise with values {"a","b"}
- loop through an array
- multi-dimensional arrays
- fill()
- Arrays.toString(*array variable*) __NOT__ *array variable*.toString as *Arrays* is a library function
- type in an array (i.e. Array&lt;type&gt;) 

Optional: *jagged arrays*

### Functions
- Purpose
- Return statement and value
- Input Parameters
- Scoping
  - re-use named variable
  - global variable
  - passing by reference vs value

### Main()
- Fixed invocation
- There can only be 1 per program
  - Identify which is the *entry* point
- How to read the parameter(s) passed

### Debugging - Introduction
- Setting a break point and *walk through* the program
- Inspecting a variable

### Exceptions (Optional)
We plan to cover this later in the course but it comes up so at this point we mention it only so that you are familar.
- What can cause an exception
- Unhandled outcome
- The syntax

### External Libraries/Maven (Optional)
As there are many examples where external libraries are used, we will briefly now show how to add such in.  We will cover libraries in more depth later in the course.


## Workshop/Practice 

### Challenge Loops
Review the loop challenges found at http://www.homeandlearn.co.uk/java/java_for_loops.html
- What causes loops to terminate?
- Practice stepping through programs using the debugger and checking on the values of the variables.
 
### Challenge "Descending Order"
- https://www.codewars.com/kata/descending-order/train/java


# Links
- [Return to Module Overview](..)
- [Previous day](https://github.com/greenfox-academy/teaching-materials/tree/master/java-basics/1-installing-basics)
- [Next day](../m03d3)