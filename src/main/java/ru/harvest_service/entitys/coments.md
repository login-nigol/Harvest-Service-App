#### @JsonBackReference

Аннотация в библиотеке Jackson для обработки циклических ссылок при сериализации объектов в
JSON. Она используется, чтобы игнорировать обратную ссылку в двухсторонних связях между объектами, предотвращая
бесконечный цикл при преобразовании в JSON.
Например, в случае отношений "родитель-ребенок" на уровне классов:

#### @JsonManagedReference

Ставится на поле "родитель" (на стороне владельца связи).

#### @JsonBackReference

Ставится на поле "ребенок", чтобы не включать обратную ссылку на родителя при сериализации.
Это позволяет избежать рекурсивной зависимости, где объекты ссылаются друг на друга.

#### Set<Footproduct> — если продукты должны быть уникальны, и порядок не имеет значения

#### CascadeType.MERGE — при обновлении основной сущности автоматически обновляет (сливает) связанные сущности.
#### fetch = FetchType.EAGER — настройка в JPA/Hibernate, которая указывает, что связанная сущность должна загружаться сразу при выборке основной сущности. EAGER (жадная загрузка): связанные данные загружаются немедленно вместе с основной сущностью. Используется: если связанная информация всегда нужна сразу, но может увеличить количество данных, загружаемых в память. Пример: при загрузке Author с @OneToMany(fetch = FetchType.EAGER) для List<Book> books, все книги автора будут сразу загружены из базы.

#### @Fetch(FetchMode.SELECT)
Указывает, что связанные данные должны загружаться отдельными SQL-запросами по мере обращения к ним.
#### Lazy Loading:
Используется для отложенной загрузки, по запросу.Hibernate выполняет отдельный запрос для каждой связанной коллекции, вместо того чтобы загружать данные заранее. Подходит для: Ситуаций, когда связанные данные не нужны сразу, чтобы избежать лишней нагрузки на базу данных.
