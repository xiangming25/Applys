package cn.apply.service.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.apply.base.BaseServiceImpl;
import cn.apply.domain.RaceGrade;
import cn.apply.service.RaceGradeService;

@Service
@Transactional
public class RaceGradeServiceImpl extends BaseServiceImpl<RaceGrade> implements RaceGradeService {

	@Resource
	SessionFactory sessionFactory;
}
