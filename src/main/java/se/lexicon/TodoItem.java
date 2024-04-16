package se.lexicon;

import java.time.LocalDate;

public class TodoItem {

        private int id;
        private String title;
        private String taskDescription;
        private LocalDate deadline;
        private boolean done;
        private Person creater;

        public TodoItem(String title, String taskDescription) {
            this.setTitle(title);
            this.setTaskDescription(taskDescription);
            this.deadline = LocalDate.now();
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            if (title != null && !title.trim().isEmpty()) {
                this.title = title;
            } else {
                throw new IllegalArgumentException(" title cannot be null or empty");
            }
        }

        public String getTaskDescription() {
            return this.taskDescription;
        }

        public void setTaskDescription(String taskDescription) {
            if (taskDescription != null && !taskDescription.trim().isEmpty()) {
                this.taskDescription = taskDescription;
            } else {
                throw new IllegalArgumentException(" taskDescription cannot be  null or empty");
            }
        }

        public LocalDate getDeadline() {
            return this.deadline;
        }

        public void setDeadline(LocalDate deadline) {
            this.deadline = LocalDate.now();
        }

        public boolean isDone() {
            return this.done;
        }

        public void setDone(boolean done) {
            this.done = done;
        }

        public Person getCreater() {
            return this.creater;
        }

        public void setCreater(Person creater) {
            if (creater == null) {
                throw new IllegalArgumentException("NO creater");
            } else {
                this.creater = creater;
            }
        }

        public String getSummary() {
            String rt;
            if (this.creater != null) {
                rt = "  id : " + this.id + " ,title: " + this.title + " ,taskDescription: " + this.taskDescription + " ,deadline: " + this.deadline + " finished: " + this.done + " ,creater task " + this.creater.getFirstname();
                return rt;
            } else {
                rt = "not creater name ";
                return rt;
            }
        }
}
