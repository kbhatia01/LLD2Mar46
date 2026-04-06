package src.Registry;

import java.util.Map;

public class StudentRegistry {
    Map<Integer, Students> students;

    StudentRegistry() {
        students = new java.util.HashMap<>();
    }
    void Register(Students student) {
        students.put(student.id, student);
    }

    public Students getStudents(int id) {
        return students.get(id);
    }
}
