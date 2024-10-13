import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class StarSystem {
    private final Star m_star;
    private final List<Planet> m_planets;

    public StarSystem(Star star) {
        this.m_star = star;
        this.m_planets = new ArrayList<>();
    }

    // Метод для добавления планеты в звездную систему
    public void addPlanet(Planet planet) {
        m_planets.add(planet);
        System.out.println("\tПланета " + planet + " добавлена в систему *" + getStarName() + "*.");
    }

    // Метод для получения количества планет в системе
    public int getPlanetCount() {
        return m_planets.size();
    }

    // Метод для получения имени звезды
    public String getStarName() {
        return m_star.getName();
    }

    // Метод для вывода информации о звездной системе
    public void printSystemInfo() {
        System.out.println("\n\tКраткая информация о системе:");
        System.out.println(this);
        System.out.println("\n\tПодробная информация о звёздной системе " + getStarName() + ":");
        System.out.println("\tКоличество планет: " + getPlanetCount());
        for (Planet planet : m_planets) {
            System.out.println("\t\t" + planet);
//            List<Moon> moons = planet.getMoons();
//            if (!moons.isEmpty()) {
//                System.out.println("    Спутники: " + moons.stream().map(Moon::toString).collect(Collectors.joining(", ")));
//            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarSystem that = (StarSystem) o;
        return Objects.equals(m_star, that.m_star) &&
                Objects.equals(m_planets, that.m_planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_star, m_planets);
    }

    @Override
    public String toString() {
        return "\tЗвездная система: " + getStarName() +
                "\n\tПланеты: " + m_planets.stream().map(Planet::toString).collect(Collectors.joining(", "));
    }
}