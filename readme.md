Мини проект OneGramChat
Необходимо создать чат, который позволит пользователям за одним компьютером обмениваться сообщениями.
Т.е. Регистрируется пользователь Вася, Регистрируется пользователь Дима.
Вася входит под собой в систему и пишет сообщение Диме. Выходит из системы.
Дима входит под собой в систему и читает сообщение Васи. Может тоже написать письмо Васе.

Для считывания данных понадобится ScannerUtil.
Этап №1 Создание сущностей
1. Создать сообщение (текст, входящее/исходящее, кому/от кого)
2. Создать Пользователя(имя, пароль, список сообщений)

Этап №2 Создание чата и работы с пользователями.
1. Необходимо создать класс OneGramChat, который позволяет:
2. Создать пользователя. Имя и пароль вводится из консоли. Список сообщений пустой.
3. Войти пользователю. Ввести имя и пароль. Если есть такой пользователь, он становится текущим пользователем в системе. Если нет пользователя, то будет ошибка.
4. Выйти пользователю, текущий пользователь становится пустым.

Этап №3 Работа с письмами

1. Создать метод в OneGramChat "Написать письмо": 
   Вводится имя пользователя, вводится текст письма.
   У текущего пользователя записывается в список сообщений как исходящий
   У пользователя которому пишем, записывается в список сообщений как входящее
   если такого пользователя нет, то возникает ошибка: такого пользователя нет
   если текущего пользователя нет, то возникает ошибка: вы не авторизованы

2. Создать метод в OneGramChat "Прочитать письма":
   Вывести все письма текущего пользователя.
   Формат входящего: "письмо от {имя пользователя}: {текст сообщения}"
   Формат исходящего: "письмо к {имя пользователя}: {текст сообщения}"
   если текущего пользователя нет, то возникает ошибка: вы не авторизованы

3. Создать метод  в OneGramChat "запуска чата":
   чат постоянно ожидает команд из консоли:
   "войти" - запуск функции "войти пользователю"
   "новый" - запуск функции "создать пользователя"
   "выйти" - запуск функции "выйти пользователю"
   "написать" - запуск функции "написать письмо"
   "прочитать" - запуск функции "прочитать письмо"
   "exit" - окончание работы программы

4. Ошибки в результате работы команд должны быть обработаны, и не должны заканчивать работу программы.

Этап № 4
1. Подключить lombok и воспользоваться его функционалом по максимуму.
2. Сделать версию приложения 1.0.0 - FINAL
4. Имя артефакта - onegramchat. Группа - com.javaacademy
3. Собрать приложение в jar с именем chat.jar