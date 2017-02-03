package cn.apply.service.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.apply.base.BaseServiceImpl;
import cn.apply.service.IndexService;
import cn.apply.vo.IndexVo;


@Service
@Transactional
public class IndexServiceImpl extends BaseServiceImpl<IndexVo> implements IndexService {

	@Resource
	SessionFactory sessionFactory;
}
