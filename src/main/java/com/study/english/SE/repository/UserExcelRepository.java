package com.study.english.SE.repository;

import com.study.english.SE.entity.UserExcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserExcelRepository extends JpaRepository<UserExcel, Long> {
}
