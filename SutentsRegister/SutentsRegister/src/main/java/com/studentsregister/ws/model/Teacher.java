package com.studentsregister.ws.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Teacher extends Person {

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Degree> degrees;

    private Long salary;

    private Date dataEntrada;

    private Date dataSaida;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "subject_id")
    private Set<Subject> teachedSubjects;

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Set<Degree> getDegrees() {
        return degrees;
    }

    public void setDegrees(Set<Degree> degrees) {
        this.degrees = degrees;
    }

    public Set<Subject> getTeachedSubjects() {
        return teachedSubjects;
    }

    public void setTeachedSubjects(Set<Subject> teachedSubjects) {
        this.teachedSubjects = teachedSubjects;
    }
}
