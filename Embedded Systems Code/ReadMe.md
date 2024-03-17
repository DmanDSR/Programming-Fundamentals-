Embedded Systems Codes

1.Interrupt Managing
  - This C code is designed for a PIC18F4520 microcontroller, focusing on interrupt handling and port configuration. It includes necessary header files, defines the crystal frequency,
 and declares a global variable named "count." An Interrupt Service Routine (ISR) called "ISR" manages interrupts from INT0, INT1, or INT2, incrementing the count variable, controlling an LED,
 and introducing a 1-second delay. Within the main function, ports are configured, interrupts initialized, and an infinite loop is established to maintain microcontroller operation.

2. Pin Toggling and Setting Specific Values
   - This C code is meant for a PIC18F4520 microcontroller. It involves toggling pins and setting specific values on PORTA, PORTB, and PORTD, for testing or demonstration purposes.

3. Temperature Control
   - This C code attempts to simulate a simple temperature control system. However, it fails to modify the `temp` variable, rendering the condition checks ineffective.
     The description outlines the structure of the code, including its inclusion of the standard input/output library, definition of the `main` function, and declaration of variables.
     Additionally, it explains the logic behind the conditional statements based on the value of `temp`. To rectify the code's functionality, it suggests initializing the `temp` variable before the if-else statements and adding a return statement at the end of `main`.

4. Total Loop
   - This C code features a loop that continuously increases a variable named `total` until it reaches 1000. The breakdown highlights its structure, including the inclusion of the standard input/output library,
     the definition of the `main` function, and the initialization of variables. Inside the `main` function, a `while` loop iterates until `total` equals 1000, incrementing `total` by 1 each time.
     However, there's a flaw in the `printf` statement, where it erroneously attempts to concatenate a string with the memory address of `total`. Correcting this to use `%d` for the integer value of `total` should resolve the issue.
     Additionally, the program lacks a return statement at the end of `main`. Once the `printf` issue is rectified, the program should correctly output "The Total is 1000". This code is suitable for general-purpose computing environments
     due to its reliance on standard input/output functions and lack of hardware-specific instructions.
