package iuh.fit.opp;

public class TestCourse {
    public static void initData(CourseList list) {
        list.addCourse(new Course("CS101", "Lập trình Java", 3, "CNTT"));
        list.addCourse(new Course("CS102", "Cấu trúc dữ liệu", 4, "CNTT"));
        list.addCourse(new Course("EN201", "Tiếng Anh chuyên ngành", 2, "Ngoại ngữ"));
        list.addCourse(new Course("MA301", "Toán rời rạc", 3, "Toán"));
    }

    public static void main(String[] args) {
        CourseList list = new CourseList();
        initData(list);

        System.out.println("Tất cả khóa học:");
        for (Course c : list.getCourses()) {
            System.out.println(c);
        }

        System.out.println("\nTìm theo ID 'CS102':");
        System.out.println(list.searchCourseById("CS102"));

        System.out.println("\nTìm theo tên chứa 'lập':");
        Course[] foundByTitle = list.searchCourseByTitle("lập");
        if (foundByTitle != null) {
            for (Course c : foundByTitle) {
                System.out.println(c);
            }
        }

        System.out.println("\nTìm theo khoa 'CNTT':");
        Course[] foundByDept = list.searchCourseByDepartment("CNTT");
        if (foundByDept != null) {
            for (Course c : foundByDept) {
                System.out.println(c);
            }
        }

        System.out.println("\nKhóa học có tín chỉ cao nhất trong khoa 'CNTT':");
        System.out.println(list.findMaxCreditCourse("CNTT"));
    }
}


