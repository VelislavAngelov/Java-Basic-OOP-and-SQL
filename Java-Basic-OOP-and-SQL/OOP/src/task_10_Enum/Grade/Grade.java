package task_10_Enum.Grade;

public enum Grade {
    СЛАБ(2){
        @Override
        public  boolean pass(){
            return false;
        }
    }
    ,СРЕДЕН(3)
    ,ДОБЪР(4)
    ,МНОГО_ДОБЪР(5)
    ,ОТЛИЧЕН(6);
    public final int numGrade;

    Grade(int numGrade) {
        this.numGrade = numGrade;
    }

    public int getNumGrade() {
        return numGrade;
    }

    public void setNumGrade() {

    }
    public  boolean pass(){
        return true;
    }
}
