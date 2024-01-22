import java.util.Scanner;

class marks3 {
    int id;
    int marksnum;
    int[] marks;
    String name;
	getname(

    marks3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void setMarksnum(int marksnum) {
        this.marksnum = marksnum;
        this.marks = new int[marksnum];
    }

    void getMarks() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < this.marksnum; i++) {
            System.out.println("Please enter mark " + (i + 1));
            this.marks[i] = scan.nextInt();
        }
    }

    int calcTotal() {
        int total = 0;
        for (int mark : this.marks) {
            total += mark;
        }
        return total;
    }

    double calcAverage(int total) {
        return total / (double) this.marksnum;
    }

    char getResults(double average) {
        if (average > 100) {
            System.out.println("Invalid marks");
            return 'X';
        } else if (average > 75) {
            return 'A';
        } else if (average > 65) {
            return 'B';
        } else if (average > 55) {
            return 'C';
        } else if (average > 45) {
            return 'S';
        } else {
            return 'F';
        }
    }

    void display() {
        System.out.println("Your id is " + this.id);
        System.out.println("Your name is " + this.name);
        for (int mark : this.marks) {
            System.out.println("Mark: " + mark);
        }
        int total = this.calcTotal();
        double average = this.calcAverage(total);
        char rank = this.getResults(average);
        System.out.println("Total is " + total);
        System.out.println("Average is " + average);
        System.out.println("Rank is " + rank);
    }

}
