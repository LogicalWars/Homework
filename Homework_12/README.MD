# Задание
* Создать интерфейс Task с методом
  - 'void complete()'

* Реализовать абстрактный класс 'AbstractNumbersPrintTask':
  - имплементирующий интерфейс 'Task' (метод 'complete()' должен быть абстрактным)
  - содержащий поля 'from' и 'to', а также конструктор для этих полей

* Реализовать классы 'EvenNumbersPrintTask' и 'OddNumbersPrintTask', которые станут потомками 'AbstractNumbersPrintTask'. 
В каждом из этих классов реализовать метод 'complete()', при этом первый класс реализует данный метод для вывода четных чисел в
диапазоне 'from-to', а второй - для вывода нечетных.

* В Main-классе предусмотреть метод 'void completeAllTasks(Task[] tasks)', который для
каждого Task массива вызывает у него метод 'complete()'.

* В main-методе создать массив задач из 'EvenNumbersPrintTask' и 'OddNumbersPrintTask'
с разными диапазонами и передать их в метод 'completeAllTasks()'.

