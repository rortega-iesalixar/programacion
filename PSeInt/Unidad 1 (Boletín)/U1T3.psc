Proceso U1T3
	
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir "Dime un n�mero:"
	Leer num1
	Escribir "Dime otro n�mero:"
	Leer num2
	
	//Ejercicio 1
	//Si num1 = num2 Entonces
	//	Escribir "Son Iguales!!"
	//SiNo
	//	Escribir "No son iguales!!"
	//FinSi
	
	//Ejercicio 2
	//Si num1 < 0 Entonces
	//	Escribir "El n�mero es negativo."
	//SiNo
	//	Si num1 = 0 Entonces
	//		Escribir "El n�mero es 0."
	//	SiNo
	//		Escribir "El n�mero es positivo."
	//	FinSi
	//FinSi
	
	//Ejercicio 3
//	Si num1 > 0 y num2 > 0 Entonces
//		Escribir "Hay dos n�meros positivos."
//	SiNo
//		Si num1 <= 0 y num2 > 0 Entonces
//			Escribir "Hay un n�mero positivo."
//		SiNo
//			Si num1 > 0 y num2 <= 0 Entonces
//				Escribir "Hay un n�mero positivo."
//			SiNo
//				Escribir "No hay n�meros positivos."
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
			Escribir "No hay n�meros positivos."
		Fin Si
	Fin Si
	
FinProceso
