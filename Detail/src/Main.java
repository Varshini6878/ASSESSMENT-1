class Students {
    String name;
    int rollno;
    int marks;

    Students(String n, int r, int m) {
        name = n;
        rollno = r;
        marks = m;
    }
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Students[] students = new Students[10];

        students[0] = new Students("Varshini", 1, 95);
        students[1] = new Students("Sheebika", 2, 89);
        students[2] = new Students("Hema", 3, 92);
        students[3] = new Students("Aarav", 4, 85);
        students[4] = new Students("Divya", 5, 90);
        students[5] = new Students("Kiran", 6, 88);
        students[6] = new Students("Meena", 7, 91);
        students[7] = new Students("Raj", 8, 87);
        students[8] = new Students("Pooja", 9, 93);
        students[9] = new Students("Vikram", 10, 84);


        for (int i = 0; i < 10; i++) {
            students[i].showDetails();
        }
    }
}