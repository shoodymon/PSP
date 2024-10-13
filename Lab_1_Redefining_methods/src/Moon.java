import java.util.Objects;

public class Moon {
    private final String m_name;

    public Moon(String name) {
        this.m_name = name;
    }

    public String getName() {
        return m_name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Moon moon = (Moon) object;
        return Objects.equals(m_name, moon.m_name);
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
