package se.lexicon;

import java.util.Arrays;

public class Person {

        private int id;
        private String firstname;
        private String lastname;
        private String email;
        private TodoItemTask[] tasks;
        public Person(String firstname, String lastname, String email) {
            this.setFirstname(firstname);
            this.setLastName(lastname);
            this.setEmail(email);
            this.id = this.setid(this.id);
            this.tasks=new TodoItemTask[0];
        }

        public int getId() {
            return this.id;
        }

        public String getFirstname() {
            return this.firstname;
        }

        public String getLastname() {
            return this.lastname;
        }

        public String getEmail() {
            return this.email;
        }

        public void setFirstname(String firstname) {
            if (firstname != null && !firstname.trim().isEmpty()) {
                this.firstname = firstname;
            } else {
                throw new IllegalArgumentException(" first name cannot null or empty");
            }
        }

        public void setLastName(String lastname) {
            if (lastname != null && !lastname.trim().isEmpty()) {
                this.lastname = lastname;
            } else {
                throw new IllegalArgumentException(" lastname cannot null or empty ");
            }
        }

        public void setEmail(String email) {
            if (email != null && !email.trim().isEmpty()) {
                this.email = email;
            } else {
                throw new IllegalArgumentException("Email  cannot null or empty ");
            }
        }

        public String getSummary() {
            String info = "id: " + this.getId() + " ,FirstName:" + this.firstname + " ,LastName: " + this.lastname + " ,Email :" + this.getEmail();
            return info;
        }

        private int setid(int idSequencer) {
            return idSequencer++;
        }
    public void setAssigned(Person person){

            tasks= Arrays.copyOf(tasks,tasks.length+1);

         //   tasks[ tasks.length-1 ] = person;

    }
    }

