import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Planet {
    private final String m_name;
    private final List<Moon> m_moons;

    public Planet(String name) {
        this.m_name = name;
        this.m_moons = new ArrayList<>();
    }

    public String getName() {
        return m_name;
    }

    public List<Moon> getMoons() {
        return new ArrayList<>(m_moons);  // Возвращаем копию списка для инкапсуляции
    }

    // Метод для добавления луны к планете
    public void addMoon(Moon moon) {
        m_moons.add(moon);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(m_name, planet.m_name) &&
                Objects.equals(m_moons, planet.m_moons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_name, m_moons);
    }

    @Override
    public String toString() {
        return m_name + " (спутники: " +
                m_moons.stream().map(Moon::toString).collect(Collectors.joining(", ")) + ")";
    }
}
