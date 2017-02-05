package cn.apply.service.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.apply.base.BaseServiceImpl;
import cn.apply.domain.Academy;
import cn.apply.service.AcademyService;

@Service
@Transactional
public class AcademyServiceImpl extends BaseServiceImpl<Academy> implements AcademyService {

	@Resource
	SessionFactory sessionFactory;
}
