public class Opgave2 {

    int assignmentPoints;
    int examPoints;
    int projectPoints;

    void main (){

        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();

    }

    int addAssignmentPoints(int points){
        assignmentPoints += points;
        return assignmentPoints;
    }
    int addExamPoints(int points){
        examPoints += points;
        return examPoints;
    }
    int addProjectPoints(int points){
        projectPoints += points;
        return projectPoints;
    }
    void printTotal(){
        int total = assignmentPoints + examPoints + projectPoints;
        System.out.println(total);
    }


}
