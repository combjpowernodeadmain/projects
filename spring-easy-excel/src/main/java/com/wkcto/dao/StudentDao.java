package com.wkcto.dao;

import com.wkcto.domain.Student;
import com.wkcto.model.PageInfo;
import com.wkcto.model.StudentModel;
import com.wkcto.model.ViewStudentModel;
import org.springframework.stereotype.Repository;

import java.util.List;

//创建Dao对象
@Repository
public interface StudentDao {

    int insertStudent(Student student);

    int insertStudentModel(StudentModel sm);

    int insertBatch(List<StudentModel> list);


    List<ViewStudentModel> selectStudents(PageInfo pageInfo);

}
