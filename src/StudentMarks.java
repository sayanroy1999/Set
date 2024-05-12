import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentMarks that = (StudentMarks) o;
        return Maths == that.Maths && Physics == that.Physics;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Maths, Physics);
    }

    private int Maths;
    private int Physics;

    public StudentMarks(int maths, int physics) {
        Maths = maths;
        Physics = physics;
    }

    public StudentMarks() {
    }

    public int getMaths() {
        return Maths;
    }

    public int getPhysics() {
        return Physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "Maths=" + Maths +
                ", Physics=" + Physics +
                '}';
    }


    @Override
    public int compareTo(StudentMarks o) {
        return 0;
    }
}
