public class ReferenceTypeArray {
    public static void main(String[] args) {
        // 여기서 배열과 요소에 대한 선언이 이루어짐
        Student[] students = new Student[2];
        // 여기서 초기화해주지 않으면 NullPointerException이 발생함
        students[0] = new Student();
        students[0].name = "jinmun";
        students[0].phoneNumber = "010-3912-1232";
        students[0].age = 23;
        students[1].name = "jinmun2";
        students[1].phoneNumber = "010-3912-1122";
        students[1].age = 30;
    }
}
