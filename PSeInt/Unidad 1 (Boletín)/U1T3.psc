Proceso U1T3
	
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir "Dime un número:"
	Leer num1
	Escribir "Dime otro número:"
	Leer num2
	
	//Ejercicio 1
	//Si num1 = num2 Entonces
	//	Escribir "Son Iguales!!"
	//SiNo
	//	Escribir "No son iguales!!"
	//FinSi
	
	//Ejercicio 2
	//Si num1 < 0 Entonces
	//	Escribir "El número es negativo."
	//SiNo
	//	Si num1 = 0 Entonces
	//		Escribir "El número es 0."
	//	SiNo
	//		Escribir "El número es positivo."
	//	FinSi
	//FinSi
	
	//Ejercicio 3
//	Si num1 > 0 y num2 > 0 Entonces
//		Escribir "Hay dos números positivos."
//	SiNo
//		Si num1 <= 0 y num2 > 0 Entonces
//			Escribir "Hay un número positivo."
//		SiNo
//			Si num1 > 0 y num2 <= 0 Entonces
//				Escribir "Hay un número positivo."
//			SiNo
//				Escribir "No hay números positivos."
//			FinSi
//		FinSi
//	FinSi
	
	//Ejercicio 4
	Si num1 > 0 y num2 > 0 Entonces
		Escribir "Ambos son positivos."
	SiNo
		Si num1 > 0 o num2 > 0 Entonces
			Escribir "Uno es positivo."
		SiNo
			Escribir "No hay números positivos."
		Fin Si
	Fin Si
	
FinProceso
