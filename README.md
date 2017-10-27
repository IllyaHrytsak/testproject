Описание проекта:
Проект содержит классы: Group, GroupComporator, Lecturer, Student, Sex, Main.
Класс Student содержит поля: имя, фамилия, возраст, пол и присутность. 
Для поля пол был создан отдельный класс SexБ который является Enum.
Класс Group содержит  поля: имя группы, список студентов и старосты группы.
Этот класс содержит метод choseMainStudent(), который сортирует всех студентов с помощью класса GroupComporator и студент,
который будет первый в списке будет старостой группы и возвращает старосту.
Сортировка просиходит следующим образом: сначала проверка по возрасту(приоритет самым старшим), 
потом проверка пола(приоритет женский пол) и если есть студенты одного пола и возраста, то идет проверка по фамилии(приоритет с начала списка).
Класс Lecturer содержит поля: имя, фамилию и группу.
Этот класс содержит метод checkStudents(), который создает 2 коллекции внутри метода и в одну коллекцию добавляет студентов, 
которые присутствуют на лекции, а в другую коллецию студентов, которые не присутсвуют, после этого выводит в консоль всю информацию.
Класс Main нужен для запуска программы.
В главном методе этого класса сначала иницируем все нужные классы, а потом вызываем их методы для вывода в консоль информации.

