package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4 , 5, 10, 14);
		
		//Criando uma Stream e usando map para multiplicar cada elemento da stream por 10
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//criando uma stream de Strings com nomes;
		Stream<String> st2 = Stream.of("Maria","Alex","Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//criando stream com interações, primeiro elemento é 0 e os seguintes (x + 2);
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); //infinita
		System.out.println(Arrays.toString(st3.limit(10).toArray()));//st3.limit define quantos elementos serão impressos do vetor Arrays
		
	}
}
