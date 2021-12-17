#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <chrono>
#include <string>

void createRandArr(int ArrInt[100])
{
	std::string answer("no");
	srand(time(NULL));
	for (int i = 0; i < 100; i++)
	{
		ArrInt[i] = rand() % 199 - 99;
		std::cout << ArrInt[i] << " ";

	}
	std::cout << std::endl;
	std::cout << std::endl << "выполнить функцию createRandArr снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		createRandArr(ArrInt);
	else return;
}

void bubbleSortArr(int ArrInt[100])
{
	int number, i = 0;
	std::string answer("no");
	auto start = std::chrono::high_resolution_clock::now();
	for (int i = 0; i < 99; i++)
	{
		for (int k = i + 1; k < 100; k++)
		{
			if (ArrInt[i] > ArrInt[k])
			{
				number = ArrInt[k];
				ArrInt[k] = ArrInt[i];
				ArrInt[i] = number;
			}
		}
	}
	for (int i = 0; i < 100; i++)
		std::cout << ArrInt[i] << " ";
	auto end = std::chrono::high_resolution_clock::now();
	std::chrono::duration<float> duration = end - start;
	std::cout << std::endl << duration.count() << " - время, затраченное на сортировку с помощью bubble sort" << std::endl;
	std::cout << std::endl << "выполнить функцию bubbleSortArr снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		bubbleSortArr(ArrInt);
	else return;
}

void shakerSortArr(int ArrInt[100])
{
	int number, i = 0;
	std::string answer("нет");
	auto start = std::chrono::high_resolution_clock::now();
	for (int i = 0; i < 100; i++)
	{
		int startOfArray = 0, endOfArray = 100;
		while (startOfArray <= endOfArray)
		{
			for (int i = startOfArray; i < endOfArray - 1; i++)
			{
				if (ArrInt[i - 1] > ArrInt[i])
				{
					number = ArrInt[i - 1];
					ArrInt[i - 1] = ArrInt[i];
					ArrInt[i] = number;
				}
			}
			endOfArray--;
			for (int i = endOfArray - 1; i > startOfArray; i--)
			{
				if (ArrInt[i] > ArrInt[i + 1])
				{
					number = ArrInt[i + 1];
					ArrInt[i + 1] = ArrInt[i];
					ArrInt[i] = number;
				}
			}
			startOfArray++;
		}
	}
	for (int i = 0; i < 100; i++)
		std::cout << ArrInt[i] << " ";
	auto end = std::chrono::high_resolution_clock::now();
	std::chrono::duration<float> duration = end - start;
	std::cout << std::endl << duration.count() << " - время, затраченное на сортировку с помощью shaker sort" << std::endl;
	std::cout << std::endl << "выполнить функцию shakerSortAr снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		shakerSortArr(ArrInt);
	else return;
}

void findMaxEl(int ArrInt[100])
{
	int max = ArrInt[1];
	std::string answer("нет");
	auto start = std::chrono::high_resolution_clock::now();
	for (int i = 0; i < 100; ++i)
	{
		if (ArrInt[i] > max)
			max = ArrInt[i];
	}
	std::cout << max << " - Максимальный эллемент массива" << std::endl;
	auto end = std::chrono::high_resolution_clock::now();
	std::chrono::duration<float> duration = end - start;
	std::cout << std::endl << duration.count() << " - Время, затраченное на поиск максимального элемента массива" << std::endl;
	std::cout << std::endl << "выполнить функцию findMaxEl снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		findMaxEl(ArrInt);
	else return;
}

void findMaxElSortedArr(int ArrInt[100])
{
	int max;
	std::string answer("нет");
	auto start = std::chrono::high_resolution_clock::now();
	max = ArrInt[100];
	std::cout << max << " - Максимальный эллемент массива" << std::endl;
	auto end = std::chrono::high_resolution_clock::now();
	std::chrono::duration<float> duration = end - start;
	std::cout << std::endl << duration.count() << " - Время, затраченное на поиск максимального элемента массива в отсортированном массиве" << std::endl;
	std::cout << std::endl << "выполнить функцию findMaxElSortedArr снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		findMaxElSortedArr(ArrInt);
	else return;
}

void findMinEl(int ArrInt[100])
{
	int min = ArrInt[1];
	std::string answer("нет");
	auto start = std::chrono::high_resolution_clock::now();
	for (int i = 0; i < 100; ++i)
	{
		if (ArrInt[i] < min)
			min = ArrInt[i];
	}
	std::cout << min << " - Минимальный элемент массива" << std::endl;
	auto end = std::chrono::high_resolution_clock::now();
	std::chrono::duration<float> duration = end - start;
	std::cout << std::endl << duration.count() << " - Время, затраченное на поиск минимального элемента массива" << std::endl;
	std::cout << std::endl << "выполнить функцию findMinEl снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		findMinEl(ArrInt);
	else return;
}

void findMinElSortedArr(int ArrInt[100])
{
	int min;
	std::string answer("нет");
	auto start = std::chrono::high_resolution_clock::now();
	min = ArrInt[0];
	std::cout << min << " - Минимальный элемент массива" << std::endl;
	auto end = std::chrono::high_resolution_clock::now();
	std::chrono::duration<float> duration = end - start;
	std::cout << std::endl << duration.count() << " - Время, затраченное на поиск минимального элемента массива в отсортированном массиве" << std::endl;
	std::cout << std::endl << "выполнить функцию findMinElSortedArr снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		findMinElSortedArr(ArrInt);
	else return;
}

void findAverageOfMaxAndMin(int ArrInt[100])
{
	int max = ArrInt[1], min = ArrInt[1], mean, quantityOfEqual = 0;
	std::string answer("нет");
	for (int i = 0; i < 100; ++i)
	{
		if (ArrInt[i] > max)
			max = ArrInt[i];
		if (ArrInt[i] < min)
			min = ArrInt[i];
	}
	mean = round((max + min) / 2);
	std::cout << mean << " - Среднее значение максимального и минимального элемента" << std::endl;

	for (int i = 0; i < 100; ++i)
	{
		if (ArrInt[i] == mean)
		{
			std::cout << i << " ";
			quantityOfEqual++;
		}
	}
	std::cout << std::endl << quantityOfEqual << " - Количество элементов, равное среднему" << std::endl;
	std::cout << std::endl << "выполнить функцию findAverageOfMaxAndMin снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		findAverageOfMaxAndMin(ArrInt);
	else return;
}

void findQuantityOfElementsLessThanGiven(int number, int ArrInt[100])
{
	int quantityOfElementsLessThanGiven = 0;
	std::string answer("нет");

	for (int i = 0; i < 100; ++i)
	{
		if (ArrInt[i] < number)
			quantityOfElementsLessThanGiven++;
	}
	std::cout << quantityOfElementsLessThanGiven << " - Количество элементов менее " << number << std::endl;
	std::cout << std::endl << "выполнить функцию findQuantityOfElementsLessThanGiven снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		findQuantityOfElementsLessThanGiven(number, ArrInt);
	else return;
}

void findQuantityOfElementsMoreThanGiven(int number, int ArrInt[100])
{
	int quantityOfElementsMoreThanGiven = 0;
	std::string answer("нет");

	for (int i = 0; i < 100; ++i)
	{
		if (ArrInt[i] > number)
			quantityOfElementsMoreThanGiven++;
	}
	std::cout << quantityOfElementsMoreThanGiven << " - Количество элементов более " << number << std::endl;
	std::cout << std::endl << "выполнить функцию findQuantityOfElementsMoreThanGiven снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		findQuantityOfElementsMoreThanGiven(number, ArrInt);
	else return;
}

void findNumberInArr(int number, int ArrInt[100])
{
	bool availability = false;
	std::string answer("нет");
	auto start = std::chrono::high_resolution_clock::now();
	for (int i = 0; i < 100; ++i)
	{
		if (ArrInt[i] == number)
			availability = true;
	}
	if (availability == true)
		std::cout << "Число находится в массиве" << std::endl;
	else
		std::cout << "Число не находится в массиве" << std::endl;
	auto end = std::chrono::high_resolution_clock::now();
	std::chrono::duration<float> duration = end - start;
	std::cout << std::endl << duration.count() << " - Время, потраченное на поиск номера обычным способом" << std::endl;
	std::cout << std::endl << "выполнить функцию findNumberInArr снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		findNumberInArr(number, ArrInt);
	else return;
}

void binarySearch(int number, int ArrInt[100])
{
	bool availability = false;
	int startOfArray = 0, endOfArray = 100, middleOfArray;
	std::string answer("нет");
	auto start = std::chrono::high_resolution_clock::now();
	while ((startOfArray <= endOfArray) && (availability != true))
	{
		middleOfArray = (startOfArray + endOfArray) / 2;
		if (number == middleOfArray)
			availability = true;
		else
			if (number < middleOfArray)
				endOfArray = middleOfArray;
			else
				startOfArray = middleOfArray;
	}
	if (availability == true)
		std::cout << "Число находится в массиве" << std::endl;
	else
		std::cout << "Число не находится в массиве" << std::endl;
	auto end = std::chrono::high_resolution_clock::now();
	std::chrono::duration<float> duration = end - start;
	std::cout << std::endl << duration.count() << " - Время, затраченное на поиск числа с помощью двоичного поиска" << std::endl;
	std::cout << std::endl << "выполнить функцию findNumberInArr снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		binarySearch(number, ArrInt);
	else return;
}

void swapArrElements(int firstIndex, int secondIndex, int ArrInt[100])
{
	int number;
	std::string answer("нет");
	auto start = std::chrono::high_resolution_clock::now();
	number = ArrInt[firstIndex];
	ArrInt[firstIndex] = ArrInt[secondIndex];
	ArrInt[secondIndex] = number;
	auto end = std::chrono::high_resolution_clock::now();
	std::chrono::duration<float> duration = end - start;
	std::cout << std::endl << duration.count() << " - Время, потраченное на обмен" << std::endl;
	std::cout << std::endl << "выполнить функцию swapArrElements снова?" << std::endl;
	std::cin >> answer;
	if (answer == "да")
		swapArrElements(firstIndex, secondIndex, ArrInt);
	else return;
}

int main() {
	int ArrInt[100], a, b, indexFirst, indexSecond, numberToFind;
	createRandArr(ArrInt);
	findMaxEl(ArrInt);
	findMinEl(ArrInt);
	findAverageOfMaxAndMin(ArrInt);

	std::cout << "Введите индексы элементов, которые необходимо поменять местами" << std::endl;
	std::cin >> indexFirst >> indexSecond;
	swapArrElements(indexFirst, indexSecond, ArrInt);

	bubbleSortArr(ArrInt);
	shakerSortArr(ArrInt);
	findMaxElSortedArr(ArrInt);
	findMinElSortedArr(ArrInt);lki


	std::cout << "Введите номер" << std::endl;
	std::cin >> a;
	findQuantityOfElementsLessThanGiven(a, ArrInt);

	std::cout << "Введите номер" << std::endl;
	std::cin >> b;
	findQuantityOfElementsMoreThanGiven(b, ArrInt);

	std::cout << "Введите номер, который вам нужно найти" << std::endl;
	std::cin >> numberToFind;
	findNumberInArr(numberToFind, ArrInt);
	binarySearch(numberToFind, ArrInt);
	return 0;
}
