package kr.ac.kopo.kopo01.repo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.kopo01.domain.Sample;

@Mapper
@Repository
public interface SampleMapper {
	List<Sample> findAll();
	List<Sample> findAllByCondition(SampleCondition condition, RowBounds rowBounds);
}
