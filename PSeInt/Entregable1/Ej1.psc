Proceso Ej1
	
	Definir pedido Como Real
	Definir precio Como Real
	Definir precio2 Como Real
	Definir precio3 Como Real
	Definir total Como Real
	precio <- 5.23
	precio2 <- 4.16
	precio3 <- 5.23 / 2
	
	Escribir "Introduzca la cantidad de unidades a pedir:"
	Leer pedido 
	
	Si pedido < 101 Entonces
		total = pedido * precio
		Escribir "El precio del pedido será: " total
	Fin Si
	
	Si pedido > 100 y pedido < 1001 Entonces
		total = 100 * precio
		pedido = pedido - 100
		total = total + (pedido * precio2)
		Escribir "El precio del pedido será: " total " euros." 		
	FinSi
	
	Si pedido > 1000 Entonces
		total = 100 * precio
		pedido = pedido - 100
		Si pedido > 1000 Entonces
			total = total + (1000 * precio2)
			pedido = pedido - 1100
			total = total + (pedido * precio3)
			Escribir "El precio del pedido será: " total " euros."
		SiNo
			total = total + (pedido * precio2)
			Escribir "El precio del pedido será: " total " euros."
		FinSi
	FinSi
	
FinProceso
