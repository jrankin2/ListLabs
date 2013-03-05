package collectionlabs;

import java.util.Objects;

public class Dog {
    private String name;
    private String rabiesId;

    public Dog() {
    }

    public Dog(String name, String rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getRabiesId() {
        return rabiesId;
    }

    public final void setRabiesId(String rabiesId) {
        this.rabiesId = rabiesId;
    }

    @Override
    public final int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.rabiesId);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.rabiesId, other.rabiesId)) {
            return false;
        }
        return true;
    }
    
}
