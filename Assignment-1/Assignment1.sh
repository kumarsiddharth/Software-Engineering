g++ -g -lpthread -std=c++11 multiThread.cpp -lpthread -o multiThread

#1. Running a program
gdb multiThread

#2. Loading symbol table
#using the -g flag while compilation

#3. Setting a break-point
b 24
b 13
#4. Listing variables and examining their values
info locals #for local variables
info args # list the arguments to the current function

#5. Printing content of an array or contiguous memory
p *arr@5

#6. Printing function arguments
info args

#7. Next, Continue, Set command
next 1
step 
cont

#8. Single stepping into function
next
#9. Listing all break point
info b
#10. Ignoring a break-point for N occurrence
ignore 2 3 # cmd: ignore break-no count 

#11. Enable/disable a break-point
disable 3 
enable 3

#12. Break condition and Command
#codition break-no. condition. Example: condition 2 i == 20 => break on breakpoint 2 if i equals 20

#13. Examining stack trace
*(gdb) bt        	print stack backtrace
(gdb) frame        	show current execution position
(gdb) up        	move up stack trace  (towards main)
(gdb) down        	move down stack trace (away from main)

#14. Examining stack trace for multi-threaded program

#15. Core file debugging

#16. Debugging of a already running program
attach processID

#17. Some more advance concepts based on your interest - for example 'watchpoint'
