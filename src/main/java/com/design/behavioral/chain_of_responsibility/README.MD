# Цепочка обязанностей 

Предназначен для организации в системе уровней ответственности.

Избегает связывания отправителя запроса с его получателем, давая возможность 
обработать запрос более чем одному объекту. Связывает объекты-получатели и 
передаёт запрос по цепочке пока объект не обработает его