package se.lexicon;

public class TodoItemTask {
        private int idSequencer = 1;
        private boolean assingned;
        private TodoItem todoItem;
        private Person assingnee;

        public TodoItemTask(int id, boolean assingned, TodoItem todoItem, Person assingnee) {
            this.idSequencer = id;
            this.assingned = assingned;
            this.todoItem = todoItem;
            this.assingnee = assingnee;
        }

        public int NextId() {
            return this.idSequencer;
        }

        public void setId(int id) {
            this.idSequencer = id;
        }

        public boolean isAssingned() {
            if (!this.assingned) {
                throw new IllegalArgumentException("Assingned connot be null");
            } else {
                return this.assingned = true;
            }
        }

        public void setAssingned(boolean assingned) {
            this.assingned = assingned;
        }

        public TodoItem getTodoItem() {
            return this.todoItem;
        }

        public void setTodoItem(TodoItem todoItem) {
            this.todoItem = todoItem;
            this.assingned = todoItem == null;
        }

        public Person getAssingnee() {
            return this.assingnee;
        }

        public void setAssingnee(Person assingnee) {
            this.assingnee = assingnee;
            this.assingned = this.todoItem == null;
        }

        public String getSummary() {
            return "TodoItemTask{id=" + this.idSequencer + ", assingned=" + this.assingned + ", todoItem=" + this.todoItem + ", assingnee=" + this.assingnee + '}';
        }
    }


