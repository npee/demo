package com.example.demo.model;

public class MessageDto {

    public static class SimpleMessage {
        private String message;
        private Long fromId;
        private Long toId;

        public SimpleMessage(String message, Long fromId, Long toId) {

        }

        private void setFrom(Long id) {

        }

        private void setTo(Long id) {

        }

    }

    public static class Deleted {
        private Long id;

        public Deleted(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
