package iuh.fit.opp;

import java.util.*;

public class CourseList {
    private int count = 0;
    private Course[] courses;

    public CourseList() {
        this.courses = new Course[100]; // giả sử tối đa 100 khóa học
    }

    public boolean addCourse(Course course) {
        if (exists(course)) {
            System.out.println("Course ID already exists.");
            return false;
        }
        if (count >= courses.length) {
            System.out.println("Course list is full.");
            return false;
        }
        courses[count++] = course;
        return true;
    }

    public boolean exists(Course course) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(course.getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean removeCourse(Course course) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(course.getId())) {
                for (int j = i; j < count - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[--count] = null;
                return true;
            }
        }
        System.out.println("Course not found.");
        return false;
    }

    public Course searchCourseById(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(id)) {
                return courses[i];
            }
        }
        return null;
    }

    public Course[] searchCourseByTitle(String title) {
        List<Course> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(courses[i]);
            }
        }
        return result.isEmpty() ? null : result.toArray(new Course[0]);
    }

    public Course[] searchCourseByDepartment(String department) {
        List<Course> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getDepartment().equalsIgnoreCase(department)) {
                result.add(courses[i]);
            }
        }
        return result.isEmpty() ? null : result.toArray(new Course[0]);
    }

    public Course findMaxCreditCourse(String department) {
        Course maxCourse = null;
        int maxCredit = -1;
        for (int i = 0; i < count; i++) {
            if (courses[i].getDepartment().equalsIgnoreCase(department) && courses[i].getCredit() > maxCredit) {
                maxCredit = courses[i].getCredit();
                maxCourse = courses[i];
            }
        }
        return maxCourse;
    }

    public Course[] getCourses() {
        return Arrays.copyOf(courses, count);
    }
}

