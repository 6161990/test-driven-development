package com.yoon.testkick.mockito.study;

import com.yoon.testkick.mockito.domain.Study;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class StudyRepositoryTest {

    @Autowired
    StudyRepository repository;

    @Test
    void save() {
        Study study = new Study(10, "java");

        repository.save(study);

        List<Study> all = repository.findAll();
        assertEquals(1, all.size());
    }
}
