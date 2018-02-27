package com.conor.moviecollection.model;

import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

    @Entity
    @Table(name = "movies")
    @EntityListeners(AuditingEntityListener.class)
    @JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
            allowGetters = true)
    public class Movie implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @NotBlank
        private String title;

        @NotBlank
        private int year;

        @NotBlank
        private int rating;
        /*
                @Column(nullable = false, updatable = false)
                @Temporal(TemporalType.TIMESTAMP)
                @CreatedDate
                private Date createdAt;
        */
        @Column(nullable = false)
        @Temporal(TemporalType.TIMESTAMP)
        @LastModifiedDate
        private Date updatedAt;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        /*
                public Date getCreatedAt() {
                    return createdAt;
                }

                public void setCreatedAt(Date createdAt) {
                    this.createdAt = createdAt;
                }
        */
        public Date getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
        }

    }
