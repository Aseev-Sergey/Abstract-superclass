# Task1
## Абстрактный суперкласс
Абстрактный класс в объектно-ориентированном программировании — базовый класс, который не предполагает создания экземпляров. Абстрактные классы реализуют на практике один из принципов ООП — полиморфизм. Абстрактный класс может содержать абстрактные методы и свойства. Абстрактный метод не реализуется для класса, в котором описан, однако должен быть реализован для его неабстрактных потомков. Абстрактные классы представляют собой наиболее общие абстракции, то есть имеющие наибольший объём и наименьшее содержание.
Суперклассом или родительским классом называют класс, на основе которого создаются другие классы. Классы, полученные на основе суперкласса, называются дочерними классами, производными классами или подклассами.
Суперкласс позволяет создавать обобщенный интерфейс, заключающий в себе настраиваемую функциональность за счет использования виртуальных функций.
Механизм суперклассов широко используется в объектно-ориентированном программировании благодаря возможности повторного использования, что достигается благодаря общим возможностям, инкапсулированным в модульные объекты.
## Назначение программы
Показать практическое применение абстрактного суперкласса по теме "Диаграмма деятельности". Абстрактным классом является Node, его наследниками являются классы Begin, End, Solution, Operation, которые описывают реальные фигуры (узлы) начала процесса, его финала, узлы решения и действия, а также соединительная стрелка, предназначенная для связи узлов.
## Диаграмма классов
![0](https://user-images.githubusercontent.com/85245803/120646839-99334a00-c482-11eb-99fa-7f666d559c52.png)
## Работа программы
Запуск программы

![1](https://user-images.githubusercontent.com/85245803/120646932-b36d2800-c482-11eb-8275-7e5fa93b5666.png)

Работа кнопок "Начало", "Действие", "Решение", "Конец", "Стрелка"

![2](https://user-images.githubusercontent.com/85245803/120647062-dc8db880-c482-11eb-9fcd-ba77a5e8419d.png)
![3](https://user-images.githubusercontent.com/85245803/120647066-dd264f00-c482-11eb-85c4-3fd8449a7dc8.png)
![4](https://user-images.githubusercontent.com/85245803/120647067-dd264f00-c482-11eb-8ae0-aec85a652972.png)
![5](https://user-images.githubusercontent.com/85245803/120647069-ddbee580-c482-11eb-9851-56f3a6a3c92e.png)
![6](https://user-images.githubusercontent.com/85245803/120647070-ddbee580-c482-11eb-81b7-f5c444f10b02.png)

Кнопка "Закрыть" выполняет функцию завершения программы.
