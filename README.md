# Data-Structures
**This repo consists of code snippets for implementation of following data structures**
1. Linked List.
Linked list is a dynamic data structure so it can grow and shrink at runtime by allocating and deallocating memory. So there is no need to give initial size of linked list.
*Insertion and Deletion*
Insertion and deletion of nodes are really easier. Unlike array here we don’t have to shift elements after insertion or deletion of an element. In linked list we just have to update the address present in next pointer of a node.
*No Memory Wastage*
As size of linked list can increase or decrease at run time so there is no memory wastage. In case of array there is lot of memory wastage, like if we declare an array of size 10 and store only 6 elements in it then space of 4 elements are wasted. There is no such problem in linked list as memory is allocated only when required.
*Implementation*
Data structures such as stack and queues can be easily implemented using linked list.

2. Stack.

A stack is a data structure which uses LIFO order.
Some Applications of a stack are:
•	Converting infix to postfix expressions.
To convert infix expression to postfix expression, we will use the stack data structure. By scanning the infix expression from left to right, when we will get any operand, simply add them to the postfix form, and for the operator and parenthesis, add them in the stack maintaining the precedence of them.
•	Undo operation is also carried out through stacks.
•	Syntaxes in languages are parsed using stacks.
•	It is used in many virtual machines like JVM.
 (JVM) is an engine that provides runtime environment to drive the Java Code or applications.

3. Queue.



