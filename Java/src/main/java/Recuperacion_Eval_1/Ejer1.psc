Proceso Ejer1
	Definir num Como Entero
	Definir cant_num Como Entero
	Definir cant_num_impar Como Entero
	Definir media_impar Como Real
	Definir mayor_par Como Entero
	
	cant_num <- 0
	mayor_par <- 0
	media_impar <- 0
	cant_num_impar <- 0
	
	Escribir "Introduzca un número (-1 para terminar):"
	Leer num
	
	Mientras num > 0 Hacer
		cant_num = cant_num + 1
		
		//Si el número es par.
		Si num % 2 = 0 Entonces
			Si num > mayor_par Entonces
				mayor_par <- num
			SiNo
				//No se hace nada.
			Fin Si
			
		//Si el número es impar.	
		SiNo
			media_impar = media_impar + num
			cant_num_impar = cant_num_impar + 1
		Fin Si
		
		Escribir "Introduzca un número (-1 para terminar):"
		Leer num
	Fin Mientras
	
	Si cant_num_impar > 0 Entonces
		media_impar = media_impar / cant_num_impar
	SiNo
		//No se hace nada.
	Fin Si
	
	
	Escribir ""
	Escribir "Se han introducido " cant_num " números."
	Escribir "La media de los impares es: " media_impar
	Escribir "El mayor de los pares es: " mayor_par
	Escribir "Fin del programa."
	
FinProceso
