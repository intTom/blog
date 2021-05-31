package com.inttom.service.impl;

import com.inttom.entity.MUser;
import com.inttom.mapper.MUserMapper;
import com.inttom.service.IMUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author inttom
 * @since 2021-05-31
 */
@Service
public class MUserServiceImpl extends ServiceImpl<MUserMapper, MUser> implements IMUserService {

}
