package cn.apply.service.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.apply.base.BaseServiceImpl;
import cn.apply.domain.RaceBaseInfo;
import cn.apply.service.RaceService;

@Service
@Transactional
public class RaceServiceImpl extends BaseServiceImpl<RaceBaseInfo> implements RaceService {

	@Resource
	SessionFactory sessionFactory;
}
