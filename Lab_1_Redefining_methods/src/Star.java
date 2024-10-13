import java.util.Objects;

public class Star {
    // Используем ключевое слово 'final', так как имя звезды не должно изменяться после создания объекта
    private final String m_name;

    public Star(String name) {
        this.m_name = name;
    }

    // Доступ к этой информации при выводе
    public String getName() {
        return m_name;
    }

    // Переопределяем метод equals для сравнения звезд по имени
    @Override
    public boolean equals(Object object) {
        // Проверяем, является ли переданный объект ссылкой на текущий объект
        // Если да, то объекты точно равны
        if (this == object) return true;

        // Проверяем, не является ли переданный объект null
        // и сравниваем классы объектов
        // Если объект null или классы не совпадают, объекты точно не равны
        if (object == null || getClass() != object.getClass()) return false;

        // Приводим переданный объект к типу Star
        // Это безопасно, так как мы уже проверили совпадение классов
        Star star = (Star) object;

        // Сравниваем имена звезд
        // Используем Objects.equals для безопасного сравнения,
        // учитывающего возможность null значений
        return Objects.equals(m_name, star.m_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_name);
    }

    @Override
    public String toString() {
        return m_name;
    }
}
