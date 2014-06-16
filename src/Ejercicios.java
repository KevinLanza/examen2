
public class Ejercicios
{	
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
	{
		if ( (num % 3) == 0)//se evalua la condicion 
		{
			return true;//devuelve si es verdadero
		}
		return false;//devuelve si es falso
	}
	
	//devuelve el numero menor entre a, b o c
	//3 puntos
	static int getMenor(int a, int b, int c)
	{
		int resultado = 0;//se hace una variable
		{
		if ( a < b && a < c)//se evalua la condicion
			{
			return a;
			}
		if (b < c && b < a)//se evalua la condicion
			{
		return b;
			}
		if (c < a && c < b)//se evalua la condicion
			{
			return c;
			}
		}
		return resultado;//devuelve el resultado
	}
	
	//devuelve el promedio los elementos de un arreglo
	//5 puntos
	static int getPromedio(int arreglo[])
	{
		int resultado = 0;
		int cantidad_numeros = 0;
		for (int i = 0; i< arreglo.length; i++)
		{
			resultado += arreglo [i];
			cantidad_numeros ++;
		}
		resultado = (resultado / cantidad_numeros);
		return resultado ;
	}
	
	//Realizar una funcion con las siguientes indicaciones:
	//Si el parametro recibido es "Honduras" devolvera "Tegucigalpa"
	//Si el parametro recibido es "Francia" devolvera "Paris"
	//Si el parametro recibido es "Inglaterra" devolvera "Londres"
	static String getCapital(String pais)
	{
		return "";
	}
	
	//realizarla siguiente funcion recurisva:
	
	/* Pseudocodigo*/
	//funcionRecursiva(num)
	//  si num == 0
	//    devolver 0
	//  fin si
	//  devolver num + funcionRecursiva(num-1)
	
	/*Notacion matematica*/
	//funcionRecusriva(num) = num + funcionRecursiva(num-1)
	//Donde funcionRecursiva(0) = 0
	
	//1 punto oro extra
	static int funcionRecursiva(int num)
	{
		int resultado;//se hace una variable
		if (num == 0)//se evalua la condicion
		{
			resultado = 0;
		}else//se establece el else del if para terminar de evaluar
		{
			resultado = num + funcionRecursiva(num-1);
		}
		return resultado;//devuelve el resultado
	}
	
	public static void main(String args[])
	{
	}
}
