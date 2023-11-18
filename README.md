# Задание про фрилансера
Один фрилансер, воспользовавшись гибкостью графика своего вида работы, решил смоделировать свой отдых по следующей схеме:

1. изначально у него нет денег;
2. если он решает, что следующий месяц хочет активно поработать, то его деньги увеличиваются на income, доход от работы, и уменьшаются на expense, обязательные месячные траты;
3. если он решает, что следующий месяц хочет отдохнуть, то за месяц его деньги уменьшаются на expense, а затем остаток накоплений ещё уменьшается в три раза — траты на отдых;
4. ешение, отдохнуть ли в следующем месяце принимается по правилу: если на счету есть хотя бы threshold денег, то выбираем отдых, иначе — работу.

Вам нужно написать сервисный класс с методом, который по заданным income, expenses и threshold рассчитает количество месяцев отдыха, которые будут в следующий год. Всё считается в целых числах. Сервисный класс должен быть в пакете ru.netology.services, как и тест-класс на него.

## Протестировать на папримерах: 
1. если income 10 тысяч руб., expenses 3 тысячи руб., threshold 20 тысяч руб., то отдохнуть удастся три месяца в году
2.  если income 100 тысяч руб., expenses 60 тысяч руб., threshold 150 тысяч руб.