package ru.matytsin.lists_analyze;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс вычисляет и предоставляет статистику
 * времени выполнение стандартных методов(add, get, remove, contains)
 * для контейнеров ArrayList и LinkedList
 *
 * @autor Matytsin Alexander
 */
public class ListsAnalyze {
    private static List<Integer> aList = new ArrayList<>();
    private static List<Integer> lList = new LinkedList<>();

    /**
     * Метод, предоставляющий данные о времени выполения
     * методов контейнеров в виде контейнеров
     * @param n количество операций
     * @autor Matytsin Alexander
     */
    public static void analyze(int n) {

        Long addTimeArLs = addTiming(aList, n);
        Long addTimeLnLs = addTiming(lList, n);

        Long getTimeArLs = getTiming(aList, n);
        Long getTimeLnLs = getTiming(lList, n);

        Long containsTimeArLs = containsTiming(aList, n);
        Long containsTimeLnLs = containsTiming(lList, n);

        Long deleteTimeArLs = deleteTiming(aList, n);
        Long deleteTimeLnLs = deleteTiming(lList, n);


        System.out.printf("RESULTS (size of data = %d)\n", n);
        System.out.println("-------------------------------------------------------");
        System.out.printf("\t\t\t | %-7s | %-7s | %-7s | %-7s |\n", "add", "get", "remove", "contains");
        System.out.println("-------------+---------+---------+---------+----------|");
        System.out.printf("ArrayList\t | %-7d | %-7d | %-7d | %-7d  |\n", addTimeArLs, getTimeArLs, deleteTimeArLs, containsTimeArLs);
        System.out.println("-------------+---------+---------+---------+----------|");
        System.out.printf("LinkedList\t | %-7d | %-7d | %-7d | %-7d  |\n", addTimeLnLs, getTimeLnLs, deleteTimeLnLs, containsTimeLnLs);
        System.out.println("-------------------------------------------------------");
    }

    /**
     * Метод вычисления времени выполенения add
     *
     * @autor Matytsin Alexander
     * @param list контейнер
     * @param n количество операций
     * @return время выполнения в миллисекундах
     */
    private static Long addTiming(List<Integer> list, int n) {
        Long timeBegin = System.currentTimeMillis();

        for (int i = 0; i < n; ++i)
            list.add(i);

        Long timeEnd = System.currentTimeMillis();

        return timeEnd - timeBegin;
    }

    /**
     * Метод вычисления времени выполенения remove
     *
     * @autor Matytsin Alexander
     * @param list контейнер
     * @param n количество операций
     * @return время выполнения в миллисекундах
     */
    private static Long deleteTiming(List<Integer> list, int n) {
        Long timeBegin = System.currentTimeMillis();

        for (int i = 0; i < n; ++i)
            list.remove(Integer.valueOf(i));

        Long timeEnd = System.currentTimeMillis();

        return timeEnd - timeBegin;
    }

    /**
     * Метод вычисления времени выполенения get
     *
     * @autor Matytsin Alexander
     * @param list контейнер
     * @param n количество операций
     * @return время выполнения в миллисекундах
     */
    private static Long getTiming(List<Integer> list, int n) {
        Long timeBegin = System.currentTimeMillis();

        for (int i = 0; i < n; ++i)
            list.get(i);

        Long timeEnd = System.currentTimeMillis();

        return timeEnd - timeBegin;
    }

    /**
     * Метод вычисления времени выполенения contains
     *
     * @autor Matytsin Alexander
     * @param list контейнер
     * @param n количество операций
     * @return время выполнения в миллисекундах
     */
    private static Long containsTiming(List<Integer> list, int n) {
        Long timeBegin = System.currentTimeMillis();

        for (int i = 0; i < n; ++i)
            list.contains(Integer.valueOf(i));

        Long timeEnd = System.currentTimeMillis();

        return timeEnd - timeBegin;
    }
}
