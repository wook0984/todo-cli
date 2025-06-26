import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner todoSc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("📝 할일 관리 프로그램에 오신 것을 환영합니다!");
        System.out.println("================================");

        aa: while (true) {
            System.out.println("\n📋 멋진 메뉴를 선택하세요:");
            System.out.println("1. ➕ 할일 추가");
            System.out.println("2. 📃 할일 목록 보기");
            System.out.println("3. 🔄 할일 상태 변경");
            System.out.println("4. 🚪 프로그램 종료");
            System.out.print("선택: ");
            String choice = todoSc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("📝 새로운 할일을 입력하세요: ");
                    String todo = todoSc.nextLine();
                    todos.add(todo);
                    break;
                case "2":
                    for (int i = 0; i < todos.size(); i++) {
                        System.out.println(i + ". " + todos.get(i));
                    }
                    break; // ✅ break 필수!!

                case "3":
                    System.out.println("몇 번의 Todo를 완료하셨나요?");
                    String completeTodo = todoSc.nextLine();
                    int completeTodoInt = Integer.parseInt(completeTodo);

                    if (completeTodoInt >= 0 && completeTodoInt < todos.size()) {
                        todos.remove(completeTodoInt);
                        System.out.println("할일이 성공적으로 삭제되었습니다 ✅");
                    } else {
                        System.out.println("❌ 해당 번호는 존재하지 않습니다.");
                    }
                    break; // ✅ break 필수!!
                case "4":
                    break aa;

//        System.out.println("================================");
//        System.out.println("안녕히가세요.");
//        System.out.println("================================");
            }
        }
    }
}