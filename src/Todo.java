public class Todo {
    private String description; // 할일 내용
    private boolean completed;  // 완료 여부

    public Todo(String description) {
        this.description = description;
        this.completed = false; // 새로 만든 할일은 미완료 상태
    }

    // 할일 내용을 가져오는 메서드
    public String getDescription() {
        return description;
    }

    // 완료 여부를 확인하는 메서드
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return (completed ? "✅ " : "❌") + description;
    }
}