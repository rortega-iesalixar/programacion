Proceso U1T6
//	Definir cod Como Entero
//	Definir pass Como Entero
//	
//	Repetir
//		Escribir "Introduce C�digo de Usuario:"
//		Leer cod
//		Escribir "Introduce Contrase�a:"
//		Leer pass
//		Si cod <> 1 o pass <> 1234 Entonces
//			Escribir "Usuario y/o pass incorrectos."
//		Fin Si
//	Hasta Que cod = 1 y pass = 1234
//	
//	Escribir "Has entrado!"
	
	
//	Definir num1 Como Entero
//	Definir num2 Como Entero
//	
//	Repetir
//		Escribir "Introduce un n�mero:"
//		Leer num1
//		Escribir "Introduce otro n�mero:"
//		Leer num2
//		Escribir "La suma es: " num1 + num2
//	Hasta Que num1 = 0 y num2 = 0
//	
//	Escribir "Fin de la suma."
	
	
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir "Introduce un n�mero:"
	Leer num1
	Escribir "Introduce otro n�mero:"
	Leer num2
	Repetir
		Si num2 = 0 Entonces
			Escribir "El segundo n�mero no puede ser 0, intruduzca otro n�mero:"
			Leer num2
		FinSi
	Hasta Que num2 <> 0
	
	Escribir num1 " / " num2 " = " num1 / num2
		
FinProceso
