#include<pic18f4520.h>
#include<xc.h>
#include<stdio.h>
#define _XTAL_FREQ 8000000
#include "int.h" //put your header name here
/*This C code is designed for a PIC18F4520 microcontroller

1. It includes necessary header files for the PIC18F4520 microcontroller, XC compiler, and standard input/output functions.
2. It defines the crystal frequency `_XTAL_FREQ` as 8 MHz.
3. It includes a custom header file `"int.h"` which presumably contains some interrupt-related declarations or definitions.
4. It declares a global variable `count`.
5. It defines an ISR (Interrupt Service Routine) function named `ISR` which handles interrupts. Depending on the source of the interrupt (`INT0`, `INT1`, or `INT2`), it increments the `count` variable, lights up an LED connected to `PORTBbits.RB3`, and delays for 1 second.
6. The `main` function configures the ports (`TRISB` and `TRISD`) as input/output, initializes the `count` variable to zero, configures interrupts (`INTCON`, `INTCON2`, `INTCON3`), and enters an infinite loop (`while(1)`) to keep the microcontroller running indefinitely.
*/

int count; //global variable 

void ISR(void){ // function to be called by main

	if (INTCONbits.INT0TF){
	count++; //increments the counter
	PORTD=count;
	PORTBbits.RB3=1; //light up the LED for a particular interrupt of a agent
	__delay_ms(1000);//delay for 1 sec
	}
	else if(INTCON3bits.INT1IF){
	count++;
	PORTBbits.RB3=1;
	__delay_ms(1000);
	}
	else if (INTCON3bits.INT2IF){
	count++;
	PORTBbits.RB3=1;
	__delay_ms(1000);
	}
}

void main (void){
	int 1;
	TRISB=0xF7;
	PORTB=0xF7;
	TRISD=0x00;
	count=0;
	PORTD=count;
	RCONbits.IPEN=1;
	INTCON=0x90;
	INTCON2=0xF0;
	INTCON3=0xD0;
	//for(i=0;i<5;i++){
	__delay_ms(1000); //creats 5 sec delay
	//}
	while(1){}
}